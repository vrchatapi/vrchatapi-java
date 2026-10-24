

# LimitedInstance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessType** | **String** | &#x60;type&#x60;, &#x60;groupAccessType&#x60; and &#x60;canRequestInvite&#x60; folded into one value.  | &#x60;type&#x60; | &#x60;groupAccessType&#x60; | &#x60;canRequestInvite&#x60; | &#x60;accessType&#x60; | | --- | --- | --- | --- | | &#x60;public&#x60; | | | &#x60;public&#x60; | | &#x60;friends&#x60; | | | &#x60;friends&#x60; | | &#x60;hidden&#x60; | | | &#x60;friendsPlus&#x60; | | &#x60;private&#x60; | | &#x60;false&#x60; | &#x60;invite&#x60; | | &#x60;private&#x60; | | &#x60;true&#x60; | &#x60;invitePlus&#x60; | | &#x60;group&#x60; | &#x60;public&#x60; | | &#x60;groupPublic&#x60; | | &#x60;group&#x60; | &#x60;plus&#x60; | | &#x60;groupPlus&#x60; | | &#x60;group&#x60; | &#x60;members&#x60; | | &#x60;group&#x60; | |  |
|**active** | **Boolean** |  |  |
|**capacity** | **Integer** |  |  |
|**categoryId** | **String** |  |  |
|**creationLanguages** | **List&lt;Object&gt;** |  |  |
|**description** | **String** |  |  |
|**disabledPropAbilities** | **List&lt;String&gt;** |  |  |
|**displayName** | **String** |  |  |
|**displayVibeId** | **String** |  |  |
|**dominantLanguage** | **String** |  |  |
|**full** | **Boolean** |  |  |
|**groupAccessType** | **GroupAccessType** |  |  [optional] |
|**id** | **String** | InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance. |  |
|**instanceId** | **String** | InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance. |  |
|**languageRatio** | **Map&lt;String, Object&gt;** |  |  |
|**languages** | **List&lt;String&gt;** | The keys of languageRatio, ordered by their share of the instance. |  |
|**languagesIso639** | **List&lt;String&gt;** |  |  |
|**location** | **String** | Represents a unique location, consisting of a world identifier and an instance identifier, or \&quot;offline\&quot; if the user is not on your friends list. |  |
|**minimumAvatarPerformance** | **String** |  |  |
|**nUsers** | **Integer** |  |  |
|**ownerId** | **String** | A groupId if the instance type is \&quot;group\&quot;, null if instance type is public, or a userId otherwise |  |
|**permanent** | **Boolean** |  |  |
|**photonRegion** | **Region** |  |  |
|**platforms** | [**InstancePlatforms**](InstancePlatforms.md) |  |  |
|**queueEnabled** | **Boolean** |  |  |
|**queueSize** | **Integer** |  |  |
|**recommendedCapacity** | **Integer** |  |  |
|**region** | **InstanceRegion** |  |  |
|**roleRestricted** | **Boolean** |  |  [optional] |
|**shortName** | **String** |  |  |
|**tags** | **List&lt;String&gt;** | The tags array on Instances usually contain the language tags of the people in the instance.  |  |
|**type** | **InstanceType** |  |  |
|**userCount** | **Integer** |  |  |
|**userIcons** | **List&lt;String&gt;** |  |  |
|**vibeIds** | **List&lt;String&gt;** |  |  |
|**world** | [**World**](World.md) |  |  |
|**worldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |



