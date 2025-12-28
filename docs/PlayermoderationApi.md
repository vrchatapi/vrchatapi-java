# PlayermoderationApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clearAllPlayerModerations**](PlayermoderationApi.md#clearAllPlayerModerations) | **DELETE** /auth/user/playermoderations | Clear All Player Moderations |
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
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
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
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PlayermoderationApi apiInstance = new PlayermoderationApi(defaultClient);
    PlayerModerationType type = PlayerModerationType.fromValue("block"); // PlayerModerationType | Must be one of PlayerModerationType.
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
| **type** | [**PlayerModerationType**](.md)| Must be one of PlayerModerationType. | [optional] [default to unmute] [enum: block, hideAvatar, interactOff, interactOn, mute, muteChat, showAvatar, unmute, unmuteChat] |
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
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
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
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
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

