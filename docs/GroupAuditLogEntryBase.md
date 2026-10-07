

# GroupAuditLogEntryBase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actorDisplayName** | **String** | The display name of the user who performed the action. |  |
|**actorId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**createdAt** | **OffsetDateTime** | When the action was performed. |  |
|**description** | **String** | A human-readable description of the event. |  |
|**eventType** | **String** | The type of event that occurred. This is a string that is prefixed with the type of object that the event occurred on. For example, a group role update event would be prefixed with &#x60;group.role&#x60;. |  |
|**groupId** | **String** |  |  |
|**id** | **String** |  |  |



