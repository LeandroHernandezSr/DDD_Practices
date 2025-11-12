package com.ddd.bicycle.rental.application.user;

import com.ddd.bicycle.rental.domain.model.UserId;
import com.ddd.bicycle.rental.domain.model.user.User;

import java.util.Optional;

public interface DeleteUserUseCase {
    void apply(UserId userId);
}
