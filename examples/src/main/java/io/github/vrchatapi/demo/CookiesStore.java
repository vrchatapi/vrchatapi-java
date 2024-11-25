package io.github.vrchatapi.demo;

import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.api.AuthenticationApi;
import io.github.vrchatapi.auth.HttpBasicAuth;
import io.github.vrchatapi.model.CurrentUser;
import io.github.vrchatapi.model.TwoFactorAuthCode;
import io.github.vrchatapi.model.TwoFactorEmailCode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import okhttp3.Cookie;

public class CookiesStore {

	public static void main(String[] args) throws ApiException, IOException {
		ApiClient defaultClient = Configuration.getDefaultApiClient();
		AuthenticationApi authApi = new AuthenticationApi(defaultClient);
		HttpBasicAuth authHeader = (HttpBasicAuth) defaultClient.getAuthentication("authHeader");
		authHeader.setUsername("username");
		authHeader.setPassword("password");
		defaultClient.setUserAgent("ExampleProgram/0.0.1 my@email.com");

		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			authApi.getCurrentUser();
		}
		catch (IllegalArgumentException e){
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
		CurrentUser user = authApi.getCurrentUser();
		System.out.println("Logged in as: " + user.getDisplayName());

		List<Cookie> cookies = defaultClient.getHttpClient().cookieJar().loadForRequest(new okhttp3.HttpUrl.Builder().scheme("http").host("api.vrchat.cloud").build());
		System.out.println("auth: " + cookies.get(0).value());
		System.out.println("twoFactorAuth: " + cookies.get(1).value());
	}
	
}
