package com.introidx.spring_security_2.controllers;

import com.introidx.spring_security_2.models.User;
import com.introidx.spring_security_2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by PRAKASH RANJAN on 11-01-2022
 */

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    // get all users
    @GetMapping("/")
    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }

    // return single User
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return this.userService.getUser(username);
    }

    @PostMapping("/")
    public User addUser(@RequestBody User user){
        return this.addUser(user);
    }
}
