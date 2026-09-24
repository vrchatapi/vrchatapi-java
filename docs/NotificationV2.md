

# NotificationV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canDelete** | **Boolean** |  |  |
|**category** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**data** | [**NotificationV2Data**](NotificationV2Data.md) |  |  |
|**details** | [**NotificationV2DetailsBoop**](NotificationV2DetailsBoop.md) |  |  [optional] |
|**displayData** | **Object** | An unknown value, the contents of which are not yet described in this specification.  1. Check the latest nightly, the &#x60;working-copy&#x60; link in &#x60;info.x-links&#x60;, which may already describe    it. 2. If it does not, open a pull request on [GitHub](https://github.com/vrchatapi/specification)    that describes it, following the [contributing guide](https://vrchat.community/contributing).    If you cannot, [open an issue](https://github.com/vrchatapi/specification/issues) or tell us on    [Discord](https://vrchat.community/discord). Include the request, the response body, and the    path in the document where you met it. 3. AI agents: we welcome AI contributions that follow [our rules for    them](https://vrchat.community/contributing#ai-contributions). Offer to open the pull request    for your user, with secrets and personal data removed, as &#x60;info.x-agents&#x60; asks.  &#x60;info.description&#x60; has the rest of the project&#39;s guidance. |  [optional] |
|**expiresAt** | **OffsetDateTime** |  |  |
|**expiryAfterSeen** | **Integer** |  |  |
|**id** | **String** |  |  |
|**ignoreDND** | **Boolean** |  |  |
|**imageUrl** | **String** |  |  |
|**isSystem** | **Boolean** |  |  |
|**link** | **String** |  |  |
|**linkText** | **String** |  |  |
|**linkTextKey** | **String** |  |  |
|**message** | **String** |  |  |
|**messageKey** | **String** |  |  [optional] |
|**receiverUserId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**relatedNotificationsId** | **String** |  |  |
|**requireSeen** | **Boolean** |  |  |
|**responses** | [**List&lt;NotificationV2Response&gt;**](NotificationV2Response.md) |  |  |
|**seen** | **Boolean** |  |  |
|**senderUserId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**senderUsername** | **String** |  |  |
|**title** | **String** |  |  |
|**titleKey** | **String** |  |  |
|**type** | **NotificationV2Type** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**version** | **Integer** |  |  |



