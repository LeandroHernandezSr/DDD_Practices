package com.ddd.bicycle.rental.infrastructure.adapters.repositories;

import com.ddd.bicycle.rental.domain.model.UserId;
import com.ddd.bicycle.rental.domain.model.user.User;
import com.ddd.bicycle.rental.domain.repository.UserRepository;
import com.ddd.bicycle.rental.infrastructure.adapters.repositories.jpa.UserJpaRepository;
import com.ddd.bicycle.rental.infrastructure.utils.UserMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;
    private final UserMapper userMapper;

    public UserRepositoryImpl(UserJpaRepository userJpaRepository, UserMapper userMapper) {
        this.userJpaRepository = userJpaRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User findById(UserId userId) {
        return userJpaRepository.findById(userId.getId().toString())
                .stream()
                .map(userMapper::entityToModel)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Optional<User> createUser(User user) {
        return Optional.of(user)
                .map(userMapper::modelToEntity)
                .map(userJpaRepository::save)
                .map(userMapper::entityToModel);
    }

    @Override
    public Optional<User> updateUser(User user) {
        return Optional.of(user)
                .map(userMapper::modelToEntity)
                .map(userJpaRepository::save)
                .map(userMapper::entityToModel);
    }

    @Override
    public void deleteUser(UserId userId) {
        this.userJpaRepository.deleteById(userId.getId().toString());
    }
}
