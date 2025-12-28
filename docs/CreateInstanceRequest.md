

# CreateInstanceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ageGate** | **Boolean** |  |  [optional] |
|**calendarEntryId** | **String** |  |  [optional] |
|**canRequestInvite** | **Boolean** | Only applies to invite type instances to make them invite+ |  [optional] |
|**closedAt** | **OffsetDateTime** | The time after which users won&#39;t be allowed to join the instance. This doesn&#39;t work for public instances. |  [optional] |
|**contentSettings** | [**InstanceContentSettings**](InstanceContentSettings.md) |  |  [optional] |
|**displayName** | **String** |  |  [optional] |
|**groupAccessType** | **GroupAccessType** |  |  [optional] |
|**hardClose** | **Boolean** | Currently unused, but will eventually be a flag to set if the closing of the instance should kick people. |  [optional] |
|**instancePersistenceEnabled** | **Boolean** |  |  [optional] |
|**inviteOnly** | **Boolean** |  |  [optional] |
|**ownerId** | **String** | A groupId if the instance type is \&quot;group\&quot;, null if instance type is public, or a userId otherwise |  [optional] |
|**playerPersistenceEnabled** | **Boolean** |  |  [optional] |
|**queueEnabled** | **Boolean** |  |  [optional] |
|**region** | **InstanceRegion** |  |  |
|**roleIds** | **List&lt;String&gt;** | Group roleIds that are allowed to join if the type is \&quot;group\&quot; and groupAccessType is \&quot;member\&quot; |  [optional] |
|**type** | **InstanceType** |  |  |
|**worldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |



