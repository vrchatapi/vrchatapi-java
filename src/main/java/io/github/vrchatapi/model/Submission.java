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
public class Submission {
  public static final String SERIALIZED_NAME_CONTENT_ID = "contentId";
  @SerializedName(SERIALIZED_NAME_CONTENT_ID)
  private String contentId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_JAM_ID = "jamId";
  @SerializedName(SERIALIZED_NAME_JAM_ID)
  private String jamId;

  public static final String SERIALIZED_NAME_RATING_SCORE = "ratingScore";
  @SerializedName(SERIALIZED_NAME_RATING_SCORE)
  private Integer ratingScore;

  public static final String SERIALIZED_NAME_SUBMITTER_ID = "submitterId";
  @SerializedName(SERIALIZED_NAME_SUBMITTER_ID)
  private String submitterId;

  public Submission() {
  }

  public Submission contentId(String contentId) {
    
    this.contentId = contentId;
    return this;
  }

   /**
   * Either world ID or avatar ID
   * @return contentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Either world ID or avatar ID")

  public String getContentId() {
    return contentId;
  }


  public void setContentId(String contentId) {
    this.contentId = contentId;
  }


  public Submission createdAt(OffsetDateTime createdAt) {
    
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


  public Submission description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Submission id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "jsub_f01f44fa-89fa-443c-ab4c-7fed9245970f", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Submission jamId(String jamId) {
    
    this.jamId = jamId;
    return this;
  }

   /**
   * Get jamId
   * @return jamId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "jam_0b7e3f6d-4647-4648-b2a1-1431e76906d9", required = true, value = "")

  public String getJamId() {
    return jamId;
  }


  public void setJamId(String jamId) {
    this.jamId = jamId;
  }


  public Submission ratingScore(Integer ratingScore) {
    
    this.ratingScore = ratingScore;
    return this;
  }

   /**
   * Get ratingScore
   * minimum: 0
   * @return ratingScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRatingScore() {
    return ratingScore;
  }


  public void setRatingScore(Integer ratingScore) {
    this.ratingScore = ratingScore;
  }


  public Submission submitterId(String submitterId) {
    
    this.submitterId = submitterId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return submitterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getSubmitterId() {
    return submitterId;
  }


  public void setSubmitterId(String submitterId) {
    this.submitterId = submitterId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Submission submission = (Submission) o;
    return Objects.equals(this.contentId, submission.contentId) &&
        Objects.equals(this.createdAt, submission.createdAt) &&
        Objects.equals(this.description, submission.description) &&
        Objects.equals(this.id, submission.id) &&
        Objects.equals(this.jamId, submission.jamId) &&
        Objects.equals(this.ratingScore, submission.ratingScore) &&
        Objects.equals(this.submitterId, submission.submitterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentId, createdAt, description, id, jamId, ratingScore, submitterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Submission {\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jamId: ").append(toIndentedString(jamId)).append("\n");
    sb.append("    ratingScore: ").append(toIndentedString(ratingScore)).append("\n");
    sb.append("    submitterId: ").append(toIndentedString(submitterId)).append("\n");
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
    openapiFields.add("contentId");
    openapiFields.add("created_at");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("jamId");
    openapiFields.add("ratingScore");
    openapiFields.add("submitterId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contentId");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("jamId");
    openapiRequiredFields.add("submitterId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Submission
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Submission.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Submission is not found in the empty JSON string", Submission.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Submission.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Submission` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Submission.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("contentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentId").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("jamId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jamId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jamId").toString()));
      }
      if (!jsonObj.get("submitterId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submitterId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submitterId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Submission.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Submission' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Submission> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Submission.class));

       return (TypeAdapter<T>) new TypeAdapter<Submission>() {
           @Override
           public void write(JsonWriter out, Submission value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Submission read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Submission given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Submission
  * @throws IOException if the JSON string is invalid with respect to Submission
  */
  public static Submission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Submission.class);
  }

 /**
  * Convert an instance of Submission to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

