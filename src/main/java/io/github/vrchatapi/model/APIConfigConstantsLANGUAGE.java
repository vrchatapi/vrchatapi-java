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
import java.util.HashMap;
import java.util.Map;

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
 * Language-related constants
 */
@ApiModel(description = "Language-related constants")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIConfigConstantsLANGUAGE {
  public static final String SERIALIZED_NAME_S_P_O_K_E_N_L_A_N_G_U_A_G_E_O_P_T_I_O_N_S = "SPOKEN_LANGUAGE_OPTIONS";
  @SerializedName(SERIALIZED_NAME_S_P_O_K_E_N_L_A_N_G_U_A_G_E_O_P_T_I_O_N_S)
  private Map<String, String> SPOKEN_LANGUAGE_OPTIONS = null;

  public APIConfigConstantsLANGUAGE() {
  }

  public APIConfigConstantsLANGUAGE SPOKEN_LANGUAGE_OPTIONS(Map<String, String> SPOKEN_LANGUAGE_OPTIONS) {
    
    this.SPOKEN_LANGUAGE_OPTIONS = SPOKEN_LANGUAGE_OPTIONS;
    return this;
  }

  public APIConfigConstantsLANGUAGE putSPOKENLANGUAGEOPTIONSItem(String key, String SPOKEN_LANGUAGE_OPTIONSItem) {
    if (this.SPOKEN_LANGUAGE_OPTIONS == null) {
      this.SPOKEN_LANGUAGE_OPTIONS = new HashMap<>();
    }
    this.SPOKEN_LANGUAGE_OPTIONS.put(key, SPOKEN_LANGUAGE_OPTIONSItem);
    return this;
  }

   /**
   * Supported spoken language options
   * @return SPOKEN_LANGUAGE_OPTIONS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Supported spoken language options")

  public Map<String, String> getSPOKENLANGUAGEOPTIONS() {
    return SPOKEN_LANGUAGE_OPTIONS;
  }


  public void setSPOKENLANGUAGEOPTIONS(Map<String, String> SPOKEN_LANGUAGE_OPTIONS) {
    this.SPOKEN_LANGUAGE_OPTIONS = SPOKEN_LANGUAGE_OPTIONS;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIConfigConstantsLANGUAGE apIConfigConstantsLANGUAGE = (APIConfigConstantsLANGUAGE) o;
    return Objects.equals(this.SPOKEN_LANGUAGE_OPTIONS, apIConfigConstantsLANGUAGE.SPOKEN_LANGUAGE_OPTIONS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(SPOKEN_LANGUAGE_OPTIONS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIConfigConstantsLANGUAGE {\n");
    sb.append("    SPOKEN_LANGUAGE_OPTIONS: ").append(toIndentedString(SPOKEN_LANGUAGE_OPTIONS)).append("\n");
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
    openapiFields.add("SPOKEN_LANGUAGE_OPTIONS");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIConfigConstantsLANGUAGE
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIConfigConstantsLANGUAGE.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIConfigConstantsLANGUAGE is not found in the empty JSON string", APIConfigConstantsLANGUAGE.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!APIConfigConstantsLANGUAGE.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APIConfigConstantsLANGUAGE` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIConfigConstantsLANGUAGE.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIConfigConstantsLANGUAGE' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIConfigConstantsLANGUAGE> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIConfigConstantsLANGUAGE.class));

       return (TypeAdapter<T>) new TypeAdapter<APIConfigConstantsLANGUAGE>() {
           @Override
           public void write(JsonWriter out, APIConfigConstantsLANGUAGE value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APIConfigConstantsLANGUAGE read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIConfigConstantsLANGUAGE given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIConfigConstantsLANGUAGE
  * @throws IOException if the JSON string is invalid with respect to APIConfigConstantsLANGUAGE
  */
  public static APIConfigConstantsLANGUAGE fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIConfigConstantsLANGUAGE.class);
  }

 /**
  * Convert an instance of APIConfigConstantsLANGUAGE to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

