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
import java.util.ArrayList;
import java.util.List;
import org.genome_nexus.client.GenomicLocation;
import org.genome_nexus.client.TranscriptConsequenceSummary;

/**
 * VariantAnnotationSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-16T15:36:31.946-04:00")
public class VariantAnnotationSummary {
  @SerializedName("assemblyName")
  private String assemblyName = null;

  @SerializedName("canonicalTranscriptId")
  private String canonicalTranscriptId = null;

  @SerializedName("genomicLocation")
  private GenomicLocation genomicLocation = null;

  @SerializedName("strandSign")
  private String strandSign = null;

  @SerializedName("transcriptConsequences")
  private List<TranscriptConsequenceSummary> transcriptConsequences = new ArrayList<TranscriptConsequenceSummary>();

  @SerializedName("variant")
  private String variant = null;

  @SerializedName("variantType")
  private String variantType = null;

  public VariantAnnotationSummary assemblyName(String assemblyName) {
    this.assemblyName = assemblyName;
    return this;
  }

   /**
   * Assembly name
   * @return assemblyName
  **/
  @ApiModelProperty(value = "Assembly name")
  public String getAssemblyName() {
    return assemblyName;
  }

  public void setAssemblyName(String assemblyName) {
    this.assemblyName = assemblyName;
  }

  public VariantAnnotationSummary canonicalTranscriptId(String canonicalTranscriptId) {
    this.canonicalTranscriptId = canonicalTranscriptId;
    return this;
  }

   /**
   * Canonical transcript id
   * @return canonicalTranscriptId
  **/
  @ApiModelProperty(value = "Canonical transcript id")
  public String getCanonicalTranscriptId() {
    return canonicalTranscriptId;
  }

  public void setCanonicalTranscriptId(String canonicalTranscriptId) {
    this.canonicalTranscriptId = canonicalTranscriptId;
  }

  public VariantAnnotationSummary genomicLocation(GenomicLocation genomicLocation) {
    this.genomicLocation = genomicLocation;
    return this;
  }

   /**
   * Genomic location
   * @return genomicLocation
  **/
  @ApiModelProperty(value = "Genomic location")
  public GenomicLocation getGenomicLocation() {
    return genomicLocation;
  }

  public void setGenomicLocation(GenomicLocation genomicLocation) {
    this.genomicLocation = genomicLocation;
  }

  public VariantAnnotationSummary strandSign(String strandSign) {
    this.strandSign = strandSign;
    return this;
  }

   /**
   * Strand (- or +)
   * @return strandSign
  **/
  @ApiModelProperty(value = "Strand (- or +)")
  public String getStrandSign() {
    return strandSign;
  }

  public void setStrandSign(String strandSign) {
    this.strandSign = strandSign;
  }

  public VariantAnnotationSummary transcriptConsequences(List<TranscriptConsequenceSummary> transcriptConsequences) {
    this.transcriptConsequences = transcriptConsequences;
    return this;
  }

  public VariantAnnotationSummary addTranscriptConsequencesItem(TranscriptConsequenceSummary transcriptConsequencesItem) {
    this.transcriptConsequences.add(transcriptConsequencesItem);
    return this;
  }

   /**
   * List of transcript consequence summaries
   * @return transcriptConsequences
  **/
  @ApiModelProperty(required = true, value = "List of transcript consequence summaries")
  public List<TranscriptConsequenceSummary> getTranscriptConsequences() {
    return transcriptConsequences;
  }

  public void setTranscriptConsequences(List<TranscriptConsequenceSummary> transcriptConsequences) {
    this.transcriptConsequences = transcriptConsequences;
  }

  public VariantAnnotationSummary variant(String variant) {
    this.variant = variant;
    return this;
  }

   /**
   * Variant key
   * @return variant
  **/
  @ApiModelProperty(required = true, value = "Variant key")
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }

  public VariantAnnotationSummary variantType(String variantType) {
    this.variantType = variantType;
    return this;
  }

   /**
   * Variant type
   * @return variantType
  **/
  @ApiModelProperty(value = "Variant type")
  public String getVariantType() {
    return variantType;
  }

  public void setVariantType(String variantType) {
    this.variantType = variantType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantAnnotationSummary variantAnnotationSummary = (VariantAnnotationSummary) o;
    return Objects.equals(this.assemblyName, variantAnnotationSummary.assemblyName) &&
        Objects.equals(this.canonicalTranscriptId, variantAnnotationSummary.canonicalTranscriptId) &&
        Objects.equals(this.genomicLocation, variantAnnotationSummary.genomicLocation) &&
        Objects.equals(this.strandSign, variantAnnotationSummary.strandSign) &&
        Objects.equals(this.transcriptConsequences, variantAnnotationSummary.transcriptConsequences) &&
        Objects.equals(this.variant, variantAnnotationSummary.variant) &&
        Objects.equals(this.variantType, variantAnnotationSummary.variantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assemblyName, canonicalTranscriptId, genomicLocation, strandSign, transcriptConsequences, variant, variantType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantAnnotationSummary {\n");
    
    sb.append("    assemblyName: ").append(toIndentedString(assemblyName)).append("\n");
    sb.append("    canonicalTranscriptId: ").append(toIndentedString(canonicalTranscriptId)).append("\n");
    sb.append("    genomicLocation: ").append(toIndentedString(genomicLocation)).append("\n");
    sb.append("    strandSign: ").append(toIndentedString(strandSign)).append("\n");
    sb.append("    transcriptConsequences: ").append(toIndentedString(transcriptConsequences)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    variantType: ").append(toIndentedString(variantType)).append("\n");
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
