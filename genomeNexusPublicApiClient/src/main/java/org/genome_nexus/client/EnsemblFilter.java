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

/**
 * EnsemblFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-14T15:41:58.329-05:00")
public class EnsemblFilter {
  @SerializedName("geneIds")
  private List<String> geneIds = null;

  @SerializedName("hugoSymbols")
  private List<String> hugoSymbols = null;

  @SerializedName("proteinIds")
  private List<String> proteinIds = null;

  @SerializedName("transcriptIds")
  private List<String> transcriptIds = null;

  public EnsemblFilter geneIds(List<String> geneIds) {
    this.geneIds = geneIds;
    return this;
  }

  public EnsemblFilter addGeneIdsItem(String geneIdsItem) {
    if (this.geneIds == null) {
      this.geneIds = new ArrayList<String>();
    }
    this.geneIds.add(geneIdsItem);
    return this;
  }

   /**
   * List of Ensembl gene IDs. For example [\&quot;ENSG00000136999\&quot;, \&quot;ENSG00000272398\&quot;, \&quot;ENSG00000198695\&quot;]
   * @return geneIds
  **/
  @ApiModelProperty(value = "List of Ensembl gene IDs. For example [\"ENSG00000136999\", \"ENSG00000272398\", \"ENSG00000198695\"]")
  public List<String> getGeneIds() {
    return geneIds;
  }

  public void setGeneIds(List<String> geneIds) {
    this.geneIds = geneIds;
  }

  public EnsemblFilter hugoSymbols(List<String> hugoSymbols) {
    this.hugoSymbols = hugoSymbols;
    return this;
  }

  public EnsemblFilter addHugoSymbolsItem(String hugoSymbolsItem) {
    if (this.hugoSymbols == null) {
      this.hugoSymbols = new ArrayList<String>();
    }
    this.hugoSymbols.add(hugoSymbolsItem);
    return this;
  }

   /**
   * List of Hugo Symbols. For example [\&quot;TP53\&quot;, \&quot;PIK3CA\&quot;, \&quot;BRCA1\&quot;]
   * @return hugoSymbols
  **/
  @ApiModelProperty(value = "List of Hugo Symbols. For example [\"TP53\", \"PIK3CA\", \"BRCA1\"]")
  public List<String> getHugoSymbols() {
    return hugoSymbols;
  }

  public void setHugoSymbols(List<String> hugoSymbols) {
    this.hugoSymbols = hugoSymbols;
  }

  public EnsemblFilter proteinIds(List<String> proteinIds) {
    this.proteinIds = proteinIds;
    return this;
  }

  public EnsemblFilter addProteinIdsItem(String proteinIdsItem) {
    if (this.proteinIds == null) {
      this.proteinIds = new ArrayList<String>();
    }
    this.proteinIds.add(proteinIdsItem);
    return this;
  }

   /**
   * List of Ensembl protein IDs. For example [\&quot;ENSP00000439985\&quot;, \&quot;ENSP00000478460\&quot;, \&quot;ENSP00000346196\&quot;]
   * @return proteinIds
  **/
  @ApiModelProperty(value = "List of Ensembl protein IDs. For example [\"ENSP00000439985\", \"ENSP00000478460\", \"ENSP00000346196\"]")
  public List<String> getProteinIds() {
    return proteinIds;
  }

  public void setProteinIds(List<String> proteinIds) {
    this.proteinIds = proteinIds;
  }

  public EnsemblFilter transcriptIds(List<String> transcriptIds) {
    this.transcriptIds = transcriptIds;
    return this;
  }

  public EnsemblFilter addTranscriptIdsItem(String transcriptIdsItem) {
    if (this.transcriptIds == null) {
      this.transcriptIds = new ArrayList<String>();
    }
    this.transcriptIds.add(transcriptIdsItem);
    return this;
  }

   /**
   * List of Ensembl transcript IDs. For example [\&quot;ENST00000361390\&quot;, \&quot;ENST00000361453\&quot;, \&quot;ENST00000361624\&quot;]
   * @return transcriptIds
  **/
  @ApiModelProperty(value = "List of Ensembl transcript IDs. For example [\"ENST00000361390\", \"ENST00000361453\", \"ENST00000361624\"]")
  public List<String> getTranscriptIds() {
    return transcriptIds;
  }

  public void setTranscriptIds(List<String> transcriptIds) {
    this.transcriptIds = transcriptIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnsemblFilter ensemblFilter = (EnsemblFilter) o;
    return Objects.equals(this.geneIds, ensemblFilter.geneIds) &&
        Objects.equals(this.hugoSymbols, ensemblFilter.hugoSymbols) &&
        Objects.equals(this.proteinIds, ensemblFilter.proteinIds) &&
        Objects.equals(this.transcriptIds, ensemblFilter.transcriptIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geneIds, hugoSymbols, proteinIds, transcriptIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnsemblFilter {\n");
    
    sb.append("    geneIds: ").append(toIndentedString(geneIds)).append("\n");
    sb.append("    hugoSymbols: ").append(toIndentedString(hugoSymbols)).append("\n");
    sb.append("    proteinIds: ").append(toIndentedString(proteinIds)).append("\n");
    sb.append("    transcriptIds: ").append(toIndentedString(transcriptIds)).append("\n");
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

