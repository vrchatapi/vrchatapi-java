# InviteApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInviteMessage**](InviteApi.md#getInviteMessage) | **GET** /message/{userId}/message/{messageId} | Get Invite Messages
[**getInviteMessages**](InviteApi.md#getInviteMessages) | **GET** /message/{userId}/message | List Invite Messages
[**inviteUser**](InviteApi.md#inviteUser) | **POST** /invite/{userId} | Invite User
[**requestInvite**](InviteApi.md#requestInvite) | **POST** /requestInvite/{userId} | Request Invite
[**resetInviteMessage**](InviteApi.md#resetInviteMessage) | **DELETE** /message/{userId}/message/{messageId} | Reset Invite Message
[**respondInvite**](InviteApi.md#respondInvite) | **POST** /invite/{notificationId}/response | Respond Invite
[**updateInviteMessage**](InviteApi.md#updateInviteMessage) | **PUT** /message/{userId}/message/{messageId} | Update Invite Message


<a name="getInviteMessage"></a>
# **getInviteMessage**
> InviteMessage getInviteMessage(userId, messageId)

Get Invite Messages

Returns a single Invite Message. This returns the exact same information but less than &#x60;getInviteMessages&#x60;. Admin Credentials are required to view messages of other users!

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InviteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: apiKeyCookie
    ApiKeyAuth apiKeyCookie = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyCookie");
    apiKeyCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyCookie.setApiKeyPrefix("Token");

    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InviteApi apiInstance = new InviteApi(defaultClient);
    String userId = "userId_example"; // String | 
    Integer messageId = 56; // Integer | 
    try {
      InviteMessage result = apiInstance.getInviteMessage(userId, messageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InviteApi#getInviteMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **messageId** | **Integer**|  |

### Return type

[**InviteMessage**](InviteMessage.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a single InviteMessage object. |  -  |
**400** | Error response when trying to update an Invite Message with invalid slot number. |  -  |
**401** | Error response due to missing authorization to perform that action. |  -  |

<a name="getInviteMessages"></a>
# **getInviteMessages**
> List&lt;InviteMessage&gt; getInviteMessages(userId)

List Invite Messages

Returns a list of all that users Invite Messages. Admin Credentials are required to view messages of other users!

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InviteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: apiKeyCookie
    ApiKeyAuth apiKeyCookie = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyCookie");
    apiKeyCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyCookie.setApiKeyPrefix("Token");

    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InviteApi apiInstance = new InviteApi(defaultClient);
    String userId = "userId_example"; // String | 
    try {
      List<InviteMessage> result = apiInstance.getInviteMessages(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InviteApi#getInviteMessages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**List&lt;InviteMessage&gt;**](InviteMessage.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a list of InviteMessage objects. |  -  |
**400** | Error response when trying to update an Invite Message with invalid slot number. |  -  |
**401** | Error response due to missing authorization to perform that action. |  -  |

<a name="inviteUser"></a>
# **inviteUser**
> Notification inviteUser(userId)

Invite User

Sends an invite to a user. Returns the Notification of type &#x60;invite&#x60; that was sent.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InviteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: apiKeyCookie
    ApiKeyAuth apiKeyCookie = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyCookie");
    apiKeyCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyCookie.setApiKeyPrefix("Token");

    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InviteApi apiInstance = new InviteApi(defaultClient);
    String userId = "userId_example"; // String | 
    try {
      Notification result = apiInstance.inviteUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InviteApi#inviteUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**Notification**](Notification.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a single Notifcation object. |  -  |
**403** | Error response when trying to invite someome whom you are not friends with. |  -  |

<a name="requestInvite"></a>
# **requestInvite**
> Notification requestInvite(userId)

Request Invite

Requests an invite from a user. Returns the Notification of type &#x60;requestInvite&#x60; that was sent.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InviteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: apiKeyCookie
    ApiKeyAuth apiKeyCookie = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyCookie");
    apiKeyCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyCookie.setApiKeyPrefix("Token");

    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InviteApi apiInstance = new InviteApi(defaultClient);
    String userId = "userId_example"; // String | 
    try {
      Notification result = apiInstance.requestInvite(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InviteApi#requestInvite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**Notification**](Notification.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a single Notifcation object. |  -  |
**403** | Error response when trying to invite someome whom you are not friends with. |  -  |

<a name="resetInviteMessage"></a>
# **resetInviteMessage**
> List&lt;InviteMessage&gt; resetInviteMessage(userId, messageId)

Reset Invite Message

Resets a single Invite Message back to it&#39;s original message, and then returns a list of all of them. Admin Credentials are required to update messages of other users!  Resetting a message respects the rate-limit, but resetting it does not set the rate-limit to 60 like when editing it. It is possible to edit it right after resetting it. Trying to edit a message before the cooldown timer expires results in a 429 Too Fast Error.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InviteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: apiKeyCookie
    ApiKeyAuth apiKeyCookie = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyCookie");
    apiKeyCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyCookie.setApiKeyPrefix("Token");

    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InviteApi apiInstance = new InviteApi(defaultClient);
    String userId = "userId_example"; // String | 
    Integer messageId = 56; // Integer | 
    try {
      List<InviteMessage> result = apiInstance.resetInviteMessage(userId, messageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InviteApi#resetInviteMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **messageId** | **Integer**|  |

### Return type

[**List&lt;InviteMessage&gt;**](InviteMessage.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a list of InviteMessage objects. |  -  |
**400** | Error response when trying to update an Invite Message with invalid slot number. |  -  |
**401** | Error response due to missing authorization to perform that action. |  -  |
**429** | Error response when trying to update an Invite Message before the cooldown has expired. |  -  |

<a name="respondInvite"></a>
# **respondInvite**
> Notification respondInvite(notificationId)

Respond Invite

Sends a world invite to a user.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InviteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: apiKeyCookie
    ApiKeyAuth apiKeyCookie = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyCookie");
    apiKeyCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyCookie.setApiKeyPrefix("Token");

    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InviteApi apiInstance = new InviteApi(defaultClient);
    String notificationId = "notificationId_example"; // String | 
    try {
      Notification result = apiInstance.respondInvite(notificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InviteApi#respondInvite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **String**|  |

### Return type

[**Notification**](Notification.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a single Notifcation object. |  -  |
**400** | Error response when trying to respond to an invite and something went wrong. |  -  |

<a name="updateInviteMessage"></a>
# **updateInviteMessage**
> List&lt;InviteMessage&gt; updateInviteMessage(userId, messageId)

Update Invite Message

Updates a single Invite Message and then returns a list of all of them. Admin Credentials are required to update messages of other users!  Updating a message automatically sets the cooldown timer to 60 minutes. Trying to edit a message before the cooldown timer expires results in a 429 Too Fast Error.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InviteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: apiKeyCookie
    ApiKeyAuth apiKeyCookie = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyCookie");
    apiKeyCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyCookie.setApiKeyPrefix("Token");

    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InviteApi apiInstance = new InviteApi(defaultClient);
    String userId = "userId_example"; // String | 
    Integer messageId = 56; // Integer | 
    try {
      List<InviteMessage> result = apiInstance.updateInviteMessage(userId, messageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InviteApi#updateInviteMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **messageId** | **Integer**|  |

### Return type

[**List&lt;InviteMessage&gt;**](InviteMessage.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a list of InviteMessage objects. |  -  |
**400** | Error response when trying to update an Invite Message with invalid slot number. |  -  |
**401** | Error response due to missing authorization to perform that action. |  -  |
**429** | Error response when trying to update an Invite Message before the cooldown has expired. |  -  |

