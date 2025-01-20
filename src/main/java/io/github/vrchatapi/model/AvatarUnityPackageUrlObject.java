/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.9
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
 * **Deprecation:** &#x60;Object&#x60; has unknown usage/fields, and is always empty. Use normal &#x60;Url&#x60; field instead.
 * @deprecated
 */
@Deprecated
@ApiModel(description = "**Deprecation:** `Object` has unknown usage/fields, and is always empty. Use normal `Url` field instead.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AvatarUnityPackageUrlObject {
  public static final String SERIALIZED_NAME_UNITY_PACKAGE_URL = "unityPackageUrl";
  @SerializedName(SERIALIZED_NAME_UNITY_PACKAGE_URL)
  private String unityPackageUrl;

  public AvatarUnityPackageUrlObject() {
  }

  public AvatarUnityPackageUrlObject unityPackageUrl(String unityPackageUrl) {
    
    this.unityPackageUrl = unityPackageUrl;
    return this;
  }

   /**
   * Get unityPackageUrl
   * @return unityPackageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnityPackageUrl() {
    return unityPackageUrl;
  }


  public void setUnityPackageUrl(String unityPackageUrl) {
    this.unityPackageUrl = unityPackageUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvatarUnityPackageUrlObject avatarUnityPackageUrlObject = (AvatarUnityPackageUrlObject) o;
    return Objects.equals(this.unityPackageUrl, avatarUnityPackageUrlObject.unityPackageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unityPackageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvatarUnityPackageUrlObject {\n");
    sb.append("    unityPackageUrl: ").append(toIndentedString(unityPackageUrl)).append("\n");
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
    openapiFields.add("unityPackageUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AvatarUnityPackageUrlObject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AvatarUnityPackageUrlObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvatarUnityPackageUrlObject is not found in the empty JSON string", AvatarUnityPackageUrlObject.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AvatarUnityPackageUrlObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvatarUnityPackageUrlObject` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("unityPackageUrl") != null && !jsonObj.get("unityPackageUrl").isJsonNull()) && !jsonObj.get("unityPackageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unityPackageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unityPackageUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvatarUnityPackageUrlObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvatarUnityPackageUrlObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvatarUnityPackageUrlObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvatarUnityPackageUrlObject.class));

       return (TypeAdapter<T>) new TypeAdapter<AvatarUnityPackageUrlObject>() {
           @Override
           public void write(JsonWriter out, AvatarUnityPackageUrlObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvatarUnityPackageUrlObject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AvatarUnityPackageUrlObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AvatarUnityPackageUrlObject
  * @throws IOException if the JSON string is invalid with respect to AvatarUnityPackageUrlObject
  */
  public static AvatarUnityPackageUrlObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvatarUnityPackageUrlObject.class);
  }

 /**
  * Convert an instance of AvatarUnityPackageUrlObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

