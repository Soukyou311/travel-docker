package ltd.newbee.mall.controller.mall;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.HashMap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProvider;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClientBuilder;
import com.amazonaws.services.cognitoidp.model.GetUserRequest;
import com.amazonaws.services.cognitoidp.model.GetUserResult;
import com.amazonaws.services.cognitoidp.model.InvalidParameterException;
import com.amazonaws.services.cognitoidp.model.InvalidPasswordException;
import com.amazonaws.services.cognitoidp.model.NotAuthorizedException;
import com.amazonaws.services.cognitoidp.model.UserNotFoundException;
import com.amazonaws.services.cognitoidp.model.UsernameExistsException;
import com.fasterxml.jackson.databind.JsonNode;

import ltd.newbee.mall.service.CognitoService;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/cognito")
public class CognitoController {
    private final CognitoService cognitoService;

    public CognitoController(CognitoService cognitoService) {
        this.cognitoService = cognitoService;
    }

    @PostMapping("/register")
    public ResponseEntity<Map<String, String>> register(@RequestBody Map<String, String> request) {
        String email = request.get("email");
        String password = request.get("password");
        String username = request.get("username");

        Map<String, String> response = new HashMap<>();

        try {
            String userId = cognitoService.registerUser(email, password, username);
            response.put("userId", userId);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (UsernameExistsException e) {
            response.put("message", "An account with the given email already exists");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        } catch (InvalidParameterException e) {
            response.put("message", "Attribute value for name must not be null");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        } catch (InvalidPasswordException e) {
            response.put("message", "Password did not conform with policy: Password not long enough");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            response.put("message", "Registration failed");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    
    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> request, HttpServletResponse response) {
        String email = request.get("email");
        String password = request.get("password");
        String idToken, accessToken, freshToken;

        try {
            idToken = cognitoService.loginUser(email, password);
            accessToken = cognitoService.getAccessToken(email, password);
            freshToken = cognitoService.getRefreshToken(email, password);
        } catch (NotAuthorizedException e) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", "Incorrect username or password");
            return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
        } catch (InvalidParameterException e) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", "Missing required parameter USERNAME");
            return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
        } 

        // 设置 cookie
        Cookie idTokenCookie = new Cookie("idToken", idToken);
        Cookie accessTokenCookie = new Cookie("accessToken", accessToken);
        Cookie freshTokenCookie = new Cookie("freshToken", freshToken);

        idTokenCookie.setPath("/");
        accessTokenCookie.setPath("/");
        freshTokenCookie.setPath("/");

        response.addCookie(idTokenCookie);
        response.addCookie(accessTokenCookie);
        response.addCookie(freshTokenCookie);

        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("idToken", idToken);
        responseMap.put("accessToken", accessToken);
        responseMap.put("freshToken", freshToken);

        return new ResponseEntity<>(responseMap, HttpStatus.OK);
    }
    @CrossOrigin(allowCredentials = "true")
    @GetMapping("/me")
    public ResponseEntity<Map<String, String>> me(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        String idToken = null;
        String accessToken = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("idToken")) {
                    idToken = cookie.getValue();
                } else if (cookie.getName().equals("accessToken")) {
                    accessToken = cookie.getValue();
                }
            }
        }
        if (idToken == null || accessToken == null) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

        AWSCognitoIdentityProvider cognitoIdentityProvider = AWSCognitoIdentityProviderClientBuilder.standard().build();
        GetUserRequest getUserRequest = new GetUserRequest().withAccessToken(accessToken);
        GetUserResult getUserResult;
        Map<String, String> response = new HashMap<>();
        try {
            getUserResult = cognitoIdentityProvider.getUser(getUserRequest);
        } catch (NotAuthorizedException e) {
        	response.put("message", "Access Token has expired");
            return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
        }
        String username = getUserResult.getUsername();

        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("userId", username);

        return new ResponseEntity<>(responseMap, HttpStatus.OK);
    }
    
    
    

    @GetMapping("/users/{userId}")
    public ResponseEntity<Map<String, String>> getUserAttributes(@PathVariable String userId) {
        try {
            return ResponseEntity.ok(cognitoService.getUserAttributes(userId));
        } catch (UserNotFoundException e) {
            Map<String, String> response = new HashMap<>();
            response.put("message", "User does not exist");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
}