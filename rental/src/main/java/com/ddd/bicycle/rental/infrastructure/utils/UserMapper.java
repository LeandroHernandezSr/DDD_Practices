package com.ddd.bicycle.rental.infrastructure.utils;

import com.ddd.bicycle.rental.domain.model.UserId;
import com.ddd.bicycle.rental.domain.model.user.User;
import com.ddd.bicycle.rental.infrastructure.adapters.entities.StationEntity;
import com.ddd.bicycle.rental.infrastructure.adapters.entities.UserEntity;
import com.ddd.bicycle.rental.infrastructure.entrypoints.dtos.UserDto;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserMapper {

    public UserMapper() {
    }

    public UserEntity dtoToEntity(UserDto userDto) {
        UserEntity userEntity = new UserEntity();

        if (userDto != null) {
            userEntity.setId(UUID.fromString(userDto.getId()));
        }

        userEntity.setUser(userDto.getUser());
        userEntity.setActive(userDto.getActive());

        if (userDto.getStationId() != null) {
            StationEntity  stationEntity = new StationEntity();
            stationEntity.setId(UUID.fromString(userDto.getStationId()));
            userEntity.setStation(stationEntity);
        }else{
            userEntity.setStation(null);
        }

        return userEntity;
    }

    public UserDto entityToDto(UserEntity userEntity) {
        return new UserDto.Builder()
                .id(userEntity.getId().toString())
                .user(userEntity.getUser())
                .active(userEntity.getActive())
                .stationId(userEntity.getStation().getId().toString())
                .build();
    }

    public User entityToModel(UserEntity userEntity) {
        return new User(userEntity.getUser(),new UserId(userEntity.getId()),userEntity.getActive());
    }

    public UserEntity modelToEntity(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(user.getUserId() == null ? null : user.getUserId().getId());
        userEntity.setUser(user.getName());
        userEntity.setActive(user.getActive());
        if (user.getHasBike() != null){
            StationEntity stationEntity = new StationEntity();
            stationEntity.setId(user.getHasBike().getStationId().getId());
            userEntity.setStation(stationEntity);
        }
        return userEntity;
    }

    public User dtoToModel(UserDto userDto) {
        return new User(userDto.getUser(),userDto.getId() == null ? null:new UserId(UUID.fromString(userDto.getId())),userDto.getActive());
    }


    public UserDto modelToDto(User user) {
        return new UserDto.Builder()
                .id(user.getUserId().getId().toString())
                .user(user.getName())
                .active(user.getActive())
                .stationId(user.getHasBike() != null ? user.getHasBike().getStationId().getId().toString():null)
                .build();
    }
}
