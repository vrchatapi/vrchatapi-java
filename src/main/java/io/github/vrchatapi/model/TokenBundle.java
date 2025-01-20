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
 * TokenBundle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TokenBundle {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STEAM_ITEM_ID = "steamItemId";
  @SerializedName(SERIALIZED_NAME_STEAM_ITEM_ID)
  private String steamItemId;

  public static final String SERIALIZED_NAME_OCULUS_SKU = "oculusSku";
  @SerializedName(SERIALIZED_NAME_OCULUS_SKU)
  private String oculusSku;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TOKENS = "tokens";
  @SerializedName(SERIALIZED_NAME_TOKENS)
  private Integer tokens;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public TokenBundle() {
  }

  public TokenBundle id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TokenBundle steamItemId(String steamItemId) {
    
    this.steamItemId = steamItemId;
    return this;
  }

   /**
   * Get steamItemId
   * @return steamItemId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSteamItemId() {
    return steamItemId;
  }


  public void setSteamItemId(String steamItemId) {
    this.steamItemId = steamItemId;
  }


  public TokenBundle oculusSku(String oculusSku) {
    
    this.oculusSku = oculusSku;
    return this;
  }

   /**
   * Get oculusSku
   * @return oculusSku
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getOculusSku() {
    return oculusSku;
  }


  public void setOculusSku(String oculusSku) {
    this.oculusSku = oculusSku;
  }


  public TokenBundle amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * price of the bundle
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "price of the bundle")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public TokenBundle description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TokenBundle tokens(Integer tokens) {
    
    this.tokens = tokens;
    return this;
  }

   /**
   * number of tokens received
   * @return tokens
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "number of tokens received")

  public Integer getTokens() {
    return tokens;
  }


  public void setTokens(Integer tokens) {
    this.tokens = tokens;
  }


  public TokenBundle imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * direct url to image
   * @return imageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "direct url to image")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenBundle tokenBundle = (TokenBundle) o;
    return Objects.equals(this.id, tokenBundle.id) &&
        Objects.equals(this.steamItemId, tokenBundle.steamItemId) &&
        Objects.equals(this.oculusSku, tokenBundle.oculusSku) &&
        Objects.equals(this.amount, tokenBundle.amount) &&
        Objects.equals(this.description, tokenBundle.description) &&
        Objects.equals(this.tokens, tokenBundle.tokens) &&
        Objects.equals(this.imageUrl, tokenBundle.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, steamItemId, oculusSku, amount, description, tokens, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenBundle {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    steamItemId: ").append(toIndentedString(steamItemId)).append("\n");
    sb.append("    oculusSku: ").append(toIndentedString(oculusSku)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("steamItemId");
    openapiFields.add("oculusSku");
    openapiFields.add("amount");
    openapiFields.add("description");
    openapiFields.add("tokens");
    openapiFields.add("imageUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("steamItemId");
    openapiRequiredFields.add("oculusSku");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("tokens");
    openapiRequiredFields.add("imageUrl");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TokenBundle
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TokenBundle.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenBundle is not found in the empty JSON string", TokenBundle.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TokenBundle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenBundle` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TokenBundle.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("steamItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `steamItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("steamItemId").toString()));
      }
      if (!jsonObj.get("oculusSku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oculusSku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oculusSku").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenBundle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenBundle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenBundle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenBundle.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenBundle>() {
           @Override
           public void write(JsonWriter out, TokenBundle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenBundle read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokenBundle given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenBundle
  * @throws IOException if the JSON string is invalid with respect to TokenBundle
  */
  public static TokenBundle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenBundle.class);
  }

 /**
  * Convert an instance of TokenBundle to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

