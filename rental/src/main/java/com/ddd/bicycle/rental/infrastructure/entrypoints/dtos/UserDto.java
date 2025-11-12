package com.ddd.bicycle.rental.infrastructure.entrypoints.dtos;

public class UserDto {

    private final String id;
    private final String user;
    private final Boolean active;
    private final String stationId;

    private UserDto(String id, String user, Boolean active,String stationId) {
        this.id = id;
        this.user = user;
        this.active = active;
        this.stationId = stationId;
    }

    public String getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public Boolean getActive() {
        return active;
    }

    public String getStationId() {
        return stationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder{
        private String id;
        private String user;
        private Boolean active;
        private String stationId;

        public Builder id(String id) {
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

        public Builder stationId(String stationId) {
            this.stationId = stationId;
            return this;
        }

        public UserDto build() {
            return new UserDto(id, user, active, stationId);
        }
    }
}
