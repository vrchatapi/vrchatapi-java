

# ProductListing


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** |  |  |
|**archived** | **Boolean** |  |  [optional] |
|**attribution** | [**ProductListingAttribution**](ProductListingAttribution.md) |  |  [optional] |
|**buyerRefundable** | **Boolean** |  |  |
|**collabUserDisplayName** | **String** |  |  [optional] |
|**collabUserId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] |
|**description** | **String** |  |  |
|**displayName** | **String** |  |  |
|**duration** | **Integer** |  |  [optional] |
|**durationType** | **String** |  |  [optional] |
|**groupIcon** | **String** |  |  [optional] |
|**groupId** | **String** |  |  [optional] |
|**groupName** | **String** |  |  [optional] |
|**hasAvatar** | **Boolean** |  |  |
|**hasCompanion** | **Boolean** |  |  [optional] |
|**hasInventory** | **Boolean** |  |  [optional] |
|**hasUdon** | **Boolean** |  |  |
|**hydratedProducts** | [**List&lt;Product&gt;**](Product.md) |  |  [optional] |
|**id** | **String** |  |  |
|**imageId** | **String** |  |  [optional] |
|**imageUrl** | **String** |  |  [optional] |
|**listingType** | **ProductListingType** |  |  |
|**listingVariants** | [**List&lt;ProductListingVariant&gt;**](ProductListingVariant.md) |  |  [optional] |
|**permanent** | **Boolean** |  |  [optional] |
|**priceTokens** | **Integer** |  |  |
|**productIds** | **List&lt;String&gt;** |  |  |
|**productType** | **ProductType** |  |  |
|**productTypes** | **List&lt;String&gt;** |  |  [optional] |
|**products** | **List&lt;String&gt;** | Product ids. The products themselves arrive in &#x60;hydratedProducts&#x60;. |  |
|**purchaseCount** | **Integer** |  |  [optional] |
|**purchaseCountQuantity** | **Integer** |  |  [optional] |
|**quantifiable** | **Boolean** |  |  [optional] |
|**recurrable** | **Boolean** |  |  |
|**refundable** | **Boolean** |  |  |
|**sellerDisplayName** | **String** |  |  |
|**sellerId** | **String** |  |  |
|**soldByVrc** | **Boolean** |  |  [optional] |
|**stackable** | **Boolean** |  |  |
|**storeIds** | **List&lt;String&gt;** |  |  |
|**subtitle** | **String** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**updated** | **OffsetDateTime** |  |  [optional] |
|**vrcPlusDiscountPrice** | **Integer** |  |  [optional] |
|**whenToExpire** | **OffsetDateTime** |  |  [optional] |



