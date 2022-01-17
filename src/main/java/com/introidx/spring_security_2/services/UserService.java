package com.introidx.spring_security_2.services;

import com.introidx.spring_security_2.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PRAKASH RANJAN on 11-01-2022
 */

@Service
public class UserService {
    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("abc", "abc", "abc@gmail.com"));
        list.add(new User("xyz", "xyz", "xyz@gmail.com"));
    }

    // get all users
    public List<User> getAllUsers() {
        return this.list;
    }

    // get single user
    public User getUser(String username) {
        return this.list.stream().filter((user) ->
                user.getUsername().equals(username)).findAny().orElse(null);
    }

    // add single user
    public User addUser(User user){
        this.list.add(user);
        return user;
    }
}
