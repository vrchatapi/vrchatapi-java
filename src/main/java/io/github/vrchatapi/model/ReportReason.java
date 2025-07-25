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
 * A reason used for reporting users
 */
@ApiModel(description = "A reason used for reporting users")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportReason {
  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TOOLTIP = "tooltip";
  @SerializedName(SERIALIZED_NAME_TOOLTIP)
  private String tooltip;

  public ReportReason() {
  }

  public ReportReason text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The label or name of the report reason
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The label or name of the report reason")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public ReportReason tooltip(String tooltip) {
    
    this.tooltip = tooltip;
    return this;
  }

   /**
   * A brief explanation of what this reason entails
   * @return tooltip
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A brief explanation of what this reason entails")

  public String getTooltip() {
    return tooltip;
  }


  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportReason reportReason = (ReportReason) o;
    return Objects.equals(this.text, reportReason.text) &&
        Objects.equals(this.tooltip, reportReason.tooltip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, tooltip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportReason {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
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
    openapiFields.add("text");
    openapiFields.add("tooltip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("tooltip");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportReason
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportReason.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportReason is not found in the empty JSON string", ReportReason.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReportReason.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportReason` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReportReason.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (!jsonObj.get("tooltip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tooltip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tooltip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportReason.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportReason' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportReason> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportReason.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportReason>() {
           @Override
           public void write(JsonWriter out, ReportReason value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportReason read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportReason given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportReason
  * @throws IOException if the JSON string is invalid with respect to ReportReason
  */
  public static ReportReason fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportReason.class);
  }

 /**
  * Convert an instance of ReportReason to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

