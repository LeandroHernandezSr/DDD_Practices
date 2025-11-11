package com.ddd.bicycle.rental.infrastructure.entrypoints.dtos;

public class UserDto {

    private final Long id;
    private final String user;
    private final Boolean active;
    private final Long stationId;

    private UserDto(Long id, String user, Boolean active, Long stationId) {
        this.id = id;
        this.user = user;
        this.active = active;
        this.stationId = stationId;
    }

    public Long getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public Boolean getActive() {
        return active;
    }

    public Long getStationId() {
        return stationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder{
        private Long id;
        private String user;
        private Boolean active;
        private Long stationId;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder user(String user) {
            this.user = user;
            return this;
        }

        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        public Builder stationId(Long stationId) {
            this.stationId = stationId;
            return this;
        }

        public UserDto build() {
            return new UserDto(id, user, active, stationId);
        }
    }
}
