/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.17.0
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
 * APIConfigEvents
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIConfigEvents {
  public static final String SERIALIZED_NAME_DISTANCE_CLOSE = "distanceClose";
  @SerializedName(SERIALIZED_NAME_DISTANCE_CLOSE)
  private Integer distanceClose;

  public static final String SERIALIZED_NAME_DISTANCE_FACTOR = "distanceFactor";
  @SerializedName(SERIALIZED_NAME_DISTANCE_FACTOR)
  private Integer distanceFactor;

  public static final String SERIALIZED_NAME_DISTANCE_FAR = "distanceFar";
  @SerializedName(SERIALIZED_NAME_DISTANCE_FAR)
  private Integer distanceFar;

  public static final String SERIALIZED_NAME_GROUP_DISTANCE = "groupDistance";
  @SerializedName(SERIALIZED_NAME_GROUP_DISTANCE)
  private Integer groupDistance;

  public static final String SERIALIZED_NAME_MAXIMUM_BUNCH_SIZE = "maximumBunchSize";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_BUNCH_SIZE)
  private Integer maximumBunchSize;

  public static final String SERIALIZED_NAME_NOT_VISIBLE_FACTOR = "notVisibleFactor";
  @SerializedName(SERIALIZED_NAME_NOT_VISIBLE_FACTOR)
  private Integer notVisibleFactor;

  public static final String SERIALIZED_NAME_PLAYER_ORDER_BUCKET_SIZE = "playerOrderBucketSize";
  @SerializedName(SERIALIZED_NAME_PLAYER_ORDER_BUCKET_SIZE)
  private Integer playerOrderBucketSize;

  public static final String SERIALIZED_NAME_PLAYER_ORDER_FACTOR = "playerOrderFactor";
  @SerializedName(SERIALIZED_NAME_PLAYER_ORDER_FACTOR)
  private Integer playerOrderFactor;

  public static final String SERIALIZED_NAME_SLOW_UPDATE_FACTOR_THRESHOLD = "slowUpdateFactorThreshold";
  @SerializedName(SERIALIZED_NAME_SLOW_UPDATE_FACTOR_THRESHOLD)
  private Integer slowUpdateFactorThreshold;

  public static final String SERIALIZED_NAME_VIEW_SEGMENT_LENGTH = "viewSegmentLength";
  @SerializedName(SERIALIZED_NAME_VIEW_SEGMENT_LENGTH)
  private Integer viewSegmentLength;

  public APIConfigEvents() {
  }

  public APIConfigEvents distanceClose(Integer distanceClose) {
    
    this.distanceClose = distanceClose;
    return this;
  }

   /**
   * Unknown
   * @return distanceClose
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public Integer getDistanceClose() {
    return distanceClose;
  }


  public void setDistanceClose(Integer distanceClose) {
    this.distanceClose = distanceClose;
  }


  public APIConfigEvents distanceFactor(Integer distanceFactor) {
    
    this.distanceFactor = distanceFactor;
    return this;
  }

   /**
   * Unknown
   * @return distanceFactor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public Integer getDistanceFactor() {
    return distanceFactor;
  }


  public void setDistanceFactor(Integer distanceFactor) {
    this.distanceFactor = distanceFactor;
  }


  public APIConfigEvents distanceFar(Integer distanceFar) {
    
    this.distanceFar = distanceFar;
    return this;
  }

   /**
   * Unknown
   * @return distanceFar
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public Integer getDistanceFar() {
    return distanceFar;
  }


  public void setDistanceFar(Integer distanceFar) {
    this.distanceFar = distanceFar;
  }


  public APIConfigEvents groupDistance(Integer groupDistance) {
    
    this.groupDistance = groupDistance;
    return this;
  }

   /**
   * Unknown
   * @return groupDistance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public Integer getGroupDistance() {
    return groupDistance;
  }


  public void setGroupDistance(Integer groupDistance) {
    this.groupDistance = groupDistance;
  }


  public APIConfigEvents maximumBunchSize(Integer maximumBunchSize) {
    
    this.maximumBunchSize = maximumBunchSize;
    return this;
  }

   /**
   * Unknown
   * @return maximumBunchSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public Integer getMaximumBunchSize() {
    return maximumBunchSize;
  }


  public void setMaximumBunchSize(Integer maximumBunchSize) {
    this.maximumBunchSize = maximumBunchSize;
  }


  public APIConfigEvents notVisibleFactor(Integer notVisibleFactor) {
    
    this.notVisibleFactor = notVisibleFactor;
    return this;
  }

   /**
   * Unknown
   * @return notVisibleFactor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public Integer getNotVisibleFactor() {
    return notVisibleFactor;
  }


  public void setNotVisibleFactor(Integer notVisibleFactor) {
    this.notVisibleFactor = notVisibleFactor;
  }


  public APIConfigEvents playerOrderBucketSize(Integer playerOrderBucketSize) {
    
    this.playerOrderBucketSize = playerOrderBucketSize;
    return this;
  }

   /**
   * Unknown
   * @return playerOrderBucketSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public Integer getPlayerOrderBucketSize() {
    return playerOrderBucketSize;
  }


  public void setPlayerOrderBucketSize(Integer playerOrderBucketSize) {
    this.playerOrderBucketSize = playerOrderBucketSize;
  }


  public APIConfigEvents playerOrderFactor(Integer playerOrderFactor) {
    
    this.playerOrderFactor = playerOrderFactor;
    return this;
  }

   /**
   * Unknown
   * @return playerOrderFactor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public Integer getPlayerOrderFactor() {
    return playerOrderFactor;
  }


  public void setPlayerOrderFactor(Integer playerOrderFactor) {
    this.playerOrderFactor = playerOrderFactor;
  }


  public APIConfigEvents slowUpdateFactorThreshold(Integer slowUpdateFactorThreshold) {
    
    this.slowUpdateFactorThreshold = slowUpdateFactorThreshold;
    return this;
  }

   /**
   * Unknown
   * @return slowUpdateFactorThreshold
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public Integer getSlowUpdateFactorThreshold() {
    return slowUpdateFactorThreshold;
  }


  public void setSlowUpdateFactorThreshold(Integer slowUpdateFactorThreshold) {
    this.slowUpdateFactorThreshold = slowUpdateFactorThreshold;
  }


  public APIConfigEvents viewSegmentLength(Integer viewSegmentLength) {
    
    this.viewSegmentLength = viewSegmentLength;
    return this;
  }

   /**
   * Unknown
   * @return viewSegmentLength
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public Integer getViewSegmentLength() {
    return viewSegmentLength;
  }


  public void setViewSegmentLength(Integer viewSegmentLength) {
    this.viewSegmentLength = viewSegmentLength;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIConfigEvents apIConfigEvents = (APIConfigEvents) o;
    return Objects.equals(this.distanceClose, apIConfigEvents.distanceClose) &&
        Objects.equals(this.distanceFactor, apIConfigEvents.distanceFactor) &&
        Objects.equals(this.distanceFar, apIConfigEvents.distanceFar) &&
        Objects.equals(this.groupDistance, apIConfigEvents.groupDistance) &&
        Objects.equals(this.maximumBunchSize, apIConfigEvents.maximumBunchSize) &&
        Objects.equals(this.notVisibleFactor, apIConfigEvents.notVisibleFactor) &&
        Objects.equals(this.playerOrderBucketSize, apIConfigEvents.playerOrderBucketSize) &&
        Objects.equals(this.playerOrderFactor, apIConfigEvents.playerOrderFactor) &&
        Objects.equals(this.slowUpdateFactorThreshold, apIConfigEvents.slowUpdateFactorThreshold) &&
        Objects.equals(this.viewSegmentLength, apIConfigEvents.viewSegmentLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distanceClose, distanceFactor, distanceFar, groupDistance, maximumBunchSize, notVisibleFactor, playerOrderBucketSize, playerOrderFactor, slowUpdateFactorThreshold, viewSegmentLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIConfigEvents {\n");
    sb.append("    distanceClose: ").append(toIndentedString(distanceClose)).append("\n");
    sb.append("    distanceFactor: ").append(toIndentedString(distanceFactor)).append("\n");
    sb.append("    distanceFar: ").append(toIndentedString(distanceFar)).append("\n");
    sb.append("    groupDistance: ").append(toIndentedString(groupDistance)).append("\n");
    sb.append("    maximumBunchSize: ").append(toIndentedString(maximumBunchSize)).append("\n");
    sb.append("    notVisibleFactor: ").append(toIndentedString(notVisibleFactor)).append("\n");
    sb.append("    playerOrderBucketSize: ").append(toIndentedString(playerOrderBucketSize)).append("\n");
    sb.append("    playerOrderFactor: ").append(toIndentedString(playerOrderFactor)).append("\n");
    sb.append("    slowUpdateFactorThreshold: ").append(toIndentedString(slowUpdateFactorThreshold)).append("\n");
    sb.append("    viewSegmentLength: ").append(toIndentedString(viewSegmentLength)).append("\n");
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
    openapiFields.add("distanceClose");
    openapiFields.add("distanceFactor");
    openapiFields.add("distanceFar");
    openapiFields.add("groupDistance");
    openapiFields.add("maximumBunchSize");
    openapiFields.add("notVisibleFactor");
    openapiFields.add("playerOrderBucketSize");
    openapiFields.add("playerOrderFactor");
    openapiFields.add("slowUpdateFactorThreshold");
    openapiFields.add("viewSegmentLength");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("distanceClose");
    openapiRequiredFields.add("distanceFactor");
    openapiRequiredFields.add("distanceFar");
    openapiRequiredFields.add("groupDistance");
    openapiRequiredFields.add("maximumBunchSize");
    openapiRequiredFields.add("notVisibleFactor");
    openapiRequiredFields.add("playerOrderBucketSize");
    openapiRequiredFields.add("playerOrderFactor");
    openapiRequiredFields.add("slowUpdateFactorThreshold");
    openapiRequiredFields.add("viewSegmentLength");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIConfigEvents
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIConfigEvents.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIConfigEvents is not found in the empty JSON string", APIConfigEvents.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!APIConfigEvents.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APIConfigEvents` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : APIConfigEvents.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIConfigEvents.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIConfigEvents' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIConfigEvents> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIConfigEvents.class));

       return (TypeAdapter<T>) new TypeAdapter<APIConfigEvents>() {
           @Override
           public void write(JsonWriter out, APIConfigEvents value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APIConfigEvents read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIConfigEvents given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIConfigEvents
  * @throws IOException if the JSON string is invalid with respect to APIConfigEvents
  */
  public static APIConfigEvents fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIConfigEvents.class);
  }

 /**
  * Convert an instance of APIConfigEvents to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

