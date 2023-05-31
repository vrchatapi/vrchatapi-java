# WorldsApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWorld**](WorldsApi.md#createWorld) | **POST** /worlds | Create World |
| [**deleteWorld**](WorldsApi.md#deleteWorld) | **DELETE** /worlds/{worldId} | Delete World |
| [**getActiveWorlds**](WorldsApi.md#getActiveWorlds) | **GET** /worlds/active | List Active Worlds |
| [**getFavoritedWorlds**](WorldsApi.md#getFavoritedWorlds) | **GET** /worlds/favorites | List Favorited Worlds |
| [**getRecentWorlds**](WorldsApi.md#getRecentWorlds) | **GET** /worlds/recent | List Recent Worlds |
| [**getWorld**](WorldsApi.md#getWorld) | **GET** /worlds/{worldId} | Get World by ID |
| [**getWorldInstance**](WorldsApi.md#getWorldInstance) | **GET** /worlds/{worldId}/{instanceId} | Get World Instance |
| [**getWorldMetadata**](WorldsApi.md#getWorldMetadata) | **GET** /worlds/{worldId}/metadata | Get World Metadata |
| [**getWorldPublishStatus**](WorldsApi.md#getWorldPublishStatus) | **GET** /worlds/{worldId}/publish | Get World Publish Status |
| [**publishWorld**](WorldsApi.md#publishWorld) | **PUT** /worlds/{worldId}/publish | Publish World |
| [**searchWorlds**](WorldsApi.md#searchWorlds) | **GET** /worlds | Search All Worlds |
| [**unpublishWorld**](WorldsApi.md#unpublishWorld) | **DELETE** /worlds/{worldId}/publish | Unpublish World |
| [**updateWorld**](WorldsApi.md#updateWorld) | **PUT** /worlds/{worldId} | Update World |


<a name="createWorld"></a>
# **createWorld**
> World createWorld(createWorldRequest)

Create World

Create a new world. This endpoint requires &#x60;assetUrl&#x60; to be a valid File object with &#x60;.vrcw&#x60; file extension, and &#x60;imageUrl&#x60; to be a valid File object with an image file extension.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    CreateWorldRequest createWorldRequest = new CreateWorldRequest(); // CreateWorldRequest | 
    try {
      World result = apiInstance.createWorld(createWorldRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorld");
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
| **createWorldRequest** | [**CreateWorldRequest**](CreateWorldRequest.md)|  | [optional] |

### Return type

[**World**](World.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single World object. |  -  |
| **400** | Error response when trying create a world without having the neccesary Trust rank yet. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="deleteWorld"></a>
# **deleteWorld**
> deleteWorld(worldId)

Delete World

Delete a world. Notice a world is never fully \&quot;deleted\&quot;, only its ReleaseStatus is set to \&quot;hidden\&quot; and the linked Files are deleted. The WorldID is permanently reserved.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String worldId = "worldId_example"; // String | Must be a valid world ID.
    try {
      apiInstance.deleteWorld(worldId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#deleteWorld");
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
| **worldId** | **String**| Must be a valid world ID. | |

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
| **200** | OK |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. |  -  |

<a name="getActiveWorlds"></a>
# **getActiveWorlds**
> List&lt;LimitedWorld&gt; getActiveWorlds(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform)

List Active Worlds

Search and list currently Active worlds by query filters.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    Boolean featured = true; // Boolean | Filters on featured results.
    SortOption sort = SortOption.fromValue("popularity"); // SortOption | The sort order of the results.
    Integer n = 60; // Integer | The number of objects to return.
    OrderOption order = OrderOption.fromValue("ascending"); // OrderOption | Result ordering
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    String search = "search_example"; // String | Filters by world name.
    String tag = "tag_example"; // String | Tags to include (comma-separated). Any of the tags needs to be present.
    String notag = "notag_example"; // String | Tags to exclude (comma-separated).
    ReleaseStatus releaseStatus = ReleaseStatus.fromValue("public"); // ReleaseStatus | Filter by ReleaseStatus.
    String maxUnityVersion = "maxUnityVersion_example"; // String | The maximum Unity version supported by the asset.
    String minUnityVersion = "minUnityVersion_example"; // String | The minimum Unity version supported by the asset.
    String platform = "platform_example"; // String | The platform the asset supports.
    try {
      List<LimitedWorld> result = apiInstance.getActiveWorlds(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getActiveWorlds");
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
| **featured** | **Boolean**| Filters on featured results. | [optional] |
| **sort** | [**SortOption**](.md)| The sort order of the results. | [optional] [default to popularity] [enum: popularity, heat, trust, shuffle, random, favorites, reportScore, reportCount, publicationDate, labsPublicationDate, created, _created_at, updated, _updated_at, order, relevance, magic, name] |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **order** | [**OrderOption**](.md)| Result ordering | [optional] [default to descending] [enum: ascending, descending] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |
| **search** | **String**| Filters by world name. | [optional] |
| **tag** | **String**| Tags to include (comma-separated). Any of the tags needs to be present. | [optional] |
| **notag** | **String**| Tags to exclude (comma-separated). | [optional] |
| **releaseStatus** | [**ReleaseStatus**](.md)| Filter by ReleaseStatus. | [optional] [default to public] [enum: public, private, hidden, all] |
| **maxUnityVersion** | **String**| The maximum Unity version supported by the asset. | [optional] |
| **minUnityVersion** | **String**| The minimum Unity version supported by the asset. | [optional] |
| **platform** | **String**| The platform the asset supports. | [optional] |

### Return type

[**List&lt;LimitedWorld&gt;**](LimitedWorld.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of LimitedWorld objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getFavoritedWorlds"></a>
# **getFavoritedWorlds**
> List&lt;LimitedWorld&gt; getFavoritedWorlds(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId)

List Favorited Worlds

Search and list favorited worlds by query filters.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    Boolean featured = true; // Boolean | Filters on featured results.
    SortOption sort = SortOption.fromValue("popularity"); // SortOption | The sort order of the results.
    Integer n = 60; // Integer | The number of objects to return.
    OrderOption order = OrderOption.fromValue("ascending"); // OrderOption | Result ordering
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    String search = "search_example"; // String | Filters by world name.
    String tag = "tag_example"; // String | Tags to include (comma-separated). Any of the tags needs to be present.
    String notag = "notag_example"; // String | Tags to exclude (comma-separated).
    ReleaseStatus releaseStatus = ReleaseStatus.fromValue("public"); // ReleaseStatus | Filter by ReleaseStatus.
    String maxUnityVersion = "maxUnityVersion_example"; // String | The maximum Unity version supported by the asset.
    String minUnityVersion = "minUnityVersion_example"; // String | The minimum Unity version supported by the asset.
    String platform = "platform_example"; // String | The platform the asset supports.
    String userId = "userId_example"; // String | Target user to see information on, admin-only.
    try {
      List<LimitedWorld> result = apiInstance.getFavoritedWorlds(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getFavoritedWorlds");
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
| **featured** | **Boolean**| Filters on featured results. | [optional] |
| **sort** | [**SortOption**](.md)| The sort order of the results. | [optional] [default to popularity] [enum: popularity, heat, trust, shuffle, random, favorites, reportScore, reportCount, publicationDate, labsPublicationDate, created, _created_at, updated, _updated_at, order, relevance, magic, name] |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **order** | [**OrderOption**](.md)| Result ordering | [optional] [default to descending] [enum: ascending, descending] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |
| **search** | **String**| Filters by world name. | [optional] |
| **tag** | **String**| Tags to include (comma-separated). Any of the tags needs to be present. | [optional] |
| **notag** | **String**| Tags to exclude (comma-separated). | [optional] |
| **releaseStatus** | [**ReleaseStatus**](.md)| Filter by ReleaseStatus. | [optional] [default to public] [enum: public, private, hidden, all] |
| **maxUnityVersion** | **String**| The maximum Unity version supported by the asset. | [optional] |
| **minUnityVersion** | **String**| The minimum Unity version supported by the asset. | [optional] |
| **platform** | **String**| The platform the asset supports. | [optional] |
| **userId** | **String**| Target user to see information on, admin-only. | [optional] |

### Return type

[**List&lt;LimitedWorld&gt;**](LimitedWorld.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of LimitedWorld objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response when trying to see favourited worlds of another user without sufficient admin permissions. |  -  |

<a name="getRecentWorlds"></a>
# **getRecentWorlds**
> List&lt;LimitedWorld&gt; getRecentWorlds(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId)

List Recent Worlds

Search and list recently visited worlds by query filters.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    Boolean featured = true; // Boolean | Filters on featured results.
    SortOption sort = SortOption.fromValue("popularity"); // SortOption | The sort order of the results.
    Integer n = 60; // Integer | The number of objects to return.
    OrderOption order = OrderOption.fromValue("ascending"); // OrderOption | Result ordering
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    String search = "search_example"; // String | Filters by world name.
    String tag = "tag_example"; // String | Tags to include (comma-separated). Any of the tags needs to be present.
    String notag = "notag_example"; // String | Tags to exclude (comma-separated).
    ReleaseStatus releaseStatus = ReleaseStatus.fromValue("public"); // ReleaseStatus | Filter by ReleaseStatus.
    String maxUnityVersion = "maxUnityVersion_example"; // String | The maximum Unity version supported by the asset.
    String minUnityVersion = "minUnityVersion_example"; // String | The minimum Unity version supported by the asset.
    String platform = "platform_example"; // String | The platform the asset supports.
    String userId = "userId_example"; // String | Target user to see information on, admin-only.
    try {
      List<LimitedWorld> result = apiInstance.getRecentWorlds(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getRecentWorlds");
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
| **featured** | **Boolean**| Filters on featured results. | [optional] |
| **sort** | [**SortOption**](.md)| The sort order of the results. | [optional] [default to popularity] [enum: popularity, heat, trust, shuffle, random, favorites, reportScore, reportCount, publicationDate, labsPublicationDate, created, _created_at, updated, _updated_at, order, relevance, magic, name] |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **order** | [**OrderOption**](.md)| Result ordering | [optional] [default to descending] [enum: ascending, descending] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |
| **search** | **String**| Filters by world name. | [optional] |
| **tag** | **String**| Tags to include (comma-separated). Any of the tags needs to be present. | [optional] |
| **notag** | **String**| Tags to exclude (comma-separated). | [optional] |
| **releaseStatus** | [**ReleaseStatus**](.md)| Filter by ReleaseStatus. | [optional] [default to public] [enum: public, private, hidden, all] |
| **maxUnityVersion** | **String**| The maximum Unity version supported by the asset. | [optional] |
| **minUnityVersion** | **String**| The minimum Unity version supported by the asset. | [optional] |
| **platform** | **String**| The platform the asset supports. | [optional] |
| **userId** | **String**| Target user to see information on, admin-only. | [optional] |

### Return type

[**List&lt;LimitedWorld&gt;**](LimitedWorld.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of LimitedWorld objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response when trying to see recently visited worlds of another user without sufficient admin permissions. |  -  |

<a name="getWorld"></a>
# **getWorld**
> World getWorld(worldId)

Get World by ID

Get information about a specific World. Works unauthenticated but when so will always return &#x60;0&#x60; for certain fields.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String worldId = "worldId_example"; // String | Must be a valid world ID.
    try {
      World result = apiInstance.getWorld(worldId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorld");
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
| **worldId** | **String**| Must be a valid world ID. | |

### Return type

[**World**](World.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single World object. |  -  |
| **404** | Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. |  -  |

<a name="getWorldInstance"></a>
# **getWorldInstance**
> Instance getWorldInstance(worldId, instanceId)

Get World Instance

Returns a worlds instance.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String worldId = "worldId_example"; // String | Must be a valid world ID.
    String instanceId = "instanceId_example"; // String | Must be a valid instance ID.
    try {
      Instance result = apiInstance.getWorldInstance(worldId, instanceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldInstance");
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
| **worldId** | **String**| Must be a valid world ID. | |
| **instanceId** | **String**| Must be a valid instance ID. | |

### Return type

[**Instance**](Instance.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Instance object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getWorldMetadata"></a>
# **getWorldMetadata**
> WorldMetadata getWorldMetadata(worldId)

Get World Metadata

Return a worlds custom metadata. This is currently believed to be unused. Metadata can be set with &#x60;updateWorld&#x60; and can be any arbitrary object.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String worldId = "worldId_example"; // String | Must be a valid world ID.
    try {
      WorldMetadata result = apiInstance.getWorldMetadata(worldId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldMetadata");
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
| **worldId** | **String**| Must be a valid world ID. | |

### Return type

[**WorldMetadata**](WorldMetadata.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. |  -  |

<a name="getWorldPublishStatus"></a>
# **getWorldPublishStatus**
> WorldPublishStatus getWorldPublishStatus(worldId)

Get World Publish Status

Returns a worlds publish status.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String worldId = "worldId_example"; // String | Must be a valid world ID.
    try {
      WorldPublishStatus result = apiInstance.getWorldPublishStatus(worldId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldPublishStatus");
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
| **worldId** | **String**| Must be a valid world ID. | |

### Return type

[**WorldPublishStatus**](WorldPublishStatus.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single WorldPublishStatus object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. |  -  |

<a name="publishWorld"></a>
# **publishWorld**
> publishWorld(worldId)

Publish World

Publish a world. You can only publish one world per week.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String worldId = "worldId_example"; // String | Must be a valid world ID.
    try {
      apiInstance.publishWorld(worldId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#publishWorld");
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
| **worldId** | **String**| Must be a valid world ID. | |

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
| **200** | TODO |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. |  -  |

<a name="searchWorlds"></a>
# **searchWorlds**
> List&lt;LimitedWorld&gt; searchWorlds(featured, sort, user, userId, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform)

Search All Worlds

Search and list any worlds by query filters.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    Boolean featured = true; // Boolean | Filters on featured results.
    SortOption sort = SortOption.fromValue("popularity"); // SortOption | The sort order of the results.
    String user = "me"; // String | Set to `me` for searching own worlds.
    String userId = "userId_example"; // String | Filter by UserID.
    Integer n = 60; // Integer | The number of objects to return.
    OrderOption order = OrderOption.fromValue("ascending"); // OrderOption | Result ordering
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    String search = "search_example"; // String | Filters by world name.
    String tag = "tag_example"; // String | Tags to include (comma-separated). Any of the tags needs to be present.
    String notag = "notag_example"; // String | Tags to exclude (comma-separated).
    ReleaseStatus releaseStatus = ReleaseStatus.fromValue("public"); // ReleaseStatus | Filter by ReleaseStatus.
    String maxUnityVersion = "maxUnityVersion_example"; // String | The maximum Unity version supported by the asset.
    String minUnityVersion = "minUnityVersion_example"; // String | The minimum Unity version supported by the asset.
    String platform = "platform_example"; // String | The platform the asset supports.
    try {
      List<LimitedWorld> result = apiInstance.searchWorlds(featured, sort, user, userId, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#searchWorlds");
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
| **featured** | **Boolean**| Filters on featured results. | [optional] |
| **sort** | [**SortOption**](.md)| The sort order of the results. | [optional] [default to popularity] [enum: popularity, heat, trust, shuffle, random, favorites, reportScore, reportCount, publicationDate, labsPublicationDate, created, _created_at, updated, _updated_at, order, relevance, magic, name] |
| **user** | **String**| Set to &#x60;me&#x60; for searching own worlds. | [optional] [enum: me] |
| **userId** | **String**| Filter by UserID. | [optional] |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **order** | [**OrderOption**](.md)| Result ordering | [optional] [default to descending] [enum: ascending, descending] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |
| **search** | **String**| Filters by world name. | [optional] |
| **tag** | **String**| Tags to include (comma-separated). Any of the tags needs to be present. | [optional] |
| **notag** | **String**| Tags to exclude (comma-separated). | [optional] |
| **releaseStatus** | [**ReleaseStatus**](.md)| Filter by ReleaseStatus. | [optional] [default to public] [enum: public, private, hidden, all] |
| **maxUnityVersion** | **String**| The maximum Unity version supported by the asset. | [optional] |
| **minUnityVersion** | **String**| The minimum Unity version supported by the asset. | [optional] |
| **platform** | **String**| The platform the asset supports. | [optional] |

### Return type

[**List&lt;LimitedWorld&gt;**](LimitedWorld.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of LimitedWorld objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="unpublishWorld"></a>
# **unpublishWorld**
> unpublishWorld(worldId)

Unpublish World

Unpublish a world.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String worldId = "worldId_example"; // String | Must be a valid world ID.
    try {
      apiInstance.unpublishWorld(worldId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#unpublishWorld");
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
| **worldId** | **String**| Must be a valid world ID. | |

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
| **200** | OK |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. |  -  |

<a name="updateWorld"></a>
# **updateWorld**
> World updateWorld(worldId, updateWorldRequest)

Update World

Update information about a specific World.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String worldId = "worldId_example"; // String | Must be a valid world ID.
    UpdateWorldRequest updateWorldRequest = new UpdateWorldRequest(); // UpdateWorldRequest | 
    try {
      World result = apiInstance.updateWorld(worldId, updateWorldRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorld");
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
| **worldId** | **String**| Must be a valid world ID. | |
| **updateWorldRequest** | [**UpdateWorldRequest**](UpdateWorldRequest.md)|  | [optional] |

### Return type

[**World**](World.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single World object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. |  -  |

