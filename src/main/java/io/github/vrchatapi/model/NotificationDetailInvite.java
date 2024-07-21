/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.0
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
 * NotificationDetailInvite
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotificationDetailInvite {
  public static final String SERIALIZED_NAME_INVITE_MESSAGE = "inviteMessage";
  @SerializedName(SERIALIZED_NAME_INVITE_MESSAGE)
  private String inviteMessage;

  public static final String SERIALIZED_NAME_WORLD_ID = "worldId";
  @SerializedName(SERIALIZED_NAME_WORLD_ID)
  private String worldId;

  public static final String SERIALIZED_NAME_WORLD_NAME = "worldName";
  @SerializedName(SERIALIZED_NAME_WORLD_NAME)
  private String worldName;

  public NotificationDetailInvite() {
  }

  public NotificationDetailInvite inviteMessage(String inviteMessage) {
    
    this.inviteMessage = inviteMessage;
    return this;
  }

   /**
   * Get inviteMessage
   * @return inviteMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInviteMessage() {
    return inviteMessage;
  }


  public void setInviteMessage(String inviteMessage) {
    this.inviteMessage = inviteMessage;
  }


  public NotificationDetailInvite worldId(String worldId) {
    
    this.worldId = worldId;
    return this;
  }

   /**
   * WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user.
   * @return worldId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", required = true, value = "WorldID be \"offline\" on User profiles if you are not friends with that user.")

  public String getWorldId() {
    return worldId;
  }


  public void setWorldId(String worldId) {
    this.worldId = worldId;
  }


  public NotificationDetailInvite worldName(String worldName) {
    
    this.worldName = worldName;
    return this;
  }

   /**
   * Get worldName
   * @return worldName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getWorldName() {
    return worldName;
  }


  public void setWorldName(String worldName) {
    this.worldName = worldName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationDetailInvite notificationDetailInvite = (NotificationDetailInvite) o;
    return Objects.equals(this.inviteMessage, notificationDetailInvite.inviteMessage) &&
        Objects.equals(this.worldId, notificationDetailInvite.worldId) &&
        Objects.equals(this.worldName, notificationDetailInvite.worldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteMessage, worldId, worldName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationDetailInvite {\n");
    sb.append("    inviteMessage: ").append(toIndentedString(inviteMessage)).append("\n");
    sb.append("    worldId: ").append(toIndentedString(worldId)).append("\n");
    sb.append("    worldName: ").append(toIndentedString(worldName)).append("\n");
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
    openapiFields.add("inviteMessage");
    openapiFields.add("worldId");
    openapiFields.add("worldName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("worldId");
    openapiRequiredFields.add("worldName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NotificationDetailInvite
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NotificationDetailInvite.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotificationDetailInvite is not found in the empty JSON string", NotificationDetailInvite.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NotificationDetailInvite.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotificationDetailInvite` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NotificationDetailInvite.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("inviteMessage") != null && !jsonObj.get("inviteMessage").isJsonNull()) && !jsonObj.get("inviteMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inviteMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inviteMessage").toString()));
      }
      if (!jsonObj.get("worldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worldId").toString()));
      }
      if (!jsonObj.get("worldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worldName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationDetailInvite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationDetailInvite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationDetailInvite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationDetailInvite.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationDetailInvite>() {
           @Override
           public void write(JsonWriter out, NotificationDetailInvite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationDetailInvite read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NotificationDetailInvite given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotificationDetailInvite
  * @throws IOException if the JSON string is invalid with respect to NotificationDetailInvite
  */
  public static NotificationDetailInvite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationDetailInvite.class);
  }

 /**
  * Convert an instance of NotificationDetailInvite to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

