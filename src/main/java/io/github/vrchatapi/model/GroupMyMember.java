/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.20.1
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
import io.github.vrchatapi.model.GroupPermissions;
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
 * GroupMyMember
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupMyMember {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_ROLE_IDS = "roleIds";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS)
  private List<String> roleIds = null;

  public static final String SERIALIZED_NAME_ACCEPTED_BY_DISPLAY_NAME = "acceptedByDisplayName";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_BY_DISPLAY_NAME)
  private String acceptedByDisplayName;

  public static final String SERIALIZED_NAME_ACCEPTED_BY_ID = "acceptedById";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_BY_ID)
  private String acceptedById;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_MANAGER_NOTES = "managerNotes";
  @SerializedName(SERIALIZED_NAME_MANAGER_NOTES)
  private String managerNotes;

  public static final String SERIALIZED_NAME_MEMBERSHIP_STATUS = "membershipStatus";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIP_STATUS)
  private String membershipStatus;

  public static final String SERIALIZED_NAME_IS_SUBSCRIBED_TO_ANNOUNCEMENTS = "isSubscribedToAnnouncements";
  @SerializedName(SERIALIZED_NAME_IS_SUBSCRIBED_TO_ANNOUNCEMENTS)
  private Boolean isSubscribedToAnnouncements = true;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private String visibility;

  public static final String SERIALIZED_NAME_IS_REPRESENTING = "isRepresenting";
  @SerializedName(SERIALIZED_NAME_IS_REPRESENTING)
  private Boolean isRepresenting = false;

  public static final String SERIALIZED_NAME_JOINED_AT = "joinedAt";
  @SerializedName(SERIALIZED_NAME_JOINED_AT)
  private OffsetDateTime joinedAt;

  public static final String SERIALIZED_NAME_BANNED_AT = "bannedAt";
  @SerializedName(SERIALIZED_NAME_BANNED_AT)
  private String bannedAt;

  public static final String SERIALIZED_NAME_HAS2_F_A = "has2FA";
  @SerializedName(SERIALIZED_NAME_HAS2_F_A)
  private Boolean has2FA = false;

  public static final String SERIALIZED_NAME_HAS_JOINED_FROM_PURCHASE = "hasJoinedFromPurchase";
  @SerializedName(SERIALIZED_NAME_HAS_JOINED_FROM_PURCHASE)
  private Boolean hasJoinedFromPurchase = false;

  public static final String SERIALIZED_NAME_LAST_POST_READ_AT = "lastPostReadAt";
  @SerializedName(SERIALIZED_NAME_LAST_POST_READ_AT)
  private OffsetDateTime lastPostReadAt;

  public static final String SERIALIZED_NAME_M_ROLE_IDS = "mRoleIds";
  @SerializedName(SERIALIZED_NAME_M_ROLE_IDS)
  private List<String> mRoleIds = null;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<GroupPermissions> permissions = null;

  public GroupMyMember() {
  }

  public GroupMyMember id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gmem_95cdb3b4-4643-4eb6-bdab-46a4e1e5ce37", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GroupMyMember groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "grp_71a7ff59-112c-4e78-a990-c7cc650776e5", value = "")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public GroupMyMember userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public GroupMyMember roleIds(List<String> roleIds) {
    
    this.roleIds = roleIds;
    return this;
  }

  public GroupMyMember addRoleIdsItem(String roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   * Get roleIds
   * @return roleIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRoleIds() {
    return roleIds;
  }


  public void setRoleIds(List<String> roleIds) {
    this.roleIds = roleIds;
  }


  public GroupMyMember acceptedByDisplayName(String acceptedByDisplayName) {
    
    this.acceptedByDisplayName = acceptedByDisplayName;
    return this;
  }

   /**
   * Get acceptedByDisplayName
   * @return acceptedByDisplayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAcceptedByDisplayName() {
    return acceptedByDisplayName;
  }


  public void setAcceptedByDisplayName(String acceptedByDisplayName) {
    this.acceptedByDisplayName = acceptedByDisplayName;
  }


  public GroupMyMember acceptedById(String acceptedById) {
    
    this.acceptedById = acceptedById;
    return this;
  }

   /**
   * Get acceptedById
   * @return acceptedById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAcceptedById() {
    return acceptedById;
  }


  public void setAcceptedById(String acceptedById) {
    this.acceptedById = acceptedById;
  }


  public GroupMyMember createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GroupMyMember managerNotes(String managerNotes) {
    
    this.managerNotes = managerNotes;
    return this;
  }

   /**
   * Get managerNotes
   * @return managerNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagerNotes() {
    return managerNotes;
  }


  public void setManagerNotes(String managerNotes) {
    this.managerNotes = managerNotes;
  }


  public GroupMyMember membershipStatus(String membershipStatus) {
    
    this.membershipStatus = membershipStatus;
    return this;
  }

   /**
   * Get membershipStatus
   * @return membershipStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "member", value = "")

  public String getMembershipStatus() {
    return membershipStatus;
  }


  public void setMembershipStatus(String membershipStatus) {
    this.membershipStatus = membershipStatus;
  }


  public GroupMyMember isSubscribedToAnnouncements(Boolean isSubscribedToAnnouncements) {
    
    this.isSubscribedToAnnouncements = isSubscribedToAnnouncements;
    return this;
  }

   /**
   * Get isSubscribedToAnnouncements
   * @return isSubscribedToAnnouncements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSubscribedToAnnouncements() {
    return isSubscribedToAnnouncements;
  }


  public void setIsSubscribedToAnnouncements(Boolean isSubscribedToAnnouncements) {
    this.isSubscribedToAnnouncements = isSubscribedToAnnouncements;
  }


  public GroupMyMember visibility(String visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "visible", value = "")

  public String getVisibility() {
    return visibility;
  }


  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }


  public GroupMyMember isRepresenting(Boolean isRepresenting) {
    
    this.isRepresenting = isRepresenting;
    return this;
  }

   /**
   * Get isRepresenting
   * @return isRepresenting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRepresenting() {
    return isRepresenting;
  }


  public void setIsRepresenting(Boolean isRepresenting) {
    this.isRepresenting = isRepresenting;
  }


  public GroupMyMember joinedAt(OffsetDateTime joinedAt) {
    
    this.joinedAt = joinedAt;
    return this;
  }

   /**
   * Get joinedAt
   * @return joinedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getJoinedAt() {
    return joinedAt;
  }


  public void setJoinedAt(OffsetDateTime joinedAt) {
    this.joinedAt = joinedAt;
  }


  public GroupMyMember bannedAt(String bannedAt) {
    
    this.bannedAt = bannedAt;
    return this;
  }

   /**
   * Get bannedAt
   * @return bannedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBannedAt() {
    return bannedAt;
  }


  public void setBannedAt(String bannedAt) {
    this.bannedAt = bannedAt;
  }


  public GroupMyMember has2FA(Boolean has2FA) {
    
    this.has2FA = has2FA;
    return this;
  }

   /**
   * Get has2FA
   * @return has2FA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHas2FA() {
    return has2FA;
  }


  public void setHas2FA(Boolean has2FA) {
    this.has2FA = has2FA;
  }


  public GroupMyMember hasJoinedFromPurchase(Boolean hasJoinedFromPurchase) {
    
    this.hasJoinedFromPurchase = hasJoinedFromPurchase;
    return this;
  }

   /**
   * Get hasJoinedFromPurchase
   * @return hasJoinedFromPurchase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasJoinedFromPurchase() {
    return hasJoinedFromPurchase;
  }


  public void setHasJoinedFromPurchase(Boolean hasJoinedFromPurchase) {
    this.hasJoinedFromPurchase = hasJoinedFromPurchase;
  }


  public GroupMyMember lastPostReadAt(OffsetDateTime lastPostReadAt) {
    
    this.lastPostReadAt = lastPostReadAt;
    return this;
  }

   /**
   * Get lastPostReadAt
   * @return lastPostReadAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastPostReadAt() {
    return lastPostReadAt;
  }


  public void setLastPostReadAt(OffsetDateTime lastPostReadAt) {
    this.lastPostReadAt = lastPostReadAt;
  }


  public GroupMyMember mRoleIds(List<String> mRoleIds) {
    
    this.mRoleIds = mRoleIds;
    return this;
  }

  public GroupMyMember addMRoleIdsItem(String mRoleIdsItem) {
    if (this.mRoleIds == null) {
      this.mRoleIds = new ArrayList<>();
    }
    this.mRoleIds.add(mRoleIdsItem);
    return this;
  }

   /**
   * Get mRoleIds
   * @return mRoleIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getmRoleIds() {
    return mRoleIds;
  }


  public void setmRoleIds(List<String> mRoleIds) {
    this.mRoleIds = mRoleIds;
  }


  public GroupMyMember permissions(List<GroupPermissions> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public GroupMyMember addPermissionsItem(GroupPermissions permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GroupPermissions> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<GroupPermissions> permissions) {
    this.permissions = permissions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMyMember groupMyMember = (GroupMyMember) o;
    return Objects.equals(this.id, groupMyMember.id) &&
        Objects.equals(this.groupId, groupMyMember.groupId) &&
        Objects.equals(this.userId, groupMyMember.userId) &&
        Objects.equals(this.roleIds, groupMyMember.roleIds) &&
        Objects.equals(this.acceptedByDisplayName, groupMyMember.acceptedByDisplayName) &&
        Objects.equals(this.acceptedById, groupMyMember.acceptedById) &&
        Objects.equals(this.createdAt, groupMyMember.createdAt) &&
        Objects.equals(this.managerNotes, groupMyMember.managerNotes) &&
        Objects.equals(this.membershipStatus, groupMyMember.membershipStatus) &&
        Objects.equals(this.isSubscribedToAnnouncements, groupMyMember.isSubscribedToAnnouncements) &&
        Objects.equals(this.visibility, groupMyMember.visibility) &&
        Objects.equals(this.isRepresenting, groupMyMember.isRepresenting) &&
        Objects.equals(this.joinedAt, groupMyMember.joinedAt) &&
        Objects.equals(this.bannedAt, groupMyMember.bannedAt) &&
        Objects.equals(this.has2FA, groupMyMember.has2FA) &&
        Objects.equals(this.hasJoinedFromPurchase, groupMyMember.hasJoinedFromPurchase) &&
        Objects.equals(this.lastPostReadAt, groupMyMember.lastPostReadAt) &&
        Objects.equals(this.mRoleIds, groupMyMember.mRoleIds) &&
        Objects.equals(this.permissions, groupMyMember.permissions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, userId, roleIds, acceptedByDisplayName, acceptedById, createdAt, managerNotes, membershipStatus, isSubscribedToAnnouncements, visibility, isRepresenting, joinedAt, bannedAt, has2FA, hasJoinedFromPurchase, lastPostReadAt, mRoleIds, permissions);
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
    sb.append("class GroupMyMember {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    acceptedByDisplayName: ").append(toIndentedString(acceptedByDisplayName)).append("\n");
    sb.append("    acceptedById: ").append(toIndentedString(acceptedById)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    managerNotes: ").append(toIndentedString(managerNotes)).append("\n");
    sb.append("    membershipStatus: ").append(toIndentedString(membershipStatus)).append("\n");
    sb.append("    isSubscribedToAnnouncements: ").append(toIndentedString(isSubscribedToAnnouncements)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    isRepresenting: ").append(toIndentedString(isRepresenting)).append("\n");
    sb.append("    joinedAt: ").append(toIndentedString(joinedAt)).append("\n");
    sb.append("    bannedAt: ").append(toIndentedString(bannedAt)).append("\n");
    sb.append("    has2FA: ").append(toIndentedString(has2FA)).append("\n");
    sb.append("    hasJoinedFromPurchase: ").append(toIndentedString(hasJoinedFromPurchase)).append("\n");
    sb.append("    lastPostReadAt: ").append(toIndentedString(lastPostReadAt)).append("\n");
    sb.append("    mRoleIds: ").append(toIndentedString(mRoleIds)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("groupId");
    openapiFields.add("userId");
    openapiFields.add("roleIds");
    openapiFields.add("acceptedByDisplayName");
    openapiFields.add("acceptedById");
    openapiFields.add("createdAt");
    openapiFields.add("managerNotes");
    openapiFields.add("membershipStatus");
    openapiFields.add("isSubscribedToAnnouncements");
    openapiFields.add("visibility");
    openapiFields.add("isRepresenting");
    openapiFields.add("joinedAt");
    openapiFields.add("bannedAt");
    openapiFields.add("has2FA");
    openapiFields.add("hasJoinedFromPurchase");
    openapiFields.add("lastPostReadAt");
    openapiFields.add("mRoleIds");
    openapiFields.add("permissions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupMyMember
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GroupMyMember.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupMyMember is not found in the empty JSON string", GroupMyMember.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupMyMember.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupMyMember` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("groupId") != null && !jsonObj.get("groupId").isJsonNull()) && !jsonObj.get("groupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roleIds") != null && !jsonObj.get("roleIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleIds` to be an array in the JSON string but got `%s`", jsonObj.get("roleIds").toString()));
      }
      if ((jsonObj.get("acceptedByDisplayName") != null && !jsonObj.get("acceptedByDisplayName").isJsonNull()) && !jsonObj.get("acceptedByDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acceptedByDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acceptedByDisplayName").toString()));
      }
      if ((jsonObj.get("acceptedById") != null && !jsonObj.get("acceptedById").isJsonNull()) && !jsonObj.get("acceptedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acceptedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acceptedById").toString()));
      }
      if ((jsonObj.get("managerNotes") != null && !jsonObj.get("managerNotes").isJsonNull()) && !jsonObj.get("managerNotes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `managerNotes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("managerNotes").toString()));
      }
      if ((jsonObj.get("membershipStatus") != null && !jsonObj.get("membershipStatus").isJsonNull()) && !jsonObj.get("membershipStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `membershipStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("membershipStatus").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      if ((jsonObj.get("bannedAt") != null && !jsonObj.get("bannedAt").isJsonNull()) && !jsonObj.get("bannedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bannedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bannedAt").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("mRoleIds") != null && !jsonObj.get("mRoleIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mRoleIds` to be an array in the JSON string but got `%s`", jsonObj.get("mRoleIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupMyMember.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupMyMember' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupMyMember> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupMyMember.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupMyMember>() {
           @Override
           public void write(JsonWriter out, GroupMyMember value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupMyMember read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupMyMember given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupMyMember
  * @throws IOException if the JSON string is invalid with respect to GroupMyMember
  */
  public static GroupMyMember fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupMyMember.class);
  }

 /**
  * Convert an instance of GroupMyMember to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

