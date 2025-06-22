

# Avatar



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acknowledgements** | **String** |  |  [optional] |
|**assetUrl** | **String** | Not present from general search &#x60;/avatars&#x60;, only on specific requests &#x60;/avatars/{avatarId}&#x60;. |  [optional] |
|**assetUrlObject** | **Object** | Not present from general search &#x60;/avatars&#x60;, only on specific requests &#x60;/avatars/{avatarId}&#x60;. **Deprecation:** &#x60;Object&#x60; has unknown usage/fields, and is always empty. Use normal &#x60;Url&#x60; field instead. |  [optional] |
|**authorId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**authorName** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**description** | **String** |  |  |
|**featured** | **Boolean** |  |  |
|**highestPrice** | **Integer** |  |  [optional] |
|**id** | **String** |  |  |
|**imageUrl** | **String** |  |  |
|**lock** | **Boolean** |  |  [optional] |
|**lowestPrice** | **Integer** |  |  [optional] |
|**name** | **String** |  |  |
|**performance** | [**AvatarPerformance**](AvatarPerformance.md) |  |  |
|**productId** | **String** |  |  [optional] |
|**publishedListings** | [**List&lt;AvatarPublishedListingsInner&gt;**](AvatarPublishedListingsInner.md) |  |  [optional] |
|**releaseStatus** | **ReleaseStatus** |  |  |
|**searchable** | **Boolean** |  |  [optional] |
|**styles** | [**AvatarStyles**](AvatarStyles.md) |  |  |
|**tags** | **List&lt;String&gt;** |   |  |
|**thumbnailImageUrl** | **String** |  |  |
|**unityPackageUrl** | **String** |  |  |
|**unityPackageUrlObject** | [**AvatarUnityPackageUrlObject**](AvatarUnityPackageUrlObject.md) |  |  |
|**unityPackages** | [**Set&lt;UnityPackage&gt;**](UnityPackage.md) |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**version** | **Integer** |  |  |



