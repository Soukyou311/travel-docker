package ltd.newbee.mall.service.impl;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProvider;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClientBuilder;
import com.amazonaws.services.cognitoidp.model.AdminGetUserRequest;
import com.amazonaws.services.cognitoidp.model.AdminGetUserResult;
import com.amazonaws.services.cognitoidp.model.AttributeType;
import com.amazonaws.services.cognitoidp.model.AuthFlowType;
import com.amazonaws.services.cognitoidp.model.AuthenticationResultType;
import com.amazonaws.services.cognitoidp.model.GetUserRequest;
import com.amazonaws.services.cognitoidp.model.GetUserResult;
import com.amazonaws.services.cognitoidp.model.InitiateAuthRequest;
import com.amazonaws.services.cognitoidp.model.InitiateAuthResult;
import com.amazonaws.services.cognitoidp.model.SignUpRequest;
import com.amazonaws.services.cognitoidp.model.SignUpResult;

import ltd.newbee.mall.service.CognitoService;

@Service
public class CognitoServiceImpl implements CognitoService {
    private final AWSCognitoIdentityProvider cognito;
    private final String userPoolId;
    private final String clientId;

    public CognitoServiceImpl(AWSCognitoIdentityProvider cognito,
            @Value("${aws.cognito.pool-id}") String userPoolId,
            @Value("${aws.cognito.client-id}") String clientId) {
    	this.cognito = cognito;
    	this.userPoolId = userPoolId;
    	this.clientId = clientId;
    }
    @Override
    public String registerUser(String email, String password, String username) {
        SignUpRequest signUpRequest = new SignUpRequest()
                .withClientId(clientId)
                .withUsername(email)
                .withPassword(password)
                .withUserAttributes(new AttributeType().withName("email").withValue(email)
                                    .withName("name").withValue(username)); // 添加username参数到userAttributes
        SignUpResult signUpResult = cognito.signUp(signUpRequest);
        return signUpResult.getUserSub();
    }

    @Override
    public String loginUser(String email, String password) {
        InitiateAuthRequest initiateAuthRequest = new InitiateAuthRequest()
                .withClientId(clientId)
                .withAuthFlow(AuthFlowType.USER_PASSWORD_AUTH)
                .addAuthParametersEntry("USERNAME", email)
                .addAuthParametersEntry("PASSWORD", password);

        InitiateAuthResult initiateAuthResult = cognito.initiateAuth(initiateAuthRequest);

        AuthenticationResultType authenticationResult = initiateAuthResult.getAuthenticationResult();
        if (authenticationResult != null) {
            return authenticationResult.getIdToken();
        } else {
            throw new RuntimeException("Authentication failed");
        }
    }
    @Override
    public String getAccessToken(String email, String password) {
        InitiateAuthRequest initiateAuthRequest = new InitiateAuthRequest()
                .withClientId(clientId)
                .withAuthFlow(AuthFlowType.USER_PASSWORD_AUTH)
                .addAuthParametersEntry("USERNAME", email)
                .addAuthParametersEntry("PASSWORD", password);

        InitiateAuthResult initiateAuthResult = cognito.initiateAuth(initiateAuthRequest);

        AuthenticationResultType authenticationResult = initiateAuthResult.getAuthenticationResult();
        if (authenticationResult != null) {
            return authenticationResult.getAccessToken();
        } else {
            throw new RuntimeException("Authentication failed");
        }
    }
    
    @Override
    public String getRefreshToken(String email, String password) {
        InitiateAuthRequest initiateAuthRequest = new InitiateAuthRequest()
                .withClientId(clientId)
                .withAuthFlow(AuthFlowType.USER_PASSWORD_AUTH)
                .addAuthParametersEntry("USERNAME", email)
                .addAuthParametersEntry("PASSWORD", password);

        InitiateAuthResult initiateAuthResult = cognito.initiateAuth(initiateAuthRequest);

        AuthenticationResultType authenticationResult = initiateAuthResult.getAuthenticationResult();
        if (authenticationResult != null) {
            return authenticationResult.getRefreshToken();
        } else {
            throw new RuntimeException("Authentication failed");
        }
    }
    
    @Override
    public Map<String, String> getUserInfo(String idToken) {
        GetUserRequest getUserRequest = new GetUserRequest().withAccessToken(idToken);
        GetUserResult getUserResult = cognito.getUser(getUserRequest);
        List<AttributeType> attributes = getUserResult.getUserAttributes();

        Map<String, String> userInfo = new HashMap<>();
        for (AttributeType attribute : attributes) {
            userInfo.put(attribute.getName(), attribute.getValue());
        }
        return userInfo;
    }
    @Override
    public Map<String, String> getUserAttributes(String userId) {
        AdminGetUserRequest adminGetUserRequest = new AdminGetUserRequest()
                .withUserPoolId(userPoolId)
                .withUsername(userId);
        AdminGetUserResult adminGetUserResult = cognito.adminGetUser(adminGetUserRequest);
        List<AttributeType> attributes = adminGetUserResult.getUserAttributes();

        Map<String, String> userAttributes = new HashMap<>();
        for (AttributeType attribute : attributes) {
            userAttributes.put(attribute.getName(), attribute.getValue());
        }
        return userAttributes;
    }
   
}