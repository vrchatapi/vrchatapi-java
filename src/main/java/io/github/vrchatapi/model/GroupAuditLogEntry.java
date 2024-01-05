/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.16.2
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * GroupAuditLogEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupAuditLogEntry {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_ACTOR_ID = "actorId";
  @SerializedName(SERIALIZED_NAME_ACTOR_ID)
  private String actorId;

  public static final String SERIALIZED_NAME_ACTOR_DISPLAYNAME = "actorDisplayname";
  @SerializedName(SERIALIZED_NAME_ACTOR_DISPLAYNAME)
  private String actorDisplayname;

  public static final String SERIALIZED_NAME_TARGET_ID = "targetId";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType = "group.update";

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public GroupAuditLogEntry() {
  }

  public GroupAuditLogEntry id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gaud_71a7ff59-112c-4e78-a990-c7cc650776e5", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GroupAuditLogEntry createdAt(OffsetDateTime createdAt) {
    
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


  public GroupAuditLogEntry groupId(String groupId) {
    
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


  public GroupAuditLogEntry actorId(String actorId) {
    
    this.actorId = actorId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return actorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getActorId() {
    return actorId;
  }


  public void setActorId(String actorId) {
    this.actorId = actorId;
  }


  public GroupAuditLogEntry actorDisplayname(String actorDisplayname) {
    
    this.actorDisplayname = actorDisplayname;
    return this;
  }

   /**
   * Get actorDisplayname
   * @return actorDisplayname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActorDisplayname() {
    return actorDisplayname;
  }


  public void setActorDisplayname(String actorDisplayname) {
    this.actorDisplayname = actorDisplayname;
  }


  public GroupAuditLogEntry targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * Typically GroupID or GroupRoleID, but could be other types of IDs.
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typically GroupID or GroupRoleID, but could be other types of IDs.")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public GroupAuditLogEntry eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of event that occurred. This is a string that is prefixed with the type of object that the event occurred on. For example, a group role update event would be prefixed with &#x60;group.role&#x60;.
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "group.role.update", value = "The type of event that occurred. This is a string that is prefixed with the type of object that the event occurred on. For example, a group role update event would be prefixed with `group.role`.")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public GroupAuditLogEntry description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A human-readable description of the event.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Group role updated", value = "A human-readable description of the event.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GroupAuditLogEntry data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * The data associated with the event. The format of this data is dependent on the event type.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"description\":{\"old\":\"My exciting new group.  It's pretty nifty!\",\"new\":\"My exciting new group. It's pretty nifty!\"},\"joinState\":{\"old\":\"closed\",\"new\":\"request\"}}", value = "The data associated with the event. The format of this data is dependent on the event type.")

  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupAuditLogEntry groupAuditLogEntry = (GroupAuditLogEntry) o;
    return Objects.equals(this.id, groupAuditLogEntry.id) &&
        Objects.equals(this.createdAt, groupAuditLogEntry.createdAt) &&
        Objects.equals(this.groupId, groupAuditLogEntry.groupId) &&
        Objects.equals(this.actorId, groupAuditLogEntry.actorId) &&
        Objects.equals(this.actorDisplayname, groupAuditLogEntry.actorDisplayname) &&
        Objects.equals(this.targetId, groupAuditLogEntry.targetId) &&
        Objects.equals(this.eventType, groupAuditLogEntry.eventType) &&
        Objects.equals(this.description, groupAuditLogEntry.description) &&
        Objects.equals(this.data, groupAuditLogEntry.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, groupId, actorId, actorDisplayname, targetId, eventType, description, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupAuditLogEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    actorId: ").append(toIndentedString(actorId)).append("\n");
    sb.append("    actorDisplayname: ").append(toIndentedString(actorDisplayname)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("groupId");
    openapiFields.add("actorId");
    openapiFields.add("actorDisplayname");
    openapiFields.add("targetId");
    openapiFields.add("eventType");
    openapiFields.add("description");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupAuditLogEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GroupAuditLogEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupAuditLogEntry is not found in the empty JSON string", GroupAuditLogEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupAuditLogEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupAuditLogEntry` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("groupId") != null && !jsonObj.get("groupId").isJsonNull()) && !jsonObj.get("groupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
      if ((jsonObj.get("actorId") != null && !jsonObj.get("actorId").isJsonNull()) && !jsonObj.get("actorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actorId").toString()));
      }
      if ((jsonObj.get("actorDisplayname") != null && !jsonObj.get("actorDisplayname").isJsonNull()) && !jsonObj.get("actorDisplayname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actorDisplayname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actorDisplayname").toString()));
      }
      if ((jsonObj.get("targetId") != null && !jsonObj.get("targetId").isJsonNull()) && !jsonObj.get("targetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetId").toString()));
      }
      if ((jsonObj.get("eventType") != null && !jsonObj.get("eventType").isJsonNull()) && !jsonObj.get("eventType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventType").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupAuditLogEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupAuditLogEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupAuditLogEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupAuditLogEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupAuditLogEntry>() {
           @Override
           public void write(JsonWriter out, GroupAuditLogEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupAuditLogEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupAuditLogEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupAuditLogEntry
  * @throws IOException if the JSON string is invalid with respect to GroupAuditLogEntry
  */
  public static GroupAuditLogEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupAuditLogEntry.class);
  }

 /**
  * Convert an instance of GroupAuditLogEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

