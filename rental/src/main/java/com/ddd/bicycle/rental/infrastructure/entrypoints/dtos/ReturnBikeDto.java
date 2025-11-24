package com.ddd.bicycle.rental.infrastructure.entrypoints.dtos;

public record ReturnBikeDto(
    String userId,
    String stationId
) {

}
