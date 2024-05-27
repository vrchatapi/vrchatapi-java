# FavoritesApi

All URIs are relative to *https://vrchat.com/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFavorite**](FavoritesApi.md#addFavorite) | **POST** /favorites | Add Favorite |
| [**clearFavoriteGroup**](FavoritesApi.md#clearFavoriteGroup) | **DELETE** /favorite/group/{favoriteGroupType}/{favoriteGroupName}/{userId} | Clear Favorite Group |
| [**getFavorite**](FavoritesApi.md#getFavorite) | **GET** /favorites/{favoriteId} | Show Favorite |
| [**getFavoriteGroup**](FavoritesApi.md#getFavoriteGroup) | **GET** /favorite/group/{favoriteGroupType}/{favoriteGroupName}/{userId} | Show Favorite Group |
| [**getFavoriteGroups**](FavoritesApi.md#getFavoriteGroups) | **GET** /favorite/groups | List Favorite Groups |
| [**getFavorites**](FavoritesApi.md#getFavorites) | **GET** /favorites | List Favorites |
| [**removeFavorite**](FavoritesApi.md#removeFavorite) | **DELETE** /favorites/{favoriteId} | Remove Favorite |
| [**updateFavoriteGroup**](FavoritesApi.md#updateFavoriteGroup) | **PUT** /favorite/group/{favoriteGroupType}/{favoriteGroupName}/{userId} | Update Favorite Group |


<a name="addFavorite"></a>
# **addFavorite**
> Favorite addFavorite(addFavoriteRequest)

Add Favorite

Add a new favorite.  Friend groups are named &#x60;group_0&#x60; through &#x60;group_3&#x60;. Avatar and World groups are named &#x60;avatars1&#x60; to &#x60;avatars4&#x60; and &#x60;worlds1&#x60; to &#x60;worlds4&#x60;.  You cannot add people whom you are not friends with to your friends list. Destroying a friendship removes the person as favorite on both sides.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FavoritesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    FavoritesApi apiInstance = new FavoritesApi(defaultClient);
    AddFavoriteRequest addFavoriteRequest = new AddFavoriteRequest(); // AddFavoriteRequest | 
    try {
      Favorite result = apiInstance.addFavorite(addFavoriteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FavoritesApi#addFavorite");
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
| **addFavoriteRequest** | [**AddFavoriteRequest**](AddFavoriteRequest.md)|  | [optional] |

### Return type

[**Favorite**](Favorite.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Favorite object. |  -  |
| **400** | Error response when trying favorite someone or something when already having it/them favorited. |  -  |
| **403** | Error response when trying favorite someone whom you are not friends with. |  -  |

<a name="clearFavoriteGroup"></a>
# **clearFavoriteGroup**
> Success clearFavoriteGroup(favoriteGroupType, favoriteGroupName, userId)

Clear Favorite Group

Clear ALL contents of a specific favorite group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FavoritesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    FavoritesApi apiInstance = new FavoritesApi(defaultClient);
    String favoriteGroupType = "world"; // String | The type of group to fetch, must be a valid FavoriteType.
    String favoriteGroupName = "favoriteGroupName_example"; // String | The name of the group to fetch, must be a name of a FavoriteGroup.
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      Success result = apiInstance.clearFavoriteGroup(favoriteGroupType, favoriteGroupName, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FavoritesApi#clearFavoriteGroup");
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
| **favoriteGroupType** | **String**| The type of group to fetch, must be a valid FavoriteType. | [enum: world, friend, avatar] |
| **favoriteGroupName** | **String**| The name of the group to fetch, must be a name of a FavoriteGroup. | |
| **userId** | **String**| Must be a valid user ID. | |

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
| **200** | Success response after clearing a favorite group. |  -  |

<a name="getFavorite"></a>
# **getFavorite**
> Favorite getFavorite(favoriteId)

Show Favorite

Return information about a specific Favorite.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FavoritesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    FavoritesApi apiInstance = new FavoritesApi(defaultClient);
    String favoriteId = "favoriteId_example"; // String | Must be a valid favorite ID.
    try {
      Favorite result = apiInstance.getFavorite(favoriteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FavoritesApi#getFavorite");
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
| **favoriteId** | **String**| Must be a valid favorite ID. | |

### Return type

[**Favorite**](Favorite.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Favorite object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to show information about a non-existent favorite. |  -  |

<a name="getFavoriteGroup"></a>
# **getFavoriteGroup**
> FavoriteGroup getFavoriteGroup(favoriteGroupType, favoriteGroupName, userId)

Show Favorite Group

Fetch information about a specific favorite group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FavoritesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    FavoritesApi apiInstance = new FavoritesApi(defaultClient);
    String favoriteGroupType = "world"; // String | The type of group to fetch, must be a valid FavoriteType.
    String favoriteGroupName = "favoriteGroupName_example"; // String | The name of the group to fetch, must be a name of a FavoriteGroup.
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      FavoriteGroup result = apiInstance.getFavoriteGroup(favoriteGroupType, favoriteGroupName, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FavoritesApi#getFavoriteGroup");
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
| **favoriteGroupType** | **String**| The type of group to fetch, must be a valid FavoriteType. | [enum: world, friend, avatar] |
| **favoriteGroupName** | **String**| The name of the group to fetch, must be a name of a FavoriteGroup. | |
| **userId** | **String**| Must be a valid user ID. | |

### Return type

[**FavoriteGroup**](FavoriteGroup.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single FavoriteGroup object. |  -  |

<a name="getFavoriteGroups"></a>
# **getFavoriteGroups**
> List&lt;FavoriteGroup&gt; getFavoriteGroups(n, offset, ownerId)

List Favorite Groups

Return a list of favorite groups owned by a user. Returns the same information as &#x60;getFavoriteGroups&#x60;.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FavoritesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    FavoritesApi apiInstance = new FavoritesApi(defaultClient);
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    String ownerId = "ownerId_example"; // String | The owner of whoms favorite groups to return. Must be a UserID.
    try {
      List<FavoriteGroup> result = apiInstance.getFavoriteGroups(n, offset, ownerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FavoritesApi#getFavoriteGroups");
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
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |
| **ownerId** | **String**| The owner of whoms favorite groups to return. Must be a UserID. | [optional] |

### Return type

[**List&lt;FavoriteGroup&gt;**](FavoriteGroup.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of FavoriteGroup objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getFavorites"></a>
# **getFavorites**
> List&lt;Favorite&gt; getFavorites(n, offset, type, tag)

List Favorites

Returns a list of favorites.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FavoritesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    FavoritesApi apiInstance = new FavoritesApi(defaultClient);
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    String type = "type_example"; // String | The type of favorites to return, FavoriteType.
    String tag = "tag_example"; // String | Tags to include (comma-separated). Any of the tags needs to be present.
    try {
      List<Favorite> result = apiInstance.getFavorites(n, offset, type, tag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FavoritesApi#getFavorites");
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
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |
| **type** | **String**| The type of favorites to return, FavoriteType. | [optional] |
| **tag** | **String**| Tags to include (comma-separated). Any of the tags needs to be present. | [optional] |

### Return type

[**List&lt;Favorite&gt;**](Favorite.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Favorite objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="removeFavorite"></a>
# **removeFavorite**
> Success removeFavorite(favoriteId)

Remove Favorite

Remove a favorite from your favorites list.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FavoritesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    FavoritesApi apiInstance = new FavoritesApi(defaultClient);
    String favoriteId = "favoriteId_example"; // String | Must be a valid favorite ID.
    try {
      Success result = apiInstance.removeFavorite(favoriteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FavoritesApi#removeFavorite");
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
| **favoriteId** | **String**| Must be a valid favorite ID. | |

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
| **200** | Success response after removing a favorite. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to show information about a non-existent favorite. |  -  |

<a name="updateFavoriteGroup"></a>
# **updateFavoriteGroup**
> updateFavoriteGroup(favoriteGroupType, favoriteGroupName, userId, updateFavoriteGroupRequest)

Update Favorite Group

Update information about a specific favorite group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.FavoritesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://vrchat.com/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    FavoritesApi apiInstance = new FavoritesApi(defaultClient);
    String favoriteGroupType = "world"; // String | The type of group to fetch, must be a valid FavoriteType.
    String favoriteGroupName = "favoriteGroupName_example"; // String | The name of the group to fetch, must be a name of a FavoriteGroup.
    String userId = "userId_example"; // String | Must be a valid user ID.
    UpdateFavoriteGroupRequest updateFavoriteGroupRequest = new UpdateFavoriteGroupRequest(); // UpdateFavoriteGroupRequest | 
    try {
      apiInstance.updateFavoriteGroup(favoriteGroupType, favoriteGroupName, userId, updateFavoriteGroupRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling FavoritesApi#updateFavoriteGroup");
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
| **favoriteGroupType** | **String**| The type of group to fetch, must be a valid FavoriteType. | [enum: world, friend, avatar] |
| **favoriteGroupName** | **String**| The name of the group to fetch, must be a name of a FavoriteGroup. | |
| **userId** | **String**| Must be a valid user ID. | |
| **updateFavoriteGroupRequest** | [**UpdateFavoriteGroupRequest**](UpdateFavoriteGroupRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

