# FilesApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](FilesApi.md#createFile) | **POST** /file | Create File
[**createFileVersion**](FilesApi.md#createFileVersion) | **POST** /file/{fileId} | Create File Version
[**deleteFile**](FilesApi.md#deleteFile) | **DELETE** /file/{fileId} | Delete File
[**deleteFileVersion**](FilesApi.md#deleteFileVersion) | **DELETE** /file/{fileId}/{versionId} | Delete File Version
[**downloadFileVersion**](FilesApi.md#downloadFileVersion) | **GET** /file/{fileId}/{versionId} | Download File Version
[**finishFileDataUpload**](FilesApi.md#finishFileDataUpload) | **PUT** /file/{fileId}/{versionId}/{fileType}/finish | Finish FileData Upload
[**getFile**](FilesApi.md#getFile) | **GET** /file/{fileId} | Show File
[**getFileDataUploadStatus**](FilesApi.md#getFileDataUploadStatus) | **GET** /file/{fileId}/{versionId}/{fileType}/status | Check FileData Upload Status
[**getFiles**](FilesApi.md#getFiles) | **GET** /files | List Files
[**startFileDataUpload**](FilesApi.md#startFileDataUpload) | **PUT** /file/{fileId}/{versionId}/{fileType}/start | Start FileData Upload


<a name="createFile"></a>
# **createFile**
> java.io.File createFile(inlineObject3)

Create File

Creates a new File object

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
    try {
      java.io.File result = apiInstance.createFile(inlineObject3);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#createFile");
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
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**java.io.File**](java.io.File.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a single File object. |  -  |

<a name="createFileVersion"></a>
# **createFileVersion**
> java.io.File createFileVersion(fileId, inlineObject4)

Create File Version

Creates a new FileVersion. Once a Version has been created, proceed to the &#x60;/file/{fileId}/{versionId}/file/start&#x60; endpoint to start a file upload.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String fileId = "file_00000000-0000-0000-0000-000000000000"; // String | 
    InlineObject4 inlineObject4 = new InlineObject4(); // InlineObject4 | 
    try {
      java.io.File result = apiInstance.createFileVersion(fileId, inlineObject4);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#createFileVersion");
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
 **fileId** | **String**|  |
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  | [optional]

### Return type

[**java.io.File**](java.io.File.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a single File object. |  -  |

<a name="deleteFile"></a>
# **deleteFile**
> Success deleteFile(fileId)

Delete File

Deletes a File object.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String fileId = "file_00000000-0000-0000-0000-000000000000"; // String | 
    try {
      Success result = apiInstance.deleteFile(fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#deleteFile");
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
 **fileId** | **String**|  |

### Return type

[**Success**](Success.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response after deleting a File. |  -  |
**404** | Error response when trying to delete a non-existent file. |  -  |

<a name="deleteFileVersion"></a>
# **deleteFileVersion**
> java.io.File deleteFileVersion(fileId, versionId)

Delete File Version

Delete a specific version of a file. You can only delete the latest version.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String fileId = "file_00000000-0000-0000-0000-000000000000"; // String | 
    Integer versionId = 1; // Integer | 
    try {
      java.io.File result = apiInstance.deleteFileVersion(fileId, versionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#deleteFileVersion");
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
 **fileId** | **String**|  |
 **versionId** | **Integer**|  |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a single File object. |  -  |
**400** | Error response when trying to delete the initial version of a file. Delete the main File object instead. |  -  |
**500** | Error response when trying to delete any version of a file that is not hte last one. |  -  |

<a name="downloadFileVersion"></a>
# **downloadFileVersion**
> downloadFileVersion(fileId, versionId)

Download File Version

Downloads the file with the provided version number.  **Version Note:** Version 0 is always when the file was created. The real data is usually always located in version 1 and up.  **Extension Note:** Files are not guaranteed to have a file extensions. UnityPackage files tends to have it, images through this endpoint do not. You are responsible for appending file extension from the &#x60;extension&#x60; field when neccesary.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String fileId = "file_00000000-0000-0000-0000-000000000000"; // String | 
    Integer versionId = 1; // Integer | 
    try {
      apiInstance.downloadFileVersion(fileId, versionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#downloadFileVersion");
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
 **fileId** | **String**|  |
 **versionId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Raw file |  -  |

<a name="finishFileDataUpload"></a>
# **finishFileDataUpload**
> java.io.File finishFileDataUpload(fileId, versionId, fileType, inlineObject5)

Finish FileData Upload

Finish an upload of a FileData. This will mark it as \&quot;complete\&quot;. After uploading the &#x60;file&#x60; for Avatars and Worlds you then have to upload a &#x60;signature&#x60; file.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String fileId = "file_00000000-0000-0000-0000-000000000000"; // String | 
    Integer versionId = 1; // Integer | 
    String fileType = "file"; // String | 
    InlineObject5 inlineObject5 = new InlineObject5(); // InlineObject5 | 
    try {
      java.io.File result = apiInstance.finishFileDataUpload(fileId, versionId, fileType, inlineObject5);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#finishFileDataUpload");
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
 **fileId** | **String**|  |
 **versionId** | **Integer**|  |
 **fileType** | **String**|  | [enum: file, signature, delta]
 **inlineObject5** | [**InlineObject5**](InlineObject5.md)|  | [optional]

### Return type

[**java.io.File**](java.io.File.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a single File object. |  -  |

<a name="getFile"></a>
# **getFile**
> java.io.File getFile(fileId)

Show File

Shows general information about the \&quot;File\&quot; object. Each File can have several \&quot;Version\&quot;&#39;s, and each Version can have multiple real files or \&quot;Data\&quot; blobs.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String fileId = "file_00000000-0000-0000-0000-000000000000"; // String | 
    try {
      java.io.File result = apiInstance.getFile(fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getFile");
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
 **fileId** | **String**|  |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a single File object. |  -  |
**404** | Error response when trying to show information about a non-existent file. |  -  |

<a name="getFileDataUploadStatus"></a>
# **getFileDataUploadStatus**
> InlineResponse2004 getFileDataUploadStatus(fileId, versionId, fileType)

Check FileData Upload Status

Retrieves the upload status for file upload. Can currently only be accessed when &#x60;status&#x60; is &#x60;waiting&#x60;. Trying to access it on a file version already uploaded currently times out.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String fileId = "file_00000000-0000-0000-0000-000000000000"; // String | 
    Integer versionId = 1; // Integer | 
    String fileType = "file"; // String | 
    try {
      InlineResponse2004 result = apiInstance.getFileDataUploadStatus(fileId, versionId, fileType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getFileDataUploadStatus");
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
 **fileId** | **String**|  |
 **versionId** | **Integer**|  |
 **fileType** | **String**|  | [enum: file, signature, delta]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Current FileVersion upload status. Contains the uploadId needed for uploading, as well as the already uploaded parts. |  -  |

<a name="getFiles"></a>
# **getFiles**
> List&lt;java.io.File&gt; getFiles(tag, userId, n, offset)

List Files

Returns a list of files

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String tag = "tag_example"; // String | Tag, for example \"icon\" or \"gallery\", not included by default.
    String userId = "userId_example"; // String | UserID, will always generate a 500 permission error.
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    try {
      List<java.io.File> result = apiInstance.getFiles(tag, userId, n, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getFiles");
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
 **tag** | **String**| Tag, for example \&quot;icon\&quot; or \&quot;gallery\&quot;, not included by default. | [optional]
 **userId** | **String**| UserID, will always generate a 500 permission error. | [optional]
 **n** | **Integer**| The number of objects to return. | [optional] [default to 60]
 **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional]

### Return type

[**List&lt;java.io.File&gt;**](java.io.File.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a list of File objects. |  -  |

<a name="startFileDataUpload"></a>
# **startFileDataUpload**
> InlineResponse2005 startFileDataUpload(fileId, versionId, fileType, partNumber)

Start FileData Upload

Starts an upload of a specific FilePart. This endpoint will return an AWS URL which you can PUT data to. You need to call this and receive a new AWS API URL for each &#x60;partNumber&#x60;. Please see AWS&#39;s REST documentation on \&quot;PUT Object to S3\&quot; on how to upload. Once all parts has been uploaded, proceed to &#x60;/finish&#x60; endpoint.  **Note:** &#x60;nextPartNumber&#x60; seems like it is always ignored. Despite it returning 0, first partNumber is always 1.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String fileId = "file_00000000-0000-0000-0000-000000000000"; // String | 
    Integer versionId = 1; // Integer | 
    String fileType = "file"; // String | 
    Integer partNumber = 1; // Integer | 
    try {
      InlineResponse2005 result = apiInstance.startFileDataUpload(fileId, versionId, fileType, partNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#startFileDataUpload");
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
 **fileId** | **String**|  |
 **versionId** | **Integer**|  |
 **fileType** | **String**|  | [enum: file, signature, delta]
 **partNumber** | **Integer**|  |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | See [https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html](AWS REST docs - PUT Object) |  -  |
**400** | Error response when trying to start an upload against a FileVersion that is already marked as  &#x60;complete&#x60;. |  -  |

