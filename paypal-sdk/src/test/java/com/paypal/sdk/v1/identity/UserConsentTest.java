package com.paypal.sdk.v1.identity;

import com.braintreepayments.http.HttpResponse;
import com.paypal.core.PayPalHttpClient;
import com.paypal.core.object.RefreshToken;
import com.paypal.core.request.RefreshTokenRequest;
import com.paypal.sdk.TestHarness;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class UserConsentTest extends TestHarness {

    @Test
    public void testUserConsent() {
        String userConsentUrl = new UserConsent(environment())
                .responseType("code")
                .scope("profile+email+openid+phone+address+https%3A%2F%2Furi.paypal.com%2Fservices%2Fpaypalattributes")
                .redirectUri("http%3A%2F%2Frequestbin.fullcontact.com%2F15a7bhu1")
                .build();

        assertEquals(userConsentUrl, "https://www.sandbox.paypal.com/signin/authorize?client_id=AdV4d6nLHabWLyemrw4BKdO9LjcnioNIOgoz7vD611ObbDUL0kJQfzrdhXEBwnH8QmV-7XZjvjRWn0kg&response_type=code&scope=profile+email+openid+phone+address+https%3A%2F%2Furi.paypal.com%2Fservices%2Fpaypalattributes&redirect_uri=http%3A%2F%2Frequestbin.fullcontact.com%2F15a7bhu1&");
    }

    @Test(enabled = false)
    public void testGetRefreshTokenFromCode() throws IOException {
        String code = "C21AAHkLXZ-oIqg3ow0tK4kEyCSHjhdy2FXuxtcc_UZfr2HJEclxOqsV8XC_EJMkzeBEk_nTxkH2eR2eDXV0gx67fikpeHTWQ";

        RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest(environment(), code);

        HttpResponse<RefreshToken> refreshTokenResponse = client().execute(refreshTokenRequest);

        assertEquals(200, refreshTokenResponse.statusCode());
        assertNotNull(refreshTokenResponse.result());
        assertNotNull(refreshTokenResponse.result().refreshToken());
    }

    @Test(enabled = false)
    public void testUserinfoGetRequest() throws IOException {
        String refreshToken = "R23AAGugHBGsj7Y-yWS-XtgY8MtL1ovx4S86SRWLgiZgRjug85nO0egYreBn-4oSV321IwuLuGt0MQ2c2COzq5pJQzHWwvnb14IW6VspQIuJd9rpsegIKuQYfEjgcfhyey3CIGjK7DWdmHdaQAgXw";
        PayPalHttpClient client = new PayPalHttpClient(environment(), refreshToken);

        UserinfoGetRequest request = new UserinfoGetRequest().schema("openid");

        HttpResponse<UserInfo> infoResponse = client.execute(request);

        assertEquals(200, infoResponse.statusCode());

        assertNotNull(infoResponse.result());

        UserInfo actual = infoResponse.result();

        assertEquals("Sample Buyer", actual.name());
        assertEquals("samplebuyer@buy.com", actual.email());
        assertEquals("Sample", actual.givenName());
        assertEquals("4084891074", actual.phoneNumber());
        assertNotNull(actual.address());
        assertEquals("San Jose", actual.address().locality());
    }
}

