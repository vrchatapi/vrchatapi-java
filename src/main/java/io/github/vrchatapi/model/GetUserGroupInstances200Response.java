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
import io.github.vrchatapi.model.Instance;
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
 * GetUserGroupInstances200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetUserGroupInstances200Response {
  public static final String SERIALIZED_NAME_FETCHED_AT = "fetchedAt";
  @SerializedName(SERIALIZED_NAME_FETCHED_AT)
  private OffsetDateTime fetchedAt;

  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private List<Instance> instances = null;

  public GetUserGroupInstances200Response() {
  }

  public GetUserGroupInstances200Response fetchedAt(OffsetDateTime fetchedAt) {
    
    this.fetchedAt = fetchedAt;
    return this;
  }

   /**
   * Get fetchedAt
   * @return fetchedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getFetchedAt() {
    return fetchedAt;
  }


  public void setFetchedAt(OffsetDateTime fetchedAt) {
    this.fetchedAt = fetchedAt;
  }


  public GetUserGroupInstances200Response instances(List<Instance> instances) {
    
    this.instances = instances;
    return this;
  }

  public GetUserGroupInstances200Response addInstancesItem(Instance instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Instance> getInstances() {
    return instances;
  }


  public void setInstances(List<Instance> instances) {
    this.instances = instances;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserGroupInstances200Response getUserGroupInstances200Response = (GetUserGroupInstances200Response) o;
    return Objects.equals(this.fetchedAt, getUserGroupInstances200Response.fetchedAt) &&
        Objects.equals(this.instances, getUserGroupInstances200Response.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fetchedAt, instances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserGroupInstances200Response {\n");
    sb.append("    fetchedAt: ").append(toIndentedString(fetchedAt)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
    openapiFields.add("fetchedAt");
    openapiFields.add("instances");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetUserGroupInstances200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetUserGroupInstances200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetUserGroupInstances200Response is not found in the empty JSON string", GetUserGroupInstances200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetUserGroupInstances200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetUserGroupInstances200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("instances") != null && !jsonObj.get("instances").isJsonNull()) {
        JsonArray jsonArrayinstances = jsonObj.getAsJsonArray("instances");
        if (jsonArrayinstances != null) {
          // ensure the json data is an array
          if (!jsonObj.get("instances").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `instances` to be an array in the JSON string but got `%s`", jsonObj.get("instances").toString()));
          }

          // validate the optional field `instances` (array)
          for (int i = 0; i < jsonArrayinstances.size(); i++) {
            Instance.validateJsonObject(jsonArrayinstances.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetUserGroupInstances200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetUserGroupInstances200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetUserGroupInstances200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetUserGroupInstances200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetUserGroupInstances200Response>() {
           @Override
           public void write(JsonWriter out, GetUserGroupInstances200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetUserGroupInstances200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetUserGroupInstances200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetUserGroupInstances200Response
  * @throws IOException if the JSON string is invalid with respect to GetUserGroupInstances200Response
  */
  public static GetUserGroupInstances200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetUserGroupInstances200Response.class);
  }

 /**
  * Convert an instance of GetUserGroupInstances200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

