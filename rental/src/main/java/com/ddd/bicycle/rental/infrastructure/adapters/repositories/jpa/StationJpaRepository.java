package com.ddd.bicycle.rental.infrastructure.adapters.repositories.jpa;

import com.ddd.bicycle.rental.infrastructure.adapters.entities.StationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StationJpaRepository extends JpaRepository<StationEntity, UUID> {
}
