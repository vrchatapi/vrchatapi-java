/*
 * VRChat API Documentation
 * ![VRChat API Banner](https://vrchatapi.github.io/assets/img/api_banner_1500x400.png)  # Welcome to the VRChat API  Before we begin, we would like to state this is a **COMMUNITY DRIVEN PROJECT**. This means that everything you read on here was written by the community itself and is **not** officially supported by VRChat. The documentation is provided \"AS IS\", and any action you take towards VRChat is completely your own responsibility.  The documentation and additional libraries SHALL ONLY be used for applications interacting with VRChat's API in accordance with their [Terms of Service](https://github.com/VRChatAPI), and MUST NOT be used for modifying the client, \"avatar ripping\", or other illegal activities. Malicious usage or spamming the API may result in account termination. Certain parts of the API are also more sensitive than others, for example moderation, so please read tread extra carefully and read the warnings when present.  ![Tupper Policy on API](https://i.imgur.com/yLlW7Ok.png)  Finally, use of the API using applications other than the approved methods (website, VRChat application, Unity SDK) is not officially supported. VRChat provides no guarantee or support for external applications using the API. Access to API endpoints may break **at any time, without notice**. Therefore, please **do not ping** VRChat Staff in the VRChat Discord if you are having API problems, as they do not provide API support. We will make a best effort in keeping this documentation and associated language libraries up to date, but things might be outdated or missing. If you find that something is no longer valid, please contact us on Discord or [create an issue](https://github.com/vrchatapi/specification/issues) and tell us so we can fix it.  # Getting Started  The VRChat API can be used to programmatically retrieve or update information regarding your profile, friends, avatars, worlds and more. The API consists of two parts, \"Photon\" which is only used in-game, and the \"Web API\" which is used by both the game and the website. This documentation focuses only on the Web API.  The API is designed around the REST ideology, providing semi-simple and usually predictable URIs to access and modify objects. Requests support standard HTTP methods like GET, PUT, POST, and DELETE and standard status codes. Response bodies are always UTF-8 encoded JSON objects, unless explicitly documented otherwise.  <div class=\"callout callout-error\">   <strong>🛑 Warning! Do not touch Photon!</strong><br>   Photon is only used by the in-game client and should <b>not</b> be touched. Doing so may result in permanent account termination. </div>  <div class=\"callout callout-info\">   <strong>ℹ️ API Key and Authentication</strong><br>   The API Key has always been the same and is currently <code>JlE5Jldo5Jibnk5O5hTx6XVqsJu4WJ26</code>.   Read <a href=\"#tag--authentication\">Authentication</a> for how to log in. </div>  # Using the API  For simply exploring what the API can do it is strongly recommended to download [Insomnia](https://insomnia.rest/download), a free and open-source API client that's great for sending requests to the API in an orderly fashion. Insomnia allows you to send data in the format that's required for VRChat's API. It is also possible to try out the API in your browser, by first logging in at [vrchat.com/home](https://vrchat.com/home/) and then going to [vrchat.com/api/1/auth/user](https://vrchat.com/api/1/auth/user), but the information will be much harder to work with.  For more permanent operation such as software development it is instead recommended to use one of the existing language SDKs. This community project maintains API libraries in several languages, which allows you to interact with the API with simple function calls rather than having to implement the HTTP protocol yourself. Most of these libraries are automatically generated from the API specification, sometimes with additional helpful wrapper code to make usage easier. This allows them to be almost automatically updated and expanded upon as soon as a new feature is introduced in the specification itself. The libraries can be found on [GitHub](https://github.com/vrchatapi) or following:  * [NodeJS (JavaScript)](https://www.npmjs.com/package/vrchat) * [Dart](https://pub.dev/packages/vrchat_dart) * [Rust](https://crates.io/crates/vrchatapi) * [C#](github.com/vrchatapi/vrchatapi-csharp) * [Python](https://github.com/vrchatapi/VRChatPython)  # Pagination  Most endpoints enforce pagination, meaning they will only return 10 entries by default, and never more than 100.<br> Using both the limit and offset parameters allows you to easily paginate through a large number of objects.  | Query Parameter | Type | Description | | ----------|--|------- | | `limit` | integer  | The number of objects to return. This value often defaults to 10. Highest limit is always 100.| | `offset` | integer  | A zero-based offset from the default object sorting.|  If a request returns fewer objects than the `limit` parameter, there are no more items available to return.  # Contribution  Do you want to get involved in the documentation effort? Do you want to help improve one of the language API libraries? This project is an [OPEN Open Source Project](https://openopensource.org)! This means that individuals making significant and valuable contributions are given commit-access to the project. It also means we are very open and welcoming of new people making contributions, unlike some more guarded open-source projects.  [![Discord](https://img.shields.io/static/v1?label=vrchatapi&message=discord&color=blueviolet&style=for-the-badge)](https://discord.gg/qjZE9C9fkB)
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: me@ruby.js.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.vrchatapi.model.ConfigAnnouncements;
import io.github.vrchatapi.model.ConfigDownloadUrls;
import io.github.vrchatapi.model.ConfigDynamicWorldRows;
import io.github.vrchatapi.model.ConfigEvents;
import io.github.vrchatapi.model.DeploymentGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Config
 */
