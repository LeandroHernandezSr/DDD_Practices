package com.ddd.bicycle.rental.infrastructure.entrypoints.handlers;

import com.ddd.bicycle.rental.domain.model.UserId;
import com.ddd.bicycle.rental.domain.ports.in.user.*;
import com.ddd.bicycle.rental.infrastructure.entrypoints.dtos.UserDto;
import com.ddd.bicycle.rental.infrastructure.utils.UserMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class UserHandler {

    private final CreateUserUseCase createUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;
    private final FindUserByIdUseCase  findUserByIdUseCase;
    private final UpdateUserUseCase updateUserUseCase;
    private final RentBikeUseCase  rentBikeUseCase;
    private final UserMapper  userMapper;

    public UserHandler(CreateUserUseCase createUserUseCase, DeleteUserUseCase deleteUserUseCase, FindUserByIdUseCase findUserByIdUseCase, UpdateUserUseCase updateUserUseCase, RentBikeUseCase rentBikeUseCase, UserMapper userMapper) {
        this.createUserUseCase = createUserUseCase;
        this.deleteUserUseCase = deleteUserUseCase;
        this.findUserByIdUseCase = findUserByIdUseCase;
        this.updateUserUseCase = updateUserUseCase;
        this.rentBikeUseCase = rentBikeUseCase;
        this.userMapper = userMapper;
    }


    public ResponseEntity<UserDto> createUser(UserDto userDto) {
        return Optional.of(userDto)
            .map(userMapper::dtoToModel)
            .flatMap(createUserUseCase::apply)
            .map(userMapper::modelToDto)
            .map(ResponseEntity::ok)
            .orElseThrow(()->new RuntimeException("Error while creating user"));
    }

    public ResponseEntity<String> delete(String userId){
        deleteUserUseCase.apply(new UserId(UUID.fromString(userId)));
        return ResponseEntity.ok(userId);
    }

    public ResponseEntity<UserDto>findUserById(String userId){
        return ResponseEntity.ok(userMapper.modelToDto(findUserByIdUseCase.apply(new UserId(UUID.fromString(userId)))));
    }

    public ResponseEntity<UserDto>updateUser(UserDto userDto){
        return ResponseEntity.ok(updateUserUseCase.apply(userMapper.dtoToModel(userDto)).map(userMapper::modelToDto)
                .orElseThrow(()->new RuntimeException("Error while updating user"))
        );
    }

    public ResponseEntity<Void>rentBike(String userId,String stationId){
        this.rentBikeUseCase.apply(userId,stationId);
        return ResponseEntity.ok().build();
    }

}
