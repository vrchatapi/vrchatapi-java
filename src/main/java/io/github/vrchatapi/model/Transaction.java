/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.17.5
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
import io.github.vrchatapi.model.Subscription;
import io.github.vrchatapi.model.TransactionAgreement;
import io.github.vrchatapi.model.TransactionStatus;
import io.github.vrchatapi.model.TransactionSteamInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
public class Transaction {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_USER_DISPLAY_NAME = "userDisplayName";
  @SerializedName(SERIALIZED_NAME_USER_DISPLAY_NAME)
  private String userDisplayName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TransactionStatus status = TransactionStatus.ACTIVE;

  public static final String SERIALIZED_NAME_SUBSCRIPTION = "subscription";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION)
  private Subscription subscription;

  public static final String SERIALIZED_NAME_SANDBOX = "sandbox";
  @SerializedName(SERIALIZED_NAME_SANDBOX)
  private Boolean sandbox = false;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_STEAM = "steam";
  @SerializedName(SERIALIZED_NAME_STEAM)
  private TransactionSteamInfo steam;

  public static final String SERIALIZED_NAME_AGREEMENT = "agreement";
  @SerializedName(SERIALIZED_NAME_AGREEMENT)
  private TransactionAgreement agreement;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_IS_GIFT = "isGift";
  @SerializedName(SERIALIZED_NAME_IS_GIFT)
  private Boolean isGift = false;

  public static final String SERIALIZED_NAME_IS_TOKENS = "isTokens";
  @SerializedName(SERIALIZED_NAME_IS_TOKENS)
  private Boolean isTokens = false;

  public Transaction() {
  }

  public Transaction id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "txn_e5c72948-e735-4880-8245-24b2a41198b0", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Transaction userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public Transaction userDisplayName(String userDisplayName) {
    
    this.userDisplayName = userDisplayName;
    return this;
  }

   /**
   * Get userDisplayName
   * @return userDisplayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserDisplayName() {
    return userDisplayName;
  }


  public void setUserDisplayName(String userDisplayName) {
    this.userDisplayName = userDisplayName;
  }


  public Transaction status(TransactionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TransactionStatus getStatus() {
    return status;
  }


  public void setStatus(TransactionStatus status) {
    this.status = status;
  }


  public Transaction subscription(Subscription subscription) {
    
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Subscription getSubscription() {
    return subscription;
  }


  public void setSubscription(Subscription subscription) {
    this.subscription = subscription;
  }


  public Transaction sandbox(Boolean sandbox) {
    
    this.sandbox = sandbox;
    return this;
  }

   /**
   * Get sandbox
   * @return sandbox
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getSandbox() {
    return sandbox;
  }


  public void setSandbox(Boolean sandbox) {
    this.sandbox = sandbox;
  }


  public Transaction createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Transaction updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Transaction steam(TransactionSteamInfo steam) {
    
    this.steam = steam;
    return this;
  }

   /**
   * Get steam
   * @return steam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionSteamInfo getSteam() {
    return steam;
  }


  public void setSteam(TransactionSteamInfo steam) {
    this.steam = steam;
  }


  public Transaction agreement(TransactionAgreement agreement) {
    
    this.agreement = agreement;
    return this;
  }

   /**
   * Get agreement
   * @return agreement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionAgreement getAgreement() {
    return agreement;
  }


  public void setAgreement(TransactionAgreement agreement) {
    this.agreement = agreement;
  }


  public Transaction error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public Transaction isGift(Boolean isGift) {
    
    this.isGift = isGift;
    return this;
  }

   /**
   * Get isGift
   * @return isGift
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsGift() {
    return isGift;
  }


  public void setIsGift(Boolean isGift) {
    this.isGift = isGift;
  }


  public Transaction isTokens(Boolean isTokens) {
    
    this.isTokens = isTokens;
    return this;
  }

   /**
   * Get isTokens
   * @return isTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsTokens() {
    return isTokens;
  }


  public void setIsTokens(Boolean isTokens) {
    this.isTokens = isTokens;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.userId, transaction.userId) &&
        Objects.equals(this.userDisplayName, transaction.userDisplayName) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.subscription, transaction.subscription) &&
        Objects.equals(this.sandbox, transaction.sandbox) &&
        Objects.equals(this.createdAt, transaction.createdAt) &&
        Objects.equals(this.updatedAt, transaction.updatedAt) &&
        Objects.equals(this.steam, transaction.steam) &&
        Objects.equals(this.agreement, transaction.agreement) &&
        Objects.equals(this.error, transaction.error) &&
        Objects.equals(this.isGift, transaction.isGift) &&
        Objects.equals(this.isTokens, transaction.isTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, userDisplayName, status, subscription, sandbox, createdAt, updatedAt, steam, agreement, error, isGift, isTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userDisplayName: ").append(toIndentedString(userDisplayName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    steam: ").append(toIndentedString(steam)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    isGift: ").append(toIndentedString(isGift)).append("\n");
    sb.append("    isTokens: ").append(toIndentedString(isTokens)).append("\n");
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
    openapiFields.add("userId");
    openapiFields.add("userDisplayName");
    openapiFields.add("status");
    openapiFields.add("subscription");
    openapiFields.add("sandbox");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("steam");
    openapiFields.add("agreement");
    openapiFields.add("error");
    openapiFields.add("isGift");
    openapiFields.add("isTokens");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("subscription");
    openapiRequiredFields.add("sandbox");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("error");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Transaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Transaction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Transaction is not found in the empty JSON string", Transaction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Transaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Transaction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Transaction.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("userDisplayName") != null && !jsonObj.get("userDisplayName").isJsonNull()) && !jsonObj.get("userDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userDisplayName").toString()));
      }
      // validate the required field `subscription`
      Subscription.validateJsonObject(jsonObj.getAsJsonObject("subscription"));
      // validate the optional field `steam`
      if (jsonObj.get("steam") != null && !jsonObj.get("steam").isJsonNull()) {
        TransactionSteamInfo.validateJsonObject(jsonObj.getAsJsonObject("steam"));
      }
      // validate the optional field `agreement`
      if (jsonObj.get("agreement") != null && !jsonObj.get("agreement").isJsonNull()) {
        TransactionAgreement.validateJsonObject(jsonObj.getAsJsonObject("agreement"));
      }
      if (!jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Transaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Transaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Transaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Transaction.class));

       return (TypeAdapter<T>) new TypeAdapter<Transaction>() {
           @Override
           public void write(JsonWriter out, Transaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Transaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Transaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Transaction
  * @throws IOException if the JSON string is invalid with respect to Transaction
  */
  public static Transaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Transaction.class);
  }

 /**
  * Convert an instance of Transaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

