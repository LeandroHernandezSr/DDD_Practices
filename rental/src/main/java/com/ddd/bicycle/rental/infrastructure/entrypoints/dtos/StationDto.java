package com.ddd.bicycle.rental.infrastructure.entrypoints.dtos;

public class StationDto {

    private final String id;
    private final String stationName;
    private final Integer totalCapacity;
    private final Integer curentBikeCount;

    private StationDto(String id, String stationName, Integer totalCapacity, Integer curentBikeCount) {
        this.id = id;
        this.stationName = stationName;
        this.totalCapacity = totalCapacity;
        this.curentBikeCount = curentBikeCount;
    }

    public String getId() {
        return id;
    }

    public String getStationName() {
        return stationName;
    }

    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    public Integer getCurentBikeCount() {
        return curentBikeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String id;
        private String stationName;
        private Integer totalCapacity;
        private Integer curentBikeCount;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder stationName(String stationName) {
            this.stationName = stationName;
            return this;
        }

        public Builder totalCapacity(Integer totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }

        public Builder curentBikeCount(Integer curentBikeCount) {
            this.curentBikeCount = curentBikeCount;
            return this;
        }

        public StationDto build() {
            return new StationDto(id, stationName, totalCapacity, curentBikeCount);
        }
    }
}
