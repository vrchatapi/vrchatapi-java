

# Config


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | VRChat&#39;s office address |  [readonly]
**announcements** | [**Set&lt;ConfigAnnouncements&gt;**](ConfigAnnouncements.md) | Public Announcements |  [readonly]
**apiKey** | **String** | apiKey to be used for all other requests |  [readonly]
**appName** | **String** | Game name |  [readonly]
**buildVersionTag** | **String** | Build tag of the API server |  [readonly]
**clientApiKey** | **String** | apiKey to be used for all other requests |  [readonly]
**clientBPSCeiling** | **BigDecimal** | Unknown |  [optional]
**clientDisconnectTimeout** | **BigDecimal** | Unknown |  [optional]
**clientReservedPlayerBPS** | **BigDecimal** | Unknown |  [optional]
**clientSentCountAllowance** | **BigDecimal** | Unknown |  [optional]
**contactEmail** | **String** | VRChat&#39;s contact email |  [readonly]
**copyrightEmail** | **String** | VRChat&#39;s copyright-issues-related email |  [readonly]
**currentTOSVersion** | **BigDecimal** | Current version number of the Terms of Service |  [readonly]
**defaultAvatar** | **String** |  | 
**deploymentGroup** | **DeploymentGroup** |  | 
**devAppVersionStandalone** | **String** | Version number for game development build |  [readonly]
**devDownloadLinkWindows** | **String** | Developer Download link |  [readonly]
**devSdkUrl** | **String** | Link to download the development SDK, use downloadUrls instead |  [readonly]
**devSdkVersion** | **String** | Version of the development SDK |  [readonly]
**devServerVersionStandalone** | **String** | Version number for server development build |  [readonly]
**disableAvatarCopying** | **Boolean** | Toggles if copying avatars should be disabled | 
**disableAvatarGating** | **Boolean** | Toggles if avatar gating should be disabled. Avatar gating restricts uploading of avatars to people with the &#x60;system_avatar_access&#x60; Tag or &#x60;admin_avatar_access&#x60; Tag | 
**disableCommunityLabs** | **Boolean** | Toggles if the Community Labs should be disabled | 
**disableCommunityLabsPromotion** | **Boolean** | Toggles if promotion out of Community Labs should be disabled | 
**disableEmail** | **Boolean** | Unknown |  [optional]
**disableEventStream** | **Boolean** | Toggles if Analytics should be disabled (this sreportedly not used in the Client) | 
**disableFeedbackGating** | **Boolean** | Toggles if feedback gating should be disabled. Feedback gating restricts submission of feedback (reporting a World or User) to people with the &#x60;system_feedback_access&#x60; Tag. | 
**disableHello** | **Boolean** | Unknown |  [optional]
**disableRegistration** | **Boolean** | Toggles if new user account registration should be disabled | 
**disableSteamNetworking** | **Boolean** | Toggles if Steam Networking should be disabled. VRChat these days uses Photon Unity Networking (PUN) instead. | 
**disableTwoFactorAuth** | **Boolean** | Toggles if 2FA should be disabled. | 
**disableUdon** | **Boolean** | Toggles if Udon should be universally disabled in-game. | 
**disableUpgradeAccount** | **Boolean** | Toggles if account upgrading \&quot;linking with Steam/Oculus\&quot; should be disabled. | 
**downloadLinkWindows** | **String** | Download link for game on the Oculus Rift website. |  [readonly]
**downloadUrls** | [**ConfigDownloadUrls**](ConfigDownloadUrls.md) |  | 
**dynamicWorldRows** | [**Set&lt;ConfigDynamicWorldRows&gt;**](ConfigDynamicWorldRows.md) | Array of DynamicWorldRow objects, used by the game to display the list of world rows |  [readonly]
**events** | [**ConfigEvents**](ConfigEvents.md) |  | 
**gearDemoRoomId** | **String** | Unknown |  [readonly]
**homepageRedirectTarget** | **String** | Redirect target if you try to open the base API domain in your browser |  [readonly]
**homeWorldId** | **String** |  | 
**hubWorldId** | **String** |  | 
**jobsEmail** | **String** | VRChat&#39;s job application email |  [readonly]
**messageOfTheDay** | **String** | MOTD |  [readonly]
**moderationEmail** | **String** | VRChat&#39;s moderation related email |  [readonly]
**moderationQueryPeriod** | **BigDecimal** | Unknown | 
**notAllowedToSelectAvatarInPrivateWorldMessage** | **String** | Used in-game to notify a user they aren&#39;t allowed to select avatars in private worlds |  [readonly]
**plugin** | **String** | Extra [plugin](https://doc.photonengine.com/en-us/server/current/plugins/manual) to run in each instance |  [readonly]
**releaseAppVersionStandalone** | **String** | Version number for game release build |  [readonly]
**releaseSdkUrl** | **String** | Link to download the release SDK |  [readonly]
**releaseSdkVersion** | **String** | Version of the release SDK |  [readonly]
**releaseServerVersionStandalone** | **String** | Version number for server release build |  [readonly]
**sdkDeveloperFaqUrl** | **String** | Link to the developer FAQ |  [readonly]
**sdkDiscordUrl** | **String** | Link to the official VRChat Discord |  [readonly]
**sdkNotAllowedToPublishMessage** | **String** | Used in the SDK to notify a user they aren&#39;t allowed to upload avatars/worlds yet |  [readonly]
**sdkUnityVersion** | **String** | Unity version supported by the SDK |  [readonly]
**serverName** | **String** | Server name of the API server currently responding |  [readonly]
**supportEmail** | **String** | VRChat&#39;s support email |  [readonly]
**timeOutWorldId** | **String** |  | 
**tutorialWorldId** | **String** |  | 
**updateRateMsMaximum** | **BigDecimal** | Unknown |  [readonly]
**updateRateMsMinimum** | **BigDecimal** | Unknown |  [readonly]
**updateRateMsNormal** | **BigDecimal** | Unknown |  [readonly]
**updateRateMsUdonManual** | **BigDecimal** | Unknown |  [readonly]
**uploadAnalysisPercent** | **BigDecimal** | Unknown |  [readonly]
**urlList** | **List&lt;String&gt;** | List of allowed URLs that bypass the \&quot;Allow untrusted URL&#39;s\&quot; setting in-game |  [readonly]
**useReliableUdpForVoice** | **Boolean** | Unknown | 
**userUpdatePeriod** | **BigDecimal** | Unknown |  [readonly]
**userVerificationDelay** | **BigDecimal** | Unknown |  [readonly]
**userVerificationRetry** | **BigDecimal** | Unknown |  [readonly]
**userVerificationTimeout** | **BigDecimal** | Unknown |  [readonly]
**viveWindowsUrl** | **String** | Download link for game on the Steam website. |  [readonly]
**whiteListedAssetUrls** | **List&lt;String&gt;** | List of allowed URLs that are allowed to host avatar assets |  [readonly]
**worldUpdatePeriod** | **BigDecimal** | Unknown |  [readonly]
**youtubedlHash** | **String** | Currently used youtube-dl.exe hash in SHA-256-delimited format |  [readonly]
**youtubedlVersion** | **String** | Currently used youtube-dl.exe version |  [readonly]



