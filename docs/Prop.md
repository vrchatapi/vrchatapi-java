

# Prop



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**authorId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**authorName** | **String** |  |  |
|**description** | **String** |  |  |
|**id** | **String** |  |  |
|**imageUrl** | **String** |  |  |
|**maxCountPerUser** | **Integer** |  |  |
|**name** | **String** |  |  |
|**releaseStatus** | **ReleaseStatus** |  |  |
|**spawnType** | **Integer** | How a prop is summoned and interacted with. 0: the prop fixed to some surface in the world 1: the prop is a pickup and may be held by users 2: ??? |  |
|**tags** | **List&lt;String&gt;** |  |  |
|**thumbnailImageUrl** | **String** |  |  |
|**unityPackageUrl** | **String** |  |  |
|**unityPackages** | [**Set&lt;PropUnityPackage&gt;**](PropUnityPackage.md) |  |  |
|**worldPlacementMask** | **Integer** | Bitmask for restrictions on what world surfaces a prop may be summoned. 0: no restrictions 1: floors 2: walls 4: ceilings |  |



