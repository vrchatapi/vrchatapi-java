

# Instance

* `hidden` field is only present if InstanceType is `hidden` aka \"Friends+\", and is instance creator. * `friends` field is only present if InstanceType is `friends` aka \"Friends\", and is instance creator. * `private` field is only present if InstanceType is `private` aka \"Invite\" or \"Invite+\", and is instance creator.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** |  |  [optional] |
|**ageGate** | **Boolean** |  |  [optional] |
|**calendarEntryId** | **String** |  |  [optional] |
|**canRequestInvite** | **Boolean** |  |  [optional] |
|**capacity** | **Integer** |  |  [optional] |
|**clientNumber** | **String** | Always returns \&quot;unknown\&quot;. |  |
|**closedAt** | **OffsetDateTime** |  |  [optional] |
|**contentSettings** | [**InstanceContentSettings**](InstanceContentSettings.md) |  |  [optional] |
|**creatorId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**displayName** | **String** |  |  [optional] |
|**friends** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**full** | **Boolean** |  |  |
|**gameServerVersion** | **Integer** |  |  [optional] |
|**groupAccessType** | **GroupAccessType** |  |  [optional] |
|**hardClose** | **Boolean** |  |  [optional] |
|**hasCapacityForYou** | **Boolean** |  |  [optional] |
|**hidden** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**id** | **String** | InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance. |  |
|**instanceId** | **String** | InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance. |  |
|**instancePersistenceEnabled** | **Boolean** |  |  [optional] |
|**location** | **String** | Represents a unique location, consisting of a world identifier and an instance identifier, or \&quot;offline\&quot; if the user is not on your friends list. |  |
|**nUsers** | **Integer** |  |  |
|**name** | **String** |  |  |
|**nonce** | **String** |  |  [optional] |
|**ownerId** | **String** | A groupId if the instance type is \&quot;group\&quot;, null if instance type is public, or a userId otherwise |  [optional] |
|**permanent** | **Boolean** |  |  |
|**photonRegion** | **Region** |  |  |
|**platforms** | [**InstancePlatforms**](InstancePlatforms.md) |  |  |
|**playerPersistenceEnabled** | **Boolean** |  |  [optional] |
|**_private** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**queueEnabled** | **Boolean** |  |  |
|**queueSize** | **Integer** |  |  |
|**recommendedCapacity** | **Integer** |  |  |
|**region** | **InstanceRegion** |  |  |
|**roleRestricted** | **Boolean** |  |  [optional] |
|**secureName** | **String** |  |  |
|**shortName** | **String** |  |  [optional] |
|**strict** | **Boolean** |  |  |
|**tags** | **List&lt;String&gt;** | The tags array on Instances usually contain the language tags of the people in the instance.  |  |
|**type** | **InstanceType** |  |  |
|**userCount** | **Integer** |  |  |
|**users** | [**List&lt;LimitedUserInstance&gt;**](LimitedUserInstance.md) | The users field is present on instances created by the requesting user. |  [optional] |
|**world** | [**World**](World.md) |  |  |
|**worldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |



