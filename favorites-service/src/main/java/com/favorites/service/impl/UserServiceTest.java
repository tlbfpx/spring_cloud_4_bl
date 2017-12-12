package com.favorites.service.impl;

import com.favorites.domain.User;
import com.favorites.proxy.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceTest {

    @Autowired
    UserRepository userRepository;


    @RequestMapping("/getUser/{id}")
    public User getUserById(@RequestParam("id") long id){
        return userRepository.findById(id);
    }
}