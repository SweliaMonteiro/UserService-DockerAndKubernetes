package com.example.controllers;

import com.example.exceptions.UserNotFoundException;
import com.example.models.User;
import com.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    // This is a sample method which is used to get the user details by id
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") long id) {
        try {
            System.out.println(new Date() + " ---> UserId: " + id);  // To test if the requests are distributed among the 5 servers
            User user = userService.getUserById(id);
            user.setStatusMessage("User found");
            return user;
        }
        catch (UserNotFoundException e) {
            User user = new User();
            user.setStatusMessage(e.getMessage());
            return user;
        }
    }
}
