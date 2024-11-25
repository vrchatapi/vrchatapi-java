package io.github.vrchatapi.demo;

import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.api.AuthenticationApi;
import io.github.vrchatapi.auth.HttpBasicAuth;
import io.github.vrchatapi.model.CurrentUser;

public class CookiesLoad {

	public static void main(String[] args) throws ApiException {
		ApiClient defaultClient = Configuration.getDefaultApiClient();
		AuthenticationApi authApi = new AuthenticationApi(defaultClient);
		HttpBasicAuth authHeader = (HttpBasicAuth) defaultClient.getAuthentication("authHeader");
		authHeader.setUsername("username");
		authHeader.setPassword("password");
		defaultClient.setUserAgent("ExampleProgram/0.0.1 my@email.com");
		defaultClient.addDefaultHeader("Cookie", "auth=[AUTH_COOKIE_HERE]; twoFactorAuth=[TWO_FACTOR_AUTH_COOKIE_HERE]");

		CurrentUser user = authApi.getCurrentUser();
		System.out.println("Logged in as: " + user.getDisplayName());
	}
	
}