public class ConfigTest {
    private final Config model = new Config();

    /**
     * Model tests for Config
     */
    @Test
    public void testConfig() {
        // TODO: test Config
    }

    /**
     * Test the property 'address'
     */
    @Test
    public void addressTest() {
        // TODO: test address
    }

    /**
     * Test the property 'announcements'
     */
    @Test
    public void announcementsTest() {
        // TODO: test announcements
    }

    /**
     * Test the property 'apiKey'
     */
    @Test
    public void apiKeyTest() {
        // TODO: test apiKey
    }

    /**
     * Test the property 'appName'
     */
    @Test
    public void appNameTest() {
        // TODO: test appName
    }

    /**
     * Test the property 'buildVersionTag'
     */
    @Test
    public void buildVersionTagTest() {
        // TODO: test buildVersionTag
    }

    /**
     * Test the property 'clientApiKey'
     */
    @Test
    public void clientApiKeyTest() {
        // TODO: test clientApiKey
    }

    /**
     * Test the property 'clientBPSCeiling'
     */
    @Test
    public void clientBPSCeilingTest() {
        // TODO: test clientBPSCeiling
    }

    /**
     * Test the property 'clientDisconnectTimeout'
     */
    @Test
    public void clientDisconnectTimeoutTest() {
        // TODO: test clientDisconnectTimeout
    }

    /**
     * Test the property 'clientReservedPlayerBPS'
     */
    @Test
    public void clientReservedPlayerBPSTest() {
        // TODO: test clientReservedPlayerBPS
    }

    /**
     * Test the property 'clientSentCountAllowance'
     */
    @Test
    public void clientSentCountAllowanceTest() {
        // TODO: test clientSentCountAllowance
    }

    /**
     * Test the property 'contactEmail'
     */
    @Test
    public void contactEmailTest() {
        // TODO: test contactEmail
    }

    /**
     * Test the property 'copyrightEmail'
     */
    @Test
    public void copyrightEmailTest() {
        // TODO: test copyrightEmail
    }

    /**
     * Test the property 'currentTOSVersion'
     */
    @Test
    public void currentTOSVersionTest() {
        // TODO: test currentTOSVersion
    }

    /**
     * Test the property 'defaultAvatar'
     */
    @Test
    public void defaultAvatarTest() {
        // TODO: test defaultAvatar
    }

    /**
     * Test the property 'deploymentGroup'
     */
    @Test
    public void deploymentGroupTest() {
        // TODO: test deploymentGroup
    }

    /**
     * Test the property 'devAppVersionStandalone'
     */
    @Test
    public void devAppVersionStandaloneTest() {
        // TODO: test devAppVersionStandalone
    }

    /**
     * Test the property 'devDownloadLinkWindows'
     */
    @Test
    public void devDownloadLinkWindowsTest() {
        // TODO: test devDownloadLinkWindows
    }

    /**
     * Test the property 'devSdkUrl'
     */
    @Test
    public void devSdkUrlTest() {
        // TODO: test devSdkUrl
    }

    /**
     * Test the property 'devSdkVersion'
     */
    @Test
    public void devSdkVersionTest() {
        // TODO: test devSdkVersion
    }

    /**
     * Test the property 'devServerVersionStandalone'
     */
    @Test
    public void devServerVersionStandaloneTest() {
        // TODO: test devServerVersionStandalone
    }

    /**
     * Test the property 'disableAvatarCopying'
     */
    @Test
    public void disableAvatarCopyingTest() {
        // TODO: test disableAvatarCopying
    }

    /**
     * Test the property 'disableAvatarGating'
     */
    @Test
    public void disableAvatarGatingTest() {
        // TODO: test disableAvatarGating
    }

