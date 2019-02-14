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
import org.genome_nexus.client.Alleles;
import org.genome_nexus.client.Gene;
import org.genome_nexus.client.Hg19;

/**
 * Dbsnp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-14T15:41:58.329-05:00")
public class Dbsnp {
  @SerializedName("_class")
  private String propertyClass = null;

  @SerializedName("alleleOrigin")
  private String alleleOrigin = null;

  @SerializedName("alleles")
  private List<Alleles> alleles = null;

  @SerializedName("alt")
  private String alt = null;

  @SerializedName("chrom")
  private String chrom = null;

  @SerializedName("dbsnpBuild")
  private Integer dbsnpBuild = null;

  @SerializedName("flags")
  private List<String> flags = null;

  @SerializedName("gene")
  private Gene gene = null;

  @SerializedName("hg19")
  private Hg19 hg19 = null;

  @SerializedName("license")
  private String license = null;

  @SerializedName("ref")
  private String ref = null;

  @SerializedName("rsid")
  private String rsid = null;

  @SerializedName("validated")
  private Boolean validated = null;

  @SerializedName("varSubtype")
  private String varSubtype = null;

  @SerializedName("vartype")
  private String vartype = null;

  public Dbsnp propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * class
   * @return propertyClass
  **/
  @ApiModelProperty(value = "class")
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public Dbsnp alleleOrigin(String alleleOrigin) {
    this.alleleOrigin = alleleOrigin;
    return this;
  }

   /**
   * allele_origin
   * @return alleleOrigin
  **/
  @ApiModelProperty(value = "allele_origin")
  public String getAlleleOrigin() {
    return alleleOrigin;
  }

  public void setAlleleOrigin(String alleleOrigin) {
    this.alleleOrigin = alleleOrigin;
  }

  public Dbsnp alleles(List<Alleles> alleles) {
    this.alleles = alleles;
    return this;
  }

  public Dbsnp addAllelesItem(Alleles allelesItem) {
    if (this.alleles == null) {
      this.alleles = new ArrayList<Alleles>();
    }
    this.alleles.add(allelesItem);
    return this;
  }

   /**
   * alleles
   * @return alleles
  **/
  @ApiModelProperty(value = "alleles")
  public List<Alleles> getAlleles() {
    return alleles;
  }

  public void setAlleles(List<Alleles> alleles) {
    this.alleles = alleles;
  }

  public Dbsnp alt(String alt) {
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

  public Dbsnp chrom(String chrom) {
    this.chrom = chrom;
    return this;
  }

   /**
   * chrom
   * @return chrom
  **/
  @ApiModelProperty(value = "chrom")
  public String getChrom() {
    return chrom;
  }

  public void setChrom(String chrom) {
    this.chrom = chrom;
  }

  public Dbsnp dbsnpBuild(Integer dbsnpBuild) {
    this.dbsnpBuild = dbsnpBuild;
    return this;
  }

   /**
   * dbsnp_build
   * @return dbsnpBuild
  **/
  @ApiModelProperty(value = "dbsnp_build")
  public Integer getDbsnpBuild() {
    return dbsnpBuild;
  }

  public void setDbsnpBuild(Integer dbsnpBuild) {
    this.dbsnpBuild = dbsnpBuild;
  }

  public Dbsnp flags(List<String> flags) {
    this.flags = flags;
    return this;
  }

  public Dbsnp addFlagsItem(String flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<String>();
    }
    this.flags.add(flagsItem);
    return this;
  }

   /**
   * flags
   * @return flags
  **/
  @ApiModelProperty(value = "flags")
  public List<String> getFlags() {
    return flags;
  }

  public void setFlags(List<String> flags) {
    this.flags = flags;
  }

  public Dbsnp gene(Gene gene) {
    this.gene = gene;
    return this;
  }

   /**
   * gene
   * @return gene
  **/
  @ApiModelProperty(value = "gene")
  public Gene getGene() {
    return gene;
  }

  public void setGene(Gene gene) {
    this.gene = gene;
  }

  public Dbsnp hg19(Hg19 hg19) {
    this.hg19 = hg19;
    return this;
  }

   /**
   * hg19
   * @return hg19
  **/
  @ApiModelProperty(value = "hg19")
  public Hg19 getHg19() {
    return hg19;
  }

  public void setHg19(Hg19 hg19) {
    this.hg19 = hg19;
  }

  public Dbsnp license(String license) {
    this.license = license;
    return this;
  }

   /**
   * _license
   * @return license
  **/
  @ApiModelProperty(value = "_license")
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public Dbsnp ref(String ref) {
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

  public Dbsnp rsid(String rsid) {
    this.rsid = rsid;
    return this;
  }

   /**
   * rsid
   * @return rsid
  **/
  @ApiModelProperty(value = "rsid")
  public String getRsid() {
    return rsid;
  }

  public void setRsid(String rsid) {
    this.rsid = rsid;
  }

  public Dbsnp validated(Boolean validated) {
    this.validated = validated;
    return this;
  }

   /**
   * validated
   * @return validated
  **/
  @ApiModelProperty(example = "false", value = "validated")
  public Boolean isValidated() {
    return validated;
  }

  public void setValidated(Boolean validated) {
    this.validated = validated;
  }

  public Dbsnp varSubtype(String varSubtype) {
    this.varSubtype = varSubtype;
    return this;
  }

   /**
   * var_subtype
   * @return varSubtype
  **/
  @ApiModelProperty(value = "var_subtype")
  public String getVarSubtype() {
    return varSubtype;
  }

  public void setVarSubtype(String varSubtype) {
    this.varSubtype = varSubtype;
  }

  public Dbsnp vartype(String vartype) {
    this.vartype = vartype;
    return this;
  }

   /**
   * vartype
   * @return vartype
  **/
  @ApiModelProperty(value = "vartype")
  public String getVartype() {
    return vartype;
  }

  public void setVartype(String vartype) {
    this.vartype = vartype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dbsnp dbsnp = (Dbsnp) o;
    return Objects.equals(this.propertyClass, dbsnp.propertyClass) &&
        Objects.equals(this.alleleOrigin, dbsnp.alleleOrigin) &&
        Objects.equals(this.alleles, dbsnp.alleles) &&
        Objects.equals(this.alt, dbsnp.alt) &&
        Objects.equals(this.chrom, dbsnp.chrom) &&
        Objects.equals(this.dbsnpBuild, dbsnp.dbsnpBuild) &&
        Objects.equals(this.flags, dbsnp.flags) &&
        Objects.equals(this.gene, dbsnp.gene) &&
        Objects.equals(this.hg19, dbsnp.hg19) &&
        Objects.equals(this.license, dbsnp.license) &&
        Objects.equals(this.ref, dbsnp.ref) &&
        Objects.equals(this.rsid, dbsnp.rsid) &&
        Objects.equals(this.validated, dbsnp.validated) &&
        Objects.equals(this.varSubtype, dbsnp.varSubtype) &&
        Objects.equals(this.vartype, dbsnp.vartype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, alleleOrigin, alleles, alt, chrom, dbsnpBuild, flags, gene, hg19, license, ref, rsid, validated, varSubtype, vartype);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dbsnp {\n");
    
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    alleleOrigin: ").append(toIndentedString(alleleOrigin)).append("\n");
    sb.append("    alleles: ").append(toIndentedString(alleles)).append("\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    chrom: ").append(toIndentedString(chrom)).append("\n");
    sb.append("    dbsnpBuild: ").append(toIndentedString(dbsnpBuild)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    gene: ").append(toIndentedString(gene)).append("\n");
    sb.append("    hg19: ").append(toIndentedString(hg19)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    rsid: ").append(toIndentedString(rsid)).append("\n");
    sb.append("    validated: ").append(toIndentedString(validated)).append("\n");
    sb.append("    varSubtype: ").append(toIndentedString(varSubtype)).append("\n");
    sb.append("    vartype: ").append(toIndentedString(vartype)).append("\n");
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
