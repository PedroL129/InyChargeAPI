package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Organization
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-09T18:41:28.991Z")

public class OrganizationModel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("legalEntity")
  private String legalEntity = null;

  public OrganizationModel id(String id) {
    this.id = id;
    return this;
  }
  

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrganizationModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganizationModel legalEntity(String legalEntity) {
    this.legalEntity = legalEntity;
    return this;
  }

  /**
   * Get legalEntity
   * @return legalEntity
  **/
  @ApiModelProperty(value = "")


  public String getLegalEntity() {
    return legalEntity;
  }

  public void setLegalEntity(String legalEntity) {
    this.legalEntity = legalEntity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationModel organization = (OrganizationModel) o;
    return Objects.equals(this.id, organization.id) &&
        Objects.equals(this.name, organization.name) &&
        Objects.equals(this.legalEntity, organization.legalEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, legalEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    legalEntity: ").append(toIndentedString(legalEntity)).append("\n");
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

