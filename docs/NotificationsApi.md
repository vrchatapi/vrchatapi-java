# NotificationsApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptFriendRequest**](NotificationsApi.md#acceptFriendRequest) | **PUT** /auth/user/notifications/{notificationId}/accept | Accept Friend Request |
| [**acknowledgeNotificationV2**](NotificationsApi.md#acknowledgeNotificationV2) | **POST** /notifications/{notificationId}/see | Acknowledge NotificationV2 |
| [**clearNotifications**](NotificationsApi.md#clearNotifications) | **PUT** /auth/user/notifications/clear | Clear All Notifications |
| [**deleteAllNotificationV2s**](NotificationsApi.md#deleteAllNotificationV2s) | **DELETE** /notifications | Delete All NotificationV2s |
| [**deleteNotification**](NotificationsApi.md#deleteNotification) | **PUT** /auth/user/notifications/{notificationId}/hide | Delete Notification |
| [**deleteNotificationV2**](NotificationsApi.md#deleteNotificationV2) | **DELETE** /notifications/{notificationId} | Delete NotificationV2 |
| [**getNotification**](NotificationsApi.md#getNotification) | **GET** /auth/user/notifications/{notificationId} | Show notification |
| [**getNotificationV2**](NotificationsApi.md#getNotificationV2) | **GET** /notifications/{notificationId} | Get NotificationV2 |
| [**getNotificationV2s**](NotificationsApi.md#getNotificationV2s) | **GET** /notifications | List NotificationV2s |
| [**getNotifications**](NotificationsApi.md#getNotifications) | **GET** /auth/user/notifications | List Notifications |
| [**markNotificationAsRead**](NotificationsApi.md#markNotificationAsRead) | **PUT** /auth/user/notifications/{notificationId}/see | Mark Notification As Read |
| [**replyNotificationV2**](NotificationsApi.md#replyNotificationV2) | **POST** /notifications/{notificationId}/reply | Reply NotificationV2 |
| [**respondNotificationV2**](NotificationsApi.md#respondNotificationV2) | **POST** /notifications/{notificationId}/respond | Respond NotificationV2 |


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

<a name="acknowledgeNotificationV2"></a>
# **acknowledgeNotificationV2**
> NotificationV2 acknowledgeNotificationV2(notificationId)

Acknowledge NotificationV2

Acknowledge a specific notification

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
      NotificationV2 result = apiInstance.acknowledgeNotificationV2(notificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#acknowledgeNotificationV2");
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

[**NotificationV2**](NotificationV2.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single NotifcationV2 object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing notification. |  -  |

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

<a name="deleteAllNotificationV2s"></a>
# **deleteAllNotificationV2s**
> Success deleteAllNotificationV2s()

Delete All NotificationV2s

Delete all of the current user&#39;s notifications.

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
      Success result = apiInstance.deleteAllNotificationV2s();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#deleteAllNotificationV2s");
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

<a name="deleteNotificationV2"></a>
# **deleteNotificationV2**
> Success deleteNotificationV2(notificationId)

Delete NotificationV2

Delete a specific notification

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
      Success result = apiInstance.deleteNotificationV2(notificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#deleteNotificationV2");
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
| **200** | Successful response after clearing a notification. |  -  |
| **400** | Error response when trying to perform an invalid operations on a notification. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing notification. |  -  |

<a name="getNotification"></a>
# **getNotification**
> Notification getNotification(notificationId)

Show notification

Get a notification by notification &#x60;not_&#x60; ID.

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
      Notification result = apiInstance.getNotification(notificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getNotification");
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
| **404** | Error response when trying to perform operations on a non-existing notification. |  -  |

<a name="getNotificationV2"></a>
# **getNotificationV2**
> NotificationV2 getNotificationV2(notificationId)

Get NotificationV2

Get a specific notification. Appears to require admin credentials by default. Expect a 403 Forbidden error response for normal users.

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
      NotificationV2 result = apiInstance.getNotificationV2(notificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getNotificationV2");
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

[**NotificationV2**](NotificationV2.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single NotifcationV2 object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response due to missing Administrator credentials. |  -  |
| **404** | Error response when trying to perform operations on a non-existing notification. |  -  |

<a name="getNotificationV2s"></a>
# **getNotificationV2s**
> List&lt;NotificationV2&gt; getNotificationV2s(limit)

List NotificationV2s

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
    Integer limit = 100; // Integer | The maximum number of entries to get.
    try {
      List<NotificationV2> result = apiInstance.getNotificationV2s(limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getNotificationV2s");
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
| **limit** | **Integer**| The maximum number of entries to get. | [optional] |

### Return type

[**List&lt;NotificationV2&gt;**](NotificationV2.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of NotifcationV2 objects. |  -  |
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

<a name="replyNotificationV2"></a>
# **replyNotificationV2**
> NotificationV2 replyNotificationV2(notificationId, body)

Reply NotificationV2

Reply to a specific notification

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
    Object body = null; // Object | 
    try {
      NotificationV2 result = apiInstance.replyNotificationV2(notificationId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#replyNotificationV2");
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
| **body** | **Object**|  | |

### Return type

[**NotificationV2**](NotificationV2.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single NotifcationV2 object. |  -  |
| **400** | Error response when trying to perform an invalid operations on a notification. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing notification. |  -  |

<a name="respondNotificationV2"></a>
# **respondNotificationV2**
> NotificationV2 respondNotificationV2(notificationId, respondNotificationV2Request)

Respond NotificationV2

Respond to a specific notification

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
    RespondNotificationV2Request respondNotificationV2Request = new RespondNotificationV2Request(); // RespondNotificationV2Request | 
    try {
      NotificationV2 result = apiInstance.respondNotificationV2(notificationId, respondNotificationV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#respondNotificationV2");
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
| **respondNotificationV2Request** | [**RespondNotificationV2Request**](RespondNotificationV2Request.md)|  | |

### Return type

[**NotificationV2**](NotificationV2.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single NotifcationV2 object. |  -  |
| **400** | Error response when trying to perform an invalid operations on a notification. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing notification. |  -  |

