package io.github.vrchatapi.demo;

import io.github.vrchatapi.*;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.api.*;
import io.github.vrchatapi.model.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws ApiException, IOException {
		// Step 1. VRChat consists of several API's
		// e.g. (WorldsApi, UsersApi, FilesApi, NotificationsApi, FriendsApi, etc...)
		// Here we instantiate the Authentication API which is required for logging in.
		ApiClient defaultClient = Configuration.getDefaultApiClient();
		AuthenticationApi authApi = new AuthenticationApi(defaultClient);

		// Step 2. We begin with creating a Configuration
		// This contains the username and password for authentication, as well as a user agent.
		HttpBasicAuth authHeader = (HttpBasicAuth) defaultClient.getAuthentication("authHeader");
		authHeader.setUsername("username");
		authHeader.setPassword("password");
		defaultClient.setUserAgent("ExampleProgram/0.0.1 my@email.com");


		// Step 3. Call getCurrentUser on Authentication API.
		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			authApi.getCurrentUser();
		}
		catch (IllegalArgumentException e){
			// Step 4. Verify using 2fa.
			if (e.toString().contains("emailOtp")){
				System.out.println("2FA Email code:");
				TwoFactorEmailCode code = new TwoFactorEmailCode();
				code.setCode(reader.readLine());
				authApi.verify2FAEmailCode(code);
			} else {
				System.out.println("2FA Authenticator code:");
				TwoFactorAuthCode code = new TwoFactorAuthCode();
				code.setCode(reader.readLine());
				authApi.verify2FA(code);
			}
		}
		CurrentUser user = authApi.getCurrentUser().getCurrentUser();
		System.out.println("Logged in as: " + user.getDisplayName());
	}
	
}
