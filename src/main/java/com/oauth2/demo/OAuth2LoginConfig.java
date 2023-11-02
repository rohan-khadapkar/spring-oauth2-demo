// package com.oauth2.demo;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.oauth2.client.registration.ClientRegistration;
// import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
// import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
// import org.springframework.security.oauth2.core.AuthorizationGrantType;
// import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
// import org.springframework.security.oauth2.core.oidc.IdTokenClaimNames;

// @Configuration
// public class OAuth2LoginConfig {

//     @Bean
//     public ClientRegistrationRepository clientRegistrationRepository() {
//         return new InMemoryClientRegistrationRepository(this.swiftClientRegistration());
//     }

//     private ClientRegistration swiftClientRegistration() {
//         return ClientRegistration.withRegistrationId("swift-sandbox")
//                 .clientId("CrxXEIn7vbQuKUmH1RV6VdWGOoC9DODV")
//                 .clientSecret("ATny25xYvgcZCGZ6")
//                 .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_JWT)
//                 .authorizationGrantType(AuthorizationGrantType.JWT_BEARER)
//                 .redirectUri("{baseUrl}/login/oauth2/code/{registrationId}")
//                 .scope("swift.alliancecloud.api")
//                 .authorizationUri("https://sandbox.swift.com/oauth2/v1/token")
//                 .tokenUri("https://sandbox.swift.com/oauth2/v1/token")
//                 .userInfoUri("https://sandbox.swift.com/oauth2/v1/token")
//                 .userNameAttributeName(IdTokenClaimNames.SUB)
//                 .jwkSetUri("https://sandbox.swift.com/oauth2/v1/token")
//                 .clientName("SWIFT")
//                 .build();
//     }
// }