/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.19.2
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
 * Crowded population range
 */
@ApiModel(description = "Crowded population range")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED {
  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Integer max;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Integer min;

  public APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED() {
  }

  public APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED max(Integer max) {
    
    this.max = max;
    return this;
  }

   /**
   * Maximum population for a crowded instance
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum population for a crowded instance")

  public Integer getMax() {
    return max;
  }


  public void setMax(Integer max) {
    this.max = max;
  }


  public APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED min(Integer min) {
    
    this.min = min;
    return this;
  }

   /**
   * Minimum population for a crowded instance
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum population for a crowded instance")

  public Integer getMin() {
    return min;
  }


  public void setMin(Integer min) {
    this.min = min;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED apIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED = (APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED) o;
    return Objects.equals(this.max, apIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED.max) &&
        Objects.equals(this.min, apIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
    openapiFields.add("max");
    openapiFields.add("min");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED is not found in the empty JSON string", APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED.class));

       return (TypeAdapter<T>) new TypeAdapter<APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED>() {
           @Override
           public void write(JsonWriter out, APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED
  * @throws IOException if the JSON string is invalid with respect to APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED
  */
  public static APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED.class);
  }

 /**
  * Convert an instance of APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

