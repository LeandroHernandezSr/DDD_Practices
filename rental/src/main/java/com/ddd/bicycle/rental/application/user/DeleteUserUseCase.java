package com.ddd.bicycle.rental.application.user;

import com.ddd.bicycle.rental.domain.model.UserId;
import com.ddd.bicycle.rental.domain.model.user.User;

public interface DeleteUserUseCase {
    User apply(UserId userId);
}
