package io.github.vrchatapi.demo;

import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import io.github.vrchatapi.*;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.api.*;
import io.github.vrchatapi.model.*;

public class Demo {

	public static void main(String[] args) throws ApiException {
		// Step 1. VRChat consists of several API's
		// e.g. (WorldsApi, UsersApi, FilesApi, NotificationsApi, FriendsApi, etc...)
		// Here we instantiate the Authentication API which is required for logging in.
		// We also instantiate the System API for fetching the API key needed for future requests.
		ApiClient defaultClient = Configuration.getDefaultApiClient();
		AuthenticationApi authApi = new AuthenticationApi(defaultClient);
		SystemApi systemApi = new SystemApi(defaultClient);

		// Step 2. We begin with creating a Configuration
		// This contains the username and password for authentication.
		HttpBasicAuth authHeader = (HttpBasicAuth) defaultClient.getAuthentication("authHeader");
		authHeader.setUsername("username");
		authHeader.setPassword("password");
		// Also fetch API key. Fetching the Config sets the API key as a cookie.
		systemApi.getConfig();

		// Step 3. Call getCurrentUser on Authentication API.
		// This logs you in if the user isn't already logged in.
		CurrentUser result = authApi.getCurrentUser();
		System.out.println(result.getDisplayName());
		
		System.exit(0);
	}
	
}
