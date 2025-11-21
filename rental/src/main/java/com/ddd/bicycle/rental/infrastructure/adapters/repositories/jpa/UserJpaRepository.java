package com.ddd.bicycle.rental.infrastructure.adapters.repositories.jpa;

import com.ddd.bicycle.rental.infrastructure.adapters.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserJpaRepository extends JpaRepository<UserEntity, UUID> {
}
