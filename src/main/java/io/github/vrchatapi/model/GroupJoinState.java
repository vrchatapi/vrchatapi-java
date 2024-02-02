/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.16.4
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
 * Gets or Sets GroupJoinState
 */
@JsonAdapter(GroupJoinState.Adapter.class)
public enum GroupJoinState {
  
  CLOSED("closed"),
  
  INVITE("invite"),
  
  REQUEST("request"),
  
  OPEN("open");

  private String value;

  GroupJoinState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GroupJoinState fromValue(String value) {
    for (GroupJoinState b : GroupJoinState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GroupJoinState> {
    @Override
    public void write(final JsonWriter jsonWriter, final GroupJoinState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GroupJoinState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GroupJoinState.fromValue(value);
    }
  }
}

