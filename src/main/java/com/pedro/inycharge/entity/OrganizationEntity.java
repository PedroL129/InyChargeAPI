package com.pedro.inycharge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name ="Organization")

public class OrganizationEntity {
	@Id
	private String id;

	@Column(nullable = false)
	private String name;

	@Column(name="legalEntity")
	private String legalEntity;

	public OrganizationEntity(String id, String name, String legalEntity) {
		this.id = id;
		this.name = name;
		this.legalEntity = legalEntity;
	}

	public OrganizationEntity() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLegalEntity() {
		return legalEntity;
	}

	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

}
