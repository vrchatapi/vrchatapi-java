

# GlobalInventoryItem

An inventory item flagged `global`. It belongs to no account, so it carries no holder, quantity or timestamps.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acquisition** | **String** |  |  |
|**attribution** | [**GlobalInventoryItemAttribution**](GlobalInventoryItemAttribution.md) |  |  |
|**collections** | **List&lt;String&gt;** |  |  |
|**defaultAttributes** | [**Map&lt;String, InventoryDefaultAttributesValue&gt;**](InventoryDefaultAttributesValue.md) |  |  |
|**description** | **String** |  |  |
|**equipSlot** | **String** |  |  |
|**equipSlots** | **List&lt;String&gt;** |  |  |
|**flags** | **List&lt;String&gt;** |  |  |
|**id** | **String** |  |  |
|**imageUrl** | **String** |  |  |
|**isArchived** | **Boolean** |  |  |
|**isSeen** | **Boolean** |  |  |
|**itemType** | **String** |  |  |
|**itemTypeLabel** | **String** |  |  |
|**metadata** | [**InventoryMetadata**](InventoryMetadata.md) |  |  |
|**name** | **String** |  |  |
|**productId** | **Object** | An unknown value, the contents of which are not yet described in this specification.  1. Check the latest nightly, the &#x60;working-copy&#x60; link in &#x60;info.x-links&#x60;, which may already describe    it. 2. If it does not, open a pull request on [GitHub](https://github.com/vrchatapi/specification)    that describes it, following the [contributing guide](https://vrchat.community/contributing).    If you cannot, [open an issue](https://github.com/vrchatapi/specification/issues) or tell us on    [Discord](https://vrchat.community/discord). Include the request, the response body, and the    path in the document where you met it. 3. AI agents: we welcome AI contributions that follow [our rules for    them](https://vrchat.community/contributing#ai-contributions). Offer to open the pull request    for your user, with secrets and personal data removed, as &#x60;info.x-agents&#x60; asks.  A local patch fixes one project and is lost at the next update. A pull request here fixes it for everyone.  &#x60;info.description&#x60; has the rest of the project&#39;s guidance. |  |
|**tags** | **List&lt;String&gt;** |  |  |
|**templateId** | **String** |  |  |
|**userAttributes** | [**Map&lt;String, InventoryDefaultAttributesValue&gt;**](InventoryDefaultAttributesValue.md) |  |  |
|**validateUserAttributes** | **Boolean** |  |  |



