/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.13.0
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
import io.github.vrchatapi.model.PlayerModerationType;
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
 * PlayerModeration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlayerModeration {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SOURCE_DISPLAY_NAME = "sourceDisplayName";
  @SerializedName(SERIALIZED_NAME_SOURCE_DISPLAY_NAME)
  private String sourceDisplayName;

  public static final String SERIALIZED_NAME_SOURCE_USER_ID = "sourceUserId";
  @SerializedName(SERIALIZED_NAME_SOURCE_USER_ID)
  private String sourceUserId;

  public static final String SERIALIZED_NAME_TARGET_DISPLAY_NAME = "targetDisplayName";
  @SerializedName(SERIALIZED_NAME_TARGET_DISPLAY_NAME)
  private String targetDisplayName;

  public static final String SERIALIZED_NAME_TARGET_USER_ID = "targetUserId";
  @SerializedName(SERIALIZED_NAME_TARGET_USER_ID)
  private String targetUserId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private PlayerModerationType type = PlayerModerationType.UNMUTE;

  public PlayerModeration() {
  }

  public PlayerModeration created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public PlayerModeration id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "pmod_25551a8d-6f5d-430a-88d3-9c0ce08b5244", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PlayerModeration sourceDisplayName(String sourceDisplayName) {
    
    this.sourceDisplayName = sourceDisplayName;
    return this;
  }

   /**
   * Get sourceDisplayName
   * @return sourceDisplayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSourceDisplayName() {
    return sourceDisplayName;
  }


  public void setSourceDisplayName(String sourceDisplayName) {
    this.sourceDisplayName = sourceDisplayName;
  }


  public PlayerModeration sourceUserId(String sourceUserId) {
    
    this.sourceUserId = sourceUserId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return sourceUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getSourceUserId() {
    return sourceUserId;
  }


  public void setSourceUserId(String sourceUserId) {
    this.sourceUserId = sourceUserId;
  }


  public PlayerModeration targetDisplayName(String targetDisplayName) {
    
    this.targetDisplayName = targetDisplayName;
    return this;
  }

   /**
   * Get targetDisplayName
   * @return targetDisplayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTargetDisplayName() {
    return targetDisplayName;
  }


  public void setTargetDisplayName(String targetDisplayName) {
    this.targetDisplayName = targetDisplayName;
  }


  public PlayerModeration targetUserId(String targetUserId) {
    
    this.targetUserId = targetUserId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return targetUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getTargetUserId() {
    return targetUserId;
  }


  public void setTargetUserId(String targetUserId) {
    this.targetUserId = targetUserId;
  }


  public PlayerModeration type(PlayerModerationType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlayerModerationType getType() {
    return type;
  }


  public void setType(PlayerModerationType type) {
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
    PlayerModeration playerModeration = (PlayerModeration) o;
    return Objects.equals(this.created, playerModeration.created) &&
        Objects.equals(this.id, playerModeration.id) &&
        Objects.equals(this.sourceDisplayName, playerModeration.sourceDisplayName) &&
        Objects.equals(this.sourceUserId, playerModeration.sourceUserId) &&
        Objects.equals(this.targetDisplayName, playerModeration.targetDisplayName) &&
        Objects.equals(this.targetUserId, playerModeration.targetUserId) &&
        Objects.equals(this.type, playerModeration.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, id, sourceDisplayName, sourceUserId, targetDisplayName, targetUserId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerModeration {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceDisplayName: ").append(toIndentedString(sourceDisplayName)).append("\n");
    sb.append("    sourceUserId: ").append(toIndentedString(sourceUserId)).append("\n");
    sb.append("    targetDisplayName: ").append(toIndentedString(targetDisplayName)).append("\n");
    sb.append("    targetUserId: ").append(toIndentedString(targetUserId)).append("\n");
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
    openapiFields.add("created");
    openapiFields.add("id");
    openapiFields.add("sourceDisplayName");
    openapiFields.add("sourceUserId");
    openapiFields.add("targetDisplayName");
    openapiFields.add("targetUserId");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("sourceDisplayName");
    openapiRequiredFields.add("sourceUserId");
    openapiRequiredFields.add("targetDisplayName");
    openapiRequiredFields.add("targetUserId");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PlayerModeration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PlayerModeration.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlayerModeration is not found in the empty JSON string", PlayerModeration.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PlayerModeration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlayerModeration` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PlayerModeration.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("sourceDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceDisplayName").toString()));
      }
      if (!jsonObj.get("sourceUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceUserId").toString()));
      }
      if (!jsonObj.get("targetDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetDisplayName").toString()));
      }
      if (!jsonObj.get("targetUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetUserId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlayerModeration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayerModeration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayerModeration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayerModeration.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayerModeration>() {
           @Override
           public void write(JsonWriter out, PlayerModeration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlayerModeration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlayerModeration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlayerModeration
  * @throws IOException if the JSON string is invalid with respect to PlayerModeration
  */
  public static PlayerModeration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayerModeration.class);
  }

 /**
  * Convert an instance of PlayerModeration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

