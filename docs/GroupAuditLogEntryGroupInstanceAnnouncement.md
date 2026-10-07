

# GroupAuditLogEntryGroupInstanceAnnouncement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actorDisplayName** | **String** | The display name of the user who performed the action. |  |
|**actorId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**createdAt** | **OffsetDateTime** | When the action was performed. |  |
|**description** | **String** | A human-readable description of the event. |  |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**groupId** | **String** |  |  |
|**id** | **String** |  |  |
|**data** | [**GroupAuditLogEntryDataGroupInstanceAnnouncement**](GroupAuditLogEntryDataGroupInstanceAnnouncement.md) |  |  |
|**targetId** | **String** | Represents a unique location, consisting of a world identifier and an instance identifier, or \&quot;offline\&quot; if the user is not on your friends list. |  |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| GROUP_INSTANCE_ANNOUNCEMENT | &quot;group.instance.announcement&quot; |



