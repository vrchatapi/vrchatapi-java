# EconomyApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBalance**](EconomyApi.md#getBalance) | **GET** /user/{userId}/balance | Get Balance |
| [**getCurrentSubscriptions**](EconomyApi.md#getCurrentSubscriptions) | **GET** /auth/user/subscription | Get Current Subscriptions |
| [**getLicenseGroup**](EconomyApi.md#getLicenseGroup) | **GET** /licenseGroups/{licenseGroupId} | Get License Group |
| [**getProductListing**](EconomyApi.md#getProductListing) | **GET** /listing/{productId} | Get Product Listing |
| [**getProductListings**](EconomyApi.md#getProductListings) | **GET** /user/{userId}/listings | Get User Product Listings |
| [**getSteamTransaction**](EconomyApi.md#getSteamTransaction) | **GET** /Steam/transactions/{transactionId} | Get Steam Transaction |
| [**getSteamTransactions**](EconomyApi.md#getSteamTransactions) | **GET** /Steam/transactions | List Steam Transactions |
| [**getSubscriptions**](EconomyApi.md#getSubscriptions) | **GET** /subscriptions | List Subscriptions |
| [**getTiliaStatus**](EconomyApi.md#getTiliaStatus) | **GET** /tilia/status | Get Tilia Status |
| [**getTiliaTos**](EconomyApi.md#getTiliaTos) | **GET** /user/{userId}/tilia/tos | Get Tilia TOS Agreement Status |
| [**getTokenBundles**](EconomyApi.md#getTokenBundles) | **GET** /tokenBundles | List Token Bundles |


<a name="getBalance"></a>
# **getBalance**
> Balance getBalance(userId)

Get Balance

Gets the balance of a user

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.EconomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    EconomyApi apiInstance = new EconomyApi(defaultClient);
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      Balance result = apiInstance.getBalance(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getBalance");
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

<a name="getCurrentSubscriptions"></a>
# **getCurrentSubscriptions**
> List&lt;UserSubscription&gt; getCurrentSubscriptions()

Get Current Subscriptions

Get a list of all current user subscriptions.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.EconomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    EconomyApi apiInstance = new EconomyApi(defaultClient);
    try {
      List<UserSubscription> result = apiInstance.getCurrentSubscriptions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getCurrentSubscriptions");
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

[**List&lt;UserSubscription&gt;**](UserSubscription.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of UserSubscription objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getLicenseGroup"></a>
# **getLicenseGroup**
> LicenseGroup getLicenseGroup(licenseGroupId)

Get License Group

Get a single License Group by given ID.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.EconomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    EconomyApi apiInstance = new EconomyApi(defaultClient);
    String licenseGroupId = "licenseGroupId_example"; // String | Must be a valid license group ID.
    try {
      LicenseGroup result = apiInstance.getLicenseGroup(licenseGroupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getLicenseGroup");
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
| **licenseGroupId** | **String**| Must be a valid license group ID. | |

### Return type

[**LicenseGroup**](LicenseGroup.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single LicenseGroup object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getProductListing"></a>
# **getProductListing**
> ProductListing getProductListing(productId, hydrate)

Get Product Listing

Gets a product listing

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.EconomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    EconomyApi apiInstance = new EconomyApi(defaultClient);
    String productId = "productId_example"; // String | Must be a valid product ID.
    Boolean hydrate = true; // Boolean | Populates some fields and changes types of others for certain objects.
    try {
      ProductListing result = apiInstance.getProductListing(productId, hydrate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getProductListing");
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
| **productId** | **String**| Must be a valid product ID. | |
| **hydrate** | **Boolean**| Populates some fields and changes types of others for certain objects. | [optional] |

### Return type

[**ProductListing**](ProductListing.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single ProductListing object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getProductListings"></a>
# **getProductListings**
> List&lt;ProductListing&gt; getProductListings(userId, n, offset, hydrate, groupId, active)

Get User Product Listings

Gets the product listings of a given user

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.EconomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    EconomyApi apiInstance = new EconomyApi(defaultClient);
    String userId = "userId_example"; // String | Must be a valid user ID.
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    Boolean hydrate = true; // Boolean | Populates some fields and changes types of others for certain objects.
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    Boolean active = true; // Boolean | Filter for users' listings and inventory bundles.
    try {
      List<ProductListing> result = apiInstance.getProductListings(userId, n, offset, hydrate, groupId, active);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getProductListings");
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
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |
| **hydrate** | **Boolean**| Populates some fields and changes types of others for certain objects. | [optional] |
| **groupId** | **String**| Must be a valid group ID. | [optional] |
| **active** | **Boolean**| Filter for users&#39; listings and inventory bundles. | [optional] |

### Return type

[**List&lt;ProductListing&gt;**](ProductListing.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of ProductListing objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getSteamTransaction"></a>
# **getSteamTransaction**
> Transaction getSteamTransaction(transactionId)

Get Steam Transaction

Get a single Steam transactions by ID. This returns the exact same information as &#x60;getSteamTransactions&#x60;, so no point in using this endpoint.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.EconomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    EconomyApi apiInstance = new EconomyApi(defaultClient);
    String transactionId = "transactionId_example"; // String | Must be a valid transaction ID.
    try {
      Transaction result = apiInstance.getSteamTransaction(transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getSteamTransaction");
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
| **transactionId** | **String**| Must be a valid transaction ID. | |

### Return type

[**Transaction**](Transaction.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Transaction object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getSteamTransactions"></a>
# **getSteamTransactions**
> List&lt;Transaction&gt; getSteamTransactions()

List Steam Transactions

Get all own Steam transactions.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.EconomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    EconomyApi apiInstance = new EconomyApi(defaultClient);
    try {
      List<Transaction> result = apiInstance.getSteamTransactions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getSteamTransactions");
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

[**List&lt;Transaction&gt;**](Transaction.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Transaction objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getSubscriptions"></a>
# **getSubscriptions**
> List&lt;Subscription&gt; getSubscriptions()

List Subscriptions

List all existing Subscriptions. For example, \&quot;vrchatplus-monthly\&quot; and \&quot;vrchatplus-yearly\&quot;.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.EconomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    EconomyApi apiInstance = new EconomyApi(defaultClient);
    try {
      List<Subscription> result = apiInstance.getSubscriptions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getSubscriptions");
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

[**List&lt;Subscription&gt;**](Subscription.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Subscription objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getTiliaStatus"></a>
# **getTiliaStatus**
> TiliaStatus getTiliaStatus()

Get Tilia Status

Gets the status of Tilia integration

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.EconomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    EconomyApi apiInstance = new EconomyApi(defaultClient);
    try {
      TiliaStatus result = apiInstance.getTiliaStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getTiliaStatus");
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

<a name="getTiliaTos"></a>
# **getTiliaTos**
> TiliaTOS getTiliaTos(userId)

Get Tilia TOS Agreement Status

Gets the status of the agreement of a user to the Tilia TOS

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.EconomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    EconomyApi apiInstance = new EconomyApi(defaultClient);
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      TiliaTOS result = apiInstance.getTiliaTos(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getTiliaTos");
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

<a name="getTokenBundles"></a>
# **getTokenBundles**
> List&lt;TokenBundle&gt; getTokenBundles()

List Token Bundles

Gets the list of token bundles

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.EconomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    EconomyApi apiInstance = new EconomyApi(defaultClient);
    try {
      List<TokenBundle> result = apiInstance.getTokenBundles();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getTokenBundles");
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

[**List&lt;TokenBundle&gt;**](TokenBundle.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of TokenBundle objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

