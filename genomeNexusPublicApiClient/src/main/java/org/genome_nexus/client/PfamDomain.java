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
 * PfamDomain
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-14T15:41:58.329-05:00")
public class PfamDomain {
  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("pfamAccession")
  private String pfamAccession = null;

  public PfamDomain description(String description) {
    this.description = description;
    return this;
  }

   /**
   * PFAM domain description
   * @return description
  **/
  @ApiModelProperty(value = "PFAM domain description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PfamDomain name(String name) {
    this.name = name;
    return this;
  }

   /**
   * PFAM domain name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "PFAM domain name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PfamDomain pfamAccession(String pfamAccession) {
    this.pfamAccession = pfamAccession;
    return this;
  }

   /**
   * PFAM domain accession
   * @return pfamAccession
  **/
  @ApiModelProperty(required = true, value = "PFAM domain accession")
  public String getPfamAccession() {
    return pfamAccession;
  }

  public void setPfamAccession(String pfamAccession) {
    this.pfamAccession = pfamAccession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PfamDomain pfamDomain = (PfamDomain) o;
    return Objects.equals(this.description, pfamDomain.description) &&
        Objects.equals(this.name, pfamDomain.name) &&
        Objects.equals(this.pfamAccession, pfamDomain.pfamAccession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, pfamAccession);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PfamDomain {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pfamAccession: ").append(toIndentedString(pfamAccession)).append("\n");
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

