/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.19.0
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
 * Gets or Sets ProductListingType
 */
@JsonAdapter(ProductListingType.Adapter.class)
public enum ProductListingType {
  
  SUBSCRIPTION("subscription");

  private String value;

  ProductListingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductListingType fromValue(String value) {
    for (ProductListingType b : ProductListingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProductListingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProductListingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProductListingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProductListingType.fromValue(value);
    }
  }
}

