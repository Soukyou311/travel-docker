package ltd.newbee.mall.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProvider;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClientBuilder;

import ltd.newbee.mall.service.CognitoService;
import ltd.newbee.mall.service.impl.CognitoServiceImpl;

@Configuration
public class CognitoConfig {
    private final String region;
    private final String userPoolId;
    private final String clientId;

    public CognitoConfig(
            @Value("${aws.cognito.region}") String region,
            @Value("${aws.cognito.pool-id}") String userPoolId,
            @Value("${aws.cognito.client-id}") String clientId ) {
        this.region = region;
        this.userPoolId = userPoolId;
        this.clientId = clientId;
    }

    @Bean
    public AWSCognitoIdentityProvider cognito() {
        return AWSCognitoIdentityProviderClientBuilder.standard()
                .withRegion(region)
                .build();
    }


    @Bean
    public CognitoService cognitoService(
            AWSCognitoIdentityProvider cognito,
            @Value("${aws.cognito.pool-id}") String userPoolId,
            @Value("${aws.cognito.client-id}") String clientId) {
        return new CognitoServiceImpl(cognito, userPoolId, clientId);
    }
}