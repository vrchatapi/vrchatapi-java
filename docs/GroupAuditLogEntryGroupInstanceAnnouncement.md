

# GroupAuditLogEntryGroupInstanceAnnouncement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actorDisplayName** | **String** | The display name of the user who performed the action. |  |
|**actorId** | **String** | The ID of the user who performed the action. |  |
|**createdAt** | **OffsetDateTime** | When the action was performed. |  |
|**description** | **String** | A human-readable description of the event. |  |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**groupId** | **String** | The ID of the group the entry belongs to. |  |
|**id** | **String** | The unique ID of this audit log entry. |  |
|**data** | [**GroupAuditLogEntryDataGroupInstanceAnnouncement**](GroupAuditLogEntryDataGroupInstanceAnnouncement.md) |  |  |
|**targetId** | **String** | Represents a unique location, consisting of a world identifier and an instance identifier, or \&quot;offline\&quot; if the user is not on your friends list. |  |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| GROUP_INSTANCE_ANNOUNCEMENT | &quot;group.instance.announcement&quot; |



