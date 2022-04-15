/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.7.0
 * Contact: me@ariesclark.com
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

}

