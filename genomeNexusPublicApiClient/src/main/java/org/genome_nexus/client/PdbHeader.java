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
 * PdbHeader
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-14T15:53:18.951-05:00")
public class PdbHeader {
  @SerializedName("compound")
  private Object compound = null;

  @SerializedName("pdbId")
  private String pdbId = null;

  @SerializedName("source")
  private Object source = null;

  @SerializedName("title")
  private String title = null;

  public PdbHeader compound(Object compound) {
    this.compound = compound;
    return this;
  }

   /**
   * Get compound
   * @return compound
  **/
  @ApiModelProperty(value = "")
  public Object getCompound() {
    return compound;
  }

  public void setCompound(Object compound) {
    this.compound = compound;
  }

  public PdbHeader pdbId(String pdbId) {
    this.pdbId = pdbId;
    return this;
  }

   /**
   * PDB id
   * @return pdbId
  **/
  @ApiModelProperty(required = true, value = "PDB id")
  public String getPdbId() {
    return pdbId;
  }

  public void setPdbId(String pdbId) {
    this.pdbId = pdbId;
  }

  public PdbHeader source(Object source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public Object getSource() {
    return source;
  }

  public void setSource(Object source) {
    this.source = source;
  }

  public PdbHeader title(String title) {
    this.title = title;
    return this;
  }

   /**
   * PDB description
   * @return title
  **/
  @ApiModelProperty(required = true, value = "PDB description")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdbHeader pdbHeader = (PdbHeader) o;
    return Objects.equals(this.compound, pdbHeader.compound) &&
        Objects.equals(this.pdbId, pdbHeader.pdbId) &&
        Objects.equals(this.source, pdbHeader.source) &&
        Objects.equals(this.title, pdbHeader.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compound, pdbId, source, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdbHeader {\n");
    
    sb.append("    compound: ").append(toIndentedString(compound)).append("\n");
    sb.append("    pdbId: ").append(toIndentedString(pdbId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

