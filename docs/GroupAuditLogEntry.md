

# GroupAuditLogEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**groupId** | **String** |  |  [optional] |
|**actorId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**actorDisplayname** | **String** |  |  [optional] |
|**targetId** | **String** | Typically GroupID or GroupRoleID, but could be other types of IDs. |  [optional] |
|**eventType** | **String** | The type of event that occurred. This is a string that is prefixed with the type of object that the event occurred on. For example, a group role update event would be prefixed with &#x60;group.role&#x60;. |  [optional] |
|**description** | **String** | A human-readable description of the event. |  [optional] |
|**data** | **Object** | The data associated with the event. The format of this data is dependent on the event type. |  [optional] |