    /**
     * Test the property 'disableCommunityLabs'
     */
    @Test
    public void disableCommunityLabsTest() {
        // TODO: test disableCommunityLabs
    }

    /**
     * Test the property 'disableCommunityLabsPromotion'
     */
    @Test
    public void disableCommunityLabsPromotionTest() {
        // TODO: test disableCommunityLabsPromotion
    }

    /**
     * Test the property 'disableEmail'
     */
    @Test
    public void disableEmailTest() {
        // TODO: test disableEmail
    }

    /**
     * Test the property 'disableEventStream'
     */
    @Test
    public void disableEventStreamTest() {
        // TODO: test disableEventStream
    }

    /**
     * Test the property 'disableFeedbackGating'
     */
    @Test
    public void disableFeedbackGatingTest() {
        // TODO: test disableFeedbackGating
    }

    /**
     * Test the property 'disableHello'
     */
    @Test
    public void disableHelloTest() {
        // TODO: test disableHello
    }

    /**
     * Test the property 'disableRegistration'
     */
    @Test
    public void disableRegistrationTest() {
        // TODO: test disableRegistration
    }

    /**
     * Test the property 'disableSteamNetworking'
     */
    @Test
    public void disableSteamNetworkingTest() {
        // TODO: test disableSteamNetworking
    }

    /**
     * Test the property 'disableTwoFactorAuth'
     */
    @Test
    public void disableTwoFactorAuthTest() {
        // TODO: test disableTwoFactorAuth
    }

    /**
     * Test the property 'disableUdon'
     */
    @Test
    public void disableUdonTest() {
        // TODO: test disableUdon
    }

    /**
     * Test the property 'disableUpgradeAccount'
     */
    @Test
    public void disableUpgradeAccountTest() {
        // TODO: test disableUpgradeAccount
    }

    /**
     * Test the property 'downloadLinkWindows'
     */
    @Test
    public void downloadLinkWindowsTest() {
        // TODO: test downloadLinkWindows
    }

    /**
     * Test the property 'downloadUrls'
     */
    @Test
    public void downloadUrlsTest() {
        // TODO: test downloadUrls
    }

    /**
     * Test the property 'dynamicWorldRows'
     */
    @Test
    public void dynamicWorldRowsTest() {
        // TODO: test dynamicWorldRows
    }

    /**
     * Test the property 'events'
     */
    @Test
    public void eventsTest() {
        // TODO: test events
    }

    /**
     * Test the property 'gearDemoRoomId'
     */
    @Test
    public void gearDemoRoomIdTest() {
        // TODO: test gearDemoRoomId
    }

    /**
     * Test the property 'homepageRedirectTarget'
     */
    @Test
    public void homepageRedirectTargetTest() {
        // TODO: test homepageRedirectTarget
    }

    /**
     * Test the property 'homeWorldId'
     */
    @Test
    public void homeWorldIdTest() {
        // TODO: test homeWorldId
    }

    /**
     * Test the property 'hubWorldId'
     */
    @Test
    public void hubWorldIdTest() {
        // TODO: test hubWorldId
    }

    /**
     * Test the property 'jobsEmail'
     */
    @Test
    public void jobsEmailTest() {
        // TODO: test jobsEmail
    }

    /**
     * Test the property 'messageOfTheDay'
     */
    @Test
    public void messageOfTheDayTest() {
        // TODO: test messageOfTheDay
    }

    /**
     * Test the property 'moderationEmail'
     */
    @Test
    public void moderationEmailTest() {
        // TODO: test moderationEmail
    }

    /**
     * Test the property 'moderationQueryPeriod'
     */
    @Test
    public void moderationQueryPeriodTest() {
        // TODO: test moderationQueryPeriod
    }

    /**
     * Test the property 'notAllowedToSelectAvatarInPrivateWorldMessage'
     */
    @Test
    public void notAllowedToSelectAvatarInPrivateWorldMessageTest() {
        // TODO: test notAllowedToSelectAvatarInPrivateWorldMessage
    }

    /**
     * Test the property 'plugin'
     */
    @Test
    public void pluginTest() {
        // TODO: test plugin
    }

    /**
     * Test the property 'releaseAppVersionStandalone'
     */
    @Test
    public void releaseAppVersionStandaloneTest() {
        // TODO: test releaseAppVersionStandalone
    }

    /**
     * Test the property 'releaseSdkUrl'
     */
    @Test
    public void releaseSdkUrlTest() {
        // TODO: test releaseSdkUrl
    }

