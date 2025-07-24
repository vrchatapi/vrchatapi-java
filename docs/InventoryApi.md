# InventoryApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInventory**](InventoryApi.md#getInventory) | **GET** /inventory | Get Inventory |
| [**getInventoryDrops**](InventoryApi.md#getInventoryDrops) | **GET** /inventory/drops | List Inventory Drops |
| [**getInventoryTemplate**](InventoryApi.md#getInventoryTemplate) | **GET** /inventory/template/{inventoryTemplateId} | Get Inventory Template |
| [**getOwnInventoryItem**](InventoryApi.md#getOwnInventoryItem) | **GET** /inventory/{inventoryItemId} | Get Own Inventory Item |
| [**spawnInventoryItem**](InventoryApi.md#spawnInventoryItem) | **GET** /inventory/spawn | Spawn Inventory Item |


<a name="getInventory"></a>
# **getInventory**
> Inventory getInventory(n, offset, inventorySortOrder, inventoryItemType)

Get Inventory

Returns an Inventory object.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InventoryApi apiInstance = new InventoryApi(defaultClient);
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    String inventorySortOrder = "newest"; // String | Sort order for inventory retrieval.
    InventoryItemType inventoryItemType = InventoryItemType.fromValue("bundle"); // InventoryItemType | Filter for inventory retrieval.
    try {
      Inventory result = apiInstance.getInventory(n, offset, inventorySortOrder, inventoryItemType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#getInventory");
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
| **inventorySortOrder** | **String**| Sort order for inventory retrieval. | [optional] [enum: newest, oldest] |
| **inventoryItemType** | [**InventoryItemType**](.md)| Filter for inventory retrieval. | [optional] [default to bundle] [enum: bundle, prop, emoji, sticker] |

### Return type

[**Inventory**](Inventory.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an Inventory object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getInventoryDrops"></a>
# **getInventoryDrops**
> List&lt;InventoryDrop&gt; getInventoryDrops(active)

List Inventory Drops

Returns a list of InventoryDrop objects.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InventoryApi apiInstance = new InventoryApi(defaultClient);
    Boolean active = true; // Boolean | Filter for users' listings and inventory bundles.
    try {
      List<InventoryDrop> result = apiInstance.getInventoryDrops(active);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#getInventoryDrops");
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
| **active** | **Boolean**| Filter for users&#39; listings and inventory bundles. | [optional] |

### Return type

[**List&lt;InventoryDrop&gt;**](InventoryDrop.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of InventoryDrop objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getInventoryTemplate"></a>
# **getInventoryTemplate**
> InventoryTemplate getInventoryTemplate(inventoryTemplateId)

Get Inventory Template

Returns an InventoryTemplate object.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InventoryApi apiInstance = new InventoryApi(defaultClient);
    String inventoryTemplateId = "invt_00000000-0000-0000-0000-000000000000"; // String | Must be a valid inventory template ID.
    try {
      InventoryTemplate result = apiInstance.getInventoryTemplate(inventoryTemplateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#getInventoryTemplate");
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
| **inventoryTemplateId** | **String**| Must be a valid inventory template ID. | |

### Return type

[**InventoryTemplate**](InventoryTemplate.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an InventoryTemplate object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getOwnInventoryItem"></a>
# **getOwnInventoryItem**
> InventoryItem getOwnInventoryItem(inventoryItemId)

Get Own Inventory Item

Returns an InventoryItem object held by the currently logged in user.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InventoryApi apiInstance = new InventoryApi(defaultClient);
    String inventoryItemId = "inv_00000000-0000-0000-0000-000000000000"; // String | Must be a valid inventory item ID.
    try {
      InventoryItem result = apiInstance.getOwnInventoryItem(inventoryItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#getOwnInventoryItem");
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
| **inventoryItemId** | **String**| Must be a valid inventory item ID. | |

### Return type

[**InventoryItem**](InventoryItem.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an InventoryItem object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="spawnInventoryItem"></a>
# **spawnInventoryItem**
> InventorySpawn spawnInventoryItem(id)

Spawn Inventory Item

Returns an InventorySpawn object.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.InventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    InventoryApi apiInstance = new InventoryApi(defaultClient);
    String id = "id_example"; // String | Id for inventory item spawning.
    try {
      InventorySpawn result = apiInstance.spawnInventoryItem(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#spawnInventoryItem");
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
| **id** | **String**| Id for inventory item spawning. | |

### Return type

[**InventorySpawn**](InventorySpawn.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an InventorySpawn object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

