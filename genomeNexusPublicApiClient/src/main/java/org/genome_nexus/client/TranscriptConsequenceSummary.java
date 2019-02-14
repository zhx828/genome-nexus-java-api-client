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
 * TranscriptConsequenceSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-14T15:41:58.329-05:00")
public class TranscriptConsequenceSummary {
  @SerializedName("codonChange")
  private String codonChange = null;

  @SerializedName("consequenceTerms")
  private String consequenceTerms = null;

  @SerializedName("entrezGeneId")
  private String entrezGeneId = null;

  @SerializedName("exon")
  private String exon = null;

  @SerializedName("hgvsc")
  private String hgvsc = null;

  @SerializedName("hgvsp")
  private String hgvsp = null;

  @SerializedName("hgvspShort")
  private String hgvspShort = null;

  @SerializedName("hugoGeneSymbol")
  private String hugoGeneSymbol = null;

  @SerializedName("proteinPosition")
  private IntegerRange proteinPosition = null;

  @SerializedName("refSeq")
  private String refSeq = null;

  @SerializedName("transcriptId")
  private String transcriptId = null;

  @SerializedName("variantClassification")
  private String variantClassification = null;

  public TranscriptConsequenceSummary codonChange(String codonChange) {
    this.codonChange = codonChange;
    return this;
  }

   /**
   * Codon change
   * @return codonChange
  **/
  @ApiModelProperty(value = "Codon change")
  public String getCodonChange() {
    return codonChange;
  }

  public void setCodonChange(String codonChange) {
    this.codonChange = codonChange;
  }

  public TranscriptConsequenceSummary consequenceTerms(String consequenceTerms) {
    this.consequenceTerms = consequenceTerms;
    return this;
  }

   /**
   * Consequence terms (comma separated)
   * @return consequenceTerms
  **/
  @ApiModelProperty(value = "Consequence terms (comma separated)")
  public String getConsequenceTerms() {
    return consequenceTerms;
  }

  public void setConsequenceTerms(String consequenceTerms) {
    this.consequenceTerms = consequenceTerms;
  }

  public TranscriptConsequenceSummary entrezGeneId(String entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
    return this;
  }

   /**
   * Entrez gene id
   * @return entrezGeneId
  **/
  @ApiModelProperty(value = "Entrez gene id")
  public String getEntrezGeneId() {
    return entrezGeneId;
  }

  public void setEntrezGeneId(String entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
  }

  public TranscriptConsequenceSummary exon(String exon) {
    this.exon = exon;
    return this;
  }

   /**
   * Get exon
   * @return exon
  **/
  @ApiModelProperty(value = "")
  public String getExon() {
    return exon;
  }

  public void setExon(String exon) {
    this.exon = exon;
  }

  public TranscriptConsequenceSummary hgvsc(String hgvsc) {
    this.hgvsc = hgvsc;
    return this;
  }

   /**
   * HGVSc
   * @return hgvsc
  **/
  @ApiModelProperty(value = "HGVSc")
  public String getHgvsc() {
    return hgvsc;
  }

  public void setHgvsc(String hgvsc) {
    this.hgvsc = hgvsc;
  }

  public TranscriptConsequenceSummary hgvsp(String hgvsp) {
    this.hgvsp = hgvsp;
    return this;
  }

   /**
   * HGVSp
   * @return hgvsp
  **/
  @ApiModelProperty(value = "HGVSp")
  public String getHgvsp() {
    return hgvsp;
  }

  public void setHgvsp(String hgvsp) {
    this.hgvsp = hgvsp;
  }

  public TranscriptConsequenceSummary hgvspShort(String hgvspShort) {
    this.hgvspShort = hgvspShort;
    return this;
  }

   /**
   * HGVSp short
   * @return hgvspShort
  **/
  @ApiModelProperty(value = "HGVSp short")
  public String getHgvspShort() {
    return hgvspShort;
  }

  public void setHgvspShort(String hgvspShort) {
    this.hgvspShort = hgvspShort;
  }

  public TranscriptConsequenceSummary hugoGeneSymbol(String hugoGeneSymbol) {
    this.hugoGeneSymbol = hugoGeneSymbol;
    return this;
  }

