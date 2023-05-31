# NotificationsApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptFriendRequest**](NotificationsApi.md#acceptFriendRequest) | **PUT** /auth/user/notifications/{notificationId}/accept | Accept Friend Request |
| [**clearNotifications**](NotificationsApi.md#clearNotifications) | **PUT** /auth/user/notifications/clear | Clear All Notifications |
| [**deleteNotification**](NotificationsApi.md#deleteNotification) | **PUT** /auth/user/notifications/{notificationId}/hide | Delete Notification |
| [**getNotifications**](NotificationsApi.md#getNotifications) | **GET** /auth/user/notifications | List Notifications |
| [**markNotificationAsRead**](NotificationsApi.md#markNotificationAsRead) | **PUT** /auth/user/notifications/{notificationId}/see | Mark Notification As Read |


<a name="acceptFriendRequest"></a>
# **acceptFriendRequest**
> Success acceptFriendRequest(notificationId)

Accept Friend Request

Accept a friend request by notification &#x60;frq_&#x60; ID. Friend requests can be found using the NotificationsAPI &#x60;getNotifications&#x60; by filtering of type &#x60;friendRequest&#x60;.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String notificationId = "notificationId_example"; // String | Must be a valid notification ID.
    try {
      Success result = apiInstance.acceptFriendRequest(notificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#acceptFriendRequest");
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
| **notificationId** | **String**| Must be a valid notification ID. | |

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
| **200** | Successful response after friending a user. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to accept a non-existent friend request. |  -  |

<a name="clearNotifications"></a>
# **clearNotifications**
> Success clearNotifications()

Clear All Notifications

Clear **all** notifications.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    try {
      Success result = apiInstance.clearNotifications();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#clearNotifications");
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
| **200** | Successful response after clearing all notifications. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="deleteNotification"></a>
# **deleteNotification**
> Notification deleteNotification(notificationId)

Delete Notification

Delete a notification.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String notificationId = "notificationId_example"; // String | Must be a valid notification ID.
    try {
      Notification result = apiInstance.deleteNotification(notificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#deleteNotification");
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
| **notificationId** | **String**| Must be a valid notification ID. | |

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
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getNotifications"></a>
# **getNotifications**
> List&lt;Notification&gt; getNotifications(type, sent, hidden, after, n, offset)

List Notifications

Retrieve all of the current user&#39;s notifications.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String type = "all"; // String | Only send notifications of this type (can use `all` for all). This parameter no longer does anything, and is deprecated.
    Boolean sent = true; // Boolean | Return notifications sent by the user. Must be false or omitted.
    Boolean hidden = true; // Boolean | Whether to return hidden or non-hidden notifications. True only allowed on type `friendRequest`.
    String after = "five_minutes_ago"; // String | Only return notifications sent after this Date. Ignored if type is `friendRequest`.
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    try {
      List<Notification> result = apiInstance.getNotifications(type, sent, hidden, after, n, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getNotifications");
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
| **type** | **String**| Only send notifications of this type (can use &#x60;all&#x60; for all). This parameter no longer does anything, and is deprecated. | [optional] |
| **sent** | **Boolean**| Return notifications sent by the user. Must be false or omitted. | [optional] |
| **hidden** | **Boolean**| Whether to return hidden or non-hidden notifications. True only allowed on type &#x60;friendRequest&#x60;. | [optional] |
| **after** | **String**| Only return notifications sent after this Date. Ignored if type is &#x60;friendRequest&#x60;. | [optional] |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |

### Return type

[**List&lt;Notification&gt;**](Notification.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Notifcation objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="markNotificationAsRead"></a>
# **markNotificationAsRead**
> Notification markNotificationAsRead(notificationId)

Mark Notification As Read

Mark a notification as seen.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String notificationId = "notificationId_example"; // String | Must be a valid notification ID.
    try {
      Notification result = apiInstance.markNotificationAsRead(notificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#markNotificationAsRead");
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
| **notificationId** | **String**| Must be a valid notification ID. | |

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
| **401** | Error response due to missing auth cookie. |  -  |

