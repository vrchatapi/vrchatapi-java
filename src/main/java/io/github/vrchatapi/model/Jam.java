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
import io.github.vrchatapi.model.JamStateChangeDates;
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
public class Jam {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_VISIBLE = "isVisible";
  @SerializedName(SERIALIZED_NAME_IS_VISIBLE)
  private Boolean isVisible;

  public static final String SERIALIZED_NAME_MORE_INFO = "moreInfo";
  @SerializedName(SERIALIZED_NAME_MORE_INFO)
  private String moreInfo;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_STATE_CHANGE_DATES = "stateChangeDates";
  @SerializedName(SERIALIZED_NAME_STATE_CHANGE_DATES)
  private JamStateChangeDates stateChangeDates;

  public static final String SERIALIZED_NAME_SUBMISSION_CONTENT_GATE_DATE = "submissionContentGateDate";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_CONTENT_GATE_DATE)
  private OffsetDateTime submissionContentGateDate;

  public static final String SERIALIZED_NAME_SUBMISSION_CONTENT_GATED = "submissionContentGated";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_CONTENT_GATED)
  private Boolean submissionContentGated;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Jam() {
  }

  public Jam description(String description) {
    
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


  public Jam id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "jam_0b7e3f6d-4647-4648-b2a1-1431e76906d9", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Jam isVisible(Boolean isVisible) {
    
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Get isVisible
   * @return isVisible
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsVisible() {
    return isVisible;
  }


  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }


  public Jam moreInfo(String moreInfo) {
    
    this.moreInfo = moreInfo;
    return this;
  }

   /**
   * Get moreInfo
   * @return moreInfo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMoreInfo() {
    return moreInfo;
  }


  public void setMoreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
  }


  public Jam state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * One of: - submissions_open - closed
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "One of: - submissions_open - closed")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Jam stateChangeDates(JamStateChangeDates stateChangeDates) {
    
    this.stateChangeDates = stateChangeDates;
    return this;
  }

   /**
   * Get stateChangeDates
   * @return stateChangeDates
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JamStateChangeDates getStateChangeDates() {
    return stateChangeDates;
  }


  public void setStateChangeDates(JamStateChangeDates stateChangeDates) {
    this.stateChangeDates = stateChangeDates;
  }


  public Jam submissionContentGateDate(OffsetDateTime submissionContentGateDate) {
    
    this.submissionContentGateDate = submissionContentGateDate;
    return this;
  }

   /**
   * Get submissionContentGateDate
   * @return submissionContentGateDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getSubmissionContentGateDate() {
    return submissionContentGateDate;
  }


  public void setSubmissionContentGateDate(OffsetDateTime submissionContentGateDate) {
    this.submissionContentGateDate = submissionContentGateDate;
  }


  public Jam submissionContentGated(Boolean submissionContentGated) {
    
    this.submissionContentGated = submissionContentGated;
    return this;
  }

   /**
   * Get submissionContentGated
   * @return submissionContentGated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getSubmissionContentGated() {
    return submissionContentGated;
  }


  public void setSubmissionContentGated(Boolean submissionContentGated) {
    this.submissionContentGated = submissionContentGated;
  }


  public Jam title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Jam updatedAt(OffsetDateTime updatedAt) {
    
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
    Jam jam = (Jam) o;
    return Objects.equals(this.description, jam.description) &&
        Objects.equals(this.id, jam.id) &&
        Objects.equals(this.isVisible, jam.isVisible) &&
        Objects.equals(this.moreInfo, jam.moreInfo) &&
        Objects.equals(this.state, jam.state) &&
        Objects.equals(this.stateChangeDates, jam.stateChangeDates) &&
        Objects.equals(this.submissionContentGateDate, jam.submissionContentGateDate) &&
        Objects.equals(this.submissionContentGated, jam.submissionContentGated) &&
        Objects.equals(this.title, jam.title) &&
        Objects.equals(this.updatedAt, jam.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isVisible, moreInfo, state, stateChangeDates, submissionContentGateDate, submissionContentGated, title, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jam {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    moreInfo: ").append(toIndentedString(moreInfo)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateChangeDates: ").append(toIndentedString(stateChangeDates)).append("\n");
    sb.append("    submissionContentGateDate: ").append(toIndentedString(submissionContentGateDate)).append("\n");
    sb.append("    submissionContentGated: ").append(toIndentedString(submissionContentGated)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("isVisible");
    openapiFields.add("moreInfo");
    openapiFields.add("state");
    openapiFields.add("stateChangeDates");
    openapiFields.add("submissionContentGateDate");
    openapiFields.add("submissionContentGated");
    openapiFields.add("title");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("isVisible");
    openapiRequiredFields.add("moreInfo");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("stateChangeDates");
    openapiRequiredFields.add("submissionContentGateDate");
    openapiRequiredFields.add("submissionContentGated");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Jam
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Jam.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Jam is not found in the empty JSON string", Jam.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Jam.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Jam` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Jam.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("moreInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `moreInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("moreInfo").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the required field `stateChangeDates`
      JamStateChangeDates.validateJsonObject(jsonObj.getAsJsonObject("stateChangeDates"));
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Jam.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Jam' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Jam> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Jam.class));

       return (TypeAdapter<T>) new TypeAdapter<Jam>() {
           @Override
           public void write(JsonWriter out, Jam value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Jam read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Jam given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Jam
  * @throws IOException if the JSON string is invalid with respect to Jam
  */
  public static Jam fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Jam.class);
  }

 /**
  * Convert an instance of Jam to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

