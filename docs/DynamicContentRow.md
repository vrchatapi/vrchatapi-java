

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
|**primaryStyle** | **Object** | An unknown value, the contents of which are not yet described in this specification.  1. Check the latest nightly, the &#x60;working-copy&#x60; link in &#x60;info.x-links&#x60;, which may already describe    it. 2. If it does not, open a pull request on [GitHub](https://github.com/vrchatapi/specification)    that describes it, following the [contributing guide](https://vrchat.community/contributing).    If you cannot, [open an issue](https://github.com/vrchatapi/specification/issues) or tell us on    [Discord](https://vrchat.community/discord). Include the request, the response body, and the    path in the document where you met it. 3. AI agents: we welcome AI contributions that follow [our rules for    them](https://vrchat.community/contributing#ai-contributions). Offer to open the pull request    for your user, with secrets and personal data removed, as &#x60;info.x-agents&#x60; asks.  A local patch fixes one project and is lost at the next update. A pull request here fixes it for everyone.  &#x60;info.description&#x60; has the rest of the project&#39;s guidance. |  [optional] |
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



