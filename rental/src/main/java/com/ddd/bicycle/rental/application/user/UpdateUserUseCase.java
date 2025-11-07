package com.ddd.bicycle.rental.application.user;

import com.ddd.bicycle.rental.domain.model.user.User;

public interface UpdateUserUseCase {
    User apply(User user);
}
