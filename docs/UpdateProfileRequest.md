

# UpdateProfileRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**backgroundTextureId** | **String** |  |  [optional] |
|**backgroundType** | [**BackgroundTypeEnum**](#BackgroundTypeEnum) |  |  [optional] |
|**bannerColor** | **String** | Hex colour without a leading &#x60;#&#x60;. |  [optional] |
|**bannerType** | [**BannerTypeEnum**](#BannerTypeEnum) |  |  [optional] |
|**bio** | **String** |  |  [optional] |
|**bioLinks** | **List&lt;String&gt;** |  |  [optional] |
|**iconFrame** | **String** |  |  [optional] |
|**languages** | **List&lt;String&gt;** |  |  [optional] |
|**nameplateEffect** | **String** |  |  [optional] |
|**profileEffect** | **String** |  |  [optional] |
|**themeId** | **String** |  |  [optional] |
|**userIcon** | **String** |  |  [optional] |



## Enum: BackgroundTypeEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| GRADIENT | &quot;gradient&quot; |
| INVENTORY | &quot;inventory&quot; |
| TEXTURE | &quot;texture&quot; |



## Enum: BannerTypeEnum

| Name | Value |
|---- | -----|
| AVATAR_BANNER | &quot;avatarBanner&quot; |
| COLOR | &quot;color&quot; |
| CUSTOM_IMAGE | &quot;customImage&quot; |



