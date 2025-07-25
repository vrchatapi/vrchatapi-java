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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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
 * Status information for a service request
 */
@ApiModel(description = "Status information for a service request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceStatus {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private List<Object> progress = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUESTER_USER_ID = "requesterUserId";
  @SerializedName(SERIALIZED_NAME_REQUESTER_USER_ID)
  private String requesterUserId;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_SUBJECT_ID = "subjectId";
  @SerializedName(SERIALIZED_NAME_SUBJECT_ID)
  private String subjectId;

  public static final String SERIALIZED_NAME_SUBJECT_TYPE = "subjectType";
  @SerializedName(SERIALIZED_NAME_SUBJECT_TYPE)
  private String subjectType;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public ServiceStatus() {
  }

  public ServiceStatus createdAt(OffsetDateTime createdAt) {
    
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


  public ServiceStatus id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of this service, NOT the id of the thing this service was requested for.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The id of this service, NOT the id of the thing this service was requested for.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ServiceStatus progress(List<Object> progress) {
    
    this.progress = progress;
    return this;
  }

  public ServiceStatus addProgressItem(Object progressItem) {
    this.progress.add(progressItem);
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getProgress() {
    return progress;
  }


  public void setProgress(List<Object> progress) {
    this.progress = progress;
  }


  public ServiceStatus requesterUserId(String requesterUserId) {
    
    this.requesterUserId = requesterUserId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return requesterUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getRequesterUserId() {
    return requesterUserId;
  }


  public void setRequesterUserId(String requesterUserId) {
    this.requesterUserId = requesterUserId;
  }


  public ServiceStatus state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public ServiceStatus subjectId(String subjectId) {
    
    this.subjectId = subjectId;
    return this;
  }

   /**
   * The id of the thing this service was requested for.
   * @return subjectId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The id of the thing this service was requested for.")

  public String getSubjectId() {
    return subjectId;
  }


  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }


  public ServiceStatus subjectType(String subjectType) {
    
    this.subjectType = subjectType;
    return this;
  }

   /**
   * The kind of the thing this service was requested for.
   * @return subjectType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The kind of the thing this service was requested for.")

  public String getSubjectType() {
    return subjectType;
  }


  public void setSubjectType(String subjectType) {
    this.subjectType = subjectType;
  }


  public ServiceStatus type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The kind of service that was requested.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The kind of service that was requested.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ServiceStatus updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceStatus serviceStatus = (ServiceStatus) o;
    return Objects.equals(this.createdAt, serviceStatus.createdAt) &&
        Objects.equals(this.id, serviceStatus.id) &&
        Objects.equals(this.progress, serviceStatus.progress) &&
        Objects.equals(this.requesterUserId, serviceStatus.requesterUserId) &&
        Objects.equals(this.state, serviceStatus.state) &&
        Objects.equals(this.subjectId, serviceStatus.subjectId) &&
        Objects.equals(this.subjectType, serviceStatus.subjectType) &&
        Objects.equals(this.type, serviceStatus.type) &&
        Objects.equals(this.updatedAt, serviceStatus.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, progress, requesterUserId, state, subjectId, subjectType, type, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceStatus {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    requesterUserId: ").append(toIndentedString(requesterUserId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("progress");
    openapiFields.add("requesterUserId");
    openapiFields.add("state");
    openapiFields.add("subjectId");
    openapiFields.add("subjectType");
    openapiFields.add("type");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("progress");
    openapiRequiredFields.add("requesterUserId");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("subjectId");
    openapiRequiredFields.add("subjectType");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ServiceStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceStatus is not found in the empty JSON string", ServiceStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ServiceStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ServiceStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ServiceStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("progress") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("progress").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `progress` to be an array in the JSON string but got `%s`", jsonObj.get("progress").toString()));
      }
      if (!jsonObj.get("requesterUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requesterUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requesterUserId").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("subjectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subjectId").toString()));
      }
      if (!jsonObj.get("subjectType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjectType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subjectType").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceStatus>() {
           @Override
           public void write(JsonWriter out, ServiceStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServiceStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServiceStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceStatus
  * @throws IOException if the JSON string is invalid with respect to ServiceStatus
  */
  public static ServiceStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceStatus.class);
  }

 /**
  * Convert an instance of ServiceStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

