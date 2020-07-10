package com.pedro.api;

import java.rmi.server.UID;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.pedro.assembler.OrganizationAssembler;
import com.pedro.inycharge.entity.OrganizationEntity;
import com.pedro.inycharge.repository.OrganizationRepository;

import io.swagger.api.OrganizationApi;
import io.swagger.model.OrganizationModel;

@Controller
public class OrganizationApiImplementation implements OrganizationApi {

	@Autowired
	private OrganizationRepository repository;

	@Override
	public ResponseEntity<Void> addOrganization(@Valid OrganizationModel body) {
		OrganizationEntity entity = OrganizationAssembler.getEntity(body);
		entity.setId(UUID.randomUUID().toString());
		repository.save(entity);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> deleteOrganization(String organizationId) {
		repository.deleteById(organizationId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<OrganizationModel>> getAllOrganizations() {
		List<OrganizationModel> body = repository.findAll().stream().map(obj -> (OrganizationAssembler.getModel(obj)))
				.collect(Collectors.toList());
		return new ResponseEntity<List<OrganizationModel>>(body, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<OrganizationModel> getOrganizationById(String organizationId) {
		OrganizationEntity entity = repository.findById(organizationId).get();
		OrganizationModel model = OrganizationAssembler.getModel(entity);
		return new ResponseEntity<OrganizationModel>(model, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> updateOrganization(String organizationId, @Valid OrganizationModel organization) {
		OrganizationEntity entity = repository.findById(organizationId).get();
		entity.setLegalEntity(organization.getLegalEntity());
		entity.setName(organization.getName());
		repository.save(entity);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
