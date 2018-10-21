package org.spring.springboot.controller;

import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/getAll/{id}")
    public User findAllUsers(@PathVariable("id") Integer id) {
        return userService.selectByPrimaryKey(id);
    }
}
