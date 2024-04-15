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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets GroupPrivacy
 */
@JsonAdapter(GroupPrivacy.Adapter.class)
public enum GroupPrivacy {
  
  DEFAULT("default"),
  
  PRIVATE("private");

  private String value;

  GroupPrivacy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GroupPrivacy fromValue(String value) {
    for (GroupPrivacy b : GroupPrivacy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GroupPrivacy> {
    @Override
    public void write(final JsonWriter jsonWriter, final GroupPrivacy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GroupPrivacy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GroupPrivacy.fromValue(value);
    }
  }
}

