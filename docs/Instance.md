

# Instance

* `hidden` field is only present if InstanceType is `hidden` aka \"Friends+\", and is instance creator. * `friends` field is only present if InstanceType is `friends` aka \"Friends\", and is instance creator. * `private` field is only present if InstanceType is `private` aka \"Invite\" or \"Invite+\", and is instance creator.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** |  |  |
|**canRequestInvite** | **Boolean** |  |  |
|**capacity** | **Integer** |  |  |
|**clientNumber** | **String** | Always returns \&quot;unknown\&quot;. |  |
|**full** | **Boolean** |  |  |
|**id** | **String** | InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance. |  |
|**instanceId** | **String** |  |  |
|**location** | **String** | InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance. |  |
|**nUsers** | **Integer** |  |  |
|**name** | **String** |  |  |
|**ownerId** | **String** | A groupId if the instance type is \&quot;group\&quot;, null if instance type is public, or a userId otherwise |  [optional] |
|**permanent** | **Boolean** |  |  |
|**photonRegion** | **Region** |  |  |
|**platforms** | [**InstancePlatforms**](InstancePlatforms.md) |  |  |
|**region** | **InstanceRegion** |  |  |
|**secureName** | **String** |  |  |
|**shortName** | **String** |  |  [optional] |
|**tags** | **List&lt;String&gt;** | The tags array on Instances usually contain the language tags of the people in the instance.  |  |
|**type** | **InstanceType** |  |  |
|**worldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |
|**hidden** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**friends** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**_private** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**queueEnabled** | **Boolean** |  |  |
|**queueSize** | **Integer** |  |  |
|**recommendedCapacity** | **Integer** |  |  |
|**roleRestricted** | **Boolean** |  |  [optional] |
|**strict** | **Boolean** |  |  |
|**userCount** | **Integer** |  |  |
|**world** | [**World**](World.md) |  |  |
|**users** | [**List&lt;LimitedUser&gt;**](LimitedUser.md) | The users field is present on instances created by the requesting user. |  [optional] |
|**groupAccessType** | **GroupAccessType** |  |  [optional] |
|**hasCapacityForYou** | **Boolean** |  |  [optional] |
|**nonce** | **String** |  |  [optional] |
|**closedAt** | **OffsetDateTime** |  |  [optional] |
|**hardClose** | **Boolean** |  |  [optional] |



