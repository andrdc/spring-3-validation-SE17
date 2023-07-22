package com.andresruiz.validationdemo.service;

import com.andresruiz.validationdemo.dto.UserRequest;
import com.andresruiz.validationdemo.entity.User;
import com.andresruiz.validationdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User save(UserRequest userRequest) {
        User user = User.build(0, userRequest.getName(), userRequest.getEmail());
        return repository.save(user);
    }

    public List<User> getAll() {
        return repository.findAll();
    }

    public User get(long id) {
        return repository.findById(id);
    }
}