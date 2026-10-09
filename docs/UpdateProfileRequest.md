

# UpdateProfileRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**backgroundGradientBottom** | **String** | Six hexadecimal digits, without a leading &#x60;#&#x60;. May be empty. |  [optional] |
|**backgroundGradientTop** | **String** | Six hexadecimal digits, without a leading &#x60;#&#x60;. May be empty. |  [optional] |
|**backgroundTextureId** | **String** |  |  [optional] |
|**backgroundType** | [**BackgroundTypeEnum**](#BackgroundTypeEnum) |  |  [optional] |
|**bannerColor** | **String** | Six hexadecimal digits, without a leading &#x60;#&#x60;. May be empty. |  [optional] |
|**bannerCustomUrl** | **String** |  |  [optional] |
|**bannerType** | **BannerType** |  |  [optional] |
|**bio** | **String** |  |  [optional] |
|**bioLinks** | **List&lt;String&gt;** |  |  [optional] |
|**iconFrame** | **String** |  |  [optional] |
|**languages** | **List&lt;String&gt;** |  |  [optional] |
|**nameplateEffect** | **String** |  |  [optional] |
|**profileEffect** | **String** |  |  [optional] |
|**themeId** | [**PublicProfileThemeID**](PublicProfileThemeID.md) |  |  [optional] |
|**userIcon** | **String** |  |  [optional] |



## Enum: BackgroundTypeEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| GRADIENT | &quot;gradient&quot; |
| INVENTORY | &quot;inventory&quot; |
| TEXTURE | &quot;texture&quot; |



