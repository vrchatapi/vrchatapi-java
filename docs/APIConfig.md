

# APIConfig



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**voiceEnableDegradation** | **Boolean** | Unknown, probably voice optimization testing |  |
|**voiceEnableReceiverLimiting** | **Boolean** | Unknown, probably voice optimization testing |  |
|**address** | **String** | VRChat&#39;s office address |  |
|**announcements** | [**Set&lt;APIConfigAnnouncement&gt;**](APIConfigAnnouncement.md) | Public Announcements |  |
|**appName** | **String** | Game name |  |
|**availableLanguageCodes** | **List&lt;String&gt;** | List of supported Languages |  |
|**availableLanguages** | **List&lt;String&gt;** | List of supported Languages |  |
|**buildVersionTag** | **String** | Build tag of the API server |  |
|**clientApiKey** | **String** | apiKey to be used for all other requests |  |
|**clientBPSCeiling** | **Integer** | Unknown |  |
|**clientDisconnectTimeout** | **Integer** | Unknown |  |
|**clientNetDispatchThread** | **Boolean** | Unknown |  [optional] |
|**clientNetInThread** | **Boolean** | Unknown |  [optional] |
|**clientNetInThread2** | **Boolean** | Unknown |  [optional] |
|**clientNetInThreadMobile** | **Boolean** | Unknown |  [optional] |
|**clientNetInThreadMobile2** | **Boolean** | Unknown |  [optional] |
|**clientNetOutThread** | **Boolean** | Unknown |  [optional] |
|**clientNetOutThread2** | **Boolean** | Unknown |  [optional] |
|**clientNetOutThreadMobile** | **Boolean** | Unknown |  [optional] |
|**clientNetOutThreadMobile2** | **Boolean** | Unknown |  [optional] |
|**clientQR** | **Integer** | Unknown |  [optional] |
|**clientReservedPlayerBPS** | **Integer** | Unknown |  |
|**clientSentCountAllowance** | **Integer** | Unknown |  |
|**contactEmail** | **String** | VRChat&#39;s contact email |  |
|**copyrightEmail** | **String** | VRChat&#39;s copyright-issues-related email |  |
|**currentPrivacyVersion** | **Integer** | Current version number of the Privacy Agreement |  [optional] |
|**currentTOSVersion** | **Integer** | Current version number of the Terms of Service |  |
|**defaultAvatar** | **String** |  |  |
|**deploymentGroup** | **DeploymentGroup** |  |  |
|**devLanguageCodes** | **List&lt;String&gt;** | Unknown |  [optional] |
|**devSdkUrl** | **String** | Link to download the development SDK, use downloadUrls instead |  |
|**devSdkVersion** | **String** | Version of the development SDK |  |
|**disCountdown** | **OffsetDateTime** | Unknown, \&quot;dis\&quot; maybe for disconnect? |  |
|**disableAVProInProton** | **Boolean** | Unknown |  [optional] |
|**disableAvatarCopying** | **Boolean** | Toggles if copying avatars should be disabled |  |
|**disableAvatarGating** | **Boolean** | Toggles if avatar gating should be disabled. Avatar gating restricts uploading of avatars to people with the &#x60;system_avatar_access&#x60; Tag or &#x60;admin_avatar_access&#x60; Tag |  |
|**disableCommunityLabs** | **Boolean** | Toggles if the Community Labs should be disabled |  |
|**disableCommunityLabsPromotion** | **Boolean** | Toggles if promotion out of Community Labs should be disabled |  |
|**disableEmail** | **Boolean** | Unknown |  |
|**disableCaptcha** | **Boolean** | Unknown |  [optional] |
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
|**economyPauseEnd** | **String** | Unknown |  [optional] |
|**economyPauseStart** | **String** | Unknown |  [optional] |
|**economyState** | **Integer** | Unknown |  [optional] |
|**events** | [**APIConfigEvents**](APIConfigEvents.md) |  |  |
|**homeWorldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |
|**homepageRedirectTarget** | **String** | Redirect target if you try to open the base API domain in your browser |  |
|**hubWorldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |
|**imageHostUrlList** | **List&lt;String&gt;** | A list of explicitly allowed origins that worlds can request images from via the Udon&#39;s [VRCImageDownloader#DownloadImage](https://creators.vrchat.com/worlds/udon/image-loading/#downloadimage). |  |
|**jobsEmail** | **String** | VRChat&#39;s job application email |  |
|**moderationEmail** | **String** | VRChat&#39;s moderation related email |  |
|**notAllowedToSelectAvatarInPrivateWorldMessage** | **String** | Used in-game to notify a user they aren&#39;t allowed to select avatars in private worlds |  |
|**sdkDeveloperFaqUrl** | **String** | Link to the developer FAQ |  |
|**sdkDiscordUrl** | **String** | Link to the official VRChat Discord |  |
|**sdkNotAllowedToPublishMessage** | **String** | Used in the SDK to notify a user they aren&#39;t allowed to upload avatars/worlds yet |  |
|**sdkUnityVersion** | **String** | Unity version supported by the SDK |  |
|**serverName** | **String** | Server name of the API server currently responding |  |
|**stringHostUrlList** | **List&lt;String&gt;** | A list of explicitly allowed origins that worlds can request strings from via the Udon&#39;s [VRCStringDownloader.LoadUrl](https://creators.vrchat.com/worlds/udon/string-loading/#ivrcstringdownload). |  |
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
|**viveWindowsUrl** | **String** | Download link for game on the Steam website. |  |
|**whiteListedAssetUrls** | **List&lt;String&gt;** | List of allowed URLs that are allowed to host avatar assets |  |
|**playerUrlResolverVersion** | **String** | Currently used youtube-dl.exe version |  |
|**playerUrlResolverSha1** | **String** | Currently used youtube-dl.exe hash in SHA1-delimited format |  |



