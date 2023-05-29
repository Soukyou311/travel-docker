package ltd.newbee.mall.service;

import java.util.List;
import java.util.Map;

import com.amazonaws.services.cognitoidp.model.AttributeType;

public interface CognitoService {
    String registerUser(String email, String password, String username);
    String loginUser(String email, String password); 
    String getAccessToken(String email, String password);
	String getRefreshToken(String email, String password);
	Map<String, String> getUserInfo(String idToken);
	Map<String, String> getUserAttributes(String userSub);
}