   /**
   * Hugo gene symbol
   * @return hugoGeneSymbol
  **/
  @ApiModelProperty(value = "Hugo gene symbol")
  public String getHugoGeneSymbol() {
    return hugoGeneSymbol;
  }

  public void setHugoGeneSymbol(String hugoGeneSymbol) {
    this.hugoGeneSymbol = hugoGeneSymbol;
  }

  public TranscriptConsequenceSummary proteinPosition(IntegerRange proteinPosition) {
    this.proteinPosition = proteinPosition;
    return this;
  }

   /**
   * Protein position (start and end)
   * @return proteinPosition
  **/
  @ApiModelProperty(value = "Protein position (start and end)")
  public IntegerRange getProteinPosition() {
    return proteinPosition;
  }

  public void setProteinPosition(IntegerRange proteinPosition) {
    this.proteinPosition = proteinPosition;
  }

  public TranscriptConsequenceSummary refSeq(String refSeq) {
    this.refSeq = refSeq;
    return this;
  }

   /**
   * RefSeq id
   * @return refSeq
  **/
  @ApiModelProperty(value = "RefSeq id")
  public String getRefSeq() {
    return refSeq;
  }

  public void setRefSeq(String refSeq) {
    this.refSeq = refSeq;
  }

  public TranscriptConsequenceSummary transcriptId(String transcriptId) {
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

  public TranscriptConsequenceSummary variantClassification(String variantClassification) {
    this.variantClassification = variantClassification;
    return this;
  }

   /**
   * Variant classification
   * @return variantClassification
  **/
  @ApiModelProperty(value = "Variant classification")
  public String getVariantClassification() {
    return variantClassification;
  }

  public void setVariantClassification(String variantClassification) {
    this.variantClassification = variantClassification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptConsequenceSummary transcriptConsequenceSummary = (TranscriptConsequenceSummary) o;
    return Objects.equals(this.codonChange, transcriptConsequenceSummary.codonChange) &&
        Objects.equals(this.consequenceTerms, transcriptConsequenceSummary.consequenceTerms) &&
        Objects.equals(this.entrezGeneId, transcriptConsequenceSummary.entrezGeneId) &&
        Objects.equals(this.exon, transcriptConsequenceSummary.exon) &&
        Objects.equals(this.hgvsc, transcriptConsequenceSummary.hgvsc) &&
        Objects.equals(this.hgvsp, transcriptConsequenceSummary.hgvsp) &&
        Objects.equals(this.hgvspShort, transcriptConsequenceSummary.hgvspShort) &&
        Objects.equals(this.hugoGeneSymbol, transcriptConsequenceSummary.hugoGeneSymbol) &&
        Objects.equals(this.proteinPosition, transcriptConsequenceSummary.proteinPosition) &&
        Objects.equals(this.refSeq, transcriptConsequenceSummary.refSeq) &&
        Objects.equals(this.transcriptId, transcriptConsequenceSummary.transcriptId) &&
        Objects.equals(this.variantClassification, transcriptConsequenceSummary.variantClassification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codonChange, consequenceTerms, entrezGeneId, exon, hgvsc, hgvsp, hgvspShort, hugoGeneSymbol, proteinPosition, refSeq, transcriptId, variantClassification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptConsequenceSummary {\n");
    
    sb.append("    codonChange: ").append(toIndentedString(codonChange)).append("\n");
    sb.append("    consequenceTerms: ").append(toIndentedString(consequenceTerms)).append("\n");
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    exon: ").append(toIndentedString(exon)).append("\n");
    sb.append("    hgvsc: ").append(toIndentedString(hgvsc)).append("\n");
    sb.append("    hgvsp: ").append(toIndentedString(hgvsp)).append("\n");
    sb.append("    hgvspShort: ").append(toIndentedString(hgvspShort)).append("\n");
    sb.append("    hugoGeneSymbol: ").append(toIndentedString(hugoGeneSymbol)).append("\n");
    sb.append("    proteinPosition: ").append(toIndentedString(proteinPosition)).append("\n");
    sb.append("    refSeq: ").append(toIndentedString(refSeq)).append("\n");
    sb.append("    transcriptId: ").append(toIndentedString(transcriptId)).append("\n");
    sb.append("    variantClassification: ").append(toIndentedString(variantClassification)).append("\n");
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

