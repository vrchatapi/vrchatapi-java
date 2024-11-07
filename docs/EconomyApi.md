# EconomyApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrentSubscriptions**](EconomyApi.md#getCurrentSubscriptions) | **GET** /auth/user/subscription | Get Current Subscriptions |
| [**getLicenseGroup**](EconomyApi.md#getLicenseGroup) | **GET** /licenseGroups/{licenseGroupId} | Get License Group |
| [**getSteamTransaction**](EconomyApi.md#getSteamTransaction) | **GET** /Steam/transactions/{transactionId} | Get Steam Transaction |
| [**getSteamTransactions**](EconomyApi.md#getSteamTransactions) | **GET** /Steam/transactions | List Steam Transactions |
| [**getSubscriptions**](EconomyApi.md#getSubscriptions) | **GET** /subscriptions | List Subscriptions |


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

