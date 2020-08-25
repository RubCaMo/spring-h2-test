package com.b2b.example.services;

import com.b2b.example.entity.User;
import com.b2b.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository _userRepository;

    public List<User> findAll() {
        System.out.println("INN??");
        return (List<User>) this._userRepository.findAll();
    }
}
