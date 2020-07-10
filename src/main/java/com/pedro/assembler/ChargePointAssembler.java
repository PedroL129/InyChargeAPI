package com.pedro.assembler;

import com.pedro.inycharge.entity.ChargePointEntity;
import io.swagger.model.ChargePointModel;

public class ChargePointAssembler {
	public static ChargePointModel getModel(ChargePointEntity entity) {
		ChargePointModel result = new ChargePointModel();
		result.setId(entity.getId());
		result.setIdentity(entity.getIdentity());
		result.setCpo(OrganizationAssembler.getModel(entity.getCPO()));
		return result;
	}

	public static com.pedro.inycharge.entity.ChargePointEntity getEntity(ChargePointModel model) {
		ChargePointEntity result = new ChargePointEntity();
		result.setId(model.getId());
		result.setCPO(OrganizationAssembler.getEntity(model.getCpo()));
		result.setIdentity(model.getIdentity());
		return result;
	}
}
