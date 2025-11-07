package com.ddd.bicycle.rental.application.user;

import com.ddd.bicycle.rental.domain.model.user.User;
import com.ddd.bicycle.rental.domain.repository.UserRepository;

public class UpdateUserUseCaseImpl implements UpdateUserUseCase{

    private final UserRepository userRepository;

    public UpdateUserUseCaseImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public User apply(User user) {
        return this.userRepository.updateUser(user);
    }

}
