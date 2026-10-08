

# GroupAuditLogEntryGroupMemberRemove


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actorDisplayName** | **String** | The display name of the user who performed the action. |  |
|**actorId** | **String** | The ID of the user who performed the action. |  |
|**createdAt** | **OffsetDateTime** | When the action was performed. |  |
|**description** | **String** | A human-readable description of the event. |  |
|**groupId** | **String** | The ID of the group the entry belongs to. |  |
|**id** | **String** | The unique ID of this audit log entry. |  |
|**data** | **Object** |  |  |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**targetId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| GROUP_MEMBER_REMOVE | &quot;group.member.remove&quot; |



