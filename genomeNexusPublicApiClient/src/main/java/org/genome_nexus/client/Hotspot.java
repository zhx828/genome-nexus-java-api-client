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
import org.genome_nexus.client.IntegerRange;

/**
 * Hotspot
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-16T15:36:31.946-04:00")
public class Hotspot {
  @SerializedName("aminoAcidPosition")
  private IntegerRange aminoAcidPosition = null;

  @SerializedName("hugoSymbol")
  private String hugoSymbol = null;

  @SerializedName("residue")
  private String residue = null;

  @SerializedName("transcriptId")
  private String transcriptId = null;

  @SerializedName("tumorCount")
  private Integer tumorCount = null;

  @SerializedName("tumorTypeCount")
  private Integer tumorTypeCount = null;

  @SerializedName("type")
  private String type = null;

  public Hotspot aminoAcidPosition(IntegerRange aminoAcidPosition) {
    this.aminoAcidPosition = aminoAcidPosition;
    return this;
  }

   /**
   * Amino acid position (start - end)
   * @return aminoAcidPosition
  **/
  @ApiModelProperty(value = "Amino acid position (start - end)")
  public IntegerRange getAminoAcidPosition() {
    return aminoAcidPosition;
  }

  public void setAminoAcidPosition(IntegerRange aminoAcidPosition) {
    this.aminoAcidPosition = aminoAcidPosition;
  }

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

  public Hotspot residue(String residue) {
    this.residue = residue;
    return this;
  }

   /**
   * Hotspot Residue
   * @return residue
  **/
  @ApiModelProperty(value = "Hotspot Residue")
  public String getResidue() {
    return residue;
  }

  public void setResidue(String residue) {
    this.residue = residue;
  }

  public Hotspot transcriptId(String transcriptId) {
    this.transcriptId = transcriptId;
    return this;
  }

   /**
   * Transcript id
   * @return transcriptId
  **/
  @ApiModelProperty(required = true, value = "Transcript id")
  public String getTranscriptId() {
    return transcriptId;
  }

  public void setTranscriptId(String transcriptId) {
    this.transcriptId = transcriptId;
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

  public Hotspot tumorTypeCount(Integer tumorTypeCount) {
    this.tumorTypeCount = tumorTypeCount;
    return this;
  }

   /**
   * Tumor type count
   * @return tumorTypeCount
  **/
  @ApiModelProperty(value = "Tumor type count")
  public Integer getTumorTypeCount() {
    return tumorTypeCount;
  }

  public void setTumorTypeCount(Integer tumorTypeCount) {
    this.tumorTypeCount = tumorTypeCount;
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
    return Objects.equals(this.aminoAcidPosition, hotspot.aminoAcidPosition) &&
        Objects.equals(this.hugoSymbol, hotspot.hugoSymbol) &&
        Objects.equals(this.residue, hotspot.residue) &&
        Objects.equals(this.transcriptId, hotspot.transcriptId) &&
        Objects.equals(this.tumorCount, hotspot.tumorCount) &&
        Objects.equals(this.tumorTypeCount, hotspot.tumorTypeCount) &&
        Objects.equals(this.type, hotspot.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aminoAcidPosition, hugoSymbol, residue, transcriptId, tumorCount, tumorTypeCount, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hotspot {\n");
    
    sb.append("    aminoAcidPosition: ").append(toIndentedString(aminoAcidPosition)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    residue: ").append(toIndentedString(residue)).append("\n");
    sb.append("    transcriptId: ").append(toIndentedString(transcriptId)).append("\n");
    sb.append("    tumorCount: ").append(toIndentedString(tumorCount)).append("\n");
    sb.append("    tumorTypeCount: ").append(toIndentedString(tumorTypeCount)).append("\n");
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

