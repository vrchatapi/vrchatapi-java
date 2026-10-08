

# GroupAuditLogEntryGroupCalendarEventCreate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actorDisplayName** | **String** | The display name of the user who performed the action. |  |
|**actorId** | **String** | The ID of the user who performed the action. |  |
|**createdAt** | **OffsetDateTime** | When the action was performed. |  |
|**description** | **String** | A human-readable description of the event. |  |
|**groupId** | **String** | The ID of the group the entry belongs to. |  |
|**id** | **String** | The unique ID of this audit log entry. |  |
|**data** | [**GroupAuditLogEntryDataGroupCalendarEventCreate**](GroupAuditLogEntryDataGroupCalendarEventCreate.md) |  |  |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**targetId** | **String** |  |  |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| GROUP_CALENDAR_EVENT_CREATE | &quot;group.calendarEvent.create&quot; |



