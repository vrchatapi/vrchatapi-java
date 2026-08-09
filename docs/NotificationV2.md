

# NotificationV2



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canDelete** | **Boolean** |  |  |
|**category** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**data** | **Map&lt;String, String&gt;** |  |  |
|**details** | [**NotificationV2DetailsBoop**](NotificationV2DetailsBoop.md) |  |  [optional] |
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



