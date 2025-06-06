# PrintsApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePrint**](PrintsApi.md#deletePrint) | **DELETE** /prints/{printId} | Delete Print |
| [**editPrint**](PrintsApi.md#editPrint) | **POST** /prints/{printId} | Edit Print |
| [**getPrint**](PrintsApi.md#getPrint) | **GET** /prints/{printId} | Get Print |
| [**getUserPrints**](PrintsApi.md#getUserPrints) | **GET** /prints/user/{userId} | Get Own Prints |
| [**uploadPrint**](PrintsApi.md#uploadPrint) | **POST** /prints | Upload Print |


<a name="deletePrint"></a>
# **deletePrint**
> deletePrint(printId)

Delete Print

Returns a print.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PrintsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PrintsApi apiInstance = new PrintsApi(defaultClient);
    String printId = "prnt_0a0aa0a0-85ea-42eb-b2f7-4840d7f341fa"; // String | Print ID.
    try {
      apiInstance.deletePrint(printId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrintsApi#deletePrint");
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
| **printId** | **String**| Print ID. | |

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
| **200** | Empty response if successful |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="editPrint"></a>
# **editPrint**
> Print editPrint(printId, image, note)

Edit Print

Edits a print.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PrintsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PrintsApi apiInstance = new PrintsApi(defaultClient);
    String printId = "prnt_0a0aa0a0-85ea-42eb-b2f7-4840d7f341fa"; // String | Print ID.
    File image = new File("/path/to/file"); // File | The binary blob of the png file.
    String note = "note_example"; // String | The caption for the image.
    try {
      Print result = apiInstance.editPrint(printId, image, note);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrintsApi#editPrint");
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
| **printId** | **String**| Print ID. | |
| **image** | **File**| The binary blob of the png file. | |
| **note** | **String**| The caption for the image. | [optional] |

### Return type

[**Print**](Print.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Print object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getPrint"></a>
# **getPrint**
> Print getPrint(printId)

Get Print

Returns a print.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PrintsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PrintsApi apiInstance = new PrintsApi(defaultClient);
    String printId = "prnt_0a0aa0a0-85ea-42eb-b2f7-4840d7f341fa"; // String | Print ID.
    try {
      Print result = apiInstance.getPrint(printId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrintsApi#getPrint");
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
| **printId** | **String**| Print ID. | |

### Return type

[**Print**](Print.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Print object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getUserPrints"></a>
# **getUserPrints**
> List&lt;Print&gt; getUserPrints(userId)

Get Own Prints

Returns a list of all prints of the user. User id has to be your own userId, as you can&#39;t request other user&#39;s prints.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PrintsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PrintsApi apiInstance = new PrintsApi(defaultClient);
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      List<Print> result = apiInstance.getUserPrints(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrintsApi#getUserPrints");
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

[**List&lt;Print&gt;**](Print.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Print objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response when trying to request another user&#39;s prints. |  -  |

<a name="uploadPrint"></a>
# **uploadPrint**
> Print uploadPrint(image, timestamp, note, worldId, worldName)

Upload Print

Uploads and creates a print.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.PrintsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    PrintsApi apiInstance = new PrintsApi(defaultClient);
    File image = new File("/path/to/file"); // File | The binary blob of the png file.
    OffsetDateTime timestamp = OffsetDateTime.now(); // OffsetDateTime | The time the image was captured.
    String note = "note_example"; // String | The caption for the image.
    String worldId = "worldId_example"; // String | The id of the world in which the image was captured.
    String worldName = "worldName_example"; // String | The name of the world in which the image was captured.
    try {
      Print result = apiInstance.uploadPrint(image, timestamp, note, worldId, worldName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrintsApi#uploadPrint");
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
| **image** | **File**| The binary blob of the png file. | |
| **timestamp** | **OffsetDateTime**| The time the image was captured. | |
| **note** | **String**| The caption for the image. | [optional] |
| **worldId** | **String**| The id of the world in which the image was captured. | [optional] |
| **worldName** | **String**| The name of the world in which the image was captured. | [optional] |

### Return type

[**Print**](Print.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Print object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

