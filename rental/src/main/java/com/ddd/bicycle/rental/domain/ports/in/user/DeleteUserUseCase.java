package com.ddd.bicycle.rental.domain.ports.in.user;

import com.ddd.bicycle.rental.domain.model.UserId;

public interface DeleteUserUseCase {
    void apply(UserId userId);
}
