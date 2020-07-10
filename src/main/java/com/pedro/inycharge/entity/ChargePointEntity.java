package com.pedro.inycharge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "ChargePoint")
public class ChargePointEntity {
	@Id
	private String id;

	@Column(nullable = false)
	private String identity;

	@ManyToOne()
	@JoinColumn(name = "CPO")
	private OrganizationEntity CPO;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public OrganizationEntity getCPO() {
		return CPO;
	}

	public void setCPO(OrganizationEntity cPO) {
		CPO = cPO;
	}
}
