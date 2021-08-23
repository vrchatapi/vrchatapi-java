/*
 * VRChat API Documentation
 * ![VRChat API Banner](https://vrchatapi.github.io/assets/img/api_banner_1500x400.png)  # Welcome to the VRChat API  Before we begin, we would like to state this is a **COMMUNITY DRIVEN PROJECT**. This means that everything you read on here was written by the community itself and is **not** officially supported by VRChat. The documentation is provided \"AS IS\", and any action you take towards VRChat is completely your own responsibility.  The documentation and additional libraries SHALL ONLY be used for applications interacting with VRChat's API in accordance with their [Terms of Service](https://github.com/VRChatAPI), and MUST NOT be used for modifying the client, \"avatar ripping\", or other illegal activities. Malicious usage or spamming the API may result in account termination. Certain parts of the API are also more sensitive than others, for example moderation, so please read tread extra carefully and read the warnings when present.  ![Tupper Policy on API](https://i.imgur.com/yLlW7Ok.png)  Finally, use of the API using applications other than the approved methods (website, VRChat application, Unity SDK) is not officially supported. VRChat provides no guarantee or support for external applications using the API. Access to API endpoints may break **at any time, without notice**. Therefore, please **do not ping** VRChat Staff in the VRChat Discord if you are having API problems, as they do not provide API support. We will make a best effort in keeping this documentation and associated language libraries up to date, but things might be outdated or missing. If you find that something is no longer valid, please contact us on Discord or [create an issue](https://github.com/vrchatapi/specification/issues) and tell us so we can fix it.  # Getting Started  The VRChat API can be used to programmatically retrieve or update information regarding your profile, friends, avatars, worlds and more. The API consists of two parts, \"Photon\" which is only used in-game, and the \"Web API\" which is used by both the game and the website. This documentation focuses only on the Web API.  The API is designed around the REST ideology, providing semi-simple and usually predictable URIs to access and modify objects. Requests support standard HTTP methods like GET, PUT, POST, and DELETE and standard status codes. Response bodies are always UTF-8 encoded JSON objects, unless explicitly documented otherwise.  <div class=\"callout callout-error\">   <strong>🛑 Warning! Do not touch Photon!</strong><br>   Photon is only used by the in-game client and should <b>not</b> be touched. Doing so may result in permanent account termination. </div>  <div class=\"callout callout-info\">   <strong>ℹ️ API Key and Authentication</strong><br>   The API Key has always been the same and is currently <code>JlE5Jldo5Jibnk5O5hTx6XVqsJu4WJ26</code>.   Read <a href=\"#tag--authentication\">Authentication</a> for how to log in. </div>  # Using the API  For simply exploring what the API can do it is strongly recommended to download [Insomnia](https://insomnia.rest/download), a free and open-source API client that's great for sending requests to the API in an orderly fashion. Insomnia allows you to send data in the format that's required for VRChat's API. It is also possible to try out the API in your browser, by first logging in at [vrchat.com/home](https://vrchat.com/home/) and then going to [vrchat.com/api/1/auth/user](https://vrchat.com/api/1/auth/user), but the information will be much harder to work with.  For more permanent operation such as software development it is instead recommended to use one of the existing language SDKs. This community project maintains API libraries in several languages, which allows you to interact with the API with simple function calls rather than having to implement the HTTP protocol yourself. Most of these libraries are automatically generated from the API specification, sometimes with additional helpful wrapper code to make usage easier. This allows them to be almost automatically updated and expanded upon as soon as a new feature is introduced in the specification itself. The libraries can be found on [GitHub](https://github.com/vrchatapi) or following:  * [NodeJS (JavaScript)](https://www.npmjs.com/package/vrchat) * [Dart](https://pub.dev/packages/vrchat_dart) * [Rust](https://crates.io/crates/vrchatapi) * [C#](github.com/vrchatapi/vrchatapi-csharp) * [Python](https://github.com/vrchatapi/VRChatPython)  # Pagination  Most endpoints enforce pagination, meaning they will only return 10 entries by default, and never more than 100.<br> Using both the limit and offset parameters allows you to easily paginate through a large number of objects.  | Query Parameter | Type | Description | | ----------|--|------- | | `limit` | integer  | The number of objects to return. This value often defaults to 10. Highest limit is always 100.| | `offset` | integer  | A zero-based offset from the default object sorting.|  If a request returns fewer objects than the `limit` parameter, there are no more items available to return.  # Contribution  Do you want to get involved in the documentation effort? Do you want to help improve one of the language API libraries? This project is an [OPEN Open Source Project](https://openopensource.org)! This means that individuals making significant and valuable contributions are given commit-access to the project. It also means we are very open and welcoming of new people making contributions, unlike some more guarded open-source projects.  [![Discord](https://img.shields.io/static/v1?label=vrchatapi&message=discord&color=blueviolet&style=for-the-badge)](https://discord.gg/qjZE9C9fkB)
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: me@ruby.js.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.vrchatapi.model.DeveloperType;
import io.github.vrchatapi.model.Platform;
import io.github.vrchatapi.model.UserState;
import io.github.vrchatapi.model.UserStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * CurrentUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CurrentUser {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_USER_ICON = "userIcon";
  @SerializedName(SERIALIZED_NAME_USER_ICON)
  private String userIcon;

  public static final String SERIALIZED_NAME_BIO = "bio";
  @SerializedName(SERIALIZED_NAME_BIO)
  private String bio;

  public static final String SERIALIZED_NAME_BIO_LINKS = "bioLinks";
  @SerializedName(SERIALIZED_NAME_BIO_LINKS)
  private List<String> bioLinks = new ArrayList<String>();

  public static final String SERIALIZED_NAME_PROFILE_PIC_OVERRIDE = "profilePicOverride";
  @SerializedName(SERIALIZED_NAME_PROFILE_PIC_OVERRIDE)
  private String profilePicOverride;

  public static final String SERIALIZED_NAME_STATUS_DESCRIPTION = "statusDescription";
  @SerializedName(SERIALIZED_NAME_STATUS_DESCRIPTION)
  private String statusDescription;

  public static final String SERIALIZED_NAME_PAST_DISPLAY_NAMES = "pastDisplayNames";
  @SerializedName(SERIALIZED_NAME_PAST_DISPLAY_NAMES)
  private List<String> pastDisplayNames = new ArrayList<String>();

  public static final String SERIALIZED_NAME_HAS_EMAIL = "hasEmail";
  @SerializedName(SERIALIZED_NAME_HAS_EMAIL)
  private Boolean hasEmail;

  public static final String SERIALIZED_NAME_HAS_PENDING_EMAIL = "hasPendingEmail";
  @SerializedName(SERIALIZED_NAME_HAS_PENDING_EMAIL)
  private Boolean hasPendingEmail;

  public static final String SERIALIZED_NAME_OBFUSCATED_EMAIL = "obfuscatedEmail";
  @SerializedName(SERIALIZED_NAME_OBFUSCATED_EMAIL)
  private String obfuscatedEmail;

  public static final String SERIALIZED_NAME_OBFUSCATED_PENDING_EMAIL = "obfuscatedPendingEmail";
  @SerializedName(SERIALIZED_NAME_OBFUSCATED_PENDING_EMAIL)
  private String obfuscatedPendingEmail;

  public static final String SERIALIZED_NAME_EMAIL_VERIFIED = "emailVerified";
  @SerializedName(SERIALIZED_NAME_EMAIL_VERIFIED)
  private Boolean emailVerified;

  public static final String SERIALIZED_NAME_HAS_BIRTHDAY = "hasBirthday";
  @SerializedName(SERIALIZED_NAME_HAS_BIRTHDAY)
  private Boolean hasBirthday;

  public static final String SERIALIZED_NAME_UNSUBSCRIBE = "unsubscribe";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIBE)
  private Boolean unsubscribe;

  public static final String SERIALIZED_NAME_STATUS_HISTORY = "statusHistory";
  @SerializedName(SERIALIZED_NAME_STATUS_HISTORY)
  private List<String> statusHistory = new ArrayList<String>();

  public static final String SERIALIZED_NAME_STATUS_FIRST_TIME = "statusFirstTime";
  @SerializedName(SERIALIZED_NAME_STATUS_FIRST_TIME)
  private Boolean statusFirstTime;

  public static final String SERIALIZED_NAME_FRIENDS = "friends";
  @SerializedName(SERIALIZED_NAME_FRIENDS)
  private List<String> friends = new ArrayList<String>();

  public static final String SERIALIZED_NAME_FRIEND_GROUP_NAMES = "friendGroupNames";
  @SerializedName(SERIALIZED_NAME_FRIEND_GROUP_NAMES)
  private List<String> friendGroupNames = new ArrayList<String>();

  public static final String SERIALIZED_NAME_CURRENT_AVATAR_IMAGE_URL = "currentAvatarImageUrl";
  @SerializedName(SERIALIZED_NAME_CURRENT_AVATAR_IMAGE_URL)
  private String currentAvatarImageUrl;

  public static final String SERIALIZED_NAME_CURRENT_AVATAR_THUMBNAIL_IMAGE_URL = "currentAvatarThumbnailImageUrl";
  @SerializedName(SERIALIZED_NAME_CURRENT_AVATAR_THUMBNAIL_IMAGE_URL)
  private String currentAvatarThumbnailImageUrl;

  public static final String SERIALIZED_NAME_FALLBACK_AVATAR = "fallbackAvatar";
  @SerializedName(SERIALIZED_NAME_FALLBACK_AVATAR)
  private String fallbackAvatar;

  public static final String SERIALIZED_NAME_CURRENT_AVATAR = "currentAvatar";
  @SerializedName(SERIALIZED_NAME_CURRENT_AVATAR)
  private String currentAvatar;

  public static final String SERIALIZED_NAME_CURRENT_AVATAR_ASSET_URL = "currentAvatarAssetUrl";
  @SerializedName(SERIALIZED_NAME_CURRENT_AVATAR_ASSET_URL)
  private String currentAvatarAssetUrl;

  public static final String SERIALIZED_NAME_ACCOUNT_DELETION_DATE = "accountDeletionDate";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DELETION_DATE)
  private LocalDate accountDeletionDate;

  public static final String SERIALIZED_NAME_ACCEPTED_T_O_S_VERSION = "acceptedTOSVersion";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_T_O_S_VERSION)
  private BigDecimal acceptedTOSVersion;

  public static final String SERIALIZED_NAME_STEAM_ID = "steamId";
  @SerializedName(SERIALIZED_NAME_STEAM_ID)
  private String steamId;

  public static final String SERIALIZED_NAME_STEAM_DETAILS = "steamDetails";
  @SerializedName(SERIALIZED_NAME_STEAM_DETAILS)
  private Object steamDetails;

  public static final String SERIALIZED_NAME_OCULUS_ID = "oculusId";
  @SerializedName(SERIALIZED_NAME_OCULUS_ID)
  private String oculusId;

  public static final String SERIALIZED_NAME_HAS_LOGGED_IN_FROM_CLIENT = "hasLoggedInFromClient";
  @SerializedName(SERIALIZED_NAME_HAS_LOGGED_IN_FROM_CLIENT)
  private Boolean hasLoggedInFromClient;

  public static final String SERIALIZED_NAME_HOME_LOCATION = "homeLocation";
  @SerializedName(SERIALIZED_NAME_HOME_LOCATION)
  private String homeLocation;

  public static final String SERIALIZED_NAME_TWO_FACTOR_AUTH_ENABLED = "twoFactorAuthEnabled";
  @SerializedName(SERIALIZED_NAME_TWO_FACTOR_AUTH_ENABLED)
  private Boolean twoFactorAuthEnabled;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private UserState state = UserState.OFFLINE;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<String>();

  public static final String SERIALIZED_NAME_DEVELOPER_TYPE = "developerType";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_TYPE)
  private DeveloperType developerType = DeveloperType.NONE;

  public static final String SERIALIZED_NAME_LAST_LOGIN = "last_login";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN)
  private OffsetDateTime lastLogin;

  public static final String SERIALIZED_NAME_LAST_PLATFORM = "last_platform";
  @SerializedName(SERIALIZED_NAME_LAST_PLATFORM)
  private Platform lastPlatform;

  public static final String SERIALIZED_NAME_ALLOW_AVATAR_COPYING = "allowAvatarCopying";
  @SerializedName(SERIALIZED_NAME_ALLOW_AVATAR_COPYING)
  private Boolean allowAvatarCopying;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private UserStatus status;

  public static final String SERIALIZED_NAME_DATE_JOINED = "date_joined";
  @SerializedName(SERIALIZED_NAME_DATE_JOINED)
  private LocalDate dateJoined;

  public static final String SERIALIZED_NAME_IS_FRIEND = "isFriend";
  @SerializedName(SERIALIZED_NAME_IS_FRIEND)
  private Boolean isFriend = false;

  public static final String SERIALIZED_NAME_FRIEND_KEY = "friendKey";
  @SerializedName(SERIALIZED_NAME_FRIEND_KEY)
  private String friendKey;

  public static final String SERIALIZED_NAME_ONLINE_FRIENDS = "onlineFriends";
  @SerializedName(SERIALIZED_NAME_ONLINE_FRIENDS)
  private List<String> onlineFriends = null;

  public static final String SERIALIZED_NAME_ACTIVE_FRIENDS = "activeFriends";
  @SerializedName(SERIALIZED_NAME_ACTIVE_FRIENDS)
  private List<String> activeFriends = null;

  public static final String SERIALIZED_NAME_OFFLINE_FRIENDS = "offlineFriends";
  @SerializedName(SERIALIZED_NAME_OFFLINE_FRIENDS)
  private List<String> offlineFriends = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "")

  public String getId() {
    return id;
  }




  public CurrentUser username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public CurrentUser displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CurrentUser userIcon(String userIcon) {
    
    this.userIcon = userIcon;
    return this;
  }

   /**
   * Get userIcon
   * @return userIcon
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUserIcon() {
    return userIcon;
  }


  public void setUserIcon(String userIcon) {
    this.userIcon = userIcon;
  }


  public CurrentUser bio(String bio) {
    
    this.bio = bio;
    return this;
  }

   /**
   * Get bio
   * @return bio
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBio() {
    return bio;
  }


  public void setBio(String bio) {
    this.bio = bio;
  }


  public CurrentUser bioLinks(List<String> bioLinks) {
    
    this.bioLinks = bioLinks;
    return this;
  }

  public CurrentUser addBioLinksItem(String bioLinksItem) {
    this.bioLinks.add(bioLinksItem);
    return this;
  }

   /**
   * Get bioLinks
   * @return bioLinks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getBioLinks() {
    return bioLinks;
  }


  public void setBioLinks(List<String> bioLinks) {
    this.bioLinks = bioLinks;
  }


  public CurrentUser profilePicOverride(String profilePicOverride) {
    
    this.profilePicOverride = profilePicOverride;
    return this;
  }

   /**
   * Get profilePicOverride
   * @return profilePicOverride
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getProfilePicOverride() {
    return profilePicOverride;
  }


  public void setProfilePicOverride(String profilePicOverride) {
    this.profilePicOverride = profilePicOverride;
  }


  public CurrentUser statusDescription(String statusDescription) {
    
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Get statusDescription
   * @return statusDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStatusDescription() {
    return statusDescription;
  }


  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }


  public CurrentUser pastDisplayNames(List<String> pastDisplayNames) {
    
    this.pastDisplayNames = pastDisplayNames;
    return this;
  }

  public CurrentUser addPastDisplayNamesItem(String pastDisplayNamesItem) {
    this.pastDisplayNames.add(pastDisplayNamesItem);
    return this;
  }

   /**
   * Get pastDisplayNames
   * @return pastDisplayNames
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getPastDisplayNames() {
    return pastDisplayNames;
  }


  public void setPastDisplayNames(List<String> pastDisplayNames) {
    this.pastDisplayNames = pastDisplayNames;
  }


  public CurrentUser hasEmail(Boolean hasEmail) {
    
    this.hasEmail = hasEmail;
    return this;
  }

   /**
   * Get hasEmail
   * @return hasEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHasEmail() {
    return hasEmail;
  }


  public void setHasEmail(Boolean hasEmail) {
    this.hasEmail = hasEmail;
  }


  public CurrentUser hasPendingEmail(Boolean hasPendingEmail) {
    
    this.hasPendingEmail = hasPendingEmail;
    return this;
  }

   /**
   * Get hasPendingEmail
   * @return hasPendingEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHasPendingEmail() {
    return hasPendingEmail;
  }


  public void setHasPendingEmail(Boolean hasPendingEmail) {
    this.hasPendingEmail = hasPendingEmail;
  }


  public CurrentUser obfuscatedEmail(String obfuscatedEmail) {
    
    this.obfuscatedEmail = obfuscatedEmail;
    return this;
  }

   /**
   * Get obfuscatedEmail
   * @return obfuscatedEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getObfuscatedEmail() {
    return obfuscatedEmail;
  }


  public void setObfuscatedEmail(String obfuscatedEmail) {
    this.obfuscatedEmail = obfuscatedEmail;
  }


  public CurrentUser obfuscatedPendingEmail(String obfuscatedPendingEmail) {
    
    this.obfuscatedPendingEmail = obfuscatedPendingEmail;
    return this;
  }

   /**
   * Get obfuscatedPendingEmail
   * @return obfuscatedPendingEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getObfuscatedPendingEmail() {
    return obfuscatedPendingEmail;
  }


  public void setObfuscatedPendingEmail(String obfuscatedPendingEmail) {
    this.obfuscatedPendingEmail = obfuscatedPendingEmail;
  }


  public CurrentUser emailVerified(Boolean emailVerified) {
    
    this.emailVerified = emailVerified;
    return this;
  }

   /**
   * Get emailVerified
   * @return emailVerified
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getEmailVerified() {
    return emailVerified;
  }


  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }


  public CurrentUser hasBirthday(Boolean hasBirthday) {
    
    this.hasBirthday = hasBirthday;
    return this;
  }

   /**
   * Get hasBirthday
   * @return hasBirthday
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHasBirthday() {
    return hasBirthday;
  }


  public void setHasBirthday(Boolean hasBirthday) {
    this.hasBirthday = hasBirthday;
  }


  public CurrentUser unsubscribe(Boolean unsubscribe) {
    
    this.unsubscribe = unsubscribe;
    return this;
  }

   /**
   * Get unsubscribe
   * @return unsubscribe
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getUnsubscribe() {
    return unsubscribe;
  }


  public void setUnsubscribe(Boolean unsubscribe) {
    this.unsubscribe = unsubscribe;
  }


  public CurrentUser statusHistory(List<String> statusHistory) {
    
    this.statusHistory = statusHistory;
    return this;
  }

  public CurrentUser addStatusHistoryItem(String statusHistoryItem) {
    this.statusHistory.add(statusHistoryItem);
    return this;
  }

   /**
   * Get statusHistory
   * @return statusHistory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getStatusHistory() {
    return statusHistory;
  }


  public void setStatusHistory(List<String> statusHistory) {
    this.statusHistory = statusHistory;
  }


  public CurrentUser statusFirstTime(Boolean statusFirstTime) {
    
    this.statusFirstTime = statusFirstTime;
    return this;
  }

   /**
   * Get statusFirstTime
   * @return statusFirstTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getStatusFirstTime() {
    return statusFirstTime;
  }


  public void setStatusFirstTime(Boolean statusFirstTime) {
    this.statusFirstTime = statusFirstTime;
  }


  public CurrentUser friends(List<String> friends) {
    
    this.friends = friends;
    return this;
  }

  public CurrentUser addFriendsItem(String friendsItem) {
    this.friends.add(friendsItem);
    return this;
  }

   /**
   * Get friends
   * @return friends
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getFriends() {
    return friends;
  }


  public void setFriends(List<String> friends) {
    this.friends = friends;
  }


  public CurrentUser friendGroupNames(List<String> friendGroupNames) {
    
    this.friendGroupNames = friendGroupNames;
    return this;
  }

  public CurrentUser addFriendGroupNamesItem(String friendGroupNamesItem) {
    this.friendGroupNames.add(friendGroupNamesItem);
    return this;
  }

   /**
   * Always empty array.
   * @return friendGroupNames
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Always empty array.")

  public List<String> getFriendGroupNames() {
    return friendGroupNames;
  }


  public void setFriendGroupNames(List<String> friendGroupNames) {
    this.friendGroupNames = friendGroupNames;
  }


  public CurrentUser currentAvatarImageUrl(String currentAvatarImageUrl) {
    
    this.currentAvatarImageUrl = currentAvatarImageUrl;
    return this;
  }

   /**
   * Get currentAvatarImageUrl
   * @return currentAvatarImageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCurrentAvatarImageUrl() {
    return currentAvatarImageUrl;
  }


  public void setCurrentAvatarImageUrl(String currentAvatarImageUrl) {
    this.currentAvatarImageUrl = currentAvatarImageUrl;
  }


  public CurrentUser currentAvatarThumbnailImageUrl(String currentAvatarThumbnailImageUrl) {
    
    this.currentAvatarThumbnailImageUrl = currentAvatarThumbnailImageUrl;
    return this;
  }

   /**
   * Get currentAvatarThumbnailImageUrl
   * @return currentAvatarThumbnailImageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCurrentAvatarThumbnailImageUrl() {
    return currentAvatarThumbnailImageUrl;
  }


  public void setCurrentAvatarThumbnailImageUrl(String currentAvatarThumbnailImageUrl) {
    this.currentAvatarThumbnailImageUrl = currentAvatarThumbnailImageUrl;
  }


  public CurrentUser fallbackAvatar(String fallbackAvatar) {
    
    this.fallbackAvatar = fallbackAvatar;
    return this;
  }

   /**
   * Get fallbackAvatar
   * @return fallbackAvatar
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "avtr_912d66a4-4714-43b8-8407-7de2cafbf55b", required = true, value = "")

  public String getFallbackAvatar() {
    return fallbackAvatar;
  }


  public void setFallbackAvatar(String fallbackAvatar) {
    this.fallbackAvatar = fallbackAvatar;
  }


  public CurrentUser currentAvatar(String currentAvatar) {
    
    this.currentAvatar = currentAvatar;
    return this;
  }

   /**
   * Get currentAvatar
   * @return currentAvatar
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "avtr_912d66a4-4714-43b8-8407-7de2cafbf55b", required = true, value = "")

  public String getCurrentAvatar() {
    return currentAvatar;
  }


  public void setCurrentAvatar(String currentAvatar) {
    this.currentAvatar = currentAvatar;
  }


  public CurrentUser currentAvatarAssetUrl(String currentAvatarAssetUrl) {
    
    this.currentAvatarAssetUrl = currentAvatarAssetUrl;
    return this;
  }

   /**
   * Get currentAvatarAssetUrl
   * @return currentAvatarAssetUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCurrentAvatarAssetUrl() {
    return currentAvatarAssetUrl;
  }


  public void setCurrentAvatarAssetUrl(String currentAvatarAssetUrl) {
    this.currentAvatarAssetUrl = currentAvatarAssetUrl;
  }


  public CurrentUser accountDeletionDate(LocalDate accountDeletionDate) {
    
    this.accountDeletionDate = accountDeletionDate;
    return this;
  }

   /**
   * Get accountDeletionDate
   * @return accountDeletionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getAccountDeletionDate() {
    return accountDeletionDate;
  }


  public void setAccountDeletionDate(LocalDate accountDeletionDate) {
    this.accountDeletionDate = accountDeletionDate;
  }


  public CurrentUser acceptedTOSVersion(BigDecimal acceptedTOSVersion) {
    
    this.acceptedTOSVersion = acceptedTOSVersion;
    return this;
  }

   /**
   * Get acceptedTOSVersion
   * @return acceptedTOSVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getAcceptedTOSVersion() {
    return acceptedTOSVersion;
  }


  public void setAcceptedTOSVersion(BigDecimal acceptedTOSVersion) {
    this.acceptedTOSVersion = acceptedTOSVersion;
  }


  public CurrentUser steamId(String steamId) {
    
    this.steamId = steamId;
    return this;
  }

   /**
   * Get steamId
   * @return steamId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSteamId() {
    return steamId;
  }


  public void setSteamId(String steamId) {
    this.steamId = steamId;
  }


  public CurrentUser steamDetails(Object steamDetails) {
    
    this.steamDetails = steamDetails;
    return this;
  }

   /**
   * Get steamDetails
   * @return steamDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getSteamDetails() {
    return steamDetails;
  }


  public void setSteamDetails(Object steamDetails) {
    this.steamDetails = steamDetails;
  }


  public CurrentUser oculusId(String oculusId) {
    
    this.oculusId = oculusId;
    return this;
  }

   /**
   * Get oculusId
   * @return oculusId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getOculusId() {
    return oculusId;
  }


  public void setOculusId(String oculusId) {
    this.oculusId = oculusId;
  }


  public CurrentUser hasLoggedInFromClient(Boolean hasLoggedInFromClient) {
    
    this.hasLoggedInFromClient = hasLoggedInFromClient;
    return this;
  }

   /**
   * Get hasLoggedInFromClient
   * @return hasLoggedInFromClient
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHasLoggedInFromClient() {
    return hasLoggedInFromClient;
  }


  public void setHasLoggedInFromClient(Boolean hasLoggedInFromClient) {
    this.hasLoggedInFromClient = hasLoggedInFromClient;
  }


  public CurrentUser homeLocation(String homeLocation) {
    
    this.homeLocation = homeLocation;
    return this;
  }

   /**
   * Get homeLocation
   * @return homeLocation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", required = true, value = "")

  public String getHomeLocation() {
    return homeLocation;
  }


  public void setHomeLocation(String homeLocation) {
    this.homeLocation = homeLocation;
  }


  public CurrentUser twoFactorAuthEnabled(Boolean twoFactorAuthEnabled) {
    
    this.twoFactorAuthEnabled = twoFactorAuthEnabled;
    return this;
  }

   /**
   * Get twoFactorAuthEnabled
   * @return twoFactorAuthEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getTwoFactorAuthEnabled() {
    return twoFactorAuthEnabled;
  }


  public void setTwoFactorAuthEnabled(Boolean twoFactorAuthEnabled) {
    this.twoFactorAuthEnabled = twoFactorAuthEnabled;
  }


  public CurrentUser state(UserState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserState getState() {
    return state;
  }


  public void setState(UserState state) {
    this.state = state;
  }


  public CurrentUser tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CurrentUser addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public CurrentUser developerType(DeveloperType developerType) {
    
    this.developerType = developerType;
    return this;
  }

   /**
   * Get developerType
   * @return developerType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DeveloperType getDeveloperType() {
    return developerType;
  }


  public void setDeveloperType(DeveloperType developerType) {
    this.developerType = developerType;
  }


  public CurrentUser lastLogin(OffsetDateTime lastLogin) {
    
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getLastLogin() {
    return lastLogin;
  }


  public void setLastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }


  public CurrentUser lastPlatform(Platform lastPlatform) {
    
    this.lastPlatform = lastPlatform;
    return this;
  }

   /**
   * Get lastPlatform
   * @return lastPlatform
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Platform getLastPlatform() {
    return lastPlatform;
  }


  public void setLastPlatform(Platform lastPlatform) {
    this.lastPlatform = lastPlatform;
  }


  public CurrentUser allowAvatarCopying(Boolean allowAvatarCopying) {
    
    this.allowAvatarCopying = allowAvatarCopying;
    return this;
  }

   /**
   * Get allowAvatarCopying
   * @return allowAvatarCopying
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getAllowAvatarCopying() {
    return allowAvatarCopying;
  }


  public void setAllowAvatarCopying(Boolean allowAvatarCopying) {
    this.allowAvatarCopying = allowAvatarCopying;
  }


  public CurrentUser status(UserStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserStatus getStatus() {
    return status;
  }


  public void setStatus(UserStatus status) {
    this.status = status;
  }


   /**
   * Get dateJoined
   * @return dateJoined
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LocalDate getDateJoined() {
    return dateJoined;
  }




  public CurrentUser isFriend(Boolean isFriend) {
    
    this.isFriend = isFriend;
    return this;
  }

   /**
   * Get isFriend
   * @return isFriend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsFriend() {
    return isFriend;
  }


  public void setIsFriend(Boolean isFriend) {
    this.isFriend = isFriend;
  }


  public CurrentUser friendKey(String friendKey) {
    
    this.friendKey = friendKey;
    return this;
  }

   /**
   * Get friendKey
   * @return friendKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFriendKey() {
    return friendKey;
  }


  public void setFriendKey(String friendKey) {
    this.friendKey = friendKey;
  }


  public CurrentUser onlineFriends(List<String> onlineFriends) {
    
    this.onlineFriends = onlineFriends;
    return this;
  }

  public CurrentUser addOnlineFriendsItem(String onlineFriendsItem) {
    if (this.onlineFriends == null) {
      this.onlineFriends = new ArrayList<String>();
    }
    this.onlineFriends.add(onlineFriendsItem);
    return this;
  }

   /**
   * Get onlineFriends
   * @return onlineFriends
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOnlineFriends() {
    return onlineFriends;
  }


  public void setOnlineFriends(List<String> onlineFriends) {
    this.onlineFriends = onlineFriends;
  }


  public CurrentUser activeFriends(List<String> activeFriends) {
    
    this.activeFriends = activeFriends;
    return this;
  }

  public CurrentUser addActiveFriendsItem(String activeFriendsItem) {
    if (this.activeFriends == null) {
      this.activeFriends = new ArrayList<String>();
    }
    this.activeFriends.add(activeFriendsItem);
    return this;
  }

   /**
   * Get activeFriends
   * @return activeFriends
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getActiveFriends() {
    return activeFriends;
  }


  public void setActiveFriends(List<String> activeFriends) {
    this.activeFriends = activeFriends;
  }


  public CurrentUser offlineFriends(List<String> offlineFriends) {
    
    this.offlineFriends = offlineFriends;
    return this;
  }

  public CurrentUser addOfflineFriendsItem(String offlineFriendsItem) {
    if (this.offlineFriends == null) {
      this.offlineFriends = new ArrayList<String>();
    }
    this.offlineFriends.add(offlineFriendsItem);
    return this;
  }

   /**
   * Get offlineFriends
   * @return offlineFriends
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOfflineFriends() {
    return offlineFriends;
  }


  public void setOfflineFriends(List<String> offlineFriends) {
    this.offlineFriends = offlineFriends;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUser currentUser = (CurrentUser) o;
    return Objects.equals(this.id, currentUser.id) &&
        Objects.equals(this.username, currentUser.username) &&
        Objects.equals(this.displayName, currentUser.displayName) &&
        Objects.equals(this.userIcon, currentUser.userIcon) &&
        Objects.equals(this.bio, currentUser.bio) &&
        Objects.equals(this.bioLinks, currentUser.bioLinks) &&
        Objects.equals(this.profilePicOverride, currentUser.profilePicOverride) &&
        Objects.equals(this.statusDescription, currentUser.statusDescription) &&
        Objects.equals(this.pastDisplayNames, currentUser.pastDisplayNames) &&
        Objects.equals(this.hasEmail, currentUser.hasEmail) &&
        Objects.equals(this.hasPendingEmail, currentUser.hasPendingEmail) &&
        Objects.equals(this.obfuscatedEmail, currentUser.obfuscatedEmail) &&
        Objects.equals(this.obfuscatedPendingEmail, currentUser.obfuscatedPendingEmail) &&
        Objects.equals(this.emailVerified, currentUser.emailVerified) &&
        Objects.equals(this.hasBirthday, currentUser.hasBirthday) &&
        Objects.equals(this.unsubscribe, currentUser.unsubscribe) &&
        Objects.equals(this.statusHistory, currentUser.statusHistory) &&
        Objects.equals(this.statusFirstTime, currentUser.statusFirstTime) &&
        Objects.equals(this.friends, currentUser.friends) &&
        Objects.equals(this.friendGroupNames, currentUser.friendGroupNames) &&
        Objects.equals(this.currentAvatarImageUrl, currentUser.currentAvatarImageUrl) &&
        Objects.equals(this.currentAvatarThumbnailImageUrl, currentUser.currentAvatarThumbnailImageUrl) &&
        Objects.equals(this.fallbackAvatar, currentUser.fallbackAvatar) &&
        Objects.equals(this.currentAvatar, currentUser.currentAvatar) &&
        Objects.equals(this.currentAvatarAssetUrl, currentUser.currentAvatarAssetUrl) &&
        Objects.equals(this.accountDeletionDate, currentUser.accountDeletionDate) &&
        Objects.equals(this.acceptedTOSVersion, currentUser.acceptedTOSVersion) &&
        Objects.equals(this.steamId, currentUser.steamId) &&
        Objects.equals(this.steamDetails, currentUser.steamDetails) &&
        Objects.equals(this.oculusId, currentUser.oculusId) &&
        Objects.equals(this.hasLoggedInFromClient, currentUser.hasLoggedInFromClient) &&
        Objects.equals(this.homeLocation, currentUser.homeLocation) &&
        Objects.equals(this.twoFactorAuthEnabled, currentUser.twoFactorAuthEnabled) &&
        Objects.equals(this.state, currentUser.state) &&
        Objects.equals(this.tags, currentUser.tags) &&
        Objects.equals(this.developerType, currentUser.developerType) &&
        Objects.equals(this.lastLogin, currentUser.lastLogin) &&
        Objects.equals(this.lastPlatform, currentUser.lastPlatform) &&
        Objects.equals(this.allowAvatarCopying, currentUser.allowAvatarCopying) &&
        Objects.equals(this.status, currentUser.status) &&
        Objects.equals(this.dateJoined, currentUser.dateJoined) &&
        Objects.equals(this.isFriend, currentUser.isFriend) &&
        Objects.equals(this.friendKey, currentUser.friendKey) &&
        Objects.equals(this.onlineFriends, currentUser.onlineFriends) &&
        Objects.equals(this.activeFriends, currentUser.activeFriends) &&
        Objects.equals(this.offlineFriends, currentUser.offlineFriends);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, displayName, userIcon, bio, bioLinks, profilePicOverride, statusDescription, pastDisplayNames, hasEmail, hasPendingEmail, obfuscatedEmail, obfuscatedPendingEmail, emailVerified, hasBirthday, unsubscribe, statusHistory, statusFirstTime, friends, friendGroupNames, currentAvatarImageUrl, currentAvatarThumbnailImageUrl, fallbackAvatar, currentAvatar, currentAvatarAssetUrl, accountDeletionDate, acceptedTOSVersion, steamId, steamDetails, oculusId, hasLoggedInFromClient, homeLocation, twoFactorAuthEnabled, state, tags, developerType, lastLogin, lastPlatform, allowAvatarCopying, status, dateJoined, isFriend, friendKey, onlineFriends, activeFriends, offlineFriends);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent()
      ? (a.get().getClass().isArray() ? Arrays.hashCode((T[])a.get()) : Objects.hashCode(a.get()))
      : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    userIcon: ").append(toIndentedString(userIcon)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    bioLinks: ").append(toIndentedString(bioLinks)).append("\n");
    sb.append("    profilePicOverride: ").append(toIndentedString(profilePicOverride)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    pastDisplayNames: ").append(toIndentedString(pastDisplayNames)).append("\n");
    sb.append("    hasEmail: ").append(toIndentedString(hasEmail)).append("\n");
    sb.append("    hasPendingEmail: ").append(toIndentedString(hasPendingEmail)).append("\n");
    sb.append("    obfuscatedEmail: ").append(toIndentedString(obfuscatedEmail)).append("\n");
    sb.append("    obfuscatedPendingEmail: ").append(toIndentedString(obfuscatedPendingEmail)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    hasBirthday: ").append(toIndentedString(hasBirthday)).append("\n");
    sb.append("    unsubscribe: ").append(toIndentedString(unsubscribe)).append("\n");
    sb.append("    statusHistory: ").append(toIndentedString(statusHistory)).append("\n");
    sb.append("    statusFirstTime: ").append(toIndentedString(statusFirstTime)).append("\n");
    sb.append("    friends: ").append(toIndentedString(friends)).append("\n");
    sb.append("    friendGroupNames: ").append(toIndentedString(friendGroupNames)).append("\n");
    sb.append("    currentAvatarImageUrl: ").append(toIndentedString(currentAvatarImageUrl)).append("\n");
    sb.append("    currentAvatarThumbnailImageUrl: ").append(toIndentedString(currentAvatarThumbnailImageUrl)).append("\n");
    sb.append("    fallbackAvatar: ").append(toIndentedString(fallbackAvatar)).append("\n");
    sb.append("    currentAvatar: ").append(toIndentedString(currentAvatar)).append("\n");
    sb.append("    currentAvatarAssetUrl: ").append(toIndentedString(currentAvatarAssetUrl)).append("\n");
    sb.append("    accountDeletionDate: ").append(toIndentedString(accountDeletionDate)).append("\n");
    sb.append("    acceptedTOSVersion: ").append(toIndentedString(acceptedTOSVersion)).append("\n");
    sb.append("    steamId: ").append(toIndentedString(steamId)).append("\n");
    sb.append("    steamDetails: ").append(toIndentedString(steamDetails)).append("\n");
    sb.append("    oculusId: ").append(toIndentedString(oculusId)).append("\n");
    sb.append("    hasLoggedInFromClient: ").append(toIndentedString(hasLoggedInFromClient)).append("\n");
    sb.append("    homeLocation: ").append(toIndentedString(homeLocation)).append("\n");
    sb.append("    twoFactorAuthEnabled: ").append(toIndentedString(twoFactorAuthEnabled)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    developerType: ").append(toIndentedString(developerType)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    lastPlatform: ").append(toIndentedString(lastPlatform)).append("\n");
    sb.append("    allowAvatarCopying: ").append(toIndentedString(allowAvatarCopying)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateJoined: ").append(toIndentedString(dateJoined)).append("\n");
    sb.append("    isFriend: ").append(toIndentedString(isFriend)).append("\n");
    sb.append("    friendKey: ").append(toIndentedString(friendKey)).append("\n");
    sb.append("    onlineFriends: ").append(toIndentedString(onlineFriends)).append("\n");
    sb.append("    activeFriends: ").append(toIndentedString(activeFriends)).append("\n");
    sb.append("    offlineFriends: ").append(toIndentedString(offlineFriends)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

