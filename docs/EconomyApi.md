# EconomyApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProduct**](EconomyApi.md#createProduct) | **POST** /products | Create Product |
| [**createProductListingDirect**](EconomyApi.md#createProductListingDirect) | **POST** /listing | Create Product Listing |
| [**deleteProduct**](EconomyApi.md#deleteProduct) | **DELETE** /products/{productId} | Delete Product |
| [**deleteProductListingDirect**](EconomyApi.md#deleteProductListingDirect) | **DELETE** /listing/{productId} | Delete Product Listing |
| [**getActiveLicenses**](EconomyApi.md#getActiveLicenses) | **GET** /economy/licenses/active | Get Active Licenses |
| [**getBalance**](EconomyApi.md#getBalance) | **GET** /user/{userId}/balance | Get Balance |
| [**getBalanceEarnings**](EconomyApi.md#getBalanceEarnings) | **GET** /user/{userId}/balance/earnings | Get Balance Earnings |
| [**getBulkGiftPurchases**](EconomyApi.md#getBulkGiftPurchases) | **GET** /user/bulk/gift/purchases | Get Bulk Gift Purchases |
| [**getCurrentSubscriptions**](EconomyApi.md#getCurrentSubscriptions) | **GET** /auth/user/subscription | Get Current Subscriptions |
| [**getEarningsMetrics**](EconomyApi.md#getEarningsMetrics) | **GET** /economy/metrics/earnings | Get Earnings Metrics |
| [**getEconomyAccount**](EconomyApi.md#getEconomyAccount) | **GET** /user/{userId}/economy/account | Get Economy Account |
| [**getEconomyBalances**](EconomyApi.md#getEconomyBalances) | **GET** /user/{userId}/economy/balances | Get Economy Balances |
| [**getEconomyPayoutStatus**](EconomyApi.md#getEconomyPayoutStatus) | **GET** /user/{userId}/economy/payouts/status | Get Economy Payout Status |
| [**getEconomyPayouts**](EconomyApi.md#getEconomyPayouts) | **GET** /user/{userId}/economy/payouts/list | Get Economy Payouts |
| [**getLicenseGroup**](EconomyApi.md#getLicenseGroup) | **GET** /licenseGroups/{licenseGroupId} | Get License Group |
| [**getProductListing**](EconomyApi.md#getProductListing) | **GET** /listing/{productId} | Get Product Listing |
| [**getProductListingAlternate**](EconomyApi.md#getProductListingAlternate) | **GET** /products/{productId} | Get Product Listing (alternate) |
| [**getProductListings**](EconomyApi.md#getProductListings) | **GET** /user/{userId}/listings | Get User Product Listings |
| [**getProductPurchase**](EconomyApi.md#getProductPurchase) | **GET** /economy/purchases/{productPurchaseId} | Get Product Purchase |
| [**getProductPurchaseHistory**](EconomyApi.md#getProductPurchaseHistory) | **GET** /user/{userId}/economy/transactions | Get Product Purchase History |
| [**getProductPurchaseStacks**](EconomyApi.md#getProductPurchaseStacks) | **GET** /economy/purchases/{productPurchaseId}/stacks | Get Product Purchase Stacks |
| [**getProductPurchases**](EconomyApi.md#getProductPurchases) | **GET** /economy/purchases | Get Product Purchases |
| [**getRecentSubscription**](EconomyApi.md#getRecentSubscription) | **GET** /user/subscription/recent | Get Recent Subscription |
| [**getSellerEligibility**](EconomyApi.md#getSellerEligibility) | **GET** /economy/seller/eligibility | Get Seller Eligibility |
| [**getSteamTransaction**](EconomyApi.md#getSteamTransaction) | **GET** /Steam/transactions/{transactionId} | Get Steam Transaction |
| [**getSteamTransactions**](EconomyApi.md#getSteamTransactions) | **GET** /Steam/transactions | List Steam Transactions |
| [**getStore**](EconomyApi.md#getStore) | **GET** /economy/store | Get Store |
| [**getStoreShelves**](EconomyApi.md#getStoreShelves) | **GET** /economy/store/shelves | Get Store Shelves |
| [**getSubscriptions**](EconomyApi.md#getSubscriptions) | **GET** /subscriptions | List Subscriptions |
| [**getTiliaStatus**](EconomyApi.md#getTiliaStatus) | **GET** /tilia/status | Get Tilia Status |
| [**getTiliaTos**](EconomyApi.md#getTiliaTos) | **GET** /user/{userId}/tilia/tos | Get Tilia TOS Agreement Status |
| [**getTokenBundles**](EconomyApi.md#getTokenBundles) | **GET** /tokenBundles | List Token Bundles |
| [**getUserCreditsEligible**](EconomyApi.md#getUserCreditsEligible) | **GET** /users/{userId}/credits/eligible | Get User Credits Eligiblity |
| [**getUserSubscriptionEligible**](EconomyApi.md#getUserSubscriptionEligible) | **GET** /users/{userId}/subscription/eligible | Get User Subscription Eligiblity |
| [**getUserTiliaKyc**](EconomyApi.md#getUserTiliaKyc) | **GET** /user/{userId}/tilia/kyc | Get User Tilia KYC |
| [**listStores**](EconomyApi.md#listStores) | **GET** /economy/stores | List Stores |
| [**listUserProducts**](EconomyApi.md#listUserProducts) | **GET** /user/{userId}/products | List User Products |
| [**purchaseProductListing**](EconomyApi.md#purchaseProductListing) | **POST** /economy/purchase/listing | Purchase Product Listing |
| [**updateProduct**](EconomyApi.md#updateProduct) | **PUT** /products/{productId} | Update Product |
| [**updateProductListingDirect**](EconomyApi.md#updateProductListingDirect) | **PUT** /listing/{productId} | Update Product Listing |
| [**updateTiliaTos**](EconomyApi.md#updateTiliaTos) | **PUT** /user/{userId}/tilia/tos | Update Tilia TOS Agreement Status |


<a name="createProduct"></a>
# **createProduct**
> Product createProduct(createProductRequest)

Create Product

Creates a product and returns the new Product object.

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
    CreateProductRequest createProductRequest = new CreateProductRequest(); // CreateProductRequest | 
    try {
      Product result = apiInstance.createProduct(createProductRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#createProduct");
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
| **createProductRequest** | [**CreateProductRequest**](CreateProductRequest.md)|  | |

### Return type

[**Product**](Product.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Product object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="createProductListingDirect"></a>
# **createProductListingDirect**
> ProductListing createProductListingDirect(createListingRequest)

Create Product Listing

Creates a listing and returns the new ProductListing object. The request body is based on observed fields and may be incomplete.

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
    CreateListingRequest createListingRequest = new CreateListingRequest(); // CreateListingRequest | 
    try {
      ProductListing result = apiInstance.createProductListingDirect(createListingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#createProductListingDirect");
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
| **createListingRequest** | [**CreateListingRequest**](CreateListingRequest.md)|  | |

### Return type

[**ProductListing**](ProductListing.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single ProductListing object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="deleteProduct"></a>
# **deleteProduct**
> SuccessFlag deleteProduct(productId)

Delete Product

Deletes a product.

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
    try {
      SuccessFlag result = apiInstance.deleteProduct(productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#deleteProduct");
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

### Return type

[**SuccessFlag**](SuccessFlag.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an SuccessFlag object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="deleteProductListingDirect"></a>
# **deleteProductListingDirect**
> SuccessFlag deleteProductListingDirect(productId, hydrate)

Delete Product Listing

Deletes a listing.

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
      SuccessFlag result = apiInstance.deleteProductListingDirect(productId, hydrate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#deleteProductListingDirect");
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

[**SuccessFlag**](SuccessFlag.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an SuccessFlag object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getActiveLicenses"></a>
# **getActiveLicenses**
> List&lt;License&gt; getActiveLicenses()

Get Active Licenses

Gets active licenses

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
      List<License> result = apiInstance.getActiveLicenses();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getActiveLicenses");
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

[**List&lt;License&gt;**](License.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of License objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

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

<a name="getBalanceEarnings"></a>
# **getBalanceEarnings**
> Balance getBalanceEarnings(userId)

Get Balance Earnings

Gets the balance of a user from earnings

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
      Balance result = apiInstance.getBalanceEarnings(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getBalanceEarnings");
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

<a name="getBulkGiftPurchases"></a>
# **getBulkGiftPurchases**
> List&lt;Object&gt; getBulkGiftPurchases(mostRecent)

Get Bulk Gift Purchases

Get bulk gift purchases made by the user.

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
    Boolean mostRecent = true; // Boolean | 
    try {
      List<Object> result = apiInstance.getBulkGiftPurchases(mostRecent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getBulkGiftPurchases");
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
| **mostRecent** | **Boolean**|  | [optional] |

### Return type

**List&lt;Object&gt;**

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of ??? objects. |  -  |
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

<a name="getEarningsMetrics"></a>
# **getEarningsMetrics**
> EarningsMetrics getEarningsMetrics(sellerId, metricDateStart, metricDateEnd, groupByDuration)

Get Earnings Metrics

Gets earnings totals and breakdown metrics for the currently authenticated user.

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
    String sellerId = "sellerId_example"; // String | Seller to retrieve economy metrics for.
    String metricDateStart = "2026-03-28T23:00:00.000Z"; // String | Lower bound for economy metrics queries. Observed formats include both date-only and full ISO timestamps.
    String metricDateEnd = "2026-04-04T21:59:59.999Z"; // String | Upper bound for economy metrics queries. Observed formats include both date-only and full ISO timestamps.
    String groupByDuration = "days"; // String | Time bucket size for economy metrics. Observed values include `days` and `years`.
    try {
      EarningsMetrics result = apiInstance.getEarningsMetrics(sellerId, metricDateStart, metricDateEnd, groupByDuration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getEarningsMetrics");
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
| **sellerId** | **String**| Seller to retrieve economy metrics for. | |
| **metricDateStart** | **String**| Lower bound for economy metrics queries. Observed formats include both date-only and full ISO timestamps. | [optional] |
| **metricDateEnd** | **String**| Upper bound for economy metrics queries. Observed formats include both date-only and full ISO timestamps. | [optional] |
| **groupByDuration** | **String**| Time bucket size for economy metrics. Observed values include &#x60;days&#x60; and &#x60;years&#x60;. | [optional] |

### Return type

[**EarningsMetrics**](EarningsMetrics.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single EarningsMetrics object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getEconomyAccount"></a>
# **getEconomyAccount**
> EconomyAccount getEconomyAccount(userId)

Get Economy Account

Gets the economy account of a user

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
      EconomyAccount result = apiInstance.getEconomyAccount(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getEconomyAccount");
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

[**EconomyAccount**](EconomyAccount.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single EconomyAccount object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getEconomyBalances"></a>
# **getEconomyBalances**
> EconomyBalances getEconomyBalances(userId)

Get Economy Balances

Gets the combined balances for a user.

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
      EconomyBalances result = apiInstance.getEconomyBalances(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getEconomyBalances");
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

[**EconomyBalances**](EconomyBalances.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an EconomyBalances object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getEconomyPayoutStatus"></a>
# **getEconomyPayoutStatus**
> EconomyPayoutStatus getEconomyPayoutStatus(userId)

Get Economy Payout Status

Gets the current payout status and eligibility information for a user.

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
      EconomyPayoutStatus result = apiInstance.getEconomyPayoutStatus(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getEconomyPayoutStatus");
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

[**EconomyPayoutStatus**](EconomyPayoutStatus.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an EconomyPayoutStatus object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getEconomyPayouts"></a>
# **getEconomyPayouts**
> EconomyPayoutList getEconomyPayouts(userId)

Get Economy Payouts

Gets the payout history for a user.

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
      EconomyPayoutList result = apiInstance.getEconomyPayouts(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getEconomyPayouts");
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

[**EconomyPayoutList**](EconomyPayoutList.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an EconomyPayoutList object. |  -  |
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

<a name="getProductListingAlternate"></a>
# **getProductListingAlternate**
> ProductListing getProductListingAlternate(productId)

Get Product Listing (alternate)

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
    try {
      ProductListing result = apiInstance.getProductListingAlternate(productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getProductListingAlternate");
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
> List&lt;ProductListing&gt; getProductListings(userId, n, offset, hydrate, listingType, groupId, active)

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
    String listingType = "otp"; // String | Filter user listings by category. Observed values include `otp` and `subscription`.
    String groupId = "groupId_example"; // String | Must be a valid group ID.
    Boolean active = true; // Boolean | Filter for users' listings and inventory bundles.
    try {
      List<ProductListing> result = apiInstance.getProductListings(userId, n, offset, hydrate, listingType, groupId, active);
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
| **listingType** | **String**| Filter user listings by category. Observed values include &#x60;otp&#x60; and &#x60;subscription&#x60;. | [optional] |
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

<a name="getProductPurchase"></a>
# **getProductPurchase**
> ProductPurchase getProductPurchase(productPurchaseId)

Get Product Purchase

Gets a single product purchase

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
    String productPurchaseId = "productPurchaseId_example"; // String | Must be a valid purchase ID.
    try {
      ProductPurchase result = apiInstance.getProductPurchase(productPurchaseId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getProductPurchase");
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
| **productPurchaseId** | **String**| Must be a valid purchase ID. | |

### Return type

[**ProductPurchase**](ProductPurchase.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single ProductPurchase object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getProductPurchaseHistory"></a>
# **getProductPurchaseHistory**
> ProductPurchaseHistory getProductPurchaseHistory(userId, n, dateMin, dateMax, fromUserId, toUserId, sort, order)

Get Product Purchase History

Gets a history of product purchases

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
    OffsetDateTime dateMin = OffsetDateTime.now(); // OffsetDateTime | The start date of the search range.
    OffsetDateTime dateMax = OffsetDateTime.now(); // OffsetDateTime | The end date of the search range.
    String fromUserId = "fromUserId_example"; // String | Must be a valid user ID.
    String toUserId = "toUserId_example"; // String | Must be a valid user ID.
    SortOptionProductPurchase sort = SortOptionProductPurchase.fromValue("purchaseDate"); // SortOptionProductPurchase | The sort order of the results.
    OrderOptionShort order = OrderOptionShort.fromValue("asc"); // OrderOptionShort | Result ordering
    try {
      ProductPurchaseHistory result = apiInstance.getProductPurchaseHistory(userId, n, dateMin, dateMax, fromUserId, toUserId, sort, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getProductPurchaseHistory");
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
| **dateMin** | **OffsetDateTime**| The start date of the search range. | [optional] |
| **dateMax** | **OffsetDateTime**| The end date of the search range. | [optional] |
| **fromUserId** | **String**| Must be a valid user ID. | [optional] |
| **toUserId** | **String**| Must be a valid user ID. | [optional] |
| **sort** | [**SortOptionProductPurchase**](.md)| The sort order of the results. | [optional] [default to purchaseDate] [enum: purchaseDate] |
| **order** | [**OrderOptionShort**](.md)| Result ordering | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**ProductPurchaseHistory**](ProductPurchaseHistory.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single ProductPurchaseHistory object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getProductPurchaseStacks"></a>
# **getProductPurchaseStacks**
> List&lt;Object&gt; getProductPurchaseStacks(productPurchaseId)

Get Product Purchase Stacks

Gets stacks for a product purchase

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
    String productPurchaseId = "productPurchaseId_example"; // String | Must be a valid purchase ID.
    try {
      List<Object> result = apiInstance.getProductPurchaseStacks(productPurchaseId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getProductPurchaseStacks");
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
| **productPurchaseId** | **String**| Must be a valid purchase ID. | |

### Return type

**List&lt;Object&gt;**

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of stacks for a product purchase. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getProductPurchases"></a>
# **getProductPurchases**
> List&lt;ProductPurchase&gt; getProductPurchases(buyerId, sellerId, n, offset, mostRecent, sort, order)

Get Product Purchases

Gets product purchases

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
    String buyerId = "buyerId_example"; // String | Must be a valid user ID.
    String sellerId = "sellerId_example"; // String | Filter results by seller.
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    Boolean mostRecent = true; // Boolean | 
    SortOptionProductPurchase sort = SortOptionProductPurchase.fromValue("purchaseDate"); // SortOptionProductPurchase | The sort order of the results.
    OrderOptionShort order = OrderOptionShort.fromValue("asc"); // OrderOptionShort | Result ordering
    try {
      List<ProductPurchase> result = apiInstance.getProductPurchases(buyerId, sellerId, n, offset, mostRecent, sort, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getProductPurchases");
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
| **buyerId** | **String**| Must be a valid user ID. | |
| **sellerId** | **String**| Filter results by seller. | [optional] |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |
| **mostRecent** | **Boolean**|  | [optional] |
| **sort** | [**SortOptionProductPurchase**](.md)| The sort order of the results. | [optional] [default to purchaseDate] [enum: purchaseDate] |
| **order** | [**OrderOptionShort**](.md)| Result ordering | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**List&lt;ProductPurchase&gt;**](ProductPurchase.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of ProductPurchase objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getRecentSubscription"></a>
# **getRecentSubscription**
> UserSubscription getRecentSubscription()

Get Recent Subscription

Get the most recent user subscription.

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
      UserSubscription result = apiInstance.getRecentSubscription();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getRecentSubscription");
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

[**UserSubscription**](UserSubscription.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a UserSubscription object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getSellerEligibility"></a>
# **getSellerEligibility**
> SellerEligibility getSellerEligibility()

Get Seller Eligibility

Get the eligibility of the currently authenticated user to become a seller

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
      SellerEligibility result = apiInstance.getSellerEligibility();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getSellerEligibility");
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

<a name="getStore"></a>
# **getStore**
> Store getStore(storeId, hydrateListings, hydrateProducts)

Get Store

Gets a store

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
    String storeId = "storeId_example"; // String | 
    Boolean hydrateListings = true; // Boolean | Listings fields will be populated.
    Boolean hydrateProducts = true; // Boolean | Products fields will be populated.
    try {
      Store result = apiInstance.getStore(storeId, hydrateListings, hydrateProducts);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getStore");
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
| **storeId** | **String**|  | |
| **hydrateListings** | **Boolean**| Listings fields will be populated. | [optional] |
| **hydrateProducts** | **Boolean**| Products fields will be populated. | [optional] |

### Return type

[**Store**](Store.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Store object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getStoreShelves"></a>
# **getStoreShelves**
> List&lt;StoreShelf&gt; getStoreShelves(storeId, hydrateListings, fetch)

Get Store Shelves

Gets the shelves for a store

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
    String storeId = "storeId_example"; // String | 
    Boolean hydrateListings = true; // Boolean | Listings fields will be populated.
    StoreView fetch = StoreView.fromValue("all"); // StoreView | 
    try {
      List<StoreShelf> result = apiInstance.getStoreShelves(storeId, hydrateListings, fetch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getStoreShelves");
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
| **storeId** | **String**|  | |
| **hydrateListings** | **Boolean**| Listings fields will be populated. | [optional] |
| **fetch** | [**StoreView**](.md)|  | [optional] [default to public] [enum: all, draft, preview, public, publicPreview] |

### Return type

[**List&lt;StoreShelf&gt;**](StoreShelf.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of StoreShelf objects. |  -  |
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

<a name="getUserCreditsEligible"></a>
# **getUserCreditsEligible**
> UserCreditsEligible getUserCreditsEligible(userId, subscriptionId)

Get User Credits Eligiblity

Get the user&#39;s eligibility status for subscriptions based on available credits.

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
    String subscriptionId = "subscriptionId_example"; // String | 
    try {
      UserCreditsEligible result = apiInstance.getUserCreditsEligible(userId, subscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getUserCreditsEligible");
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

<a name="getUserSubscriptionEligible"></a>
# **getUserSubscriptionEligible**
> UserSubscriptionEligible getUserSubscriptionEligible(userId, steamId)

Get User Subscription Eligiblity

Get the user&#39;s eligibility status for subscriptions.

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
    String steamId = "game night"; // String | The Steam ID of the user.
    try {
      UserSubscriptionEligible result = apiInstance.getUserSubscriptionEligible(userId, steamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getUserSubscriptionEligible");
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
| **steamId** | **String**| The Steam ID of the user. | [optional] |

### Return type

[**UserSubscriptionEligible**](UserSubscriptionEligible.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single UserSubscriptionEligible object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getUserTiliaKyc"></a>
# **getUserTiliaKyc**
> TiliaKyc getUserTiliaKyc(userId)

Get User Tilia KYC

Gets KYC status details for a user&#39;s Tilia account.

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
      TiliaKyc result = apiInstance.getUserTiliaKyc(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#getUserTiliaKyc");
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

[**TiliaKyc**](TiliaKyc.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a TiliaKyc object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="listStores"></a>
# **listStores**
> List&lt;Store&gt; listStores(sellerId, managementPov, n, offset)

List Stores

Lists stores, optionally filtered to a seller and adjusted for management views.

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
    String sellerId = "sellerId_example"; // String | Filter results by seller.
    Boolean managementPov = true; // Boolean | Return stores from the seller management point of view.
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    try {
      List<Store> result = apiInstance.listStores(sellerId, managementPov, n, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#listStores");
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
| **sellerId** | **String**| Filter results by seller. | [optional] |
| **managementPov** | **Boolean**| Return stores from the seller management point of view. | [optional] |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |

### Return type

[**List&lt;Store&gt;**](Store.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Store objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="listUserProducts"></a>
# **listUserProducts**
> List&lt;Product&gt; listUserProducts(userId, n, offset)

List User Products

Gets the products of a given user.

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
    try {
      List<Product> result = apiInstance.listUserProducts(userId, n, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#listUserProducts");
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

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Product objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="purchaseProductListing"></a>
# **purchaseProductListing**
> ProductPurchase purchaseProductListing(purchaseProductListingRequest)

Purchase Product Listing

Purchases a product listing

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
    PurchaseProductListingRequest purchaseProductListingRequest = new PurchaseProductListingRequest(); // PurchaseProductListingRequest | 
    try {
      ProductPurchase result = apiInstance.purchaseProductListing(purchaseProductListingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#purchaseProductListing");
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
| **purchaseProductListingRequest** | [**PurchaseProductListingRequest**](PurchaseProductListingRequest.md)|  | [optional] |

### Return type

[**ProductPurchase**](ProductPurchase.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single ProductPurchase object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="updateProduct"></a>
# **updateProduct**
> Product updateProduct(productId, updateProductRequest)

Update Product

Updates a product and returns the updated Product object.

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
    UpdateProductRequest updateProductRequest = new UpdateProductRequest(); // UpdateProductRequest | 
    try {
      Product result = apiInstance.updateProduct(productId, updateProductRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#updateProduct");
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
| **updateProductRequest** | [**UpdateProductRequest**](UpdateProductRequest.md)|  | |

### Return type

[**Product**](Product.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Product object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="updateProductListingDirect"></a>
# **updateProductListingDirect**
> ProductListing updateProductListingDirect(productId, updateListingRequest, hydrate)

Update Product Listing

Updates the active state of a listing. Setting &#x60;active&#x60; to &#x60;true&#x60; publishes the listing, while &#x60;false&#x60; unpublishes it.

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
    UpdateListingRequest updateListingRequest = new UpdateListingRequest(); // UpdateListingRequest | 
    Boolean hydrate = true; // Boolean | Populates some fields and changes types of others for certain objects.
    try {
      ProductListing result = apiInstance.updateProductListingDirect(productId, updateListingRequest, hydrate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#updateProductListingDirect");
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
| **updateListingRequest** | [**UpdateListingRequest**](UpdateListingRequest.md)|  | |
| **hydrate** | **Boolean**| Populates some fields and changes types of others for certain objects. | [optional] |

### Return type

[**ProductListing**](ProductListing.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single ProductListing object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="updateTiliaTos"></a>
# **updateTiliaTos**
> Object updateTiliaTos(userId, updateTiliaTOSRequest)

Update Tilia TOS Agreement Status

Updates the status of the agreement of a user to the Tilia TOS

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
    UpdateTiliaTOSRequest updateTiliaTOSRequest = new UpdateTiliaTOSRequest(); // UpdateTiliaTOSRequest | 
    try {
      Object result = apiInstance.updateTiliaTos(userId, updateTiliaTOSRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EconomyApi#updateTiliaTos");
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

