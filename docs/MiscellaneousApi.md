# MiscellaneousApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAssignedPermissions**](MiscellaneousApi.md#getAssignedPermissions) | **GET** /auth/permissions | Get Assigned Permissions |
| [**getCSS**](MiscellaneousApi.md#getCSS) | **GET** /css/app.css | Download CSS |
| [**getConfig**](MiscellaneousApi.md#getConfig) | **GET** /config | Fetch API Config |
| [**getCurrentOnlineUsers**](MiscellaneousApi.md#getCurrentOnlineUsers) | **GET** /visits | Current Online Users |
| [**getHealth**](MiscellaneousApi.md#getHealth) | **GET** /health | Check API Health |
| [**getInfoPush**](MiscellaneousApi.md#getInfoPush) | **GET** /infoPush | Show Information Notices |
| [**getJavaScript**](MiscellaneousApi.md#getJavaScript) | **GET** /js/app.js | Download JavaScript |
| [**getPermission**](MiscellaneousApi.md#getPermission) | **GET** /permissions/{permissionId} | Get Permission |
| [**getSystemTime**](MiscellaneousApi.md#getSystemTime) | **GET** /time | Current System Time |


<a name="getAssignedPermissions"></a>
# **getAssignedPermissions**
> List&lt;Permission&gt; getAssignedPermissions()

Get Assigned Permissions

Returns a list of all permissions currently granted by the user. Permissions are assigned e.g. by subscribing to VRC+.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.MiscellaneousApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
    try {
      List<Permission> result = apiInstance.getAssignedPermissions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#getAssignedPermissions");
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

[**List&lt;Permission&gt;**](Permission.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Permission objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getCSS"></a>
# **getCSS**
> String getCSS(variant, branch)

Download CSS

Fetches the CSS code to the frontend React website.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.MiscellaneousApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");

    MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
    String variant = "internal"; // String | Specifies which `variant` of the site. Public is the end-user site, while `internal` is the staff-only site with special pages for moderation and management.
    String branch = "main"; // String | Specifies which git branch the site should load frontend source code from.
    try {
      String result = apiInstance.getCSS(variant, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#getCSS");
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
| **variant** | **String**| Specifies which &#x60;variant&#x60; of the site. Public is the end-user site, while &#x60;internal&#x60; is the staff-only site with special pages for moderation and management. | [optional] [default to public] [enum: internal, public] |
| **branch** | **String**| Specifies which git branch the site should load frontend source code from. | [optional] [default to main] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/css, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **Note:** VRChat uses 302 Redirect to Cloudfront. The implementing library **must** support and follow redirects natively. |  -  |
| **400** | Error response when trying to download non-public and non-main JavaScript or CSS without Admin Credentials. |  -  |

<a name="getConfig"></a>
# **getConfig**
> APIConfig getConfig()

Fetch API Config

API config contains configuration that the clients needs to work properly.  Currently the most important value here is &#x60;clientApiKey&#x60; which is used for all other API endpoints.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.MiscellaneousApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");

    MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
    try {
      APIConfig result = apiInstance.getConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#getConfig");
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

[**APIConfig**](APIConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the API&#39;s config. |  -  |

<a name="getCurrentOnlineUsers"></a>
# **getCurrentOnlineUsers**
> Integer getCurrentOnlineUsers()

Current Online Users

Returns the current number of online users.  **NOTE:** The response type is not a JSON object, but a simple JSON integer.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.MiscellaneousApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");

    MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
    try {
      Integer result = apiInstance.getCurrentOnlineUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#getCurrentOnlineUsers");
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

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getHealth"></a>
# **getHealth**
> APIHealth getHealth()

Check API Health

~~Gets the overall health status, the server name, and the current build version tag of the API.~~  **DEPRECATED:** VRChat has suddenly restricted this endpoint for unknown reasons, and now always return 401 Unauthorized.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.MiscellaneousApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");

    MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
    try {
      APIHealth result = apiInstance.getHealth();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#getHealth");
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

[**APIHealth**](APIHealth.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the API&#39;s health. |  -  |

<a name="getInfoPush"></a>
# **getInfoPush**
> List&lt;InfoPush&gt; getInfoPush(require, include)

Show Information Notices

IPS (Info Push System) is a system for VRChat to push out dynamic information to the client. This is primarily used by the Quick-Menu info banners, but can also be used to e.g. alert you to update your game to the latest version.  &#x60;include&#x60; is used to query what Information Pushes should be included in the response. If include is missing or empty, then no notices will normally be returned. This is an \&quot;any of\&quot; search.  &#x60;require&#x60; is used to limit what Information Pushes should be included in the response. This is usually used in combination with &#x60;include&#x60;, and is an \&quot;all of\&quot; search.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.MiscellaneousApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");

    MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
    String require = "require_example"; // String | Tags to include (comma-separated). All of the tags needs to be present.
    String include = "include_example"; // String | Tags to include (comma-separated). Any of the tags needs to be present.
    try {
      List<InfoPush> result = apiInstance.getInfoPush(require, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#getInfoPush");
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
| **require** | **String**| Tags to include (comma-separated). All of the tags needs to be present. | [optional] |
| **include** | **String**| Tags to include (comma-separated). Any of the tags needs to be present. | [optional] |

### Return type

[**List&lt;InfoPush&gt;**](InfoPush.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of InfoPush objects. |  -  |

<a name="getJavaScript"></a>
# **getJavaScript**
> String getJavaScript(variant, branch)

Download JavaScript

Fetches the JavaScript code to the frontend React website.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.MiscellaneousApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");

    MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
    String variant = "internal"; // String | Specifies which `variant` of the site. Public is the end-user site, while `internal` is the staff-only site with special pages for moderation and management.
    String branch = "main"; // String | Specifies which git branch the site should load frontend source code from.
    try {
      String result = apiInstance.getJavaScript(variant, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#getJavaScript");
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
| **variant** | **String**| Specifies which &#x60;variant&#x60; of the site. Public is the end-user site, while &#x60;internal&#x60; is the staff-only site with special pages for moderation and management. | [optional] [default to public] [enum: internal, public] |
| **branch** | **String**| Specifies which git branch the site should load frontend source code from. | [optional] [default to main] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/javascript, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **Note:** VRChat uses 302 Redirect to Cloudfront. The implementing library **must** support and follow redirects natively. |  -  |
| **400** | Error response when trying to download non-public and non-main JavaScript or CSS without Admin Credentials. |  -  |

<a name="getPermission"></a>
# **getPermission**
> Permission getPermission(permissionId)

Get Permission

Returns a single permission. This endpoint is pretty useless, as it returns the exact same information as &#x60;/auth/permissions&#x60;.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.MiscellaneousApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
    String permissionId = "permissionId_example"; // String | Must be a valid permission ID.
    try {
      Permission result = apiInstance.getPermission(permissionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#getPermission");
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
| **permissionId** | **String**| Must be a valid permission ID. | |

### Return type

[**Permission**](Permission.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Permission object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getSystemTime"></a>
# **getSystemTime**
> OffsetDateTime getSystemTime()

Current System Time

Returns the current time of the API server.  **NOTE:** The response type is not a JSON object, but a simple JSON string.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.MiscellaneousApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");

    MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
    try {
      OffsetDateTime result = apiInstance.getSystemTime();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#getSystemTime");
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

[**OffsetDateTime**](OffsetDateTime.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

