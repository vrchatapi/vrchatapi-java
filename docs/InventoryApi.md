# InventoryApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**consumeOwnInventoryItem**](InventoryApi.md#consumeOwnInventoryItem) | **PUT** /inventory/{inventoryItemId}/consume | Consume Own Inventory Item |
| [**deleteOwnInventoryItem**](InventoryApi.md#deleteOwnInventoryItem) | **DELETE** /inventory/{inventoryItemId} | Delete Own Inventory Item |
| [**equipOwnInventoryItem**](InventoryApi.md#equipOwnInventoryItem) | **PUT** /inventory/{inventoryItemId}/equip | Equip Own Inventory Item |
| [**getInventory**](InventoryApi.md#getInventory) | **GET** /inventory | Get Inventory |
| [**getInventoryCollections**](InventoryApi.md#getInventoryCollections) | **GET** /inventory/collections | List Inventory Collections |
| [**getInventoryDrops**](InventoryApi.md#getInventoryDrops) | **GET** /inventory/drops | List Inventory Drops |
| [**getInventoryTemplate**](InventoryApi.md#getInventoryTemplate) | **GET** /inventory/template/{inventoryTemplateId} | Get Inventory Template |
| [**getOwnInventoryItem**](InventoryApi.md#getOwnInventoryItem) | **GET** /inventory/{inventoryItemId} | Get Own Inventory Item |
| [**getUserInventoryItem**](InventoryApi.md#getUserInventoryItem) | **GET** /user/{userId}/inventory/{inventoryItemId} | Get User Inventory Item |
| [**shareInventoryItemDirect**](InventoryApi.md#shareInventoryItemDirect) | **POST** /inventory/cloning/direct | Share Inventory Item Direct |
| [**shareInventoryItemPedestal**](InventoryApi.md#shareInventoryItemPedestal) | **GET** /inventory/cloning/pedestal | Share Inventory Item by Pedestal |
| [**spawnInventoryItem**](InventoryApi.md#spawnInventoryItem) | **GET** /inventory/spawn | Spawn Inventory Item |
| [**unequipOwnInventorySlot**](InventoryApi.md#unequipOwnInventorySlot) | **DELETE** /inventory/{inventoryItemId}/equip | Unequip Own Inventory Slot |
| [**updateOwnInventoryItem**](InventoryApi.md#updateOwnInventoryItem) | **PUT** /inventory/{inventoryItemId} | Update Own Inventory Item |


<a name="consumeOwnInventoryItem"></a>
# **consumeOwnInventoryItem**
> InventoryConsumptionResults consumeOwnInventoryItem(inventoryItemId)

Consume Own Inventory Item

Returns the modified InventoryItem object as held by the currently logged in user.

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
      InventoryConsumptionResults result = apiInstance.consumeOwnInventoryItem(inventoryItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#consumeOwnInventoryItem");
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

[**InventoryConsumptionResults**](InventoryConsumptionResults.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an InventoryConsumptionResults object. |  -  |
| **400** | Error response when trying to consume an InventoryItem lacking the consumable flag. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="deleteOwnInventoryItem"></a>
# **deleteOwnInventoryItem**
> SuccessFlag deleteOwnInventoryItem(inventoryItemId)

Delete Own Inventory Item

Deletes an InventoryItem from the inventory of the currently logged in user.

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
      SuccessFlag result = apiInstance.deleteOwnInventoryItem(inventoryItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#deleteOwnInventoryItem");
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

[**SuccessFlag**](SuccessFlag.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an SuccessFlag object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="equipOwnInventoryItem"></a>
# **equipOwnInventoryItem**
> InventoryItem equipOwnInventoryItem(inventoryItemId, equipInventoryItemRequest)

Equip Own Inventory Item

Returns the modified InventoryItem object as held by the currently logged in user.

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
    EquipInventoryItemRequest equipInventoryItemRequest = new EquipInventoryItemRequest(); // EquipInventoryItemRequest | 
    try {
      InventoryItem result = apiInstance.equipOwnInventoryItem(inventoryItemId, equipInventoryItemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#equipOwnInventoryItem");
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
| **equipInventoryItemRequest** | [**EquipInventoryItemRequest**](EquipInventoryItemRequest.md)|  | [optional] |

### Return type

[**InventoryItem**](InventoryItem.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an InventoryItem object. |  -  |
| **400** | Error response when trying to equip an InventoryItem lacking the equippable flag. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getInventory"></a>
# **getInventory**
> Inventory getInventory(n, offset, holderId, equipSlot, order, tags, types, flags, notTypes, notFlags, archived)

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
    String holderId = "holderId_example"; // String | The UserID of the owner of the inventory; defaults to the currently authenticated user.
    InventoryEquipSlot equipSlot = InventoryEquipSlot.fromValue(""); // InventoryEquipSlot | Filter for inventory retrieval.
    String order = "newest"; // String | Sort order for inventory retrieval.
    String tags = "tags_example"; // String | Filter tags for inventory retrieval (comma-separated).
    InventoryItemType types = InventoryItemType.fromValue("bundle"); // InventoryItemType | Filter for inventory retrieval.
    InventoryFlag flags = InventoryFlag.fromValue("archivable"); // InventoryFlag | Filter flags for inventory retrieval (comma-separated).
    InventoryItemType notTypes = InventoryItemType.fromValue("bundle"); // InventoryItemType | Filter out types for inventory retrieval (comma-separated).
    InventoryFlag notFlags = InventoryFlag.fromValue("archivable"); // InventoryFlag | Filter out flags for inventory retrieval (comma-separated).
    Boolean archived = true; // Boolean | Filter archived status for inventory retrieval.
    try {
      Inventory result = apiInstance.getInventory(n, offset, holderId, equipSlot, order, tags, types, flags, notTypes, notFlags, archived);
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
| **holderId** | **String**| The UserID of the owner of the inventory; defaults to the currently authenticated user. | [optional] |
| **equipSlot** | [**InventoryEquipSlot**](.md)| Filter for inventory retrieval. | [optional] [default to ] [enum: , drone, portal, warp] |
| **order** | **String**| Sort order for inventory retrieval. | [optional] [enum: newest, newest_created, oldest, oldest_created] |
| **tags** | **String**| Filter tags for inventory retrieval (comma-separated). | [optional] |
| **types** | [**InventoryItemType**](.md)| Filter for inventory retrieval. | [optional] [default to bundle] [enum: bundle, droneskin, emoji, portalskin, prop, sticker, warpeffect] |
| **flags** | [**InventoryFlag**](.md)| Filter flags for inventory retrieval (comma-separated). | [optional] [default to instantiatable] [enum: archivable, cloneable, consumable, equippable, instantiatable, trashable, ugc, unique] |
| **notTypes** | [**InventoryItemType**](.md)| Filter out types for inventory retrieval (comma-separated). | [optional] [default to bundle] [enum: bundle, droneskin, emoji, portalskin, prop, sticker, warpeffect] |
| **notFlags** | [**InventoryFlag**](.md)| Filter out flags for inventory retrieval (comma-separated). | [optional] [default to instantiatable] [enum: archivable, cloneable, consumable, equippable, instantiatable, trashable, ugc, unique] |
| **archived** | **Boolean**| Filter archived status for inventory retrieval. | [optional] |

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
| **403** | Error response due to missing permissions. |  -  |

<a name="getInventoryCollections"></a>
# **getInventoryCollections**
> List&lt;String&gt; getInventoryCollections()

List Inventory Collections

Returns a list of collection names.

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
    try {
      List<String> result = apiInstance.getInventoryCollections();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#getInventoryCollections");
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

**List&lt;String&gt;**

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of strings. |  -  |
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

<a name="getUserInventoryItem"></a>
# **getUserInventoryItem**
> InventoryItem getUserInventoryItem(userId, inventoryItemId)

Get User Inventory Item

Returns an InventoryItem object held by the given user.

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
    String userId = "userId_example"; // String | Must be a valid user ID.
    String inventoryItemId = "inv_00000000-0000-0000-0000-000000000000"; // String | Must be a valid inventory item ID.
    try {
      InventoryItem result = apiInstance.getUserInventoryItem(userId, inventoryItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#getUserInventoryItem");
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

<a name="shareInventoryItemDirect"></a>
# **shareInventoryItemDirect**
> OkStatus shareInventoryItemDirect(itemId, duration, shareInventoryItemDirectRequest)

Share Inventory Item Direct

Share content directly with other users.

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
    String itemId = "itemId_example"; // String | Id for inventory item sharing.
    Integer duration = 90; // Integer | The duration before the sharing pedestal despawns.
    ShareInventoryItemDirectRequest shareInventoryItemDirectRequest = new ShareInventoryItemDirectRequest(); // ShareInventoryItemDirectRequest | 
    try {
      OkStatus result = apiInstance.shareInventoryItemDirect(itemId, duration, shareInventoryItemDirectRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#shareInventoryItemDirect");
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
| **itemId** | **String**| Id for inventory item sharing. | |
| **duration** | **Integer**| The duration before the sharing pedestal despawns. | [default to 90] |
| **shareInventoryItemDirectRequest** | [**ShareInventoryItemDirectRequest**](ShareInventoryItemDirectRequest.md)|  | |

### Return type

[**OkStatus**](OkStatus.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an OkStatus object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="shareInventoryItemPedestal"></a>
# **shareInventoryItemPedestal**
> InventorySpawn shareInventoryItemPedestal(itemId, duration)

Share Inventory Item by Pedestal

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
    String itemId = "itemId_example"; // String | Id for inventory item sharing.
    Integer duration = 90; // Integer | The duration before the sharing pedestal despawns.
    try {
      InventorySpawn result = apiInstance.shareInventoryItemPedestal(itemId, duration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#shareInventoryItemPedestal");
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
| **itemId** | **String**| Id for inventory item sharing. | |
| **duration** | **Integer**| The duration before the sharing pedestal despawns. | [default to 90] |

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

<a name="unequipOwnInventorySlot"></a>
# **unequipOwnInventorySlot**
> String unequipOwnInventorySlot(inventoryItemId)

Unequip Own Inventory Slot

Unequips the InventoryItem in the given slot of the inventory of the currently logged in user.

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
    InventoryEquipSlot inventoryItemId = InventoryEquipSlot.fromValue(""); // InventoryEquipSlot | Selector for inventory slot management.
    try {
      String result = apiInstance.unequipOwnInventorySlot(inventoryItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#unequipOwnInventorySlot");
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
| **inventoryItemId** | [**InventoryEquipSlot**](.md)| Selector for inventory slot management. | [default to ] [enum: , drone, portal, warp] |

### Return type

**String**

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a string. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="updateOwnInventoryItem"></a>
# **updateOwnInventoryItem**
> InventoryItem updateOwnInventoryItem(inventoryItemId, updateInventoryItemRequest)

Update Own Inventory Item

Returns the modified InventoryItem object as held by the currently logged in user.

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
    UpdateInventoryItemRequest updateInventoryItemRequest = new UpdateInventoryItemRequest(); // UpdateInventoryItemRequest | 
    try {
      InventoryItem result = apiInstance.updateOwnInventoryItem(inventoryItemId, updateInventoryItemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#updateOwnInventoryItem");
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
| **updateInventoryItemRequest** | [**UpdateInventoryItemRequest**](UpdateInventoryItemRequest.md)|  | [optional] |

### Return type

[**InventoryItem**](InventoryItem.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an InventoryItem object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

