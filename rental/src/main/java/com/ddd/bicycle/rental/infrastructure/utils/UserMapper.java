package com.ddd.bicycle.rental.infrastructure.utils;

import com.ddd.bicycle.rental.infrastructure.adapters.entities.StationEntity;
import com.ddd.bicycle.rental.infrastructure.adapters.entities.UserEntity;
import com.ddd.bicycle.rental.infrastructure.entrypoints.dtos.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserEntity toEntity(UserDto userDto) {
        UserEntity userEntity = new UserEntity();

        if (userDto != null) {
            userEntity.setId(userDto.getId());
        }

        userEntity.setUser(userDto.getUser());
        userEntity.setActive(userDto.getActive());

        if (userDto.getStationId() != null) {
            StationEntity  stationEntity = new StationEntity();
            stationEntity.setId(userDto.getStationId());
            userEntity.setStation(stationEntity);
        }else{
            userEntity.setStation(null);
        }

        return userEntity;
    }

    public UserDto toDto(UserEntity userEntity) {
        return new UserDto.Builder()
                .id(userEntity.getId())
                .user(userEntity.getUser())
                .active(userEntity.getActive())
                .stationId(userEntity.getStation().getId())
                .build();
    }
}
