package com.practise.practise.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.practise.practise.models.User;
import com.practise.practise.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder ;



    public User createUser(User user) {

        System.out.println("arrived userservice");
        user.setPassword(passwordEncoder.encode(user.getPassword()));;
        return userRepository.save(user);

    }
}
