/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.9
 * Contact: vrchatapi.lpv0t@aries.fyi
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
import io.github.vrchatapi.model.UserStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.github.vrchatapi.JSON;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LimitedUser {
  public static final String SERIALIZED_NAME_BIO = "bio";
  @SerializedName(SERIALIZED_NAME_BIO)
  private String bio;

  public static final String SERIALIZED_NAME_BIO_LINKS = "bioLinks";
  @SerializedName(SERIALIZED_NAME_BIO_LINKS)
  private List<String> bioLinks = null;

  public static final String SERIALIZED_NAME_CURRENT_AVATAR_IMAGE_URL = "currentAvatarImageUrl";
  @SerializedName(SERIALIZED_NAME_CURRENT_AVATAR_IMAGE_URL)
  private String currentAvatarImageUrl;

  public static final String SERIALIZED_NAME_CURRENT_AVATAR_THUMBNAIL_IMAGE_URL = "currentAvatarThumbnailImageUrl";
  @SerializedName(SERIALIZED_NAME_CURRENT_AVATAR_THUMBNAIL_IMAGE_URL)
  private String currentAvatarThumbnailImageUrl;

  public static final String SERIALIZED_NAME_CURRENT_AVATAR_TAGS = "currentAvatarTags";
  @SerializedName(SERIALIZED_NAME_CURRENT_AVATAR_TAGS)
  private List<String> currentAvatarTags = null;

  public static final String SERIALIZED_NAME_DEVELOPER_TYPE = "developerType";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_TYPE)
  private DeveloperType developerType = DeveloperType.NONE;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_FALLBACK_AVATAR = "fallbackAvatar";
  @SerializedName(SERIALIZED_NAME_FALLBACK_AVATAR)
  private String fallbackAvatar;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_FRIEND = "isFriend";
  @SerializedName(SERIALIZED_NAME_IS_FRIEND)
  private Boolean isFriend;

  public static final String SERIALIZED_NAME_LAST_PLATFORM = "last_platform";
  @SerializedName(SERIALIZED_NAME_LAST_PLATFORM)
  private String lastPlatform;

  public static final String SERIALIZED_NAME_LAST_LOGIN = "last_login";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN)
  private OffsetDateTime lastLogin;

  public static final String SERIALIZED_NAME_PROFILE_PIC_OVERRIDE = "profilePicOverride";
  @SerializedName(SERIALIZED_NAME_PROFILE_PIC_OVERRIDE)
  private String profilePicOverride;

  public static final String SERIALIZED_NAME_PRONOUNS = "pronouns";
  @SerializedName(SERIALIZED_NAME_PRONOUNS)
  private String pronouns;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private UserStatus status = UserStatus.OFFLINE;

  public static final String SERIALIZED_NAME_STATUS_DESCRIPTION = "statusDescription";
  @SerializedName(SERIALIZED_NAME_STATUS_DESCRIPTION)
  private String statusDescription;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_ICON = "userIcon";
  @SerializedName(SERIALIZED_NAME_USER_ICON)
  private String userIcon;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_FRIEND_KEY = "friendKey";
  @SerializedName(SERIALIZED_NAME_FRIEND_KEY)
  private String friendKey;

  public LimitedUser() {
  }

  public LimitedUser bio(String bio) {
    
    this.bio = bio;
    return this;
  }

   /**
   * Get bio
   * @return bio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBio() {
    return bio;
  }


  public void setBio(String bio) {
    this.bio = bio;
  }


  public LimitedUser bioLinks(List<String> bioLinks) {
    
    this.bioLinks = bioLinks;
    return this;
  }

  public LimitedUser addBioLinksItem(String bioLinksItem) {
    if (this.bioLinks == null) {
      this.bioLinks = new ArrayList<>();
    }
    this.bioLinks.add(bioLinksItem);
    return this;
  }

   /**
   *  
   * @return bioLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " ")

  public List<String> getBioLinks() {
    return bioLinks;
  }


  public void setBioLinks(List<String> bioLinks) {
    this.bioLinks = bioLinks;
  }


  public LimitedUser currentAvatarImageUrl(String currentAvatarImageUrl) {
    
    this.currentAvatarImageUrl = currentAvatarImageUrl;
    return this;
  }

   /**
   * When profilePicOverride is not empty, use it instead.
   * @return currentAvatarImageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.vrchat.cloud/api/1/file/file_ae46d521-7281-4b38-b365-804b32a1d6a7/1/file", value = "When profilePicOverride is not empty, use it instead.")

  public String getCurrentAvatarImageUrl() {
    return currentAvatarImageUrl;
  }


  public void setCurrentAvatarImageUrl(String currentAvatarImageUrl) {
    this.currentAvatarImageUrl = currentAvatarImageUrl;
  }


  public LimitedUser currentAvatarThumbnailImageUrl(String currentAvatarThumbnailImageUrl) {
    
    this.currentAvatarThumbnailImageUrl = currentAvatarThumbnailImageUrl;
    return this;
  }

   /**
   * When profilePicOverride is not empty, use it instead.
   * @return currentAvatarThumbnailImageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.vrchat.cloud/api/1/image/file_aae83ed9-d42d-4d72-9f4b-9f1e41ed17e1/1/256", value = "When profilePicOverride is not empty, use it instead.")

  public String getCurrentAvatarThumbnailImageUrl() {
    return currentAvatarThumbnailImageUrl;
  }


  public void setCurrentAvatarThumbnailImageUrl(String currentAvatarThumbnailImageUrl) {
    this.currentAvatarThumbnailImageUrl = currentAvatarThumbnailImageUrl;
  }


  public LimitedUser currentAvatarTags(List<String> currentAvatarTags) {
    
    this.currentAvatarTags = currentAvatarTags;
    return this;
  }

  public LimitedUser addCurrentAvatarTagsItem(String currentAvatarTagsItem) {
    if (this.currentAvatarTags == null) {
      this.currentAvatarTags = new ArrayList<>();
    }
    this.currentAvatarTags.add(currentAvatarTagsItem);
    return this;
  }

   /**
   * Get currentAvatarTags
   * @return currentAvatarTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCurrentAvatarTags() {
    return currentAvatarTags;
  }


  public void setCurrentAvatarTags(List<String> currentAvatarTags) {
    this.currentAvatarTags = currentAvatarTags;
  }


  public LimitedUser developerType(DeveloperType developerType) {
    
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


  public LimitedUser displayName(String displayName) {
    
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


  public LimitedUser fallbackAvatar(String fallbackAvatar) {
    
    this.fallbackAvatar = fallbackAvatar;
    return this;
  }

   /**
   * Get fallbackAvatar
   * @return fallbackAvatar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "avtr_912d66a4-4714-43b8-8407-7de2cafbf55b", value = "")

  public String getFallbackAvatar() {
    return fallbackAvatar;
  }


  public void setFallbackAvatar(String fallbackAvatar) {
    this.fallbackAvatar = fallbackAvatar;
  }


  public LimitedUser id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LimitedUser isFriend(Boolean isFriend) {
    
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


  public LimitedUser lastPlatform(String lastPlatform) {
    
    this.lastPlatform = lastPlatform;
    return this;
  }

   /**
   * This can be &#x60;standalonewindows&#x60; or &#x60;android&#x60;, but can also pretty much be any random Unity verison such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;.
   * @return lastPlatform
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "standalonewindows", required = true, value = "This can be `standalonewindows` or `android`, but can also pretty much be any random Unity verison such as `2019.2.4-801-Release` or `2019.2.2-772-Release` or even `unknownplatform`.")

  public String getLastPlatform() {
    return lastPlatform;
  }


  public void setLastPlatform(String lastPlatform) {
    this.lastPlatform = lastPlatform;
  }


  public LimitedUser lastLogin(OffsetDateTime lastLogin) {
    
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastLogin() {
    return lastLogin;
  }


  public void setLastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }


  public LimitedUser profilePicOverride(String profilePicOverride) {
    
    this.profilePicOverride = profilePicOverride;
    return this;
  }

   /**
   * Get profilePicOverride
   * @return profilePicOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProfilePicOverride() {
    return profilePicOverride;
  }


  public void setProfilePicOverride(String profilePicOverride) {
    this.profilePicOverride = profilePicOverride;
  }


  public LimitedUser pronouns(String pronouns) {
    
    this.pronouns = pronouns;
    return this;
  }

   /**
   * Get pronouns
   * @return pronouns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPronouns() {
    return pronouns;
  }


  public void setPronouns(String pronouns) {
    this.pronouns = pronouns;
  }


  public LimitedUser status(UserStatus status) {
    
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


  public LimitedUser statusDescription(String statusDescription) {
    
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


  public LimitedUser tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public LimitedUser addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * &lt;- Always empty.
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<- Always empty.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public LimitedUser userIcon(String userIcon) {
    
    this.userIcon = userIcon;
    return this;
  }

   /**
   * Get userIcon
   * @return userIcon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserIcon() {
    return userIcon;
  }


  public void setUserIcon(String userIcon) {
    this.userIcon = userIcon;
  }


  public LimitedUser username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * -| **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429).
   * @return username
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "-| **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429).")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public LimitedUser location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public LimitedUser friendKey(String friendKey) {
    
    this.friendKey = friendKey;
    return this;
  }

   /**
   * Get friendKey
   * @return friendKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFriendKey() {
    return friendKey;
  }


  public void setFriendKey(String friendKey) {
    this.friendKey = friendKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitedUser limitedUser = (LimitedUser) o;
    return Objects.equals(this.bio, limitedUser.bio) &&
        Objects.equals(this.bioLinks, limitedUser.bioLinks) &&
        Objects.equals(this.currentAvatarImageUrl, limitedUser.currentAvatarImageUrl) &&
        Objects.equals(this.currentAvatarThumbnailImageUrl, limitedUser.currentAvatarThumbnailImageUrl) &&
        Objects.equals(this.currentAvatarTags, limitedUser.currentAvatarTags) &&
        Objects.equals(this.developerType, limitedUser.developerType) &&
        Objects.equals(this.displayName, limitedUser.displayName) &&
        Objects.equals(this.fallbackAvatar, limitedUser.fallbackAvatar) &&
        Objects.equals(this.id, limitedUser.id) &&
        Objects.equals(this.isFriend, limitedUser.isFriend) &&
        Objects.equals(this.lastPlatform, limitedUser.lastPlatform) &&
        Objects.equals(this.lastLogin, limitedUser.lastLogin) &&
        Objects.equals(this.profilePicOverride, limitedUser.profilePicOverride) &&
        Objects.equals(this.pronouns, limitedUser.pronouns) &&
        Objects.equals(this.status, limitedUser.status) &&
        Objects.equals(this.statusDescription, limitedUser.statusDescription) &&
        Objects.equals(this.tags, limitedUser.tags) &&
        Objects.equals(this.userIcon, limitedUser.userIcon) &&
        Objects.equals(this.username, limitedUser.username) &&
        Objects.equals(this.location, limitedUser.location) &&
        Objects.equals(this.friendKey, limitedUser.friendKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bio, bioLinks, currentAvatarImageUrl, currentAvatarThumbnailImageUrl, currentAvatarTags, developerType, displayName, fallbackAvatar, id, isFriend, lastPlatform, lastLogin, profilePicOverride, pronouns, status, statusDescription, tags, userIcon, username, location, friendKey);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitedUser {\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    bioLinks: ").append(toIndentedString(bioLinks)).append("\n");
    sb.append("    currentAvatarImageUrl: ").append(toIndentedString(currentAvatarImageUrl)).append("\n");
    sb.append("    currentAvatarThumbnailImageUrl: ").append(toIndentedString(currentAvatarThumbnailImageUrl)).append("\n");
    sb.append("    currentAvatarTags: ").append(toIndentedString(currentAvatarTags)).append("\n");
    sb.append("    developerType: ").append(toIndentedString(developerType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    fallbackAvatar: ").append(toIndentedString(fallbackAvatar)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFriend: ").append(toIndentedString(isFriend)).append("\n");
    sb.append("    lastPlatform: ").append(toIndentedString(lastPlatform)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    profilePicOverride: ").append(toIndentedString(profilePicOverride)).append("\n");
    sb.append("    pronouns: ").append(toIndentedString(pronouns)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    userIcon: ").append(toIndentedString(userIcon)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    friendKey: ").append(toIndentedString(friendKey)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("bio");
    openapiFields.add("bioLinks");
    openapiFields.add("currentAvatarImageUrl");
    openapiFields.add("currentAvatarThumbnailImageUrl");
    openapiFields.add("currentAvatarTags");
    openapiFields.add("developerType");
    openapiFields.add("displayName");
    openapiFields.add("fallbackAvatar");
    openapiFields.add("id");
    openapiFields.add("isFriend");
    openapiFields.add("last_platform");
    openapiFields.add("last_login");
    openapiFields.add("profilePicOverride");
    openapiFields.add("pronouns");
    openapiFields.add("status");
    openapiFields.add("statusDescription");
    openapiFields.add("tags");
    openapiFields.add("userIcon");
    openapiFields.add("username");
    openapiFields.add("location");
    openapiFields.add("friendKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("developerType");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("isFriend");
    openapiRequiredFields.add("last_platform");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("statusDescription");
    openapiRequiredFields.add("tags");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LimitedUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LimitedUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LimitedUser is not found in the empty JSON string", LimitedUser.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LimitedUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LimitedUser` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LimitedUser.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("bio") != null && !jsonObj.get("bio").isJsonNull()) && !jsonObj.get("bio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bio").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bioLinks") != null && !jsonObj.get("bioLinks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bioLinks` to be an array in the JSON string but got `%s`", jsonObj.get("bioLinks").toString()));
      }
      if ((jsonObj.get("currentAvatarImageUrl") != null && !jsonObj.get("currentAvatarImageUrl").isJsonNull()) && !jsonObj.get("currentAvatarImageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentAvatarImageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentAvatarImageUrl").toString()));
      }
      if ((jsonObj.get("currentAvatarThumbnailImageUrl") != null && !jsonObj.get("currentAvatarThumbnailImageUrl").isJsonNull()) && !jsonObj.get("currentAvatarThumbnailImageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentAvatarThumbnailImageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentAvatarThumbnailImageUrl").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("currentAvatarTags") != null && !jsonObj.get("currentAvatarTags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentAvatarTags` to be an array in the JSON string but got `%s`", jsonObj.get("currentAvatarTags").toString()));
      }
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("fallbackAvatar") != null && !jsonObj.get("fallbackAvatar").isJsonNull()) && !jsonObj.get("fallbackAvatar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fallbackAvatar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fallbackAvatar").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("last_platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_platform").toString()));
      }
      if ((jsonObj.get("profilePicOverride") != null && !jsonObj.get("profilePicOverride").isJsonNull()) && !jsonObj.get("profilePicOverride").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profilePicOverride` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profilePicOverride").toString()));
      }
      if ((jsonObj.get("pronouns") != null && !jsonObj.get("pronouns").isJsonNull()) && !jsonObj.get("pronouns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pronouns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pronouns").toString()));
      }
      if (!jsonObj.get("statusDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusDescription").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tags") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("userIcon") != null && !jsonObj.get("userIcon").isJsonNull()) && !jsonObj.get("userIcon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userIcon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userIcon").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("friendKey") != null && !jsonObj.get("friendKey").isJsonNull()) && !jsonObj.get("friendKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `friendKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("friendKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LimitedUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LimitedUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LimitedUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LimitedUser.class));

       return (TypeAdapter<T>) new TypeAdapter<LimitedUser>() {
           @Override
           public void write(JsonWriter out, LimitedUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LimitedUser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LimitedUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LimitedUser
  * @throws IOException if the JSON string is invalid with respect to LimitedUser
  */
  public static LimitedUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LimitedUser.class);
  }

 /**
  * Convert an instance of LimitedUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

