# FriendsApi

All URIs are relative to *https://vrchat.com/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteFriendRequest**](FriendsApi.md#deleteFriendRequest) | **DELETE** /user/{userId}/friendRequest | Delete Friend Request |
| [**friend**](FriendsApi.md#friend) | **POST** /user/{userId}/friendRequest | Send Friend Request |
| [**getFriendStatus**](FriendsApi.md#getFriendStatus) | **GET** /user/{userId}/friendStatus | Check Friend Status |
| [**getFriends**](FriendsApi.md#getFriends) | **GET** /auth/user/friends | List Friends |
| [**unfriend**](FriendsApi.md#unfriend) | **DELETE** /auth/user/friends/{userId} | Unfriend |


<a name="deleteFriendRequest"></a>
# **deleteFriendRequest**
> Success deleteFriendRequest(userId)

Delete Friend Request

Deletes an outgoing pending friend request to another user. To delete an incoming friend request, use the &#x60;deleteNotification&#x60; endpoint instead.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FriendsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    FriendsApi apiInstance = new FriendsApi(defaultClient);
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      Success result = apiInstance.deleteFriendRequest(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FriendsApi#deleteFriendRequest");
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
| **userId** | **String**| Must be a valid user ID. | |

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
| **200** | Successful response after cancelling a friend request. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to delete a non-existent friend-request. |  -  |

<a name="friend"></a>
# **friend**
> Notification friend(userId)

Send Friend Request

Send a friend request to another user.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FriendsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    FriendsApi apiInstance = new FriendsApi(defaultClient);
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      Notification result = apiInstance.friend(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FriendsApi#friend");
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
| **userId** | **String**| Must be a valid user ID. | |

### Return type

[**Notification**](Notification.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Notifcation object. |  -  |
| **400** | Bad request error response when sending a friend request |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to send a friend request to a user which doesn&#39;t exist. |  -  |

<a name="getFriendStatus"></a>
# **getFriendStatus**
> FriendStatus getFriendStatus(userId)

Check Friend Status

Retrieve if the user is currently a friend with a given user, if they have an outgoing friend request, and if they have an incoming friend request. The proper way to receive and accept friend request is by checking if the user has an incoming &#x60;Notification&#x60; of type &#x60;friendRequest&#x60;, and then accepting that notification.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FriendsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    FriendsApi apiInstance = new FriendsApi(defaultClient);
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      FriendStatus result = apiInstance.getFriendStatus(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FriendsApi#getFriendStatus");
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
| **userId** | **String**| Must be a valid user ID. | |

### Return type

[**FriendStatus**](FriendStatus.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a users Friend Status. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getFriends"></a>
# **getFriends**
> List&lt;LimitedUser&gt; getFriends(offset, n, offline)

List Friends

List information about friends.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FriendsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    FriendsApi apiInstance = new FriendsApi(defaultClient);
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    Integer n = 60; // Integer | The number of objects to return.
    Boolean offline = true; // Boolean | Returns *only* offline users if true, returns only online and active users if false
    try {
      List<LimitedUser> result = apiInstance.getFriends(offset, n, offline);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FriendsApi#getFriends");
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
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offline** | **Boolean**| Returns *only* offline users if true, returns only online and active users if false | [optional] |

### Return type

[**List&lt;LimitedUser&gt;**](LimitedUser.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of LimitedUser objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="unfriend"></a>
# **unfriend**
> Success unfriend(userId)

Unfriend

Unfriend a user by ID.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FriendsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    FriendsApi apiInstance = new FriendsApi(defaultClient);
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      Success result = apiInstance.unfriend(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FriendsApi#unfriend");
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
| **userId** | **String**| Must be a valid user ID. | |

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
| **200** | Successful response after unfriending a user. |  -  |
| **400** | Error response when trying to unfriend someone who is not a friend. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

