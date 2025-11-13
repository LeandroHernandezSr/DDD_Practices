package com.ddd.bicycle.rental.infrastructure.entrypoints.handlers;

import com.ddd.bicycle.rental.domain.ports.in.user.CreateUserUseCase;
import com.ddd.bicycle.rental.domain.ports.in.user.DeleteUserUseCase;
import com.ddd.bicycle.rental.domain.ports.in.user.FindUserByIdUseCase;
import com.ddd.bicycle.rental.domain.ports.in.user.UpdateUserUseCase;
import com.ddd.bicycle.rental.infrastructure.entrypoints.dtos.UserDto;
import com.ddd.bicycle.rental.infrastructure.utils.UserMapper;
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


    public ResponseEntity<?>createUser(UserDto userDto) {
        return ResponseEntity.ok(createUserUseCase.apply(null));
    }

}
