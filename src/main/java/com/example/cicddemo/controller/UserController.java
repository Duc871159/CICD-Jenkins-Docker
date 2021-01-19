package com.example.cicddemo.controller;

import com.example.cicddemo.model.Users;
import com.example.cicddemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/helloworld")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/users")
    public List<Users> getAll() {
        return userRepository.findAll();
    }
}
