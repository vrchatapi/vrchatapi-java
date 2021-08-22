# AvatarsApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAvatar**](AvatarsApi.md#createAvatar) | **POST** /avatars | Create Avatar
[**deleteAvatar**](AvatarsApi.md#deleteAvatar) | **DELETE** /avatars/{avatarId} | Delete Avatar
[**getAvatar**](AvatarsApi.md#getAvatar) | **GET** /avatars/{avatarId} | Get Avatar
[**getFavoritedAvatars**](AvatarsApi.md#getFavoritedAvatars) | **GET** /avatars/favorites | List Favorited Avatars
[**searchAvatars**](AvatarsApi.md#searchAvatars) | **GET** /avatars | Search Avatars
[**selectAvatar**](AvatarsApi.md#selectAvatar) | **PUT** /avatars/{avatarId}/select | Select Avatar
[**updateAvatar**](AvatarsApi.md#updateAvatar) | **PUT** /avatars/{avatarId} | Update Avatar


<a name="createAvatar"></a>
# **createAvatar**
> Avatar createAvatar(inlineObject10)

Create Avatar

Create an avatar. It&#39;s possible to optionally specify a ID if you want a custom one. Attempting to create an Avatar with an already claimed ID will result in a DB error.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AvatarsApi;

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

    AvatarsApi apiInstance = new AvatarsApi(defaultClient);
    InlineObject10 inlineObject10 = new InlineObject10(); // InlineObject10 | 
    try {
      Avatar result = apiInstance.createAvatar(inlineObject10);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#createAvatar");
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
 **inlineObject10** | [**InlineObject10**](InlineObject10.md)|  | [optional]

### Return type

[**Avatar**](Avatar.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a single Avatar object. |  -  |
**401** | Error response when set featured to true without being an admin. |  -  |

<a name="deleteAvatar"></a>
# **deleteAvatar**
> Avatar deleteAvatar(avatarId)

Delete Avatar

Delete an avatar. Notice an avatar is never fully \&quot;deleted\&quot;, only its ReleaseStatus is set to \&quot;hidden\&quot; and the linked Files are deleted. The AvatarID is permanently reserved.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AvatarsApi;

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

    AvatarsApi apiInstance = new AvatarsApi(defaultClient);
    String avatarId = "avatarId_example"; // String | 
    try {
      Avatar result = apiInstance.deleteAvatar(avatarId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#deleteAvatar");
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
 **avatarId** | **String**|  |

### Return type

[**Avatar**](Avatar.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a single Avatar object. |  -  |
**401** | Error response due to missing apiKey or auth cookie. |  -  |
**404** | Error response when trying to show information about a non-existent avatar. |  -  |

<a name="getAvatar"></a>
# **getAvatar**
> Avatar getAvatar(avatarId)

Get Avatar

Get information about a specific Avatar.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AvatarsApi;

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

    AvatarsApi apiInstance = new AvatarsApi(defaultClient);
    String avatarId = "avatarId_example"; // String | 
    try {
      Avatar result = apiInstance.getAvatar(avatarId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getAvatar");
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
 **avatarId** | **String**|  |

### Return type

[**Avatar**](Avatar.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a single Avatar object. |  -  |
**401** | Error response due to missing apiKey or auth cookie. |  -  |
**404** | Error response when trying to show information about a non-existent avatar. |  -  |

<a name="getFavoritedAvatars"></a>
# **getFavoritedAvatars**
> getFavoritedAvatars(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId)

List Favorited Avatars

Search and list favorited avatars by query filters.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AvatarsApi;

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

    AvatarsApi apiInstance = new AvatarsApi(defaultClient);
    String featured = "featured_example"; // String | Filters on featured results.
    String sort = "popularity"; // String | 
    Integer n = 60; // Integer | The number of objects to return.
    String order = "descending"; // String | 
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    String search = "search_example"; // String | Filters by world name.
    String tag = "tag_example"; // String | Tags to include (comma-separated).
    String notag = "notag_example"; // String | Tags to exclude (comma-separated).
    String releaseStatus = "hidden"; // String | Filter by ReleaseStatus.
    String maxUnityVersion = "maxUnityVersion_example"; // String | The maximum Unity version supported by the asset.
    String minUnityVersion = "minUnityVersion_example"; // String | The minimum Unity version supported by the asset.
    String platform = "platform_example"; // String | The platform the asset supports.
    String userId = "userId_example"; // String | Target user to see information on, admin-only.
    try {
      apiInstance.getFavoritedAvatars(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getFavoritedAvatars");
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
 **featured** | **String**| Filters on featured results. | [optional]
 **sort** | **String**|  | [optional] [default to popularity] [enum: popularity, heat, trust, shuffle, random, favorites, reportScore, reportCount, publicationDate, labsPublicationDate, created, _created_at, updated, _updated_at, order, relevance, magic, name]
 **n** | **Integer**| The number of objects to return. | [optional] [default to 60]
 **order** | **String**|  | [optional] [default to descending] [enum: ascending, descending]
 **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional]
 **search** | **String**| Filters by world name. | [optional]
 **tag** | **String**| Tags to include (comma-separated). | [optional]
 **notag** | **String**| Tags to exclude (comma-separated). | [optional]
 **releaseStatus** | **String**| Filter by ReleaseStatus. | [optional] [default to hidden] [enum: public, private, hidden]
 **maxUnityVersion** | **String**| The maximum Unity version supported by the asset. | [optional]
 **minUnityVersion** | **String**| The minimum Unity version supported by the asset. | [optional]
 **platform** | **String**| The platform the asset supports. | [optional]
 **userId** | **String**| Target user to see information on, admin-only. | [optional]

### Return type

null (empty response body)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Error response due to missing apiKey or auth cookie. |  -  |

<a name="searchAvatars"></a>
# **searchAvatars**
> List&lt;Avatar&gt; searchAvatars(featured, sort, user, userId, n, order, offset, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform)

Search Avatars

Search and list avatars by query filters. You can only search your own or featured avatars. It is not possible as a normal user to search other peoples avatars.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AvatarsApi;

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

    AvatarsApi apiInstance = new AvatarsApi(defaultClient);
    String featured = "featured_example"; // String | Filters on featured results.
    String sort = "popularity"; // String | 
    String user = "user_example"; // String | Set to `me` for searching own avatars.
    String userId = "userId_example"; // String | Filter by author UserID
    Integer n = 60; // Integer | The number of objects to return.
    String order = "descending"; // String | 
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    String tag = "tag_example"; // String | Tags to include (comma-separated).
    String notag = "notag_example"; // String | Tags to exclude (comma-separated).
    String releaseStatus = "hidden"; // String | Filter by ReleaseStatus.
    String maxUnityVersion = "maxUnityVersion_example"; // String | The maximum Unity version supported by the asset.
    String minUnityVersion = "minUnityVersion_example"; // String | The minimum Unity version supported by the asset.
    String platform = "platform_example"; // String | The platform the asset supports.
    try {
      List<Avatar> result = apiInstance.searchAvatars(featured, sort, user, userId, n, order, offset, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#searchAvatars");
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
 **featured** | **String**| Filters on featured results. | [optional]
 **sort** | **String**|  | [optional] [default to popularity] [enum: popularity, heat, trust, shuffle, random, favorites, reportScore, reportCount, publicationDate, labsPublicationDate, created, _created_at, updated, _updated_at, order, relevance, magic, name]
 **user** | **String**| Set to &#x60;me&#x60; for searching own avatars. | [optional] [enum: me]
 **userId** | **String**| Filter by author UserID | [optional]
 **n** | **Integer**| The number of objects to return. | [optional] [default to 60]
 **order** | **String**|  | [optional] [default to descending] [enum: ascending, descending]
 **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional]
 **tag** | **String**| Tags to include (comma-separated). | [optional]
 **notag** | **String**| Tags to exclude (comma-separated). | [optional]
 **releaseStatus** | **String**| Filter by ReleaseStatus. | [optional] [default to hidden] [enum: public, private, hidden]
 **maxUnityVersion** | **String**| The maximum Unity version supported by the asset. | [optional]
 **minUnityVersion** | **String**| The minimum Unity version supported by the asset. | [optional]
 **platform** | **String**| The platform the asset supports. | [optional]

### Return type

[**List&lt;Avatar&gt;**](Avatar.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a list of Avatar objects. |  -  |
**401** | Error response due to missing apiKey or auth cookie. |  -  |

<a name="selectAvatar"></a>
# **selectAvatar**
> CurrentUser selectAvatar(avatarId)

Select Avatar

Switches into that avatar.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AvatarsApi;

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

    AvatarsApi apiInstance = new AvatarsApi(defaultClient);
    String avatarId = "avatarId_example"; // String | 
    try {
      CurrentUser result = apiInstance.selectAvatar(avatarId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#selectAvatar");
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
 **avatarId** | **String**|  |

### Return type

[**CurrentUser**](CurrentUser.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a single CurrentUser object. |  -  |
**401** | Error response due to missing apiKey or auth cookie. |  -  |
**404** | Error response when trying to show information about a non-existent avatar. |  -  |

<a name="updateAvatar"></a>
# **updateAvatar**
> Avatar updateAvatar(avatarId, inlineObject11)

Update Avatar

Update information about a specific avatar.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.AvatarsApi;

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

    AvatarsApi apiInstance = new AvatarsApi(defaultClient);
    String avatarId = "avatarId_example"; // String | 
    InlineObject11 inlineObject11 = new InlineObject11(); // InlineObject11 | 
    try {
      Avatar result = apiInstance.updateAvatar(avatarId, inlineObject11);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#updateAvatar");
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
 **avatarId** | **String**|  |
 **inlineObject11** | [**InlineObject11**](InlineObject11.md)|  | [optional]

### Return type

[**Avatar**](Avatar.md)

### Authorization

[apiKeyCookie](../README.md#apiKeyCookie), [authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a single Avatar object. |  -  |
**401** | Error response due to missing apiKey or auth cookie. |  -  |
**404** | Error response when trying to show information about a non-existent avatar. |  -  |

