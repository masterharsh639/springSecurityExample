package com.example.springSecurityExample.controller;

import com.example.springSecurityExample.model.Users;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return user;
    }
}
