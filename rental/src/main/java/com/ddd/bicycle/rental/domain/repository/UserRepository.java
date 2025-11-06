package com.ddd.bicycle.rental.domain.repository;

import com.ddd.bicycle.rental.domain.model.UserId;
import com.ddd.bicycle.rental.domain.model.user.User;

public interface UserRepository {
    User findById(UserId userId);
    User createUser(User user);
    User updateUser(User user);
    User deleteUser(UserId userId);
}
