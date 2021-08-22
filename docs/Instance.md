

# Instance


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** |  | 
**canRequestInvite** | **Boolean** |  | 
**capacity** | **BigDecimal** |  | 
**clientNumber** | **String** |  | 
**full** | **Boolean** |  | 
**id** | **String** |  | 
**instanceId** | **String** |  | 
**location** | **String** |  | 
**nUsers** | **BigDecimal** |  | 
**name** | **String** |  | 
**nonce** | **String** |  |  [optional]
**ownerId** | **String** |  |  [readonly]
**permanent** | **Boolean** |  | 
**photonRegion** | **String** |  | 
**platforms** | [**InstancePlatforms**](InstancePlatforms.md) |  | 
**region** | **String** |  | 
**shortName** | **String** |  | 
**tags** | **List&lt;String&gt;** |  | 
**type** | **String** |  | 
**users** | **List&lt;Object&gt;** | Always empty on non-existing instances, and non-present on existing instances. |  [optional]
**world** | **Object** | Only present on non-existing instances, and only contains a very small subject of World object. Use World API instead. |  [optional]
**worldId** | **String** |  | 



