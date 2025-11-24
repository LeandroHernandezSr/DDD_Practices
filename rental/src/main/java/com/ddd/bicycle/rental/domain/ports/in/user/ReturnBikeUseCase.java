package com.ddd.bicycle.rental.domain.ports.in.user;

import com.ddd.bicycle.rental.domain.model.StationId;
import com.ddd.bicycle.rental.domain.model.UserId;

public interface ReturnBikeUseCase {
    void apply(UserId user,StationId station);
}
