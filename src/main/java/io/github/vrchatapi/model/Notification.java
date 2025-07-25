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
import io.github.vrchatapi.model.NotificationType;
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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Notification {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details = "{}";

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_SEEN = "seen";
  @SerializedName(SERIALIZED_NAME_SEEN)
  private Boolean seen = false;

  public static final String SERIALIZED_NAME_RECEIVER_USER_ID = "receiverUserId";
  @SerializedName(SERIALIZED_NAME_RECEIVER_USER_ID)
  private String receiverUserId;

  public static final String SERIALIZED_NAME_SENDER_USER_ID = "senderUserId";
  @SerializedName(SERIALIZED_NAME_SENDER_USER_ID)
  private String senderUserId;

  public static final String SERIALIZED_NAME_SENDER_USERNAME = "senderUsername";
  @SerializedName(SERIALIZED_NAME_SENDER_USERNAME)
  private String senderUsername;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private NotificationType type = NotificationType.FRIENDREQUEST;

  public Notification() {
  }

  public Notification createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Notification details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * **NOTICE:** This is not a JSON object when received from the REST API, but it is when received from the Websocket API. When received from the REST API, this is a json **encoded** object, meaning you have to json-de-encode to get the NotificationDetail object depending on the NotificationType.
   * @return details
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "OneOf: {}, NotificationDetailInvite, NotificationDetailInviteResponse, NotificationDetailRequestInvite, NotificationDetailRequestInviteResponse, NotificationDetailVoteToKick", required = true, value = "**NOTICE:** This is not a JSON object when received from the REST API, but it is when received from the Websocket API. When received from the REST API, this is a json **encoded** object, meaning you have to json-de-encode to get the NotificationDetail object depending on the NotificationType.")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public Notification id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Notification message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "This is a generated invite to VRChat Hub", required = true, value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Notification seen(Boolean seen) {
    
    this.seen = seen;
    return this;
  }

   /**
   * Not included in notification objects received from the Websocket API
   * @return seen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not included in notification objects received from the Websocket API")

  public Boolean getSeen() {
    return seen;
  }


  public void setSeen(Boolean seen) {
    this.seen = seen;
  }


  public Notification receiverUserId(String receiverUserId) {
    
    this.receiverUserId = receiverUserId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return receiverUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getReceiverUserId() {
    return receiverUserId;
  }


  public void setReceiverUserId(String receiverUserId) {
    this.receiverUserId = receiverUserId;
  }


  public Notification senderUserId(String senderUserId) {
    
    this.senderUserId = senderUserId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return senderUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getSenderUserId() {
    return senderUserId;
  }


  public void setSenderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
  }


  public Notification senderUsername(String senderUsername) {
    
    this.senderUsername = senderUsername;
    return this;
  }

   /**
   * -| **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429).
   * @return senderUsername
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "-| **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429).")

  public String getSenderUsername() {
    return senderUsername;
  }


  public void setSenderUsername(String senderUsername) {
    this.senderUsername = senderUsername;
  }


  public Notification type(NotificationType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NotificationType getType() {
    return type;
  }


  public void setType(NotificationType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.createdAt, notification.createdAt) &&
        Objects.equals(this.details, notification.details) &&
        Objects.equals(this.id, notification.id) &&
        Objects.equals(this.message, notification.message) &&
        Objects.equals(this.seen, notification.seen) &&
        Objects.equals(this.receiverUserId, notification.receiverUserId) &&
        Objects.equals(this.senderUserId, notification.senderUserId) &&
        Objects.equals(this.senderUsername, notification.senderUsername) &&
        Objects.equals(this.type, notification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, details, id, message, seen, receiverUserId, senderUserId, senderUsername, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    seen: ").append(toIndentedString(seen)).append("\n");
    sb.append("    receiverUserId: ").append(toIndentedString(receiverUserId)).append("\n");
    sb.append("    senderUserId: ").append(toIndentedString(senderUserId)).append("\n");
    sb.append("    senderUsername: ").append(toIndentedString(senderUsername)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("details");
    openapiFields.add("id");
    openapiFields.add("message");
    openapiFields.add("seen");
    openapiFields.add("receiverUserId");
    openapiFields.add("senderUserId");
    openapiFields.add("senderUsername");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("details");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("senderUserId");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Notification
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Notification.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Notification is not found in the empty JSON string", Notification.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Notification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Notification` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Notification.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("receiverUserId") != null && !jsonObj.get("receiverUserId").isJsonNull()) && !jsonObj.get("receiverUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receiverUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receiverUserId").toString()));
      }
      if (!jsonObj.get("senderUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `senderUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("senderUserId").toString()));
      }
      if ((jsonObj.get("senderUsername") != null && !jsonObj.get("senderUsername").isJsonNull()) && !jsonObj.get("senderUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `senderUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("senderUsername").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Notification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Notification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Notification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Notification.class));

       return (TypeAdapter<T>) new TypeAdapter<Notification>() {
           @Override
           public void write(JsonWriter out, Notification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Notification read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Notification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Notification
  * @throws IOException if the JSON string is invalid with respect to Notification
  */
  public static Notification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Notification.class);
  }

 /**
  * Convert an instance of Notification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

