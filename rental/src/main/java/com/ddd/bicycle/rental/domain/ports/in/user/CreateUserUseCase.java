package com.ddd.bicycle.rental.domain.ports.in.user;


import com.ddd.bicycle.rental.domain.model.user.User;

import java.util.Optional;

public interface CreateUserUseCase {
    Optional<User> apply(User user);
}

