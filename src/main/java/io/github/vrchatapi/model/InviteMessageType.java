/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.6.10
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
 * Gets or Sets InviteMessageType
 */
@JsonAdapter(InviteMessageType.Adapter.class)
public enum InviteMessageType {
  
  MESSAGE("message"),
  
  RESPONSE("response"),
  
  REQUEST("request"),
  
  REQUESTRESPONSE("requestResponse");

  private String value;

  InviteMessageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InviteMessageType fromValue(String value) {
    for (InviteMessageType b : InviteMessageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<InviteMessageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final InviteMessageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InviteMessageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InviteMessageType.fromValue(value);
    }
  }
}

