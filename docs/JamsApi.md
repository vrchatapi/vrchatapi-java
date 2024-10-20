# JamsApi

All URIs are relative to *https://vrchat.com/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getJam**](JamsApi.md#getJam) | **GET** /jams/{jamId} | Show jam information |
| [**getJamSubmissions**](JamsApi.md#getJamSubmissions) | **GET** /jams/{jamId}/submissions | Show jam submissions |
| [**getJams**](JamsApi.md#getJams) | **GET** /jams | Show jams list |


<a name="getJam"></a>
# **getJam**
> Jam getJam(jamId)

Show jam information

Returns a jam.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.JamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    JamsApi apiInstance = new JamsApi(defaultClient);
    String jamId = "jam_0b7e3f6d-4647-4648-b2a1-1431e76906d9"; // String | Must be a valid query ID.
    try {
      Jam result = apiInstance.getJam(jamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JamsApi#getJam");
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
| **jamId** | **String**| Must be a valid query ID. | |

### Return type

[**Jam**](Jam.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a Jam object. |  -  |
| **404** | Error response when trying to show information about a non-existent jam. |  -  |

<a name="getJamSubmissions"></a>
# **getJamSubmissions**
> List&lt;Submission&gt; getJamSubmissions(jamId)

Show jam submissions

Returns all submissions of a jam.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.JamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    JamsApi apiInstance = new JamsApi(defaultClient);
    String jamId = "jam_0b7e3f6d-4647-4648-b2a1-1431e76906d9"; // String | Must be a valid query ID.
    try {
      List<Submission> result = apiInstance.getJamSubmissions(jamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JamsApi#getJamSubmissions");
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
| **jamId** | **String**| Must be a valid query ID. | |

### Return type

[**List&lt;Submission&gt;**](Submission.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Submission objects. |  -  |
| **404** | Error response when trying to show information about a non-existent jam. |  -  |

<a name="getJams"></a>
# **getJams**
> List&lt;Jam&gt; getJams(type)

Show jams list

Lists World Jams or Avatar Jams, both currently running and ones that have ended.  &#x60;isActive&#x60; is used to select only active or already ended jams.  &#x60;type&#x60; is used to select only world or avatar jams, and can only take &#x60;world&#x60; or &#x60;avatar&#x60;. &#x60;&#x60;

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.JamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    JamsApi apiInstance = new JamsApi(defaultClient);
    String type = "avatar"; // String | Only show jams of this type (`avatar` or `world`).
    try {
      List<Jam> result = apiInstance.getJams(type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JamsApi#getJams");
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
| **type** | **String**| Only show jams of this type (&#x60;avatar&#x60; or &#x60;world&#x60;). | [optional] |

### Return type

[**List&lt;Jam&gt;**](Jam.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Jam objects. |  -  |

