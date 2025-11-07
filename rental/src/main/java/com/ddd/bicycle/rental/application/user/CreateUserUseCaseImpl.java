package com.ddd.bicycle.rental.application.user;

import org.springframework.stereotype.Component;

import com.ddd.bicycle.rental.domain.model.user.User;
import com.ddd.bicycle.rental.domain.repository.UserRepository;

@Component
public class CreateUserUseCaseImpl implements CreateUserUseCase{

    private final UserRepository repository;

    public CreateUserUseCaseImpl(UserRepository repository){
        this.repository=repository;
    }

    @Override
    public User apply(User user) {
        return repository.createUser(user);
    }

}
