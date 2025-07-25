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
 * CreateGroupAnnouncementRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateGroupAnnouncementRequest {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_IMAGE_ID = "imageId";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId;

  public static final String SERIALIZED_NAME_SEND_NOTIFICATION = "sendNotification";
  @SerializedName(SERIALIZED_NAME_SEND_NOTIFICATION)
  private Boolean sendNotification = false;

  public CreateGroupAnnouncementRequest() {
  }

  public CreateGroupAnnouncementRequest title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Announcement title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Event is starting soon!", required = true, value = "Announcement title")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CreateGroupAnnouncementRequest text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Announcement text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Come join us for the event!", value = "Announcement text")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public CreateGroupAnnouncementRequest imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "file_ce35d830-e20a-4df0-a6d4-5aaef4508044", value = "")

  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public CreateGroupAnnouncementRequest sendNotification(Boolean sendNotification) {
    
    this.sendNotification = sendNotification;
    return this;
  }

   /**
   * Send notification to group members.
   * @return sendNotification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Send notification to group members.")

  public Boolean getSendNotification() {
    return sendNotification;
  }


  public void setSendNotification(Boolean sendNotification) {
    this.sendNotification = sendNotification;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupAnnouncementRequest createGroupAnnouncementRequest = (CreateGroupAnnouncementRequest) o;
    return Objects.equals(this.title, createGroupAnnouncementRequest.title) &&
        Objects.equals(this.text, createGroupAnnouncementRequest.text) &&
        Objects.equals(this.imageId, createGroupAnnouncementRequest.imageId) &&
        Objects.equals(this.sendNotification, createGroupAnnouncementRequest.sendNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, text, imageId, sendNotification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupAnnouncementRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    sendNotification: ").append(toIndentedString(sendNotification)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("text");
    openapiFields.add("imageId");
    openapiFields.add("sendNotification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateGroupAnnouncementRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateGroupAnnouncementRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGroupAnnouncementRequest is not found in the empty JSON string", CreateGroupAnnouncementRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateGroupAnnouncementRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateGroupAnnouncementRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateGroupAnnouncementRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("imageId") != null && !jsonObj.get("imageId").isJsonNull()) && !jsonObj.get("imageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGroupAnnouncementRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGroupAnnouncementRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGroupAnnouncementRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGroupAnnouncementRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGroupAnnouncementRequest>() {
           @Override
           public void write(JsonWriter out, CreateGroupAnnouncementRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateGroupAnnouncementRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateGroupAnnouncementRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateGroupAnnouncementRequest
  * @throws IOException if the JSON string is invalid with respect to CreateGroupAnnouncementRequest
  */
  public static CreateGroupAnnouncementRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGroupAnnouncementRequest.class);
  }

 /**
  * Convert an instance of CreateGroupAnnouncementRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

