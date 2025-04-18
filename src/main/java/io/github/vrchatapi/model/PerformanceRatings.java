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
 * Avatar Performance ratings.
 */
@JsonAdapter(PerformanceRatings.Adapter.class)
public enum PerformanceRatings {
  
  NONE("None"),
  
  EXCELLENT("Excellent"),
  
  GOOD("Good"),
  
  MEDIUM("Medium"),
  
  POOR("Poor"),
  
  VERYPOOR("VeryPoor");

  private String value;

  PerformanceRatings(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PerformanceRatings fromValue(String value) {
    for (PerformanceRatings b : PerformanceRatings.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PerformanceRatings> {
    @Override
    public void write(final JsonWriter jsonWriter, final PerformanceRatings enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PerformanceRatings read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PerformanceRatings.fromValue(value);
    }
  }
}

