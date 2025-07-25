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
 * UpdateGroupRepresentationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateGroupRepresentationRequest {
  public static final String SERIALIZED_NAME_IS_REPRESENTING = "isRepresenting";
  @SerializedName(SERIALIZED_NAME_IS_REPRESENTING)
  private Boolean isRepresenting;

  public UpdateGroupRepresentationRequest() {
  }

  public UpdateGroupRepresentationRequest isRepresenting(Boolean isRepresenting) {
    
    this.isRepresenting = isRepresenting;
    return this;
  }

   /**
   * Whether the user is representing the group.
   * @return isRepresenting
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the user is representing the group.")

  public Boolean getIsRepresenting() {
    return isRepresenting;
  }


  public void setIsRepresenting(Boolean isRepresenting) {
    this.isRepresenting = isRepresenting;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGroupRepresentationRequest updateGroupRepresentationRequest = (UpdateGroupRepresentationRequest) o;
    return Objects.equals(this.isRepresenting, updateGroupRepresentationRequest.isRepresenting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRepresenting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGroupRepresentationRequest {\n");
    sb.append("    isRepresenting: ").append(toIndentedString(isRepresenting)).append("\n");
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
    openapiFields.add("isRepresenting");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("isRepresenting");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateGroupRepresentationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateGroupRepresentationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateGroupRepresentationRequest is not found in the empty JSON string", UpdateGroupRepresentationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateGroupRepresentationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateGroupRepresentationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateGroupRepresentationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateGroupRepresentationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateGroupRepresentationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateGroupRepresentationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateGroupRepresentationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateGroupRepresentationRequest>() {
           @Override
           public void write(JsonWriter out, UpdateGroupRepresentationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateGroupRepresentationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateGroupRepresentationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateGroupRepresentationRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateGroupRepresentationRequest
  */
  public static UpdateGroupRepresentationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateGroupRepresentationRequest.class);
  }

 /**
  * Convert an instance of UpdateGroupRepresentationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

