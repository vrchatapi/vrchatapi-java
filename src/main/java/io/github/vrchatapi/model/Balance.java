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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Balance {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance = 0;

  public static final String SERIALIZED_NAME_NO_TRANSACTIONS = "noTransactions";
  @SerializedName(SERIALIZED_NAME_NO_TRANSACTIONS)
  private Boolean noTransactions;

  public static final String SERIALIZED_NAME_TILIA_RESPONSE = "tiliaResponse";
  @SerializedName(SERIALIZED_NAME_TILIA_RESPONSE)
  private Boolean tiliaResponse;

  public Balance() {
  }

  public Balance balance(Integer balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getBalance() {
    return balance;
  }


  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  public Balance noTransactions(Boolean noTransactions) {
    
    this.noTransactions = noTransactions;
    return this;
  }

   /**
   * Get noTransactions
   * @return noTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNoTransactions() {
    return noTransactions;
  }


  public void setNoTransactions(Boolean noTransactions) {
    this.noTransactions = noTransactions;
  }


  public Balance tiliaResponse(Boolean tiliaResponse) {
    
    this.tiliaResponse = tiliaResponse;
    return this;
  }

   /**
   * Get tiliaResponse
   * @return tiliaResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTiliaResponse() {
    return tiliaResponse;
  }


  public void setTiliaResponse(Boolean tiliaResponse) {
    this.tiliaResponse = tiliaResponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.balance, balance.balance) &&
        Objects.equals(this.noTransactions, balance.noTransactions) &&
        Objects.equals(this.tiliaResponse, balance.tiliaResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, noTransactions, tiliaResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    noTransactions: ").append(toIndentedString(noTransactions)).append("\n");
    sb.append("    tiliaResponse: ").append(toIndentedString(tiliaResponse)).append("\n");
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
    openapiFields.add("balance");
    openapiFields.add("noTransactions");
    openapiFields.add("tiliaResponse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("balance");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Balance
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Balance.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Balance is not found in the empty JSON string", Balance.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Balance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Balance` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Balance.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Balance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Balance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Balance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Balance.class));

       return (TypeAdapter<T>) new TypeAdapter<Balance>() {
           @Override
           public void write(JsonWriter out, Balance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Balance read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Balance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Balance
  * @throws IOException if the JSON string is invalid with respect to Balance
  */
  public static Balance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Balance.class);
  }

 /**
  * Convert an instance of Balance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

