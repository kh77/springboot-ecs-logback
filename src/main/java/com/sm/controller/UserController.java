package com.sm.controller;

import com.sm.model.User;
import com.sm.repo.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User>  getUsers(){
        log.debug("Debug -> Get all users");
        log.info("INFO -> Get all users");
        return userRepository.getAllUsers();
    }

    @GetMapping("/error")
    public void  getUserss(){
       throw new RuntimeException("Error Found");
    }
}
