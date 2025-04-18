/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.19.2
 * Contact: vrchatapi.lpv0t@aries.fyi
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Defines the User&#39;s current status, for example \&quot;ask me\&quot;, \&quot;join me\&quot; or \&quot;offline. This status is a combined indicator of their online activity and privacy preference.
 */
@JsonAdapter(UserStatus.Adapter.class)
public enum UserStatus {
  
  ACTIVE("active"),
  
  JOIN_ME("join me"),
  
  ASK_ME("ask me"),
  
  BUSY("busy"),
  
  OFFLINE("offline");

  private String value;

  UserStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserStatus fromValue(String value) {
    for (UserStatus b : UserStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<UserStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final UserStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UserStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UserStatus.fromValue(value);
    }
  }
}

