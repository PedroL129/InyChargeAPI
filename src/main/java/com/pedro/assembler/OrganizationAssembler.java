package com.pedro.assembler;

import com.pedro.inycharge.entity.OrganizationEntity;

import io.swagger.model.OrganizationModel;

public class OrganizationAssembler {
	public static OrganizationModel getModel(OrganizationEntity entity) {
		OrganizationModel result = new OrganizationModel();
		result.setId(entity.getId());
		result.setLegalEntity(entity.getLegalEntity());
		result.setName(entity.getName());

		return result;
	}

	public static com.pedro.inycharge.entity.OrganizationEntity getEntity(OrganizationModel model) {
		OrganizationEntity result = new OrganizationEntity();
		result.setId(model.getId());
		result.setName(model.getName());
		result.setLegalEntity(model.getLegalEntity());
		return result;
	}
}
