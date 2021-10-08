/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.4.2
 * Contact: me@ruby.js.org
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

/**
 * APIEventConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIEventConfig {
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


  public APIEventConfig distanceClose(Integer distanceClose) {
    
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


  public APIEventConfig distanceFactor(Integer distanceFactor) {
    
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


  public APIEventConfig distanceFar(Integer distanceFar) {
    
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


  public APIEventConfig groupDistance(Integer groupDistance) {
    
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


  public APIEventConfig maximumBunchSize(Integer maximumBunchSize) {
    
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


  public APIEventConfig notVisibleFactor(Integer notVisibleFactor) {
    
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


  public APIEventConfig playerOrderBucketSize(Integer playerOrderBucketSize) {
    
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


  public APIEventConfig playerOrderFactor(Integer playerOrderFactor) {
    
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


  public APIEventConfig slowUpdateFactorThreshold(Integer slowUpdateFactorThreshold) {
    
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


  public APIEventConfig viewSegmentLength(Integer viewSegmentLength) {
    
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
    APIEventConfig apIEventConfig = (APIEventConfig) o;
    return Objects.equals(this.distanceClose, apIEventConfig.distanceClose) &&
        Objects.equals(this.distanceFactor, apIEventConfig.distanceFactor) &&
        Objects.equals(this.distanceFar, apIEventConfig.distanceFar) &&
        Objects.equals(this.groupDistance, apIEventConfig.groupDistance) &&
        Objects.equals(this.maximumBunchSize, apIEventConfig.maximumBunchSize) &&
        Objects.equals(this.notVisibleFactor, apIEventConfig.notVisibleFactor) &&
        Objects.equals(this.playerOrderBucketSize, apIEventConfig.playerOrderBucketSize) &&
        Objects.equals(this.playerOrderFactor, apIEventConfig.playerOrderFactor) &&
        Objects.equals(this.slowUpdateFactorThreshold, apIEventConfig.slowUpdateFactorThreshold) &&
        Objects.equals(this.viewSegmentLength, apIEventConfig.viewSegmentLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distanceClose, distanceFactor, distanceFar, groupDistance, maximumBunchSize, notVisibleFactor, playerOrderBucketSize, playerOrderFactor, slowUpdateFactorThreshold, viewSegmentLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEventConfig {\n");
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

}

