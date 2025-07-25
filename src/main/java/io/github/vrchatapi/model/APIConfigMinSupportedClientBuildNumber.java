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
import io.github.vrchatapi.model.PlatformBuildInfo;
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
 * Minimum supported client build number for various platforms
 */
@ApiModel(description = "Minimum supported client build number for various platforms")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIConfigMinSupportedClientBuildNumber {
  public static final String SERIALIZED_NAME_APP_STORE = "AppStore";
  @SerializedName(SERIALIZED_NAME_APP_STORE)
  private PlatformBuildInfo appStore;

  public static final String SERIALIZED_NAME_DEFAULT = "Default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private PlatformBuildInfo _default;

  public static final String SERIALIZED_NAME_FIREBASE = "Firebase";
  @SerializedName(SERIALIZED_NAME_FIREBASE)
  private PlatformBuildInfo firebase;

  public static final String SERIALIZED_NAME_FIREBASEI_O_S = "FirebaseiOS";
  @SerializedName(SERIALIZED_NAME_FIREBASEI_O_S)
  private PlatformBuildInfo firebaseiOS;

  public static final String SERIALIZED_NAME_GOOGLE_PLAY = "GooglePlay";
  @SerializedName(SERIALIZED_NAME_GOOGLE_PLAY)
  private PlatformBuildInfo googlePlay;

  public static final String SERIALIZED_NAME_P_C = "PC";
  @SerializedName(SERIALIZED_NAME_P_C)
  private PlatformBuildInfo PC;

  public static final String SERIALIZED_NAME_PICO_STORE = "PicoStore";
  @SerializedName(SERIALIZED_NAME_PICO_STORE)
  private PlatformBuildInfo picoStore;

  public static final String SERIALIZED_NAME_QUEST_APP_LAB = "QuestAppLab";
  @SerializedName(SERIALIZED_NAME_QUEST_APP_LAB)
  private PlatformBuildInfo questAppLab;

  public static final String SERIALIZED_NAME_QUEST_STORE = "QuestStore";
  @SerializedName(SERIALIZED_NAME_QUEST_STORE)
  private PlatformBuildInfo questStore;

  public static final String SERIALIZED_NAME_TEST_FLIGHT = "TestFlight";
  @SerializedName(SERIALIZED_NAME_TEST_FLIGHT)
  private PlatformBuildInfo testFlight;

  public static final String SERIALIZED_NAME_XR_ELITE = "XRElite";
  @SerializedName(SERIALIZED_NAME_XR_ELITE)
  private PlatformBuildInfo xrElite;

  public APIConfigMinSupportedClientBuildNumber() {
  }

  public APIConfigMinSupportedClientBuildNumber appStore(PlatformBuildInfo appStore) {
    
    this.appStore = appStore;
    return this;
  }

   /**
   * Get appStore
   * @return appStore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlatformBuildInfo getAppStore() {
    return appStore;
  }


  public void setAppStore(PlatformBuildInfo appStore) {
    this.appStore = appStore;
  }


  public APIConfigMinSupportedClientBuildNumber _default(PlatformBuildInfo _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlatformBuildInfo getDefault() {
    return _default;
  }


  public void setDefault(PlatformBuildInfo _default) {
    this._default = _default;
  }


  public APIConfigMinSupportedClientBuildNumber firebase(PlatformBuildInfo firebase) {
    
    this.firebase = firebase;
    return this;
  }

   /**
   * Get firebase
   * @return firebase
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlatformBuildInfo getFirebase() {
    return firebase;
  }


  public void setFirebase(PlatformBuildInfo firebase) {
    this.firebase = firebase;
  }


  public APIConfigMinSupportedClientBuildNumber firebaseiOS(PlatformBuildInfo firebaseiOS) {
    
    this.firebaseiOS = firebaseiOS;
    return this;
  }

   /**
   * Get firebaseiOS
   * @return firebaseiOS
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlatformBuildInfo getFirebaseiOS() {
    return firebaseiOS;
  }


  public void setFirebaseiOS(PlatformBuildInfo firebaseiOS) {
    this.firebaseiOS = firebaseiOS;
  }


  public APIConfigMinSupportedClientBuildNumber googlePlay(PlatformBuildInfo googlePlay) {
    
    this.googlePlay = googlePlay;
    return this;
  }

   /**
   * Get googlePlay
   * @return googlePlay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlatformBuildInfo getGooglePlay() {
    return googlePlay;
  }


  public void setGooglePlay(PlatformBuildInfo googlePlay) {
    this.googlePlay = googlePlay;
  }


  public APIConfigMinSupportedClientBuildNumber PC(PlatformBuildInfo PC) {
    
    this.PC = PC;
    return this;
  }

   /**
   * Get PC
   * @return PC
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlatformBuildInfo getPC() {
    return PC;
  }


  public void setPC(PlatformBuildInfo PC) {
    this.PC = PC;
  }


  public APIConfigMinSupportedClientBuildNumber picoStore(PlatformBuildInfo picoStore) {
    
    this.picoStore = picoStore;
    return this;
  }

   /**
   * Get picoStore
   * @return picoStore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlatformBuildInfo getPicoStore() {
    return picoStore;
  }


  public void setPicoStore(PlatformBuildInfo picoStore) {
    this.picoStore = picoStore;
  }


  public APIConfigMinSupportedClientBuildNumber questAppLab(PlatformBuildInfo questAppLab) {
    
    this.questAppLab = questAppLab;
    return this;
  }

   /**
   * Get questAppLab
   * @return questAppLab
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlatformBuildInfo getQuestAppLab() {
    return questAppLab;
  }


  public void setQuestAppLab(PlatformBuildInfo questAppLab) {
    this.questAppLab = questAppLab;
  }


  public APIConfigMinSupportedClientBuildNumber questStore(PlatformBuildInfo questStore) {
    
    this.questStore = questStore;
    return this;
  }

   /**
   * Get questStore
   * @return questStore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlatformBuildInfo getQuestStore() {
    return questStore;
  }


  public void setQuestStore(PlatformBuildInfo questStore) {
    this.questStore = questStore;
  }


  public APIConfigMinSupportedClientBuildNumber testFlight(PlatformBuildInfo testFlight) {
    
    this.testFlight = testFlight;
    return this;
  }

   /**
   * Get testFlight
   * @return testFlight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlatformBuildInfo getTestFlight() {
    return testFlight;
  }


  public void setTestFlight(PlatformBuildInfo testFlight) {
    this.testFlight = testFlight;
  }


  public APIConfigMinSupportedClientBuildNumber xrElite(PlatformBuildInfo xrElite) {
    
    this.xrElite = xrElite;
    return this;
  }

   /**
   * Get xrElite
   * @return xrElite
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlatformBuildInfo getXrElite() {
    return xrElite;
  }


  public void setXrElite(PlatformBuildInfo xrElite) {
    this.xrElite = xrElite;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIConfigMinSupportedClientBuildNumber apIConfigMinSupportedClientBuildNumber = (APIConfigMinSupportedClientBuildNumber) o;
    return Objects.equals(this.appStore, apIConfigMinSupportedClientBuildNumber.appStore) &&
        Objects.equals(this._default, apIConfigMinSupportedClientBuildNumber._default) &&
        Objects.equals(this.firebase, apIConfigMinSupportedClientBuildNumber.firebase) &&
        Objects.equals(this.firebaseiOS, apIConfigMinSupportedClientBuildNumber.firebaseiOS) &&
        Objects.equals(this.googlePlay, apIConfigMinSupportedClientBuildNumber.googlePlay) &&
        Objects.equals(this.PC, apIConfigMinSupportedClientBuildNumber.PC) &&
        Objects.equals(this.picoStore, apIConfigMinSupportedClientBuildNumber.picoStore) &&
        Objects.equals(this.questAppLab, apIConfigMinSupportedClientBuildNumber.questAppLab) &&
        Objects.equals(this.questStore, apIConfigMinSupportedClientBuildNumber.questStore) &&
        Objects.equals(this.testFlight, apIConfigMinSupportedClientBuildNumber.testFlight) &&
        Objects.equals(this.xrElite, apIConfigMinSupportedClientBuildNumber.xrElite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appStore, _default, firebase, firebaseiOS, googlePlay, PC, picoStore, questAppLab, questStore, testFlight, xrElite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIConfigMinSupportedClientBuildNumber {\n");
    sb.append("    appStore: ").append(toIndentedString(appStore)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    firebase: ").append(toIndentedString(firebase)).append("\n");
    sb.append("    firebaseiOS: ").append(toIndentedString(firebaseiOS)).append("\n");
    sb.append("    googlePlay: ").append(toIndentedString(googlePlay)).append("\n");
    sb.append("    PC: ").append(toIndentedString(PC)).append("\n");
    sb.append("    picoStore: ").append(toIndentedString(picoStore)).append("\n");
    sb.append("    questAppLab: ").append(toIndentedString(questAppLab)).append("\n");
    sb.append("    questStore: ").append(toIndentedString(questStore)).append("\n");
    sb.append("    testFlight: ").append(toIndentedString(testFlight)).append("\n");
    sb.append("    xrElite: ").append(toIndentedString(xrElite)).append("\n");
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
    openapiFields.add("AppStore");
    openapiFields.add("Default");
    openapiFields.add("Firebase");
    openapiFields.add("FirebaseiOS");
    openapiFields.add("GooglePlay");
    openapiFields.add("PC");
    openapiFields.add("PicoStore");
    openapiFields.add("QuestAppLab");
    openapiFields.add("QuestStore");
    openapiFields.add("TestFlight");
    openapiFields.add("XRElite");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AppStore");
    openapiRequiredFields.add("Default");
    openapiRequiredFields.add("Firebase");
    openapiRequiredFields.add("FirebaseiOS");
    openapiRequiredFields.add("GooglePlay");
    openapiRequiredFields.add("PC");
    openapiRequiredFields.add("PicoStore");
    openapiRequiredFields.add("QuestAppLab");
    openapiRequiredFields.add("QuestStore");
    openapiRequiredFields.add("TestFlight");
    openapiRequiredFields.add("XRElite");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIConfigMinSupportedClientBuildNumber
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIConfigMinSupportedClientBuildNumber.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIConfigMinSupportedClientBuildNumber is not found in the empty JSON string", APIConfigMinSupportedClientBuildNumber.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!APIConfigMinSupportedClientBuildNumber.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APIConfigMinSupportedClientBuildNumber` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : APIConfigMinSupportedClientBuildNumber.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `AppStore`
      PlatformBuildInfo.validateJsonObject(jsonObj.getAsJsonObject("AppStore"));
      // validate the required field `Default`
      PlatformBuildInfo.validateJsonObject(jsonObj.getAsJsonObject("Default"));
      // validate the required field `Firebase`
      PlatformBuildInfo.validateJsonObject(jsonObj.getAsJsonObject("Firebase"));
      // validate the required field `FirebaseiOS`
      PlatformBuildInfo.validateJsonObject(jsonObj.getAsJsonObject("FirebaseiOS"));
      // validate the required field `GooglePlay`
      PlatformBuildInfo.validateJsonObject(jsonObj.getAsJsonObject("GooglePlay"));
      // validate the required field `PC`
      PlatformBuildInfo.validateJsonObject(jsonObj.getAsJsonObject("PC"));
      // validate the required field `PicoStore`
      PlatformBuildInfo.validateJsonObject(jsonObj.getAsJsonObject("PicoStore"));
      // validate the required field `QuestAppLab`
      PlatformBuildInfo.validateJsonObject(jsonObj.getAsJsonObject("QuestAppLab"));
      // validate the required field `QuestStore`
      PlatformBuildInfo.validateJsonObject(jsonObj.getAsJsonObject("QuestStore"));
      // validate the required field `TestFlight`
      PlatformBuildInfo.validateJsonObject(jsonObj.getAsJsonObject("TestFlight"));
      // validate the required field `XRElite`
      PlatformBuildInfo.validateJsonObject(jsonObj.getAsJsonObject("XRElite"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIConfigMinSupportedClientBuildNumber.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIConfigMinSupportedClientBuildNumber' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIConfigMinSupportedClientBuildNumber> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIConfigMinSupportedClientBuildNumber.class));

       return (TypeAdapter<T>) new TypeAdapter<APIConfigMinSupportedClientBuildNumber>() {
           @Override
           public void write(JsonWriter out, APIConfigMinSupportedClientBuildNumber value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APIConfigMinSupportedClientBuildNumber read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIConfigMinSupportedClientBuildNumber given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIConfigMinSupportedClientBuildNumber
  * @throws IOException if the JSON string is invalid with respect to APIConfigMinSupportedClientBuildNumber
  */
  public static APIConfigMinSupportedClientBuildNumber fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIConfigMinSupportedClientBuildNumber.class);
  }

 /**
  * Convert an instance of APIConfigMinSupportedClientBuildNumber to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

