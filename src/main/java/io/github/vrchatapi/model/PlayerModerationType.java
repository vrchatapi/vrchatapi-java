/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.6.8
 * Contact: me@ruby.js.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets PlayerModerationType
 */
@JsonAdapter(PlayerModerationType.Adapter.class)
public enum PlayerModerationType {
  
  MUTE("mute"),
  
  UNMUTE("unmute"),
  
  BLOCK("block"),
  
  UNBLOCK("unblock"),
  
  HIDEAVATAR("hideAvatar"),
  
  SHOWAVATAR("showAvatar");

  private String value;

  PlayerModerationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlayerModerationType fromValue(String value) {
    for (PlayerModerationType b : PlayerModerationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PlayerModerationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlayerModerationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PlayerModerationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PlayerModerationType.fromValue(value);
    }
  }
}

