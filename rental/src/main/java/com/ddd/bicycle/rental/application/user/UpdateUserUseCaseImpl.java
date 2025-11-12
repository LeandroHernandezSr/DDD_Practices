package com.ddd.bicycle.rental.application.user;

import com.ddd.bicycle.rental.domain.model.user.User;
import com.ddd.bicycle.rental.domain.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UpdateUserUseCaseImpl implements UpdateUserUseCase{

    private final UserRepository userRepository;

    public UpdateUserUseCaseImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public Optional<User> apply(User user) {
        return this.userRepository.updateUser(user);
    }

}
