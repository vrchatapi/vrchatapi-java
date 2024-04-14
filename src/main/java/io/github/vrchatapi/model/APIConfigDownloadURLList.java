/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.16.8
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
 * Download links for various development assets.
 */
@ApiModel(description = "Download links for various development assets.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIConfigDownloadURLList {
  public static final String SERIALIZED_NAME_SDK2 = "sdk2";
  @SerializedName(SERIALIZED_NAME_SDK2)
  private String sdk2;

  public static final String SERIALIZED_NAME_SDK3_AVATARS = "sdk3-avatars";
  @SerializedName(SERIALIZED_NAME_SDK3_AVATARS)
  private String sdk3Avatars;

  public static final String SERIALIZED_NAME_SDK3_WORLDS = "sdk3-worlds";
  @SerializedName(SERIALIZED_NAME_SDK3_WORLDS)
  private String sdk3Worlds;

  public static final String SERIALIZED_NAME_VCC = "vcc";
  @SerializedName(SERIALIZED_NAME_VCC)
  private String vcc;

  public static final String SERIALIZED_NAME_BOOTSTRAP = "bootstrap";
  @SerializedName(SERIALIZED_NAME_BOOTSTRAP)
  private String bootstrap;

  public APIConfigDownloadURLList() {
  }

  public APIConfigDownloadURLList sdk2(String sdk2) {
    
    this.sdk2 = sdk2;
    return this;
  }

   /**
   * Download link for legacy SDK2
   * @return sdk2
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Download link for legacy SDK2")

  public String getSdk2() {
    return sdk2;
  }


  public void setSdk2(String sdk2) {
    this.sdk2 = sdk2;
  }


  public APIConfigDownloadURLList sdk3Avatars(String sdk3Avatars) {
    
    this.sdk3Avatars = sdk3Avatars;
    return this;
  }

   /**
   * Download link for SDK3 for Avatars
   * @return sdk3Avatars
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Download link for SDK3 for Avatars")

  public String getSdk3Avatars() {
    return sdk3Avatars;
  }


  public void setSdk3Avatars(String sdk3Avatars) {
    this.sdk3Avatars = sdk3Avatars;
  }


  public APIConfigDownloadURLList sdk3Worlds(String sdk3Worlds) {
    
    this.sdk3Worlds = sdk3Worlds;
    return this;
  }

   /**
   * Download link for SDK3 for Worlds
   * @return sdk3Worlds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Download link for SDK3 for Worlds")

  public String getSdk3Worlds() {
    return sdk3Worlds;
  }


  public void setSdk3Worlds(String sdk3Worlds) {
    this.sdk3Worlds = sdk3Worlds;
  }


  public APIConfigDownloadURLList vcc(String vcc) {
    
    this.vcc = vcc;
    return this;
  }

   /**
   * Download link for the Creator Companion
   * @return vcc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Download link for the Creator Companion")

  public String getVcc() {
    return vcc;
  }


  public void setVcc(String vcc) {
    this.vcc = vcc;
  }


  public APIConfigDownloadURLList bootstrap(String bootstrap) {
    
    this.bootstrap = bootstrap;
    return this;
  }

   /**
   * Download link for ???
   * @return bootstrap
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Download link for ???")

  public String getBootstrap() {
    return bootstrap;
  }


  public void setBootstrap(String bootstrap) {
    this.bootstrap = bootstrap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIConfigDownloadURLList apIConfigDownloadURLList = (APIConfigDownloadURLList) o;
    return Objects.equals(this.sdk2, apIConfigDownloadURLList.sdk2) &&
        Objects.equals(this.sdk3Avatars, apIConfigDownloadURLList.sdk3Avatars) &&
        Objects.equals(this.sdk3Worlds, apIConfigDownloadURLList.sdk3Worlds) &&
        Objects.equals(this.vcc, apIConfigDownloadURLList.vcc) &&
        Objects.equals(this.bootstrap, apIConfigDownloadURLList.bootstrap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdk2, sdk3Avatars, sdk3Worlds, vcc, bootstrap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIConfigDownloadURLList {\n");
    sb.append("    sdk2: ").append(toIndentedString(sdk2)).append("\n");
    sb.append("    sdk3Avatars: ").append(toIndentedString(sdk3Avatars)).append("\n");
    sb.append("    sdk3Worlds: ").append(toIndentedString(sdk3Worlds)).append("\n");
    sb.append("    vcc: ").append(toIndentedString(vcc)).append("\n");
    sb.append("    bootstrap: ").append(toIndentedString(bootstrap)).append("\n");
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
    openapiFields.add("sdk2");
    openapiFields.add("sdk3-avatars");
    openapiFields.add("sdk3-worlds");
    openapiFields.add("vcc");
    openapiFields.add("bootstrap");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sdk2");
    openapiRequiredFields.add("sdk3-avatars");
    openapiRequiredFields.add("sdk3-worlds");
    openapiRequiredFields.add("vcc");
    openapiRequiredFields.add("bootstrap");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIConfigDownloadURLList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIConfigDownloadURLList.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIConfigDownloadURLList is not found in the empty JSON string", APIConfigDownloadURLList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!APIConfigDownloadURLList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APIConfigDownloadURLList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : APIConfigDownloadURLList.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("sdk2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdk2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdk2").toString()));
      }
      if (!jsonObj.get("sdk3-avatars").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdk3-avatars` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdk3-avatars").toString()));
      }
      if (!jsonObj.get("sdk3-worlds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdk3-worlds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdk3-worlds").toString()));
      }
      if (!jsonObj.get("vcc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vcc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vcc").toString()));
      }
      if (!jsonObj.get("bootstrap").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bootstrap` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bootstrap").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIConfigDownloadURLList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIConfigDownloadURLList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIConfigDownloadURLList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIConfigDownloadURLList.class));

       return (TypeAdapter<T>) new TypeAdapter<APIConfigDownloadURLList>() {
           @Override
           public void write(JsonWriter out, APIConfigDownloadURLList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APIConfigDownloadURLList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIConfigDownloadURLList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIConfigDownloadURLList
  * @throws IOException if the JSON string is invalid with respect to APIConfigDownloadURLList
  */
  public static APIConfigDownloadURLList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIConfigDownloadURLList.class);
  }

 /**
  * Convert an instance of APIConfigDownloadURLList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

