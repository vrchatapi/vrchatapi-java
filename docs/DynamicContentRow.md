

# DynamicContentRow

A row of content. The fields depend on `type`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**LocalizableString**](LocalizableString.md) |  |  |
|**platform** | **String** | Usually \&quot;ThisPlatformSupported\&quot;, but can also be other values such as \&quot;all\&quot; or platform specific identifiers. |  |
|**anyStyle** | **List&lt;String&gt;** |  |  [optional] |
|**anyTag** | **List&lt;String&gt;** |  |  [optional] |
|**marketplace** | **String** |  |  [optional] |
|**maxPrice** | **Integer** |  |  [optional] |
|**minPrice** | **Integer** |  |  [optional] |
|**notag** | **List&lt;String&gt;** |  |  [optional] |
|**params** | **Map&lt;String, Object&gt;** |  |  |
|**sortHeading** | **String** |  |  |
|**sortOrder** | **OrderOption** |  |  |
|**sortOwnership** | **String** |  |  |
|**style** | **String** |  |  [optional] |
|**tag** | **String** | Tag to filter content for this row. Not a &#x60;Tag&#x60;: that type forbids the empty string, which this field uses for a row that is not tag-filtered. |  [optional] |
|**type** | **String** |  |  |
|**categories** | **List&lt;String&gt;** |  |  |
|**featuredResults** | **String** |  |  |
|**minimumInterestCount** | **Integer** |  |  |
|**minimumRemainingMinutes** | **Integer** |  |  |
|**nonFeaturedResults** | **String** |  |  |
|**personalizedResults** | **String** |  |  |
|**scope** | **String** |  |  |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**upcomingOffsetMinutes** | **Integer** |  |  |
|**groupPool** | **String** |  |  [optional] |
|**minOccupants** | **Integer** |  |  |
|**mode** | **InstanceDiscoveryMode** |  |  |
|**n** | **Integer** |  |  |
|**region** | **InstanceRegion** |  |  |
|**worldPool** | **InstanceDiscoveryWorldPool** |  |  [optional] |
|**avatarSpecific** | **Boolean** |  |  [optional] |
|**bannersTag** | **String** |  |  [optional] |
|**index** | **Integer** |  |  [optional] |
|**shortName** | [**LocalizableString**](LocalizableString.md) |  |  [optional] |



