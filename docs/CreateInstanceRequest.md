

# CreateInstanceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**worldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |
|**type** | **InstanceType** |  |  |
|**region** | **Region** |  |  |
|**ownerId** | **String** | A groupId if the instance type is \&quot;group\&quot;, null if instance type is public, or a userId otherwise |  [optional] |
|**roleIds** | **List&lt;String&gt;** | Group roleIds that are allowed to join if the type is \&quot;group\&quot; and groupAccessType is \&quot;member\&quot; |  [optional] |
|**groupAccessType** | **GroupAccessType** |  |  [optional] |
|**queueEnabled** | **Boolean** |  |  [optional] |
|**closedAt** | **OffsetDateTime** | The time after which users won&#39;t be allowed to join the instance |  [optional] |



