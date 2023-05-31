

# APIConfig



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**voiceEnableDegradation** | **Boolean** | Unknown, probably voice optimization testing |  |
|**voiceEnableReceiverLimiting** | **Boolean** | Unknown, probably voice optimization testing |  |
|**address** | **String** | VRChat&#39;s office address |  |
|**announcements** | [**Set&lt;APIConfigAnnouncement&gt;**](APIConfigAnnouncement.md) | Public Announcements |  |
|**appName** | **String** | Game name |  |
|**buildVersionTag** | **String** | Build tag of the API server |  |
|**clientApiKey** | **String** | apiKey to be used for all other requests |  |
|**clientBPSCeiling** | **Integer** | Unknown |  |
|**clientDisconnectTimeout** | **Integer** | Unknown |  |
|**clientReservedPlayerBPS** | **Integer** | Unknown |  |
|**clientSentCountAllowance** | **Integer** | Unknown |  |
|**contactEmail** | **String** | VRChat&#39;s contact email |  |
|**copyrightEmail** | **String** | VRChat&#39;s copyright-issues-related email |  |
|**currentTOSVersion** | **Integer** | Current version number of the Terms of Service |  |
|**defaultAvatar** | **String** |  |  |
|**deploymentGroup** | **DeploymentGroup** |  |  |
|**devAppVersionStandalone** | **String** | Version number for game development build |  |
|**devDownloadLinkWindows** | **String** | Developer Download link |  |
|**devSdkUrl** | **String** | Link to download the development SDK, use downloadUrls instead |  |
|**devSdkVersion** | **String** | Version of the development SDK |  |
|**devServerVersionStandalone** | **String** | Version number for server development build |  |
|**disCountdown** | **OffsetDateTime** | Unknown, \&quot;dis\&quot; maybe for disconnect? |  |
|**disableAvatarCopying** | **Boolean** | Toggles if copying avatars should be disabled |  |
|**disableAvatarGating** | **Boolean** | Toggles if avatar gating should be disabled. Avatar gating restricts uploading of avatars to people with the &#x60;system_avatar_access&#x60; Tag or &#x60;admin_avatar_access&#x60; Tag |  |
|**disableCommunityLabs** | **Boolean** | Toggles if the Community Labs should be disabled |  |
|**disableCommunityLabsPromotion** | **Boolean** | Toggles if promotion out of Community Labs should be disabled |  |
|**disableEmail** | **Boolean** | Unknown |  |
|**disableEventStream** | **Boolean** | Toggles if Analytics should be disabled. |  |
|**disableFeedbackGating** | **Boolean** | Toggles if feedback gating should be disabled. Feedback gating restricts submission of feedback (reporting a World or User) to people with the &#x60;system_feedback_access&#x60; Tag. |  |
|**disableFrontendBuilds** | **Boolean** | Unknown, probably toggles compilation of frontend web builds? So internal flag? |  |
|**disableHello** | **Boolean** | Unknown |  |
|**disableOculusSubs** | **Boolean** | Toggles if signing up for Subscriptions in Oculus is disabled or not. |  |
|**disableRegistration** | **Boolean** | Toggles if new user account registration should be disabled. |  |
|**disableSteamNetworking** | **Boolean** | Toggles if Steam Networking should be disabled. VRChat these days uses Photon Unity Networking (PUN) instead. |  |
|**disableTwoFactorAuth** | **Boolean** | Toggles if 2FA should be disabled. |  |
|**disableUdon** | **Boolean** | Toggles if Udon should be universally disabled in-game. |  |
|**disableUpgradeAccount** | **Boolean** | Toggles if account upgrading \&quot;linking with Steam/Oculus\&quot; should be disabled. |  |
|**downloadLinkWindows** | **String** | Download link for game on the Oculus Rift website. |  |
|**downloadUrls** | [**APIConfigDownloadURLList**](APIConfigDownloadURLList.md) |  |  |
|**dynamicWorldRows** | [**Set&lt;DynamicContentRow&gt;**](DynamicContentRow.md) | Array of DynamicWorldRow objects, used by the game to display the list of world rows |  |
|**events** | [**APIConfigEvents**](APIConfigEvents.md) |  |  |
|**gearDemoRoomId** | **String** | Unknown |  |
|**homeWorldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |
|**homepageRedirectTarget** | **String** | Redirect target if you try to open the base API domain in your browser |  |
|**hubWorldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |
|**jobsEmail** | **String** | VRChat&#39;s job application email |  |
|**messageOfTheDay** | **String** | MOTD |  |
|**moderationEmail** | **String** | VRChat&#39;s moderation related email |  |
|**moderationQueryPeriod** | **Integer** | Unknown |  |
|**notAllowedToSelectAvatarInPrivateWorldMessage** | **String** | Used in-game to notify a user they aren&#39;t allowed to select avatars in private worlds |  |
|**plugin** | **String** | Extra [plugin](https://doc.photonengine.com/en-us/server/current/plugins/manual) to run in each instance |  |
|**releaseAppVersionStandalone** | **String** | Version number for game release build |  |
|**releaseSdkUrl** | **String** | Link to download the release SDK |  |
|**releaseSdkVersion** | **String** | Version of the release SDK |  |
|**releaseServerVersionStandalone** | **String** | Version number for server release build |  |
|**sdkDeveloperFaqUrl** | **String** | Link to the developer FAQ |  |
|**sdkDiscordUrl** | **String** | Link to the official VRChat Discord |  |
|**sdkNotAllowedToPublishMessage** | **String** | Used in the SDK to notify a user they aren&#39;t allowed to upload avatars/worlds yet |  |
|**sdkUnityVersion** | **String** | Unity version supported by the SDK |  |
|**serverName** | **String** | Server name of the API server currently responding |  |
|**supportEmail** | **String** | VRChat&#39;s support email |  |
|**timeOutWorldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |
|**tutorialWorldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |
|**updateRateMsMaximum** | **Integer** | Unknown |  |
|**updateRateMsMinimum** | **Integer** | Unknown |  |
|**updateRateMsNormal** | **Integer** | Unknown |  |
|**updateRateMsUdonManual** | **Integer** | Unknown |  |
|**uploadAnalysisPercent** | **Integer** | Unknown |  |
|**urlList** | **List&lt;String&gt;** | List of allowed URLs that bypass the \&quot;Allow untrusted URL&#39;s\&quot; setting in-game |  |
|**useReliableUdpForVoice** | **Boolean** | Unknown |  |
|**userUpdatePeriod** | **Integer** | Unknown |  |
|**userVerificationDelay** | **Integer** | Unknown |  |
|**userVerificationRetry** | **Integer** | Unknown |  |
|**userVerificationTimeout** | **Integer** | Unknown |  |
|**viveWindowsUrl** | **String** | Download link for game on the Steam website. |  |
|**whiteListedAssetUrls** | **List&lt;String&gt;** | List of allowed URLs that are allowed to host avatar assets |  |
|**worldUpdatePeriod** | **Integer** | Unknown |  |
|**playerUrlResolverHash** | **String** | Currently used youtube-dl.exe hash in SHA-256-delimited format |  |
|**playerUrlResolverVersion** | **String** | Currently used youtube-dl.exe version |  |



