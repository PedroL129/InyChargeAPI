package com.pedro.inycharge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.inycharge.entity.OrganizationEntity;

public interface OrganizationRepository extends JpaRepository<OrganizationEntity, String> {

}
