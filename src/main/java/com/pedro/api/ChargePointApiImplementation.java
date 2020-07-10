package com.pedro.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.pedro.assembler.ChargePointAssembler;
import com.pedro.assembler.OrganizationAssembler;
import com.pedro.inycharge.entity.ChargePointEntity;
import com.pedro.inycharge.repository.ChargePointRepository;

import io.swagger.api.ChargePointApi;
import io.swagger.model.ChargePointModel;

@Controller
public class ChargePointApiImplementation implements ChargePointApi {

	@Autowired
	private ChargePointRepository repository;

	@Override
	public ResponseEntity<Void> addChargePoint(@Valid ChargePointModel body) {
		ChargePointEntity entity = ChargePointAssembler.getEntity(body);
		entity.setId(UUID.randomUUID().toString());

		repository.save(entity);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> deleteChagerPoint(String chargePointId) {
		repository.deleteById(chargePointId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<ChargePointModel>> getAllChargerPoints() {
		List<ChargePointModel> body = repository.findAll().stream().map(obj -> (ChargePointAssembler.getModel(obj)))
				.collect(Collectors.toList());
		return new ResponseEntity<List<ChargePointModel>>(body, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ChargePointModel> getChargePointById(String chargePointId) {
		ChargePointEntity entity = repository.findById(chargePointId).get();
		ChargePointModel model = ChargePointAssembler.getModel(entity);
		return new ResponseEntity<ChargePointModel>(model, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> updateChargePoint(String chargePointId, @Valid ChargePointModel chargePoint) {
		ChargePointEntity entity = repository.findById(chargePointId).get();
		entity.setCPO(OrganizationAssembler.getEntity(chargePoint.getCpo()));
		entity.setIdentity(chargePoint.getIdentity());
		repository.save(entity);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
