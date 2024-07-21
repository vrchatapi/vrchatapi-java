/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.0
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
 * Instance region
 */
@JsonAdapter(InstanceRegion.Adapter.class)
public enum InstanceRegion {
  
  US("us"),
  
  USE("use"),
  
  EU("eu"),
  
  JP("jp");

  private String value;

  InstanceRegion(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InstanceRegion fromValue(String value) {
    for (InstanceRegion b : InstanceRegion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<InstanceRegion> {
    @Override
    public void write(final JsonWriter jsonWriter, final InstanceRegion enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InstanceRegion read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InstanceRegion.fromValue(value);
    }
  }
}