    /**
     * Test the property 'releaseSdkVersion'
     */
    @Test
    public void releaseSdkVersionTest() {
        // TODO: test releaseSdkVersion
    }

    /**
     * Test the property 'releaseServerVersionStandalone'
     */
    @Test
    public void releaseServerVersionStandaloneTest() {
        // TODO: test releaseServerVersionStandalone
    }

    /**
     * Test the property 'sdkDeveloperFaqUrl'
     */
    @Test
    public void sdkDeveloperFaqUrlTest() {
        // TODO: test sdkDeveloperFaqUrl
    }

    /**
     * Test the property 'sdkDiscordUrl'
     */
    @Test
    public void sdkDiscordUrlTest() {
        // TODO: test sdkDiscordUrl
    }

    /**
     * Test the property 'sdkNotAllowedToPublishMessage'
     */
    @Test
    public void sdkNotAllowedToPublishMessageTest() {
        // TODO: test sdkNotAllowedToPublishMessage
    }

    /**
     * Test the property 'sdkUnityVersion'
     */
    @Test
    public void sdkUnityVersionTest() {
        // TODO: test sdkUnityVersion
    }

    /**
     * Test the property 'serverName'
     */
    @Test
    public void serverNameTest() {
        // TODO: test serverName
    }

    /**
     * Test the property 'supportEmail'
     */
    @Test
    public void supportEmailTest() {
        // TODO: test supportEmail
    }

    /**
     * Test the property 'timeOutWorldId'
     */
    @Test
    public void timeOutWorldIdTest() {
        // TODO: test timeOutWorldId
    }

    /**
     * Test the property 'tutorialWorldId'
     */
    @Test
    public void tutorialWorldIdTest() {
        // TODO: test tutorialWorldId
    }

    /**
     * Test the property 'updateRateMsMaximum'
     */
    @Test
    public void updateRateMsMaximumTest() {
        // TODO: test updateRateMsMaximum
    }

    /**
     * Test the property 'updateRateMsMinimum'
     */
    @Test
    public void updateRateMsMinimumTest() {
        // TODO: test updateRateMsMinimum
    }

    /**
     * Test the property 'updateRateMsNormal'
     */
    @Test
    public void updateRateMsNormalTest() {
        // TODO: test updateRateMsNormal
    }

    /**
     * Test the property 'updateRateMsUdonManual'
     */
    @Test
    public void updateRateMsUdonManualTest() {
        // TODO: test updateRateMsUdonManual
    }

    /**
     * Test the property 'uploadAnalysisPercent'
     */
    @Test
    public void uploadAnalysisPercentTest() {
        // TODO: test uploadAnalysisPercent
    }

    /**
     * Test the property 'urlList'
     */
    @Test
    public void urlListTest() {
        // TODO: test urlList
    }

    /**
     * Test the property 'useReliableUdpForVoice'
     */
    @Test
    public void useReliableUdpForVoiceTest() {
        // TODO: test useReliableUdpForVoice
    }

    /**
     * Test the property 'userUpdatePeriod'
     */
    @Test
    public void userUpdatePeriodTest() {
        // TODO: test userUpdatePeriod
    }

    /**
     * Test the property 'userVerificationDelay'
     */
    @Test
    public void userVerificationDelayTest() {
        // TODO: test userVerificationDelay
    }

    /**
     * Test the property 'userVerificationRetry'
     */
    @Test
    public void userVerificationRetryTest() {
        // TODO: test userVerificationRetry
    }

    /**
     * Test the property 'userVerificationTimeout'
     */
    @Test
    public void userVerificationTimeoutTest() {
        // TODO: test userVerificationTimeout
    }

    /**
     * Test the property 'viveWindowsUrl'
     */
    @Test
    public void viveWindowsUrlTest() {
        // TODO: test viveWindowsUrl
    }

    /**
     * Test the property 'whiteListedAssetUrls'
     */
    @Test
    public void whiteListedAssetUrlsTest() {
        // TODO: test whiteListedAssetUrls
    }

    /**
     * Test the property 'worldUpdatePeriod'
     */
    @Test
    public void worldUpdatePeriodTest() {
        // TODO: test worldUpdatePeriod
    }

    /**
     * Test the property 'youtubedlHash'
     */
    @Test
    public void youtubedlHashTest() {
        // TODO: test youtubedlHash
    }

    /**
     * Test the property 'youtubedlVersion'
     */
    @Test
    public void youtubedlVersionTest() {
        // TODO: test youtubedlVersion
    }

}
