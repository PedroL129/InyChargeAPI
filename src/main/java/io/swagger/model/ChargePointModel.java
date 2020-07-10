package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OrganizationModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ChargePoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-09T18:41:28.991Z")

public class ChargePointModel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("identity")
  private String identity = null;

  @JsonProperty("cpo")
  private OrganizationModel cpo = null;

  public ChargePointModel id(String id) {
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

  public ChargePointModel identity(String identity) {
    this.identity = identity;
    return this;
  }

  /**
   * Get identity
   * @return identity
  **/
  @ApiModelProperty(value = "")


  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public ChargePointModel cpo(OrganizationModel cpo) {
    this.cpo = cpo;
    return this;
  }

  /**
   * Get cpo
   * @return cpo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrganizationModel getCpo() {
    return cpo;
  }

  public void setCpo(OrganizationModel cpo) {
    this.cpo = cpo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargePointModel chargePoint = (ChargePointModel) o;
    return Objects.equals(this.id, chargePoint.id) &&
        Objects.equals(this.identity, chargePoint.identity) &&
        Objects.equals(this.cpo, chargePoint.cpo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, identity, cpo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargePoint {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    cpo: ").append(toIndentedString(cpo)).append("\n");
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

