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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-23T12:06:12.536997800+02:00[Europe/Stockholm]")
public class User {
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

  public static final String SERIALIZED_NAME_CURRENT_AVATAR_IMAGE_URL = "currentAvatarImageUrl";
  @SerializedName(SERIALIZED_NAME_CURRENT_AVATAR_IMAGE_URL)
  private String currentAvatarImageUrl;

  public static final String SERIALIZED_NAME_CURRENT_AVATAR_THUMBNAIL_IMAGE_URL = "currentAvatarThumbnailImageUrl";
  @SerializedName(SERIALIZED_NAME_CURRENT_AVATAR_THUMBNAIL_IMAGE_URL)
  private String currentAvatarThumbnailImageUrl;

  public static final String SERIALIZED_NAME_FALLBACK_AVATAR = "fallbackAvatar";
  @SerializedName(SERIALIZED_NAME_FALLBACK_AVATAR)
  private String fallbackAvatar;

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
  private String lastLogin;

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
  private Boolean isFriend;

  public static final String SERIALIZED_NAME_FRIEND_KEY = "friendKey";
  @SerializedName(SERIALIZED_NAME_FRIEND_KEY)
  private String friendKey;

  public static final String SERIALIZED_NAME_WORLD_ID = "worldId";
  @SerializedName(SERIALIZED_NAME_WORLD_ID)
  private String worldId;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instanceId";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private String instanceId;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "")

  public String getId() {
    return id;
  }




  public User username(String username) {
    
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


  public User displayName(String displayName) {
    
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


  public User userIcon(String userIcon) {
    
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


  public User bio(String bio) {
    
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


  public User bioLinks(List<String> bioLinks) {
    
    this.bioLinks = bioLinks;
    return this;
  }

  public User addBioLinksItem(String bioLinksItem) {
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


  public User profilePicOverride(String profilePicOverride) {
    
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


  public User statusDescription(String statusDescription) {
    
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


  public User currentAvatarImageUrl(String currentAvatarImageUrl) {
    
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


  public User currentAvatarThumbnailImageUrl(String currentAvatarThumbnailImageUrl) {
    
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


  public User fallbackAvatar(String fallbackAvatar) {
    
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


  public User state(UserState state) {
    
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


  public User tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public User addTagsItem(String tagsItem) {
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


  public User developerType(DeveloperType developerType) {
    
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


  public User lastLogin(String lastLogin) {
    
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLastLogin() {
    return lastLogin;
  }


  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }


  public User lastPlatform(Platform lastPlatform) {
    
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


  public User allowAvatarCopying(Boolean allowAvatarCopying) {
    
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


  public User status(UserStatus status) {
    
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




  public User isFriend(Boolean isFriend) {
    
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


  public User friendKey(String friendKey) {
    
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


  public User worldId(String worldId) {
    
    this.worldId = worldId;
    return this;
  }

   /**
   * Get worldId
   * @return worldId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", required = true, value = "")

  public String getWorldId() {
    return worldId;
  }


  public void setWorldId(String worldId) {
    this.worldId = worldId;
  }


  public User instanceId(String instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  public User location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.userIcon, user.userIcon) &&
        Objects.equals(this.bio, user.bio) &&
        Objects.equals(this.bioLinks, user.bioLinks) &&
        Objects.equals(this.profilePicOverride, user.profilePicOverride) &&
        Objects.equals(this.statusDescription, user.statusDescription) &&
        Objects.equals(this.currentAvatarImageUrl, user.currentAvatarImageUrl) &&
        Objects.equals(this.currentAvatarThumbnailImageUrl, user.currentAvatarThumbnailImageUrl) &&
        Objects.equals(this.fallbackAvatar, user.fallbackAvatar) &&
        Objects.equals(this.state, user.state) &&
        Objects.equals(this.tags, user.tags) &&
        Objects.equals(this.developerType, user.developerType) &&
        Objects.equals(this.lastLogin, user.lastLogin) &&
        Objects.equals(this.lastPlatform, user.lastPlatform) &&
        Objects.equals(this.allowAvatarCopying, user.allowAvatarCopying) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.dateJoined, user.dateJoined) &&
        Objects.equals(this.isFriend, user.isFriend) &&
        Objects.equals(this.friendKey, user.friendKey) &&
        Objects.equals(this.worldId, user.worldId) &&
        Objects.equals(this.instanceId, user.instanceId) &&
        Objects.equals(this.location, user.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, displayName, userIcon, bio, bioLinks, profilePicOverride, statusDescription, currentAvatarImageUrl, currentAvatarThumbnailImageUrl, fallbackAvatar, state, tags, developerType, lastLogin, lastPlatform, allowAvatarCopying, status, dateJoined, isFriend, friendKey, worldId, instanceId, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    userIcon: ").append(toIndentedString(userIcon)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    bioLinks: ").append(toIndentedString(bioLinks)).append("\n");
    sb.append("    profilePicOverride: ").append(toIndentedString(profilePicOverride)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    currentAvatarImageUrl: ").append(toIndentedString(currentAvatarImageUrl)).append("\n");
    sb.append("    currentAvatarThumbnailImageUrl: ").append(toIndentedString(currentAvatarThumbnailImageUrl)).append("\n");
    sb.append("    fallbackAvatar: ").append(toIndentedString(fallbackAvatar)).append("\n");
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
    sb.append("    worldId: ").append(toIndentedString(worldId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

