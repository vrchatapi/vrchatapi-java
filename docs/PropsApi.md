# PropsApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProp**](PropsApi.md#createProp) | **POST** /props | Create Prop |
| [**deleteProp**](PropsApi.md#deleteProp) | **DELETE** /props/{propId} | Delete Prop |
| [**getProp**](PropsApi.md#getProp) | **GET** /props/{propId} | Get Prop |
| [**getPropPublishStatus**](PropsApi.md#getPropPublishStatus) | **GET** /props/{propId}/publish | Get Prop Publish Status |
| [**listProps**](PropsApi.md#listProps) | **GET** /props | List Props |
| [**publishProp**](PropsApi.md#publishProp) | **PUT** /props/{propId}/publish | Publish Prop |
| [**unpublishProp**](PropsApi.md#unpublishProp) | **DELETE** /props/{propId}/publish | Unpublish Prop |
| [**updateProp**](PropsApi.md#updateProp) | **PUT** /props/{propId} | Update Prop |


<a name="createProp"></a>
# **createProp**
> Prop createProp(createPropRequest)

Create Prop

Create a Prop and return the new Prop object.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PropsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PropsApi apiInstance = new PropsApi(defaultClient);
    CreatePropRequest createPropRequest = new CreatePropRequest(); // CreatePropRequest | 
    try {
      Prop result = apiInstance.createProp(createPropRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropsApi#createProp");
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
| **createPropRequest** | [**CreatePropRequest**](CreatePropRequest.md)|  | |

### Return type

[**Prop**](Prop.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Prop object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response due to missing permissions. |  -  |

<a name="deleteProp"></a>
# **deleteProp**
> deleteProp(propId)

Delete Prop

Delete a Prop.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PropsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PropsApi apiInstance = new PropsApi(defaultClient);
    String propId = "prop_829ba6f6-b837-49d9-b9a9-056b82103b58"; // String | Prop ID.
    try {
      apiInstance.deleteProp(propId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropsApi#deleteProp");
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
| **propId** | **String**| Prop ID. | |

### Return type

null (empty response body)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Prop is successfully deleted. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response due to missing permissions. |  -  |
| **404** | Error response when trying to perform operations on a non-existing prop. |  -  |

<a name="getProp"></a>
# **getProp**
> Prop getProp(propId)

Get Prop

Returns a Prop object.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PropsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PropsApi apiInstance = new PropsApi(defaultClient);
    String propId = "prop_829ba6f6-b837-49d9-b9a9-056b82103b58"; // String | Prop ID.
    try {
      Prop result = apiInstance.getProp(propId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropsApi#getProp");
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
| **propId** | **String**| Prop ID. | |

### Return type

[**Prop**](Prop.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Prop object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing prop. |  -  |

<a name="getPropPublishStatus"></a>
# **getPropPublishStatus**
> PropPublishStatus getPropPublishStatus(propId)

Get Prop Publish Status

Returns a PropPublishStatus object.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PropsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PropsApi apiInstance = new PropsApi(defaultClient);
    String propId = "prop_829ba6f6-b837-49d9-b9a9-056b82103b58"; // String | Prop ID.
    try {
      PropPublishStatus result = apiInstance.getPropPublishStatus(propId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropsApi#getPropPublishStatus");
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
| **propId** | **String**| Prop ID. | |

### Return type

[**PropPublishStatus**](PropPublishStatus.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single PropPublishStatus object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response due to missing permissions. |  -  |
| **404** | Error response when trying to perform operations on a non-existing prop. |  -  |

<a name="listProps"></a>
# **listProps**
> List&lt;Prop&gt; listProps(authorId, n, offset)

List Props

Returns a list Prop objects.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PropsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PropsApi apiInstance = new PropsApi(defaultClient);
    String authorId = "authorId_example"; // String | Must be a valid user ID.
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    try {
      List<Prop> result = apiInstance.listProps(authorId, n, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropsApi#listProps");
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
| **authorId** | **String**| Must be a valid user ID. | |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |

### Return type

[**List&lt;Prop&gt;**](Prop.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Prop objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response due to missing permissions. |  -  |

<a name="publishProp"></a>
# **publishProp**
> PropPublishStatus publishProp(propId)

Publish Prop

Publish a Prop and return the updated PropPublishStatus object.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PropsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PropsApi apiInstance = new PropsApi(defaultClient);
    String propId = "prop_829ba6f6-b837-49d9-b9a9-056b82103b58"; // String | Prop ID.
    try {
      PropPublishStatus result = apiInstance.publishProp(propId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropsApi#publishProp");
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
| **propId** | **String**| Prop ID. | |

### Return type

[**PropPublishStatus**](PropPublishStatus.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single PropPublishStatus object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response due to missing permissions. |  -  |
| **404** | Error response when trying to perform operations on a non-existing prop. |  -  |

<a name="unpublishProp"></a>
# **unpublishProp**
> PropPublishStatus unpublishProp(propId)

Unpublish Prop

Unpublish a Prop and return the updated PropPublishStatus object.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PropsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PropsApi apiInstance = new PropsApi(defaultClient);
    String propId = "prop_829ba6f6-b837-49d9-b9a9-056b82103b58"; // String | Prop ID.
    try {
      PropPublishStatus result = apiInstance.unpublishProp(propId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropsApi#unpublishProp");
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
| **propId** | **String**| Prop ID. | |

### Return type

[**PropPublishStatus**](PropPublishStatus.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single PropPublishStatus object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response due to missing permissions. |  -  |
| **404** | Error response when trying to perform operations on a non-existing prop. |  -  |

<a name="updateProp"></a>
# **updateProp**
> Prop updateProp(propId, updatePropRequest)

Update Prop

Updates a Prop and returns the updated Prop object. When updating the asset bundle, all of &#x60;name&#x60;, &#x60;assetUrl&#x60;, &#x60;platform&#x60;, &#x60;unityVersion&#x60;, &#x60;assetVersion&#x60;, &#x60;spawnType&#x60;, and &#x60;worldPlacementMask&#x60; must be present, as well as &#x60;propSignature&#x60; if this value is not blank.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PropsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PropsApi apiInstance = new PropsApi(defaultClient);
    String propId = "prop_829ba6f6-b837-49d9-b9a9-056b82103b58"; // String | Prop ID.
    UpdatePropRequest updatePropRequest = new UpdatePropRequest(); // UpdatePropRequest | 
    try {
      Prop result = apiInstance.updateProp(propId, updatePropRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropsApi#updateProp");
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
| **propId** | **String**| Prop ID. | |
| **updatePropRequest** | [**UpdatePropRequest**](UpdatePropRequest.md)|  | |

### Return type

[**Prop**](Prop.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Prop object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response due to missing permissions. |  -  |
| **404** | Error response when trying to perform operations on a non-existing prop. |  -  |

