package com.ddd.bicycle.rental.infrastructure.adapters.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class UserEntity {

    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;
    private String user;
    private Boolean active;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "station_id")
    private StationEntity  station;

    @PrePersist
    public void generateId() {
        if (this.id == null) {
            this.id = UUID.randomUUID();
        }
    }

    public UserEntity(UUID id, String user, Boolean active, StationEntity station) {
        this.id = id;
        this.user = user;
        this.active = active;
        this.station = station;
    }

    public UserEntity() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public StationEntity getStation() {
        return station;
    }

    public void setStation(StationEntity station) {
        this.station = station;
    }
}
