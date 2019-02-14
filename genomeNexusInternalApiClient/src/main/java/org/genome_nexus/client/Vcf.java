/*
 * Genome Nexus API
 * Genome Nexus Variant Annotation API
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.genome_nexus.client;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Vcf
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-14T15:53:20.092-05:00")
public class Vcf {
  @SerializedName("alt")
  private String alt = null;

  @SerializedName("position")
  private String position = null;

  @SerializedName("ref")
  private String ref = null;

  public Vcf alt(String alt) {
    this.alt = alt;
    return this;
  }

   /**
   * alt
   * @return alt
  **/
  @ApiModelProperty(value = "alt")
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  public Vcf position(String position) {
    this.position = position;
    return this;
  }

   /**
   * position
   * @return position
  **/
  @ApiModelProperty(value = "position")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Vcf ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * ref
   * @return ref
  **/
  @ApiModelProperty(value = "ref")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vcf vcf = (Vcf) o;
    return Objects.equals(this.alt, vcf.alt) &&
        Objects.equals(this.position, vcf.position) &&
        Objects.equals(this.ref, vcf.ref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, position, ref);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vcf {\n");
    
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

