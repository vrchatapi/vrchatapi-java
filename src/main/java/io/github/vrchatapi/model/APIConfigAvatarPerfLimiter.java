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
import io.github.vrchatapi.model.PerformanceLimiterInfo;
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
 * APIConfigAvatarPerfLimiter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIConfigAvatarPerfLimiter {
  public static final String SERIALIZED_NAME_ANDROID_MOBILE = "AndroidMobile";
  @SerializedName(SERIALIZED_NAME_ANDROID_MOBILE)
  private PerformanceLimiterInfo androidMobile;

  public static final String SERIALIZED_NAME_P_C = "PC";
  @SerializedName(SERIALIZED_NAME_P_C)
  private PerformanceLimiterInfo PC;

  public static final String SERIALIZED_NAME_PICO = "Pico";
  @SerializedName(SERIALIZED_NAME_PICO)
  private PerformanceLimiterInfo pico;

  public static final String SERIALIZED_NAME_QUEST = "Quest";
  @SerializedName(SERIALIZED_NAME_QUEST)
  private PerformanceLimiterInfo quest;

  public static final String SERIALIZED_NAME_XR_ELITE = "XRElite";
  @SerializedName(SERIALIZED_NAME_XR_ELITE)
  private PerformanceLimiterInfo xrElite;

  public static final String SERIALIZED_NAME_I_O_S_MOBILE = "iOSMobile";
  @SerializedName(SERIALIZED_NAME_I_O_S_MOBILE)
  private PerformanceLimiterInfo iOSMobile;

  public APIConfigAvatarPerfLimiter() {
  }

  public APIConfigAvatarPerfLimiter androidMobile(PerformanceLimiterInfo androidMobile) {
    
    this.androidMobile = androidMobile;
    return this;
  }

   /**
   * Get androidMobile
   * @return androidMobile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PerformanceLimiterInfo getAndroidMobile() {
    return androidMobile;
  }


  public void setAndroidMobile(PerformanceLimiterInfo androidMobile) {
    this.androidMobile = androidMobile;
  }


  public APIConfigAvatarPerfLimiter PC(PerformanceLimiterInfo PC) {
    
    this.PC = PC;
    return this;
  }

   /**
   * Get PC
   * @return PC
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PerformanceLimiterInfo getPC() {
    return PC;
  }


  public void setPC(PerformanceLimiterInfo PC) {
    this.PC = PC;
  }


  public APIConfigAvatarPerfLimiter pico(PerformanceLimiterInfo pico) {
    
    this.pico = pico;
    return this;
  }

   /**
   * Get pico
   * @return pico
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PerformanceLimiterInfo getPico() {
    return pico;
  }


  public void setPico(PerformanceLimiterInfo pico) {
    this.pico = pico;
  }


  public APIConfigAvatarPerfLimiter quest(PerformanceLimiterInfo quest) {
    
    this.quest = quest;
    return this;
  }

   /**
   * Get quest
   * @return quest
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PerformanceLimiterInfo getQuest() {
    return quest;
  }


  public void setQuest(PerformanceLimiterInfo quest) {
    this.quest = quest;
  }


  public APIConfigAvatarPerfLimiter xrElite(PerformanceLimiterInfo xrElite) {
    
    this.xrElite = xrElite;
    return this;
  }

   /**
   * Get xrElite
   * @return xrElite
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PerformanceLimiterInfo getXrElite() {
    return xrElite;
  }


  public void setXrElite(PerformanceLimiterInfo xrElite) {
    this.xrElite = xrElite;
  }


  public APIConfigAvatarPerfLimiter iOSMobile(PerformanceLimiterInfo iOSMobile) {
    
    this.iOSMobile = iOSMobile;
    return this;
  }

   /**
   * Get iOSMobile
   * @return iOSMobile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PerformanceLimiterInfo getiOSMobile() {
    return iOSMobile;
  }


  public void setiOSMobile(PerformanceLimiterInfo iOSMobile) {
    this.iOSMobile = iOSMobile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIConfigAvatarPerfLimiter apIConfigAvatarPerfLimiter = (APIConfigAvatarPerfLimiter) o;
    return Objects.equals(this.androidMobile, apIConfigAvatarPerfLimiter.androidMobile) &&
        Objects.equals(this.PC, apIConfigAvatarPerfLimiter.PC) &&
        Objects.equals(this.pico, apIConfigAvatarPerfLimiter.pico) &&
        Objects.equals(this.quest, apIConfigAvatarPerfLimiter.quest) &&
        Objects.equals(this.xrElite, apIConfigAvatarPerfLimiter.xrElite) &&
        Objects.equals(this.iOSMobile, apIConfigAvatarPerfLimiter.iOSMobile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidMobile, PC, pico, quest, xrElite, iOSMobile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIConfigAvatarPerfLimiter {\n");
    sb.append("    androidMobile: ").append(toIndentedString(androidMobile)).append("\n");
    sb.append("    PC: ").append(toIndentedString(PC)).append("\n");
    sb.append("    pico: ").append(toIndentedString(pico)).append("\n");
    sb.append("    quest: ").append(toIndentedString(quest)).append("\n");
    sb.append("    xrElite: ").append(toIndentedString(xrElite)).append("\n");
    sb.append("    iOSMobile: ").append(toIndentedString(iOSMobile)).append("\n");
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
    openapiFields.add("AndroidMobile");
    openapiFields.add("PC");
    openapiFields.add("Pico");
    openapiFields.add("Quest");
    openapiFields.add("XRElite");
    openapiFields.add("iOSMobile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AndroidMobile");
    openapiRequiredFields.add("PC");
    openapiRequiredFields.add("Pico");
    openapiRequiredFields.add("Quest");
    openapiRequiredFields.add("XRElite");
    openapiRequiredFields.add("iOSMobile");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIConfigAvatarPerfLimiter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIConfigAvatarPerfLimiter.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIConfigAvatarPerfLimiter is not found in the empty JSON string", APIConfigAvatarPerfLimiter.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!APIConfigAvatarPerfLimiter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APIConfigAvatarPerfLimiter` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : APIConfigAvatarPerfLimiter.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `AndroidMobile`
      PerformanceLimiterInfo.validateJsonObject(jsonObj.getAsJsonObject("AndroidMobile"));
      // validate the required field `PC`
      PerformanceLimiterInfo.validateJsonObject(jsonObj.getAsJsonObject("PC"));
      // validate the required field `Pico`
      PerformanceLimiterInfo.validateJsonObject(jsonObj.getAsJsonObject("Pico"));
      // validate the required field `Quest`
      PerformanceLimiterInfo.validateJsonObject(jsonObj.getAsJsonObject("Quest"));
      // validate the required field `XRElite`
      PerformanceLimiterInfo.validateJsonObject(jsonObj.getAsJsonObject("XRElite"));
      // validate the required field `iOSMobile`
      PerformanceLimiterInfo.validateJsonObject(jsonObj.getAsJsonObject("iOSMobile"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIConfigAvatarPerfLimiter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIConfigAvatarPerfLimiter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIConfigAvatarPerfLimiter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIConfigAvatarPerfLimiter.class));

       return (TypeAdapter<T>) new TypeAdapter<APIConfigAvatarPerfLimiter>() {
           @Override
           public void write(JsonWriter out, APIConfigAvatarPerfLimiter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APIConfigAvatarPerfLimiter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIConfigAvatarPerfLimiter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIConfigAvatarPerfLimiter
  * @throws IOException if the JSON string is invalid with respect to APIConfigAvatarPerfLimiter
  */
  public static APIConfigAvatarPerfLimiter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIConfigAvatarPerfLimiter.class);
  }

 /**
  * Convert an instance of APIConfigAvatarPerfLimiter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

