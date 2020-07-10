package com.pedro.inycharge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.inycharge.entity.ChargePointEntity;

public interface ChargePointRepository extends JpaRepository<ChargePointEntity, String> {

}
