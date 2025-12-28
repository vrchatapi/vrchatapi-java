

# APIConfig

Global configuration for various features.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**campaignStatus** | **String** | The current platform-wide event taking place |  |
|**disableBackgroundPreloads** | **Boolean** | Toggles if certain assets are preloaded in the background |  |
|**locationGiftingNonSubPrioEnabled** | **Boolean** | Toggles whether users without a current VRC+ subscription are priority recipients for gift drops |  |
|**voiceEnableDegradation** | **Boolean** | Unknown, probably voice optimization testing |  |
|**voiceEnableReceiverLimiting** | **Boolean** | Unknown, probably voice optimization testing |  |
|**accessLogsUrls** | [**APIConfigAccessLogsUrls**](APIConfigAccessLogsUrls.md) |  |  |
|**address** | **String** | VRChat&#39;s office address |  |
|**ageVerificationInviteVisible** | **Boolean** |  |  |
|**ageVerificationP** | **Boolean** |  |  |
|**ageVerificationStatusVisible** | **Boolean** |  |  |
|**analysisMaxRetries** | **Integer** | Max retries for avatar analysis requests |  |
|**analysisRetryInterval** | **Integer** | Interval between retries for avatar analysis requests |  |
|**analyticsSegmentNewUIPctOfUsers** | **Integer** | Unknown |  |
|**analyticsSegmentNewUISalt** | **String** | Unknown |  |
|**announcements** | [**Set&lt;APIConfigAnnouncement&gt;**](APIConfigAnnouncement.md) | Public Announcements |  |
|**audioConfig** | [**APIConfigAudioConfig**](APIConfigAudioConfig.md) |  |  [optional] |
|**availableLanguageCodes** | **List&lt;String&gt;** | List of supported Languages |  |
|**availableLanguages** | **List&lt;String&gt;** | List of supported Languages |  |
|**avatarPerfLimiter** | [**APIConfigAvatarPerfLimiter**](APIConfigAvatarPerfLimiter.md) |  |  |
|**chatboxLogBufferSeconds** | **Integer** | Unknown |  |
|**clientApiKey** | **String** | apiKey to be used for all other requests |  |
|**clientBPSCeiling** | **Integer** | Unknown |  |
|**clientDisconnectTimeout** | **Integer** | Unknown |  |
|**clientNetDispatchThread** | **Boolean** | Unknown |  [optional] |
|**clientNetDispatchThreadMobile** | **Boolean** | Unknown |  |
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
|**constants** | [**APIConfigConstants**](APIConfigConstants.md) |  |  |
|**contactEmail** | **String** | VRChat&#39;s contact email |  |
|**copyrightEmail** | **String** | VRChat&#39;s copyright-issues-related email |  |
|**copyrightFormUrl** | **String** | VRChat&#39;s DMCA claim webform url |  |
|**currentPrivacyVersion** | **Integer** | Current version number of the Privacy Agreement |  |
|**currentTOSVersion** | **Integer** | Current version number of the Terms of Service |  |
|**defaultAvatar** | **String** |  |  |
|**defaultStickerSet** | **String** |  |  |
|**devLanguageCodes** | **List&lt;String&gt;** | Unknown |  [optional] |
|**devSdkUrl** | **String** | Link to download the development SDK, use downloadUrls instead |  |
|**devSdkVersion** | **String** | Version of the development SDK |  |
|**disCountdown** | **OffsetDateTime** | Unknown, \&quot;dis\&quot; maybe for disconnect? |  |
|**disableAVProInProton** | **Boolean** | Unknown |  [optional] |
|**disableAvatarCopying** | **Boolean** | Toggles if copying avatars should be disabled |  |
|**disableAvatarGating** | **Boolean** | Toggles if avatar gating should be disabled. Avatar gating restricts uploading of avatars to people with the &#x60;system_avatar_access&#x60; Tag or &#x60;admin_avatar_access&#x60; Tag |  |
|**disableCaptcha** | **Boolean** | Unknown |  [optional] |
|**disableCommunityLabs** | **Boolean** | Toggles if the Community Labs should be disabled |  |
|**disableCommunityLabsPromotion** | **Boolean** | Toggles if promotion out of Community Labs should be disabled |  |
|**disableEmail** | **Boolean** | Unknown |  |
|**disableEventStream** | **Boolean** | Toggles if Analytics should be disabled. |  |
|**disableFeedbackGating** | **Boolean** | Toggles if feedback gating should be disabled. Feedback gating restricts submission of feedback (reporting a World or User) to people with the &#x60;system_feedback_access&#x60; Tag. |  |
|**disableFrontendBuilds** | **Boolean** | Unknown, probably toggles compilation of frontend web builds? So internal flag? |  |
|**disableGiftDrops** | **Boolean** | Toggles if gift drops should be disabled |  |
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
|**economyLedgerBackfill** | **Boolean** | Unknown |  |
|**economyLedgerMigrationStop** | **String** | Unknown |  |
|**economyLedgerMode** | **String** | Unknown |  |
|**economyPauseEnd** | **OffsetDateTime** | Unknown |  |
|**economyPauseStart** | **OffsetDateTime** | Unknown |  |
|**economyPurchaseRepairEnabled** | **Boolean** | Unknown |  |
|**economyState** | **Integer** | Unknown |  |
|**events** | [**APIConfigEvents**](APIConfigEvents.md) |  |  |
|**forceUseLatestWorld** | **Boolean** | Unknown |  |
|**giftDisplayType** | **String** | Display type of gifts |  |
|**googleApiClientId** | **String** | Unknown |  |
|**homeWorldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |
|**homepageRedirectTarget** | **String** | Redirect target if you try to open the base API domain in your browser |  |
|**hubWorldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |
|**imageHostUrlList** | **List&lt;String&gt;** | A list of explicitly allowed origins that worlds can request images from via the Udon&#39;s [VRCImageDownloader#DownloadImage](https://creators.vrchat.com/worlds/udon/image-loading/#downloadimage). |  |
|**iosAppVersion** | **List&lt;String&gt;** | Current app version for iOS |  |
|**iosVersion** | [**APIConfigIosVersion**](APIConfigIosVersion.md) |  |  |
|**jobsEmail** | **String** | VRChat&#39;s job application email |  |
|**maxUserEmoji** | **Integer** | The maximum number of custom emoji each user may have at a given time. |  |
|**maxUserStickers** | **Integer** | The maximum number of custom stickers each user may have at a given time. |  |
|**minSupportedClientBuildNumber** | [**APIConfigMinSupportedClientBuildNumber**](APIConfigMinSupportedClientBuildNumber.md) |  |  |
|**minimumUnityVersionForUploads** | **String** | Minimum Unity version required for uploading assets |  |
|**moderationEmail** | **String** | VRChat&#39;s moderation related email |  |
|**notAllowedToSelectAvatarInPrivateWorldMessage** | **String** | Used in-game to notify a user they aren&#39;t allowed to select avatars in private worlds |  |
|**offlineAnalysis** | [**APIConfigOfflineAnalysis**](APIConfigOfflineAnalysis.md) |  |  |
|**photonNameserverOverrides** | **List&lt;String&gt;** | Unknown |  |
|**photonPublicKeys** | **List&lt;String&gt;** | Unknown |  |
|**playerUrlResolverSha1** | **String** | Currently used youtube-dl.exe hash in SHA1-delimited format |  |
|**playerUrlResolverVersion** | **String** | Currently used youtube-dl.exe version |  |
|**publicKey** | **String** | Public key, hex encoded |  |
|**reportCategories** | [**Map&lt;String, ReportCategory&gt;**](ReportCategory.md) | Categories available for reporting objectionable content |  |
|**reportFormUrl** | **String** | URL to the report form |  |
|**reportOptions** | **Map&lt;String, Map&lt;String, List&lt;String&gt;&gt;&gt;** | Options for reporting content. Select a key+value from this mapping as the &#x60;type&#x60; of the report. Select one key+value from the object at reportOptions[type] as the &#x60;category&#x60; of the report. reportCategories[category] contains user-facing text to display for all possible categories. Select one value from the array at reportOptions[type][category] as the &#x60;reason&#x60; of the report. reportReasons[reason] contains user-facing text to display for all possible categories. |  |
|**reportReasons** | [**Map&lt;String, ReportReason&gt;**](ReportReason.md) | Reasons available for submitting a report |  |
|**requireAgeVerificationBetaTag** | **Boolean** |  |  |
|**sdkDeveloperFaqUrl** | **String** | Link to the developer FAQ |  |
|**sdkDiscordUrl** | **String** | Link to the official VRChat Discord |  |
|**sdkNotAllowedToPublishMessage** | **String** | Used in the SDK to notify a user they aren&#39;t allowed to upload avatars/worlds yet |  |
|**sdkUnityVersion** | **String** | Unity version supported by the SDK |  |
|**stringHostUrlList** | **List&lt;String&gt;** | A list of explicitly allowed origins that worlds can request strings from via the Udon&#39;s [VRCStringDownloader.LoadUrl](https://creators.vrchat.com/worlds/udon/string-loading/#ivrcstringdownload). |  |
|**supportEmail** | **String** | VRChat&#39;s support email |  |
|**supportFormUrl** | **String** | VRChat&#39;s support form |  |
|**timeOutWorldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |
|**timekeeping** | **Boolean** | Unknown |  |
|**tutorialWorldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |
|**updateRateMsMaximum** | **Integer** | Unknown |  |
|**updateRateMsMinimum** | **Integer** | Unknown |  |
|**updateRateMsNormal** | **Integer** | Unknown |  |
|**updateRateMsUdonManual** | **Integer** | Unknown |  |
|**uploadAnalysisPercent** | **Integer** | Unknown |  |
|**urlList** | **List&lt;String&gt;** | List of allowed URLs that bypass the \&quot;Allow untrusted URL&#39;s\&quot; setting in-game |  |
|**useReliableUdpForVoice** | **Boolean** | Unknown |  |
|**viveWindowsUrl** | **String** | Download link for game on the Steam website. |  |
|**websocketMaxFriendsRefreshDelay** | **Integer** | Unknown |  |
|**websocketQuickReconnectTime** | **Integer** | Unknown |  |
|**websocketReconnectMaxDelay** | **Integer** | Unknown |  |
|**whiteListedAssetUrls** | **List&lt;String&gt;** | List of allowed URLs that are allowed to host avatar assets |  |



