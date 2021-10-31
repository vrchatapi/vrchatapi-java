# InviteApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInviteMessage**](InviteApi.md#getInviteMessage) | **GET** /message/{userId}/{messageType}/{slot} | Get Invite Message
[**getInviteMessages**](InviteApi.md#getInviteMessages) | **GET** /message/{userId}/{messageType} | List Invite Messages
[**inviteUser**](InviteApi.md#inviteUser) | **POST** /invite/{userId} | Invite User
[**requestInvite**](InviteApi.md#requestInvite) | **POST** /requestInvite/{userId} | Request Invite
[**resetInviteMessage**](InviteApi.md#resetInviteMessage) | **DELETE** /message/{userId}/{messageType}/{slot} | Reset Invite Message
[**respondInvite**](InviteApi.md#respondInvite) | **POST** /invite/{notificationId}/response | Respond Invite
[**updateInviteMessage**](InviteApi.md#updateInviteMessage) | **PUT** /message/{userId}/{messageType}/{slot} | Update Invite Message


<a name="getInviteMessage"></a>
# **getInviteMessage**
> InviteMessage getInviteMessage(userId, messageType, slot)

Get Invite Message

Returns a single Invite Message. This returns the exact same information but less than &#x60;getInviteMessages&#x60;. Admin Credentials are required to view messages of other users!  Message type refers to a different collection of messages, used during different types of responses.  * &#x60;message&#x60; &#x3D; Message during a normal invite * &#x60;response&#x60; &#x3D; Message when replying to a message * &#x60;request&#x60; &#x3D; Message when requesting an invite * &#x60;requestResponse&#x60; &#x3D; Message when replying to a request for invite

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
    String messageType = "message"; // String | 
    Integer slot = 56; // Integer | 
    try {
      InviteMessage result = apiInstance.getInviteMessage(userId, messageType, slot);
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
 **messageType** | **String**|  | [enum: message, response, request, requestResponse]
 **slot** | **Integer**|  |

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
**400** | Error response when trying to get an Invite Message with a negative slot number. |  -  |
**401** | Error response due to missing authorization to perform that action. |  -  |
**404** | Error response when trying to get an Invite Message with a too high slot number. |  -  |

<a name="getInviteMessages"></a>
# **getInviteMessages**
> List&lt;InviteMessage&gt; getInviteMessages(userId, messageType)

List Invite Messages

Returns a list of all the users Invite Messages. Admin Credentials are required to view messages of other users!  Message type refers to a different collection of messages, used during different types of responses.  * &#x60;message&#x60; &#x3D; Message during a normal invite * &#x60;response&#x60; &#x3D; Message when replying to a message * &#x60;request&#x60; &#x3D; Message when requesting an invite * &#x60;requestResponse&#x60; &#x3D; Message when replying to a request for invite

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
    String messageType = "message"; // String | 
    try {
      List<InviteMessage> result = apiInstance.getInviteMessages(userId, messageType);
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
 **messageType** | **String**|  | [enum: message, response, request, requestResponse]

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
**400** | Error response when trying to update an Invite Message with an invalid slot number. |  -  |
**401** | Error response due to missing authorization to perform that action. |  -  |

<a name="inviteUser"></a>
# **inviteUser**
> Notification inviteUser(userId, inviteRequest)

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
    InviteRequest inviteRequest = new InviteRequest(); // InviteRequest | Slot number of the Invite Message to use when inviting a user.
    try {
      Notification result = apiInstance.inviteUser(userId, inviteRequest);
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
 **inviteRequest** | [**InviteRequest**](InviteRequest.md)| Slot number of the Invite Message to use when inviting a user. | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
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
> List&lt;InviteMessage&gt; resetInviteMessage(userId, messageType, slot)

Reset Invite Message

Resets a single Invite Message back to it&#39;s original message, and then returns a list of all of them. Admin Credentials are required to update messages of other users!  Resetting a message respects the rate-limit, so it is not possible to reset within the 60 minutes countdown. Resetting it does however not set the rate-limit to 60 like when editing it. It is possible to edit it right after resetting it. Trying to edit a message before the cooldown timer expires results in a 429 \&quot;Too Fast Error\&quot;.  Message type refers to a different collection of messages, used during different types of responses.  * &#x60;message&#x60; &#x3D; Message during a normal invite * &#x60;response&#x60; &#x3D; Message when replying to a message * &#x60;request&#x60; &#x3D; Message when requesting an invite * &#x60;requestResponse&#x60; &#x3D; Message when replying to a request for invite  The DELETE endpoint does not have/require any request body.

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
    String messageType = "message"; // String | 
    Integer slot = 56; // Integer | 
    try {
      List<InviteMessage> result = apiInstance.resetInviteMessage(userId, messageType, slot);
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
 **messageType** | **String**|  | [enum: message, response, request, requestResponse]
 **slot** | **Integer**|  |

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
**400** | Error response when trying to update an Invite Message with an invalid slot number. |  -  |
**401** | Error response due to missing authorization to perform that action. |  -  |
**404** | Error response when trying to reset an Invite Message whos slot doesn&#39;t exist. |  -  |
**429** | Error response when trying to update an Invite Message before the cooldown has expired. |  -  |

<a name="respondInvite"></a>
# **respondInvite**
> Notification respondInvite(notificationId, inviteResponse)

Respond Invite

Respond to an invite request by sending a world invite to the requesting user. &#x60;:notificationId&#x60; is the ID of the requesting notification.

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
    InviteResponse inviteResponse = new InviteResponse(); // InviteResponse | Instance ID when inviting a user.
    try {
      Notification result = apiInstance.respondInvite(notificationId, inviteResponse);
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
 **inviteResponse** | [**InviteResponse**](InviteResponse.md)| Instance ID when inviting a user. | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a single Notifcation object. |  -  |
**400** | Error response when trying to respond to an invite and something went wrong. |  -  |

<a name="updateInviteMessage"></a>
# **updateInviteMessage**
> List&lt;InviteMessage&gt; updateInviteMessage(userId, messageType, slot, updateInviteMessageRequest)

Update Invite Message

Updates a single Invite Message and then returns a list of all of them. Admin Credentials are required to update messages of other users!  Updating a message automatically sets the cooldown timer to 60 minutes. Trying to edit a message before the cooldown timer expires results in a 429 \&quot;Too Fast Error\&quot;.  Message type refers to a different collection of messages, used during different types of responses.  * &#x60;message&#x60; &#x3D; Message during a normal invite * &#x60;response&#x60; &#x3D; Message when replying to a message * &#x60;request&#x60; &#x3D; Message when requesting an invite * &#x60;requestResponse&#x60; &#x3D; Message when replying to a request for invite

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
    String messageType = "message"; // String | 
    Integer slot = 56; // Integer | 
    UpdateInviteMessageRequest updateInviteMessageRequest = new UpdateInviteMessageRequest(); // UpdateInviteMessageRequest | Message of what to set the invite message to.
    try {
      List<InviteMessage> result = apiInstance.updateInviteMessage(userId, messageType, slot, updateInviteMessageRequest);
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
 **messageType** | **String**|  | [enum: message, response, request, requestResponse]
 **slot** | **Integer**|  |
 **updateInviteMessageRequest** | [**UpdateInviteMessageRequest**](UpdateInviteMessageRequest.md)| Message of what to set the invite message to. | [optional]

### Return type

[**List&lt;InviteMessage&gt;**](InviteMessage.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a list of InviteMessage objects. |  -  |
**400** | Error response when trying to update an Invite Message with an invalid slot number. |  -  |
**401** | Error response due to missing authorization to perform that action. |  -  |
**429** | Error response when trying to update an Invite Message before the cooldown has expired. |  -  |

