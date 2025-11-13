package com.ddd.bicycle.rental.application.usecases.user;

import com.ddd.bicycle.rental.domain.ports.in.user.CreateUserUseCase;
import org.springframework.stereotype.Component;

import com.ddd.bicycle.rental.domain.model.user.User;
import com.ddd.bicycle.rental.domain.ports.out.UserRepository;

import java.util.Optional;

@Component
public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final UserRepository repository;

    public CreateUserUseCaseImpl(UserRepository repository){
        this.repository=repository;
    }

    @Override
    public Optional<User> apply(User user) {
        return repository.createUser(user);
    }

}
