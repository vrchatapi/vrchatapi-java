# InstancesApi

All URIs are relative to *https://vrchat.com/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**closeInstance**](InstancesApi.md#closeInstance) | **DELETE** /instances/{worldId}:{instanceId} | Close Instance |
| [**createInstance**](InstancesApi.md#createInstance) | **POST** /instances | Create Instance |
| [**getInstance**](InstancesApi.md#getInstance) | **GET** /instances/{worldId}:{instanceId} | Get Instance |
| [**getInstanceByShortName**](InstancesApi.md#getInstanceByShortName) | **GET** /instances/s/{shortName} | Get Instance By Short Name |
| [**getShortName**](InstancesApi.md#getShortName) | **GET** /instances/{worldId}:{instanceId}/shortName | Get Instance Short Name |
| [**sendSelfInvite**](InstancesApi.md#sendSelfInvite) | **POST** /instances/{worldId}:{instanceId}/invite | Send Self Invite |


<a name="closeInstance"></a>
# **closeInstance**
> Instance closeInstance(worldId, instanceId, hardClose, closedAt)

Close Instance

Close an instance or update the closedAt time when it will be closed.  You can only close an instance if the ownerId is yourself or if the instance owner is a group and you have the &#x60;group-instance-moderate&#x60; permission.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String worldId = "worldId_example"; // String | Must be a valid world ID.
    String instanceId = "instanceId_example"; // String | Must be a valid instance ID.
    Boolean hardClose = true; // Boolean | Whether to hard close the instance. Defaults to false.
    OffsetDateTime closedAt = OffsetDateTime.now(); // OffsetDateTime | The time after which users won't be allowed to join the instances. If omitted, the instance will be closed immediately.
    try {
      Instance result = apiInstance.closeInstance(worldId, instanceId, hardClose, closedAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#closeInstance");
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
| **worldId** | **String**| Must be a valid world ID. | |
| **instanceId** | **String**| Must be a valid instance ID. | |
| **hardClose** | **Boolean**| Whether to hard close the instance. Defaults to false. | [optional] |
| **closedAt** | **OffsetDateTime**| The time after which users won&#39;t be allowed to join the instances. If omitted, the instance will be closed immediately. | [optional] |

### Return type

[**Instance**](Instance.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Instance object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response due to not being allowed to close an instance |  -  |
| **404** | Error response due to non existant instance |  -  |

<a name="createInstance"></a>
# **createInstance**
> Instance createInstance(createInstanceRequest)

Create Instance

Create an instance

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    CreateInstanceRequest createInstanceRequest = new CreateInstanceRequest(); // CreateInstanceRequest | 
    try {
      Instance result = apiInstance.createInstance(createInstanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#createInstance");
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
| **createInstanceRequest** | [**CreateInstanceRequest**](CreateInstanceRequest.md)|  | |

### Return type

[**Instance**](Instance.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Instance object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getInstance"></a>
# **getInstance**
> Instance getInstance(worldId, instanceId)

Get Instance

Returns an instance. Please read [Instances Tutorial](https://vrchatapi.github.io/tutorials/instances/) for more information on Instances.  If an invalid instanceId is provided, this endpoint will simply return \&quot;null\&quot;!

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String worldId = "worldId_example"; // String | Must be a valid world ID.
    String instanceId = "instanceId_example"; // String | Must be a valid instance ID.
    try {
      Instance result = apiInstance.getInstance(worldId, instanceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstance");
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
| **worldId** | **String**| Must be a valid world ID. | |
| **instanceId** | **String**| Must be a valid instance ID. | |

### Return type

[**Instance**](Instance.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Instance object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getInstanceByShortName"></a>
# **getInstanceByShortName**
> Instance getInstanceByShortName(shortName)

Get Instance By Short Name

Returns an instance. Please read [Instances Tutorial](https://vrchatapi.github.io/tutorials/instances/) for more information on Instances.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String shortName = "shortName_example"; // String | Must be a valid instance short name.
    try {
      Instance result = apiInstance.getInstanceByShortName(shortName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstanceByShortName");
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
| **shortName** | **String**| Must be a valid instance short name. | |

### Return type

[**Instance**](Instance.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Instance object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response due to non existant instance |  -  |

<a name="getShortName"></a>
# **getShortName**
> InstanceShortNameResponse getShortName(worldId, instanceId)

Get Instance Short Name

Returns an instance short name.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String worldId = "worldId_example"; // String | Must be a valid world ID.
    String instanceId = "instanceId_example"; // String | Must be a valid instance ID.
    try {
      InstanceShortNameResponse result = apiInstance.getShortName(worldId, instanceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getShortName");
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
| **worldId** | **String**| Must be a valid world ID. | |
| **instanceId** | **String**| Must be a valid instance ID. | |

### Return type

[**InstanceShortNameResponse**](InstanceShortNameResponse.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an instance secureName and/or shortName. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="sendSelfInvite"></a>
# **sendSelfInvite**
> Success sendSelfInvite(worldId, instanceId)

Send Self Invite

Sends an invite to the instance to yourself.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String worldId = "worldId_example"; // String | Must be a valid world ID.
    String instanceId = "instanceId_example"; // String | Must be a valid instance ID.
    try {
      Success result = apiInstance.sendSelfInvite(worldId, instanceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#sendSelfInvite");
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
| **worldId** | **String**| Must be a valid world ID. | |
| **instanceId** | **String**| Must be a valid instance ID. | |

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
| **200** | Success response after sending an invite to yourself to the instance. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

