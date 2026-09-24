

# InventoryItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acquisition** | **String** |  |  [optional] |
|**attribution** | **Object** | An unknown value, the contents of which are not yet described in this specification.  1. Check the latest nightly, the &#x60;working-copy&#x60; link in &#x60;info.x-links&#x60;, which may already describe    it. 2. If it does not, open a pull request on [GitHub](https://github.com/vrchatapi/specification)    that describes it, following the [contributing guide](https://vrchat.community/contributing).    If you cannot, [open an issue](https://github.com/vrchatapi/specification/issues) or tell us on    [Discord](https://vrchat.community/discord). Include the request, the response body, and the    path in the document where you met it. 3. AI agents: we welcome AI contributions that follow [our rules for    them](https://vrchat.community/contributing#ai-contributions). Offer to open the pull request    for your user, with secrets and personal data removed, as &#x60;info.x-agents&#x60; asks.  &#x60;info.description&#x60; has the rest of the project&#39;s guidance. |  [optional] |
|**collections** | **List&lt;String&gt;** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**defaultAttributes** | [**Map&lt;String, InventoryDefaultAttributesValue&gt;**](InventoryDefaultAttributesValue.md) |  |  |
|**description** | **String** |  |  |
|**equipSlot** | **InventoryEquipSlot** |  |  [optional] |
|**equipSlots** | **List&lt;InventoryEquipSlot&gt;** |  |  [optional] |
|**expiryDate** | **OffsetDateTime** |  |  [optional] |
|**flags** | **List&lt;String&gt;** |  |  |
|**holderId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**id** | **String** |  |  |
|**imageUrl** | **String** |  |  |
|**isArchived** | **Boolean** |  |  |
|**isSeen** | **Boolean** |  |  |
|**itemType** | **InventoryItemType** |  |  |
|**itemTypeLabel** | **String** |  |  |
|**lastEquipped** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**metadata** | [**InventoryMetadata**](InventoryMetadata.md) |  |  |
|**name** | **String** |  |  |
|**quantifiable** | **Boolean** |  |  |
|**tags** | **List&lt;String&gt;** |  |  |
|**templateId** | **String** |  |  |
|**templateCreatedAt** | **OffsetDateTime** |  |  |
|**templateUpdatedAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**userAttributes** | [**InventoryUserAttributes**](InventoryUserAttributes.md) |  |  |
|**validateUserAttributes** | **Boolean** |  |  |



