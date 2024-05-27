# PlayermoderationApi

All URIs are relative to *https://vrchat.com/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clearAllPlayerModerations**](PlayermoderationApi.md#clearAllPlayerModerations) | **DELETE** /auth/user/playermoderations | Clear All Player Moderations |
| [**deletePlayerModeration**](PlayermoderationApi.md#deletePlayerModeration) | **DELETE** /auth/user/playermoderations/{playerModerationId} | Delete Player Moderation |
| [**getPlayerModeration**](PlayermoderationApi.md#getPlayerModeration) | **GET** /auth/user/playermoderations/{playerModerationId} | Get Player Moderation |
| [**getPlayerModerations**](PlayermoderationApi.md#getPlayerModerations) | **GET** /auth/user/playermoderations | Search Player Moderations |
| [**moderateUser**](PlayermoderationApi.md#moderateUser) | **POST** /auth/user/playermoderations | Moderate User |
| [**unmoderateUser**](PlayermoderationApi.md#unmoderateUser) | **PUT** /auth/user/unplayermoderate | Unmoderate User |


<a name="clearAllPlayerModerations"></a>
# **clearAllPlayerModerations**
> Success clearAllPlayerModerations()

Clear All Player Moderations

⚠️ **This will delete every single player moderation you&#39;ve ever made.**

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PlayermoderationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PlayermoderationApi apiInstance = new PlayermoderationApi(defaultClient);
    try {
      Success result = apiInstance.clearAllPlayerModerations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayermoderationApi#clearAllPlayerModerations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Success**](Success.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response after e.g. clearing all player moderations. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="deletePlayerModeration"></a>
# **deletePlayerModeration**
> Success deletePlayerModeration(playerModerationId)

Delete Player Moderation

Deletes a specific player moderation based on it&#39;s &#x60;pmod_&#x60; ID. The website uses &#x60;unmoderateUser&#x60; instead. You can delete the same player moderation multiple times successfully.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PlayermoderationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PlayermoderationApi apiInstance = new PlayermoderationApi(defaultClient);
    String playerModerationId = "playerModerationId_example"; // String | Must be a valid `pmod_` ID.
    try {
      Success result = apiInstance.deletePlayerModeration(playerModerationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayermoderationApi#deletePlayerModeration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playerModerationId** | **String**| Must be a valid &#x60;pmod_&#x60; ID. | |

### Return type

[**Success**](Success.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response after removing a PlayerModeration by ID. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response when trying to delete someone else&#39;s player moderation. |  -  |

<a name="getPlayerModeration"></a>
# **getPlayerModeration**
> PlayerModeration getPlayerModeration(playerModerationId)

Get Player Moderation

Returns a single Player Moderation. This returns the exact same amount of information as the more generalised &#x60;getPlayerModerations&#x60;.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PlayermoderationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PlayermoderationApi apiInstance = new PlayermoderationApi(defaultClient);
    String playerModerationId = "playerModerationId_example"; // String | Must be a valid `pmod_` ID.
    try {
      PlayerModeration result = apiInstance.getPlayerModeration(playerModerationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayermoderationApi#getPlayerModeration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playerModerationId** | **String**| Must be a valid &#x60;pmod_&#x60; ID. | |

### Return type

[**PlayerModeration**](PlayerModeration.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single PlayerModeration object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to show information about a non-existent player moderation. |  -  |

<a name="getPlayerModerations"></a>
# **getPlayerModerations**
> List&lt;PlayerModeration&gt; getPlayerModerations(type, targetUserId)

Search Player Moderations

Returns a list of all player moderations made by **you**.  This endpoint does not have pagination, and will return *all* results. Use query parameters to limit your query if needed.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PlayermoderationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PlayermoderationApi apiInstance = new PlayermoderationApi(defaultClient);
    String type = "type_example"; // String | Must be one of PlayerModerationType, except unblock. Unblocking simply removes a block.
    String targetUserId = "targetUserId_example"; // String | Must be valid UserID.
    try {
      List<PlayerModeration> result = apiInstance.getPlayerModerations(type, targetUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayermoderationApi#getPlayerModerations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Must be one of PlayerModerationType, except unblock. Unblocking simply removes a block. | [optional] |
| **targetUserId** | **String**| Must be valid UserID. | [optional] |

### Return type

[**List&lt;PlayerModeration&gt;**](PlayerModeration.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of PlayerModeration objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="moderateUser"></a>
# **moderateUser**
> PlayerModeration moderateUser(moderateUserRequest)

Moderate User

Moderate a user, e.g. unmute them or show their avatar.  Please see the [Player Moderation docs](https://vrchatapi.github.io/docs/api/#tag--playermoderation) on what playerModerations are, and how they differ from staff moderations.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PlayermoderationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PlayermoderationApi apiInstance = new PlayermoderationApi(defaultClient);
    ModerateUserRequest moderateUserRequest = new ModerateUserRequest(); // ModerateUserRequest | 
    try {
      PlayerModeration result = apiInstance.moderateUser(moderateUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayermoderationApi#moderateUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **moderateUserRequest** | [**ModerateUserRequest**](ModerateUserRequest.md)|  | |

### Return type

[**PlayerModeration**](PlayerModeration.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single PlayerModeration object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="unmoderateUser"></a>
# **unmoderateUser**
> Success unmoderateUser(moderateUserRequest)

Unmoderate User

Removes a player moderation previously added through &#x60;moderateUser&#x60;. E.g if you previously have shown their avatar, but now want to reset it to default.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PlayermoderationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PlayermoderationApi apiInstance = new PlayermoderationApi(defaultClient);
    ModerateUserRequest moderateUserRequest = new ModerateUserRequest(); // ModerateUserRequest | 
    try {
      Success result = apiInstance.unmoderateUser(moderateUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayermoderationApi#unmoderateUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **moderateUserRequest** | [**ModerateUserRequest**](ModerateUserRequest.md)|  | |

### Return type

[**Success**](Success.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response after unmoderating a player moderation. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

