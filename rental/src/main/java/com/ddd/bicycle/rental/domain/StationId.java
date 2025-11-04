package com.ddd.bicycle.rental.domain;

import java.util.UUID;

public class StationId {

    private final UUID id;

    public StationId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
    
}
