package com.b2b.example.controller;

import com.b2b.example.entity.User;
import com.b2b.example.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Baeldung doc utils: https://www.baeldung.com/spring-new-requestmapping-shortcuts
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    static Logger logger = (Logger) LoggerFactory.getLogger(Logger.class);

    @GetMapping("/all")
    public List<User> findAll() {
        logger.debug("Init method findAll");
        return userService.findAll();
    }

}
