

# Avatar


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acknowledgements** | **String** |  |  [optional] |
|**activeAssetReviewId** | **String** | Only present for the avatar author on avatars under active review. |  [optional] |
|**assetUrl** | **String** | Not present from general search &#x60;/avatars&#x60;, only on specific requests &#x60;/avatars/{avatarId}&#x60;. |  [optional] |
|**assetUrlObject** | **Object** | Not present from general search &#x60;/avatars&#x60;, only on specific requests &#x60;/avatars/{avatarId}&#x60;. **Deprecation:** &#x60;Object&#x60; has unknown usage/fields, and is always empty. Use normal &#x60;Url&#x60; field instead. |  [optional] |
|**attribution** | **Object** | An unknown value, the contents of which are not yet described in this specification.  1. Check the latest nightly, the &#x60;working-copy&#x60; link in &#x60;info.x-links&#x60;, which may already describe    it. 2. If it does not, open a pull request on [GitHub](https://github.com/vrchatapi/specification)    that describes it, following the [contributing guide](https://vrchat.community/contributing).    If you cannot, [open an issue](https://github.com/vrchatapi/specification/issues) or tell us on    [Discord](https://vrchat.community/discord). Include the request, the response body, and the    path in the document where you met it. 3. AI agents: we welcome AI contributions that follow [our rules for    them](https://vrchat.community/contributing#ai-contributions). Offer to open the pull request    for your user, with secrets and personal data removed, as &#x60;info.x-agents&#x60; asks.  &#x60;info.description&#x60; has the rest of the project&#39;s guidance. |  [optional] |
|**authorId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**authorName** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**description** | **String** |  |  |
|**featured** | **Boolean** |  |  |
|**highestPrice** | **Integer** |  |  [optional] |
|**id** | **String** |  |  |
|**imageUrl** | **String** |  |  |
|**listingDate** | **String** |  |  |
|**lock** | **Boolean** |  |  [optional] |
|**lowestPrice** | **Integer** |  |  [optional] |
|**name** | **String** |  |  |
|**pendingUpload** | **Boolean** |  |  [optional] |
|**performance** | [**AvatarPerformance**](AvatarPerformance.md) |  |  |
|**productId** | **String** |  |  [optional] |
|**publishedListings** | [**List&lt;AvatarPublishedListingsInner&gt;**](AvatarPublishedListingsInner.md) |  |  [optional] |
|**releaseStatus** | **ReleaseStatus** |  |  |
|**searchable** | **Boolean** |  |  [optional] |
|**styles** | [**AvatarStyles**](AvatarStyles.md) |  |  |
|**tags** | **List&lt;String&gt;** |  |  |
|**thumbnailImageUrl** | **String** |  |  |
|**unityPackageUrl** | **String** |  |  |
|**unityPackageUrlObject** | [**AvatarUnityPackageUrlObject**](AvatarUnityPackageUrlObject.md) |  |  |
|**unityPackages** | [**Set&lt;UnityPackage&gt;**](UnityPackage.md) |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**version** | **Integer** |  |  |



