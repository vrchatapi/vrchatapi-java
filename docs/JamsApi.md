# JamsApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteJamSubmission**](JamsApi.md#deleteJamSubmission) | **DELETE** /jams/{jamId}/submissions/{jamSubmissionId} | Delete Jam Submission |
| [**getJam**](JamsApi.md#getJam) | **GET** /jams/{jamId} | Show jam information |
| [**getJamSubmissions**](JamsApi.md#getJamSubmissions) | **GET** /jams/{jamId}/submissions | Show jam submissions |
| [**getJams**](JamsApi.md#getJams) | **GET** /jams | Show jams list |
| [**submitJamContent**](JamsApi.md#submitJamContent) | **POST** /jams/{jamId}/submissions | Submit Jam Content |


<a name="deleteJamSubmission"></a>
# **deleteJamSubmission**
> Success deleteJamSubmission(jamId, jamSubmissionId)

Delete Jam Submission

Withdraws a content submission from a jam.

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
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    JamsApi apiInstance = new JamsApi(defaultClient);
    String jamId = "jamId_example"; // String | Must be a valid jam ID.
    String jamSubmissionId = "jamSubmissionId_example"; // String | Must be a valid jam submission ID.
    try {
      Success result = apiInstance.deleteJamSubmission(jamId, jamSubmissionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JamsApi#deleteJamSubmission");
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
| **jamId** | **String**| Must be a valid jam ID. | |
| **jamSubmissionId** | **String**| Must be a valid jam submission ID. | |

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
| **200** | Returns an Success object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response due to missing permissions. |  -  |
| **404** | Error response when trying to show information about a non-existent jam. |  -  |

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
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    JamsApi apiInstance = new JamsApi(defaultClient);
    String jamId = "jamId_example"; // String | Must be a valid jam ID.
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
| **jamId** | **String**| Must be a valid jam ID. | |

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
> List&lt;JamSubmission&gt; getJamSubmissions(jamId, contentId, submitterId)

Show jam submissions

Returns all submissions of a jam. Can filter by contentId (for world or avatar jams) or submitterId (for a participant).

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
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    JamsApi apiInstance = new JamsApi(defaultClient);
    String jamId = "jamId_example"; // String | Must be a valid jam ID.
    String contentId = "contentId_example"; // String | Filter for particular content submitted, e.g., a groupId, userId, avatarId, etc.
    String submitterId = "submitterId_example"; // String | Must be a valid user ID.
    try {
      List<JamSubmission> result = apiInstance.getJamSubmissions(jamId, contentId, submitterId);
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
| **jamId** | **String**| Must be a valid jam ID. | |
| **contentId** | **String**| Filter for particular content submitted, e.g., a groupId, userId, avatarId, etc. | [optional] |
| **submitterId** | **String**| Must be a valid user ID. | [optional] |

### Return type

[**List&lt;JamSubmission&gt;**](JamSubmission.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of JamSubmission objects. |  -  |
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
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
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

<a name="submitJamContent"></a>
# **submitJamContent**
> JamSubmission submitJamContent(jamId, createJamSubmissionRequest)

Submit Jam Content

Submits content to a jam. The content must have been uploaded by the submitter, and both the content upload and jam submission must be made within the jam&#39;s designated times.

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
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    JamsApi apiInstance = new JamsApi(defaultClient);
    String jamId = "jamId_example"; // String | Must be a valid jam ID.
    CreateJamSubmissionRequest createJamSubmissionRequest = new CreateJamSubmissionRequest(); // CreateJamSubmissionRequest | 
    try {
      JamSubmission result = apiInstance.submitJamContent(jamId, createJamSubmissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JamsApi#submitJamContent");
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
| **jamId** | **String**| Must be a valid jam ID. | |
| **createJamSubmissionRequest** | [**CreateJamSubmissionRequest**](CreateJamSubmissionRequest.md)|  | [optional] |

### Return type

[**JamSubmission**](JamSubmission.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single JamSubmission object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to show information about a non-existent jam. |  -  |

