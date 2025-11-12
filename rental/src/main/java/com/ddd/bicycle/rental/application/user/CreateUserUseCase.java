package com.ddd.bicycle.rental.application.user;


import com.ddd.bicycle.rental.domain.model.user.User;

import java.util.Optional;

public interface CreateUserUseCase {
    Optional<User> apply(User user);
}

