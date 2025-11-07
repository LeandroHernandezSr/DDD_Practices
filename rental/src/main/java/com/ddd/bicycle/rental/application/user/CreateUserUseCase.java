package com.ddd.bicycle.rental.application.user;

import com.ddd.bicycle.rental.domain.model.user.User;

public interface CreateUserUseCase {
    User apply(User user);
}
