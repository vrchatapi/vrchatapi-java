/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.3
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
 * FriendStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FriendStatus {
  public static final String SERIALIZED_NAME_INCOMING_REQUEST = "incomingRequest";
  @SerializedName(SERIALIZED_NAME_INCOMING_REQUEST)
  private Boolean incomingRequest = false;

  public static final String SERIALIZED_NAME_IS_FRIEND = "isFriend";
  @SerializedName(SERIALIZED_NAME_IS_FRIEND)
  private Boolean isFriend = false;

  public static final String SERIALIZED_NAME_OUTGOING_REQUEST = "outgoingRequest";
  @SerializedName(SERIALIZED_NAME_OUTGOING_REQUEST)
  private Boolean outgoingRequest = false;

  public FriendStatus() {
  }

  public FriendStatus incomingRequest(Boolean incomingRequest) {
    
    this.incomingRequest = incomingRequest;
    return this;
  }

   /**
   * Get incomingRequest
   * @return incomingRequest
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIncomingRequest() {
    return incomingRequest;
  }


  public void setIncomingRequest(Boolean incomingRequest) {
    this.incomingRequest = incomingRequest;
  }


  public FriendStatus isFriend(Boolean isFriend) {
    
    this.isFriend = isFriend;
    return this;
  }

   /**
   * Get isFriend
   * @return isFriend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsFriend() {
    return isFriend;
  }


  public void setIsFriend(Boolean isFriend) {
    this.isFriend = isFriend;
  }


  public FriendStatus outgoingRequest(Boolean outgoingRequest) {
    
    this.outgoingRequest = outgoingRequest;
    return this;
  }

   /**
   * Get outgoingRequest
   * @return outgoingRequest
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getOutgoingRequest() {
    return outgoingRequest;
  }


  public void setOutgoingRequest(Boolean outgoingRequest) {
    this.outgoingRequest = outgoingRequest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendStatus friendStatus = (FriendStatus) o;
    return Objects.equals(this.incomingRequest, friendStatus.incomingRequest) &&
        Objects.equals(this.isFriend, friendStatus.isFriend) &&
        Objects.equals(this.outgoingRequest, friendStatus.outgoingRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incomingRequest, isFriend, outgoingRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendStatus {\n");
    sb.append("    incomingRequest: ").append(toIndentedString(incomingRequest)).append("\n");
    sb.append("    isFriend: ").append(toIndentedString(isFriend)).append("\n");
    sb.append("    outgoingRequest: ").append(toIndentedString(outgoingRequest)).append("\n");
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
    openapiFields.add("incomingRequest");
    openapiFields.add("isFriend");
    openapiFields.add("outgoingRequest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("incomingRequest");
    openapiRequiredFields.add("isFriend");
    openapiRequiredFields.add("outgoingRequest");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FriendStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FriendStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FriendStatus is not found in the empty JSON string", FriendStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FriendStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FriendStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FriendStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FriendStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FriendStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FriendStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FriendStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<FriendStatus>() {
           @Override
           public void write(JsonWriter out, FriendStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FriendStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FriendStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FriendStatus
  * @throws IOException if the JSON string is invalid with respect to FriendStatus
  */
  public static FriendStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FriendStatus.class);
  }

 /**
  * Convert an instance of FriendStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

