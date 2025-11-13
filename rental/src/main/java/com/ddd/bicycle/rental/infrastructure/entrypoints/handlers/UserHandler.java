package com.ddd.bicycle.rental.infrastructure.entrypoints.handlers;

import com.ddd.bicycle.rental.domain.model.UserId;
import com.ddd.bicycle.rental.domain.model.user.User;
import com.ddd.bicycle.rental.domain.ports.in.user.CreateUserUseCase;
import com.ddd.bicycle.rental.domain.ports.in.user.DeleteUserUseCase;
import com.ddd.bicycle.rental.domain.ports.in.user.FindUserByIdUseCase;
import com.ddd.bicycle.rental.domain.ports.in.user.UpdateUserUseCase;
import com.ddd.bicycle.rental.infrastructure.entrypoints.dtos.UserDto;
import com.ddd.bicycle.rental.infrastructure.utils.UserMapper;

import java.util.Optional;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserHandler {

    private final CreateUserUseCase createUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;
    private final FindUserByIdUseCase  findUserByIdUseCase;
    private final UpdateUserUseCase updateUserUseCase;
    private final UserMapper  userMapper;

    public UserHandler(CreateUserUseCase createUserUseCase, DeleteUserUseCase deleteUserUseCase, FindUserByIdUseCase findUserByIdUseCase, UpdateUserUseCase updateUserUseCase, UserMapper userMapper) {
        this.createUserUseCase = createUserUseCase;
        this.deleteUserUseCase = deleteUserUseCase;
        this.findUserByIdUseCase = findUserByIdUseCase;
        this.updateUserUseCase = updateUserUseCase;
        this.userMapper = userMapper;
    }


    public Optional<ResponseEntity<User>>createUser(UserDto userDto) {
        return Optional.of(userDto)
            .map(userMapper::dtoToModel)
            .flatMap(createUserUseCase::apply)
            .map(ResponseEntity::ok);
    }

    public ResponseEntity<String> delete(String userId){
        deleteUserUseCase.apply(new UserId(UUID.fromString(userId)));
        return ResponseEntity.ok(userId);
    }

    

}
