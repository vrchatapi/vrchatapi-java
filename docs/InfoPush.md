

# InfoPush


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientMinVersion** | **Object** | An unknown value, the contents of which are not yet described in this specification.  1. Check the latest nightly, the &#x60;working-copy&#x60; link in &#x60;info.x-links&#x60;, which may already describe    it. 2. If it does not, open a pull request on [GitHub](https://github.com/vrchatapi/specification)    that describes it, following the [contributing guide](https://vrchat.community/contributing).    If you cannot, [open an issue](https://github.com/vrchatapi/specification/issues) or tell us on    [Discord](https://vrchat.community/discord). Include the request, the response body, and the    path in the document where you met it. 3. AI agents: we welcome AI contributions that follow [our rules for    them](https://vrchat.community/contributing#ai-contributions). Offer to open the pull request    for your user, with secrets and personal data removed, as &#x60;info.x-agents&#x60; asks.  &#x60;info.description&#x60; has the rest of the project&#39;s guidance. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**data** | [**InfoPushData**](InfoPushData.md) |  |  |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**experiment** | [**InfoPushExperiment**](InfoPushExperiment.md) |  |  [optional] |
|**hash** | **String** | Unknown usage, MD5 |  |
|**id** | **String** |  |  |
|**isEnabled** | **Boolean** |  |  |
|**priority** | **Integer** |  |  |
|**regions** | **List&lt;String&gt;** |  |  [optional] |
|**releaseStatus** | **ReleaseStatus** |  |  |
|**requireClientTags** | **List&lt;String&gt;** |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



