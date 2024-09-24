package com.practise.practise.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.practise.practise.models.User;

public interface UserRepository extends MongoRepository<User, String> {

    public Optional<User> findByEmail(String email);

}
