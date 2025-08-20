

# CreateCalendarEventRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Event title |  |
|**startsAt** | **OffsetDateTime** | Time the event starts at |  |
|**description** | **String** |  |  |
|**endsAt** | **OffsetDateTime** | Time the event ends at |  |
|**category** | **String** |  |  |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**isDraft** | **Boolean** |  |  [optional] |
|**imageId** | **String** |  |  [optional] |
|**roleIds** | **List&lt;String&gt;** |  |  [optional] |
|**parentId** | **String** |  |  [optional] |
|**platforms** | **List&lt;String&gt;** |  |  [optional] |
|**languages** | **List&lt;String&gt;** |  |  [optional] |
|**sendCreationNotification** | **Boolean** | Send notification to group members. |  |
|**featured** | **Boolean** |  |  [optional] |
|**hostEarlyJoinMinutes** | **Integer** |  |  [optional] |
|**guestEarlyJoinMinutes** | **Integer** |  |  [optional] |
|**closeInstanceAfterEndMinutes** | **Integer** |  |  [optional] |
|**usesInstanceOverflow** | **Boolean** |  |  [optional] |
|**accessType** | [**AccessTypeEnum**](#AccessTypeEnum) |  |  |



## Enum: AccessTypeEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;public&quot; |
| GROUP | &quot;group&quot; |



