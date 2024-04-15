/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.17.0
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
import io.github.vrchatapi.model.GroupMemberLimitedUser;
import io.github.vrchatapi.model.GroupMemberStatus;
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
 * GroupMember
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupMember {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_IS_REPRESENTING = "isRepresenting";
  @SerializedName(SERIALIZED_NAME_IS_REPRESENTING)
  private Boolean isRepresenting = false;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private GroupMemberLimitedUser user;

  public static final String SERIALIZED_NAME_ROLE_IDS = "roleIds";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS)
  private List<String> roleIds = null;

  public static final String SERIALIZED_NAME_M_ROLE_IDS = "mRoleIds";
  @SerializedName(SERIALIZED_NAME_M_ROLE_IDS)
  private List<String> mRoleIds = null;

  public static final String SERIALIZED_NAME_JOINED_AT = "joinedAt";
  @SerializedName(SERIALIZED_NAME_JOINED_AT)
  private OffsetDateTime joinedAt;

  public static final String SERIALIZED_NAME_MEMBERSHIP_STATUS = "membershipStatus";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIP_STATUS)
  private GroupMemberStatus membershipStatus = GroupMemberStatus.INACTIVE;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private String visibility;

  public static final String SERIALIZED_NAME_IS_SUBSCRIBED_TO_ANNOUNCEMENTS = "isSubscribedToAnnouncements";
  @SerializedName(SERIALIZED_NAME_IS_SUBSCRIBED_TO_ANNOUNCEMENTS)
  private Boolean isSubscribedToAnnouncements = false;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_BANNED_AT = "bannedAt";
  @SerializedName(SERIALIZED_NAME_BANNED_AT)
  private OffsetDateTime bannedAt;

  public static final String SERIALIZED_NAME_MANAGER_NOTES = "managerNotes";
  @SerializedName(SERIALIZED_NAME_MANAGER_NOTES)
  private String managerNotes;

  public static final String SERIALIZED_NAME_LAST_POST_READ_AT = "lastPostReadAt";
  @SerializedName(SERIALIZED_NAME_LAST_POST_READ_AT)
  private OffsetDateTime lastPostReadAt;

  public static final String SERIALIZED_NAME_HAS_JOINED_FROM_PURCHASE = "hasJoinedFromPurchase";
  @SerializedName(SERIALIZED_NAME_HAS_JOINED_FROM_PURCHASE)
  private Boolean hasJoinedFromPurchase;

  public GroupMember() {
  }

  public GroupMember id(String id) {
    
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


  public GroupMember groupId(String groupId) {
    
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


  public GroupMember userId(String userId) {
    
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


  public GroupMember isRepresenting(Boolean isRepresenting) {
    
    this.isRepresenting = isRepresenting;
    return this;
  }

   /**
   * Whether the user is representing the group. This makes the group show up above the name tag in-game.
   * @return isRepresenting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the user is representing the group. This makes the group show up above the name tag in-game.")

  public Boolean getIsRepresenting() {
    return isRepresenting;
  }


  public void setIsRepresenting(Boolean isRepresenting) {
    this.isRepresenting = isRepresenting;
  }


  public GroupMember user(GroupMemberLimitedUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupMemberLimitedUser getUser() {
    return user;
  }


  public void setUser(GroupMemberLimitedUser user) {
    this.user = user;
  }


  public GroupMember roleIds(List<String> roleIds) {
    
    this.roleIds = roleIds;
    return this;
  }

  public GroupMember addRoleIdsItem(String roleIdsItem) {
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


  public GroupMember mRoleIds(List<String> mRoleIds) {
    
    this.mRoleIds = mRoleIds;
    return this;
  }

  public GroupMember addMRoleIdsItem(String mRoleIdsItem) {
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


  public GroupMember joinedAt(OffsetDateTime joinedAt) {
    
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


  public GroupMember membershipStatus(GroupMemberStatus membershipStatus) {
    
    this.membershipStatus = membershipStatus;
    return this;
  }

   /**
   * Get membershipStatus
   * @return membershipStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupMemberStatus getMembershipStatus() {
    return membershipStatus;
  }


  public void setMembershipStatus(GroupMemberStatus membershipStatus) {
    this.membershipStatus = membershipStatus;
  }


  public GroupMember visibility(String visibility) {
    
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


  public GroupMember isSubscribedToAnnouncements(Boolean isSubscribedToAnnouncements) {
    
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


  public GroupMember createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GroupMember bannedAt(OffsetDateTime bannedAt) {
    
    this.bannedAt = bannedAt;
    return this;
  }

   /**
   * Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user.
   * @return bannedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user.")

  public OffsetDateTime getBannedAt() {
    return bannedAt;
  }


  public void setBannedAt(OffsetDateTime bannedAt) {
    this.bannedAt = bannedAt;
  }


  public GroupMember managerNotes(String managerNotes) {
    
    this.managerNotes = managerNotes;
    return this;
  }

   /**
   * Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user.
   * @return managerNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user.")

  public String getManagerNotes() {
    return managerNotes;
  }


  public void setManagerNotes(String managerNotes) {
    this.managerNotes = managerNotes;
  }


  public GroupMember lastPostReadAt(OffsetDateTime lastPostReadAt) {
    
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


  public GroupMember hasJoinedFromPurchase(Boolean hasJoinedFromPurchase) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMember groupMember = (GroupMember) o;
    return Objects.equals(this.id, groupMember.id) &&
        Objects.equals(this.groupId, groupMember.groupId) &&
        Objects.equals(this.userId, groupMember.userId) &&
        Objects.equals(this.isRepresenting, groupMember.isRepresenting) &&
        Objects.equals(this.user, groupMember.user) &&
        Objects.equals(this.roleIds, groupMember.roleIds) &&
        Objects.equals(this.mRoleIds, groupMember.mRoleIds) &&
        Objects.equals(this.joinedAt, groupMember.joinedAt) &&
        Objects.equals(this.membershipStatus, groupMember.membershipStatus) &&
        Objects.equals(this.visibility, groupMember.visibility) &&
        Objects.equals(this.isSubscribedToAnnouncements, groupMember.isSubscribedToAnnouncements) &&
        Objects.equals(this.createdAt, groupMember.createdAt) &&
        Objects.equals(this.bannedAt, groupMember.bannedAt) &&
        Objects.equals(this.managerNotes, groupMember.managerNotes) &&
        Objects.equals(this.lastPostReadAt, groupMember.lastPostReadAt) &&
        Objects.equals(this.hasJoinedFromPurchase, groupMember.hasJoinedFromPurchase);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, userId, isRepresenting, user, roleIds, mRoleIds, joinedAt, membershipStatus, visibility, isSubscribedToAnnouncements, createdAt, bannedAt, managerNotes, lastPostReadAt, hasJoinedFromPurchase);
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
    sb.append("class GroupMember {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    isRepresenting: ").append(toIndentedString(isRepresenting)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    mRoleIds: ").append(toIndentedString(mRoleIds)).append("\n");
    sb.append("    joinedAt: ").append(toIndentedString(joinedAt)).append("\n");
    sb.append("    membershipStatus: ").append(toIndentedString(membershipStatus)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    isSubscribedToAnnouncements: ").append(toIndentedString(isSubscribedToAnnouncements)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    bannedAt: ").append(toIndentedString(bannedAt)).append("\n");
    sb.append("    managerNotes: ").append(toIndentedString(managerNotes)).append("\n");
    sb.append("    lastPostReadAt: ").append(toIndentedString(lastPostReadAt)).append("\n");
    sb.append("    hasJoinedFromPurchase: ").append(toIndentedString(hasJoinedFromPurchase)).append("\n");
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
    openapiFields.add("isRepresenting");
    openapiFields.add("user");
    openapiFields.add("roleIds");
    openapiFields.add("mRoleIds");
    openapiFields.add("joinedAt");
    openapiFields.add("membershipStatus");
    openapiFields.add("visibility");
    openapiFields.add("isSubscribedToAnnouncements");
    openapiFields.add("createdAt");
    openapiFields.add("bannedAt");
    openapiFields.add("managerNotes");
    openapiFields.add("lastPostReadAt");
    openapiFields.add("hasJoinedFromPurchase");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupMember
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GroupMember.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupMember is not found in the empty JSON string", GroupMember.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupMember.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupMember` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        GroupMemberLimitedUser.validateJsonObject(jsonObj.getAsJsonObject("user"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roleIds") != null && !jsonObj.get("roleIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleIds` to be an array in the JSON string but got `%s`", jsonObj.get("roleIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("mRoleIds") != null && !jsonObj.get("mRoleIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mRoleIds` to be an array in the JSON string but got `%s`", jsonObj.get("mRoleIds").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      if ((jsonObj.get("managerNotes") != null && !jsonObj.get("managerNotes").isJsonNull()) && !jsonObj.get("managerNotes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `managerNotes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("managerNotes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupMember.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupMember' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupMember> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupMember.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupMember>() {
           @Override
           public void write(JsonWriter out, GroupMember value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupMember read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupMember given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupMember
  * @throws IOException if the JSON string is invalid with respect to GroupMember
  */
  public static GroupMember fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupMember.class);
  }

 /**
  * Convert an instance of GroupMember to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

