# DeprecatedApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBalanceEarnings**](DeprecatedApi.md#getBalanceEarnings) | **GET** /user/{userId}/balance/earnings | Get Balance Earnings |
| [**getPropPublishStatus**](DeprecatedApi.md#getPropPublishStatus) | **GET** /props/{propId}/publish | Get Prop Publish Status |
| [**getSellerEligibility**](DeprecatedApi.md#getSellerEligibility) | **GET** /economy/seller/eligibility | Get Seller Eligibility |
| [**getTiliaStatus**](DeprecatedApi.md#getTiliaStatus) | **GET** /tilia/status | Get Tilia Status |
| [**getTiliaTos**](DeprecatedApi.md#getTiliaTos) | **GET** /user/{userId}/tilia/tos | Get Tilia TOS Agreement Status |
| [**getUserCreditsEligible**](DeprecatedApi.md#getUserCreditsEligible) | **GET** /users/{userId}/credits/eligible | Get User Credits Eligibility |
| [**publishProp**](DeprecatedApi.md#publishProp) | **PUT** /props/{propId}/publish | Publish Prop |
| [**unpublishProp**](DeprecatedApi.md#unpublishProp) | **DELETE** /props/{propId}/publish | Unpublish Prop |
| [**updateTiliaTos**](DeprecatedApi.md#updateTiliaTos) | **PUT** /user/{userId}/tilia/tos | Update Tilia TOS Agreement Status |


<a id="getBalanceEarnings"></a>
# **getBalanceEarnings**
> Balance getBalanceEarnings(userId)

Get Balance Earnings

Return the user&#39;s balance from earnings.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.DeprecatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    DeprecatedApi apiInstance = new DeprecatedApi(defaultClient);
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      Balance result = apiInstance.getBalanceEarnings(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeprecatedApi#getBalanceEarnings");
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

[**Balance**](Balance.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Balance object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | VRChat does not serve this route. A live route answers 200 or 401. |  -  |

<a id="getPropPublishStatus"></a>
# **getPropPublishStatus**
> PropPublishStatus getPropPublishStatus(propId)

Get Prop Publish Status

Return the PropPublishStatus object. &#x60;/props/{propId}&#x60; is still served.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.DeprecatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    DeprecatedApi apiInstance = new DeprecatedApi(defaultClient);
    String propId = "propId_example"; // String | Prop ID.
    try {
      PropPublishStatus result = apiInstance.getPropPublishStatus(propId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeprecatedApi#getPropPublishStatus");
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
| **404** | VRChat does not serve this route. A live route answers 200 or 401. |  -  |

<a id="getSellerEligibility"></a>
# **getSellerEligibility**
> SellerEligibility getSellerEligibility()

Get Seller Eligibility

Return the current user&#39;s eligibility to become a seller.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.DeprecatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    DeprecatedApi apiInstance = new DeprecatedApi(defaultClient);
    try {
      SellerEligibility result = apiInstance.getSellerEligibility();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeprecatedApi#getSellerEligibility");
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

[**SellerEligibility**](SellerEligibility.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single SellerEligibility object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | VRChat does not serve this route. A live route answers 200 or 401. |  -  |

<a id="getTiliaStatus"></a>
# **getTiliaStatus**
> TiliaStatus getTiliaStatus()

Get Tilia Status

Return the Tilia integration status.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.DeprecatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    DeprecatedApi apiInstance = new DeprecatedApi(defaultClient);
    try {
      TiliaStatus result = apiInstance.getTiliaStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeprecatedApi#getTiliaStatus");
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

[**TiliaStatus**](TiliaStatus.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single TiliaStatus object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | VRChat does not serve this route. A live route answers 200 or 401. |  -  |

<a id="getTiliaTos"></a>
# **getTiliaTos**
> TiliaTOS getTiliaTos(userId)

Get Tilia TOS Agreement Status

Return the user&#39;s Tilia TOS agreement status.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.DeprecatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    DeprecatedApi apiInstance = new DeprecatedApi(defaultClient);
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      TiliaTOS result = apiInstance.getTiliaTos(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeprecatedApi#getTiliaTos");
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

[**TiliaTOS**](TiliaTOS.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single TiliaTOS object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | VRChat does not serve this route. A live route answers 200 or 401. |  -  |

<a id="getUserCreditsEligible"></a>
# **getUserCreditsEligible**
> UserCreditsEligible getUserCreditsEligible(userId, subscriptionId)

Get User Credits Eligibility

Return the user&#39;s subscription credit eligibility.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.DeprecatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    DeprecatedApi apiInstance = new DeprecatedApi(defaultClient);
    String userId = "userId_example"; // String | Must be a valid user ID.
    String subscriptionId = "subscriptionId_example"; // String | 
    try {
      UserCreditsEligible result = apiInstance.getUserCreditsEligible(userId, subscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeprecatedApi#getUserCreditsEligible");
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
| **subscriptionId** | **String**|  | |

### Return type

[**UserCreditsEligible**](UserCreditsEligible.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single UserCreditsEligible object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | VRChat does not serve this route. A live route answers 200 or 401. |  -  |

<a id="publishProp"></a>
# **publishProp**
> PropPublishStatus publishProp(propId)

Publish Prop

Publish a prop and return the updated PropPublishStatus object. &#x60;/props/{propId}&#x60; is still served.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.DeprecatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    DeprecatedApi apiInstance = new DeprecatedApi(defaultClient);
    String propId = "propId_example"; // String | Prop ID.
    try {
      PropPublishStatus result = apiInstance.publishProp(propId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeprecatedApi#publishProp");
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
| **404** | VRChat does not serve this route. A live route answers 200 or 401. |  -  |

<a id="unpublishProp"></a>
# **unpublishProp**
> PropPublishStatus unpublishProp(propId)

Unpublish Prop

Unpublish a prop and return the updated PropPublishStatus object. &#x60;/props/{propId}&#x60; is still served.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.DeprecatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    DeprecatedApi apiInstance = new DeprecatedApi(defaultClient);
    String propId = "propId_example"; // String | Prop ID.
    try {
      PropPublishStatus result = apiInstance.unpublishProp(propId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeprecatedApi#unpublishProp");
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
| **404** | VRChat does not serve this route. A live route answers 200 or 401. |  -  |

<a id="updateTiliaTos"></a>
# **updateTiliaTos**
> Object updateTiliaTos(userId, updateTiliaTOSRequest)

Update Tilia TOS Agreement Status

Update the user&#39;s Tilia TOS agreement status.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.DeprecatedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    DeprecatedApi apiInstance = new DeprecatedApi(defaultClient);
    String userId = "userId_example"; // String | Must be a valid user ID.
    UpdateTiliaTOSRequest updateTiliaTOSRequest = new UpdateTiliaTOSRequest(); // UpdateTiliaTOSRequest | 
    try {
      Object result = apiInstance.updateTiliaTos(userId, updateTiliaTOSRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeprecatedApi#updateTiliaTos");
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
| **updateTiliaTOSRequest** | [**UpdateTiliaTOSRequest**](UpdateTiliaTOSRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a UserSubscription object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | VRChat does not serve this route. A live route answers 200 or 401. |  -  |

