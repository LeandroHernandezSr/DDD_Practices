package com.ddd.bicycle.rental.infrastructure.adapters.repositories.jpa;

import com.ddd.bicycle.rental.infrastructure.adapters.entities.StationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationJpaRepository extends JpaRepository<StationEntity, String> {
}
