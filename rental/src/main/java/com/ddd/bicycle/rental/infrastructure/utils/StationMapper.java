package com.ddd.bicycle.rental.infrastructure.utils;

import com.ddd.bicycle.rental.domain.model.StationId;
import com.ddd.bicycle.rental.domain.model.station.Station;
import com.ddd.bicycle.rental.domain.model.station.StationTotalCapacity;
import com.ddd.bicycle.rental.infrastructure.adapters.entities.StationEntity;
import com.ddd.bicycle.rental.infrastructure.entrypoints.dtos.StationDto;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class StationMapper {

    public Station entityToModel(StationEntity stationEntity) {
        return  new Station(new StationId(UUID.fromString(stationEntity.getId())),stationEntity.getStationName(),new StationTotalCapacity(stationEntity.getTotalCapacity(),stationEntity.getCurentBikeCount()));
    }

    public StationEntity modelToEntity(Station station) {
        StationEntity stationEntity = new StationEntity();
        stationEntity.setStationName(station.getName());
        if (station.getStationId().getId() != null) {
            stationEntity.setId(station.getStationId().getId().toString());
        }
        stationEntity.setCurentBikeCount(station.getTotalCapacity().getCurrentBikeCount());
        stationEntity.setTotalCapacity(station.getTotalCapacity().getTotalCapacity());
        return stationEntity;
    }

    public StationEntity dtoToEntity(StationDto stationDto) {
        StationEntity stationEntity = new StationEntity();
        stationEntity.setStationName(stationDto.getStationName());
        stationEntity.setCurentBikeCount(stationDto.getCurrentBikeCount());
        stationEntity.setTotalCapacity(stationDto.getTotalCapacity());
        return stationEntity;
    }

    public StationDto entityToDto(StationEntity stationEntity) {
        return StationDto.builder()
                .id(stationEntity.getId() != null ? stationEntity.getId():null)
                .stationName(stationEntity.getStationName())
                .curentBikeCount(stationEntity.getCurentBikeCount())
                .totalCapacity(stationEntity.getTotalCapacity())
                .build();
    }

    public StationDto modelToDto(Station station) {
        return new StationDto.Builder()
                .id(station.getStationId().getId().toString())
                .stationName(station.getName())
                .totalCapacity(station.getTotalCapacity().getTotalCapacity())
                .curentBikeCount(station.getTotalCapacity().getCurrentBikeCount())
                .build();
    }

    public Station dtoToModel(StationDto stationDto) {
        return new Station(
                new StationId(stationDto.getId() != null ? UUID.fromString(stationDto.getId()):null),
                stationDto.getStationName(),
                new StationTotalCapacity(stationDto.getTotalCapacity(),stationDto.getCurrentBikeCount())
        );
    }
}
