package com.ddd.bicycle.rental.domain.ports.in.user;

import com.ddd.bicycle.rental.domain.model.UserId;
import com.ddd.bicycle.rental.domain.model.user.User;

public interface FindUserByIdUseCase {
    User apply(UserId userId);
}
