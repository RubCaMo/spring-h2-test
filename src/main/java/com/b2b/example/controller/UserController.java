package com.b2b.example.controller;

import com.b2b.example.entity.User;
import com.b2b.example.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/users")
public class UserController {

    private UserRepository _userRepository;

    @GetMapping("/")
    public List<User> users() {
        return (List<User>) this._userRepository.findAll();
    }
}
