package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.model.User;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService{

    private final UserRepository userRepository;

    public Optional<User> findByUsername(String username){
        return userRepository.findByUsername(username);
    }
}
