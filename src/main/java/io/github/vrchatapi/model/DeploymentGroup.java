/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.15.0
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
 * Used to identify which API deployment cluster is currently responding.  &#x60;blue&#x60; and &#x60;green&#x60; are used by Production. &#x60;grape&#x60;and &#x60;cherry&#x60; are used during Development.  [Blue Green Deployment by Martin Fowler](https://martinfowler.com/bliki/BlueGreenDeployment.html)
 */
@JsonAdapter(DeploymentGroup.Adapter.class)
public enum DeploymentGroup {
  
  BLUE("blue"),
  
  GREEN("green"),
  
  GRAPE("grape"),
  
  CHERRY("cherry");

  private String value;

  DeploymentGroup(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeploymentGroup fromValue(String value) {
    for (DeploymentGroup b : DeploymentGroup.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DeploymentGroup> {
    @Override
    public void write(final JsonWriter jsonWriter, final DeploymentGroup enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DeploymentGroup read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DeploymentGroup.fromValue(value);
    }
  }
}

