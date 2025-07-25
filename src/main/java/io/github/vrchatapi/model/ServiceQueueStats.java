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
 * Statistics about the user&#39;s currently queued service request
 */
@ApiModel(description = "Statistics about the user's currently queued service request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceQueueStats {
  public static final String SERIALIZED_NAME_ESTIMATED_SERVICE_DURATION_SECONDS = "estimatedServiceDurationSeconds";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_SERVICE_DURATION_SECONDS)
  private Integer estimatedServiceDurationSeconds;

  public ServiceQueueStats() {
  }

  public ServiceQueueStats estimatedServiceDurationSeconds(Integer estimatedServiceDurationSeconds) {
    
    this.estimatedServiceDurationSeconds = estimatedServiceDurationSeconds;
    return this;
  }

   /**
   * Get estimatedServiceDurationSeconds
   * @return estimatedServiceDurationSeconds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getEstimatedServiceDurationSeconds() {
    return estimatedServiceDurationSeconds;
  }


  public void setEstimatedServiceDurationSeconds(Integer estimatedServiceDurationSeconds) {
    this.estimatedServiceDurationSeconds = estimatedServiceDurationSeconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceQueueStats serviceQueueStats = (ServiceQueueStats) o;
    return Objects.equals(this.estimatedServiceDurationSeconds, serviceQueueStats.estimatedServiceDurationSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedServiceDurationSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceQueueStats {\n");
    sb.append("    estimatedServiceDurationSeconds: ").append(toIndentedString(estimatedServiceDurationSeconds)).append("\n");
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
    openapiFields.add("estimatedServiceDurationSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("estimatedServiceDurationSeconds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceQueueStats
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ServiceQueueStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceQueueStats is not found in the empty JSON string", ServiceQueueStats.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ServiceQueueStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ServiceQueueStats` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ServiceQueueStats.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceQueueStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceQueueStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceQueueStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceQueueStats.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceQueueStats>() {
           @Override
           public void write(JsonWriter out, ServiceQueueStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServiceQueueStats read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServiceQueueStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceQueueStats
  * @throws IOException if the JSON string is invalid with respect to ServiceQueueStats
  */
  public static ServiceQueueStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceQueueStats.class);
  }

 /**
  * Convert an instance of ServiceQueueStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

