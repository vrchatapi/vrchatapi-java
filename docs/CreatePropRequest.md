

# CreatePropRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assetUrl** | **String** |  |  |
|**assetVersion** | **Integer** |  |  |
|**description** | **String** |  |  |
|**id** | **String** |  |  |
|**imageUrl** | **String** |  |  |
|**name** | **String** |  |  |
|**platform** | **String** | This is normally &#x60;android&#x60;, &#x60;ios&#x60;, &#x60;standalonewindows&#x60;, &#x60;web&#x60;, or the empty value &#x60;&#x60;, but also supposedly can be any random Unity version such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;. |  |
|**propSignature** | **String** |  |  [optional] |
|**spawnType** | **Integer** | How a prop is summoned and interacted with. 0: the prop fixed to some surface in the world 1: the prop is a pickup and may be held by users 2: ??? |  |
|**tags** | **List&lt;String&gt;** |  |  |
|**unityVersion** | **String** |  |  |
|**worldPlacementMask** | **Integer** | Bitmask for restrictions on what world surfaces a prop may be summoned. 0: no restrictions 1: floors 2: walls 4: ceilings |  |



