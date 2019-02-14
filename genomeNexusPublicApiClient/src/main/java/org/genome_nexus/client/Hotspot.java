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
 * Hotspot
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-14T15:53:18.951-05:00")
public class Hotspot {
  @SerializedName("hugoSymbol")
  private String hugoSymbol = null;

  @SerializedName("inframeCount")
  private Integer inframeCount = null;

  @SerializedName("missenseCount")
  private Integer missenseCount = null;

  @SerializedName("residue")
  private String residue = null;

  @SerializedName("spliceCount")
  private Integer spliceCount = null;

  @SerializedName("transcriptId")
  private String transcriptId = null;

  @SerializedName("truncatingCount")
  private Integer truncatingCount = null;

  @SerializedName("tumorCount")
  private Integer tumorCount = null;

  @SerializedName("type")
  private String type = null;

  public Hotspot hugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
    return this;
  }

   /**
   * Hugo gene symbol
   * @return hugoSymbol
  **/
  @ApiModelProperty(value = "Hugo gene symbol")
  public String getHugoSymbol() {
    return hugoSymbol;
  }

  public void setHugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
  }

  public Hotspot inframeCount(Integer inframeCount) {
    this.inframeCount = inframeCount;
    return this;
  }

   /**
   * Inframe mutation count
   * @return inframeCount
  **/
  @ApiModelProperty(value = "Inframe mutation count")
  public Integer getInframeCount() {
    return inframeCount;
  }

  public void setInframeCount(Integer inframeCount) {
    this.inframeCount = inframeCount;
  }

  public Hotspot missenseCount(Integer missenseCount) {
    this.missenseCount = missenseCount;
    return this;
  }

   /**
   * Missense mutation count
   * @return missenseCount
  **/
  @ApiModelProperty(value = "Missense mutation count")
  public Integer getMissenseCount() {
    return missenseCount;
  }

  public void setMissenseCount(Integer missenseCount) {
    this.missenseCount = missenseCount;
  }

  public Hotspot residue(String residue) {
    this.residue = residue;
    return this;
  }

   /**
   * Hotspot residue
   * @return residue
  **/
  @ApiModelProperty(value = "Hotspot residue")
  public String getResidue() {
    return residue;
  }

  public void setResidue(String residue) {
    this.residue = residue;
  }

  public Hotspot spliceCount(Integer spliceCount) {
    this.spliceCount = spliceCount;
    return this;
  }

   /**
   * Splice mutation count
   * @return spliceCount
  **/
  @ApiModelProperty(value = "Splice mutation count")
  public Integer getSpliceCount() {
    return spliceCount;
  }

  public void setSpliceCount(Integer spliceCount) {
    this.spliceCount = spliceCount;
  }

  public Hotspot transcriptId(String transcriptId) {
    this.transcriptId = transcriptId;
    return this;
  }

   /**
   * Ensembl Transcript Id
   * @return transcriptId
  **/
  @ApiModelProperty(value = "Ensembl Transcript Id")
  public String getTranscriptId() {
    return transcriptId;
  }

  public void setTranscriptId(String transcriptId) {
    this.transcriptId = transcriptId;
  }

  public Hotspot truncatingCount(Integer truncatingCount) {
    this.truncatingCount = truncatingCount;
    return this;
  }

   /**
   * Truncation mutation count
   * @return truncatingCount
  **/
  @ApiModelProperty(value = "Truncation mutation count")
  public Integer getTruncatingCount() {
    return truncatingCount;
  }

  public void setTruncatingCount(Integer truncatingCount) {
    this.truncatingCount = truncatingCount;
  }

  public Hotspot tumorCount(Integer tumorCount) {
    this.tumorCount = tumorCount;
    return this;
  }

   /**
   * Tumor count
   * @return tumorCount
  **/
  @ApiModelProperty(value = "Tumor count")
  public Integer getTumorCount() {
    return tumorCount;
  }

  public void setTumorCount(Integer tumorCount) {
    this.tumorCount = tumorCount;
  }

  public Hotspot type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Hotspot type
   * @return type
  **/
  @ApiModelProperty(value = "Hotspot type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hotspot hotspot = (Hotspot) o;
    return Objects.equals(this.hugoSymbol, hotspot.hugoSymbol) &&
        Objects.equals(this.inframeCount, hotspot.inframeCount) &&
        Objects.equals(this.missenseCount, hotspot.missenseCount) &&
        Objects.equals(this.residue, hotspot.residue) &&
        Objects.equals(this.spliceCount, hotspot.spliceCount) &&
        Objects.equals(this.transcriptId, hotspot.transcriptId) &&
        Objects.equals(this.truncatingCount, hotspot.truncatingCount) &&
        Objects.equals(this.tumorCount, hotspot.tumorCount) &&
        Objects.equals(this.type, hotspot.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hugoSymbol, inframeCount, missenseCount, residue, spliceCount, transcriptId, truncatingCount, tumorCount, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hotspot {\n");
    
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    inframeCount: ").append(toIndentedString(inframeCount)).append("\n");
    sb.append("    missenseCount: ").append(toIndentedString(missenseCount)).append("\n");
    sb.append("    residue: ").append(toIndentedString(residue)).append("\n");
    sb.append("    spliceCount: ").append(toIndentedString(spliceCount)).append("\n");
    sb.append("    transcriptId: ").append(toIndentedString(transcriptId)).append("\n");
    sb.append("    truncatingCount: ").append(toIndentedString(truncatingCount)).append("\n");
    sb.append("    tumorCount: ").append(toIndentedString(tumorCount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

