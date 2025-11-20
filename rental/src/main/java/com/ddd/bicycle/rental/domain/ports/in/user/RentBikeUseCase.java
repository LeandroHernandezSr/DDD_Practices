package com.ddd.bicycle.rental.domain.ports.in.user;

public interface RentBikeUseCase {
    void apply(String stationId, String userId);
}
