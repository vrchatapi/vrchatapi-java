/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.16.8
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
 * Gets or Sets SortOption
 */
@JsonAdapter(SortOption.Adapter.class)
public enum SortOption {
  
  POPULARITY("popularity"),
  
  HEAT("heat"),
  
  TRUST("trust"),
  
  SHUFFLE("shuffle"),
  
  RANDOM("random"),
  
  FAVORITES("favorites"),
  
  REPORTSCORE("reportScore"),
  
  REPORTCOUNT("reportCount"),
  
  PUBLICATIONDATE("publicationDate"),
  
  LABSPUBLICATIONDATE("labsPublicationDate"),
  
  CREATED("created"),
  
  _CREATED_AT("_created_at"),
  
  UPDATED("updated"),
  
  _UPDATED_AT("_updated_at"),
  
  ORDER("order"),
  
  RELEVANCE("relevance"),
  
  MAGIC("magic"),
  
  NAME("name");

  private String value;

  SortOption(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SortOption fromValue(String value) {
    for (SortOption b : SortOption.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SortOption> {
    @Override
    public void write(final JsonWriter jsonWriter, final SortOption enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SortOption read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SortOption.fromValue(value);
    }
  }
}

