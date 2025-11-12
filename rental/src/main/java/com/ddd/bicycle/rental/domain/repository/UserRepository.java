package com.ddd.bicycle.rental.domain.repository;

import com.ddd.bicycle.rental.domain.model.UserId;
import com.ddd.bicycle.rental.domain.model.user.User;

import java.util.Optional;

public interface UserRepository {
    User findById(UserId userId);
    Optional<User> createUser(User user);
    Optional<User> updateUser(User user);
    void deleteUser(UserId userId);
}
