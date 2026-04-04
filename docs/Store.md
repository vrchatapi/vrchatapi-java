

# Store


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**created** | **OffsetDateTime** |  |  [optional] |
|**description** | **String** |  |  |
|**displayName** | **String** |  |  |
|**groupId** | **String** |  |  [optional] |
|**id** | **String** |  |  |
|**listingIds** | **List&lt;String&gt;** | Only for store type world and group |  [optional] |
|**listings** | [**List&lt;ProductListing&gt;**](ProductListing.md) | Only for store type world and group |  [optional] |
|**sellerDisplayName** | **String** |  |  |
|**sellerId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**shelfIds** | **List&lt;String&gt;** | Only for store type house |  [optional] |
|**shelves** | [**List&lt;StoreShelf&gt;**](StoreShelf.md) | Only for store type house |  [optional] |
|**storeContext** | [**StoreContext**](StoreContext.md) |  |  [optional] |
|**storeId** | **String** |  |  |
|**storeStatus** | **String** |  |  [optional] |
|**storeType** | **StoreType** |  |  |
|**tags** | **List&lt;String&gt;** |  |  |
|**updated** | **OffsetDateTime** |  |  [optional] |
|**worldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  [optional] |



