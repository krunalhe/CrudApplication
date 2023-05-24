package com.project.crudsms.controller;

import com.project.crudsms.model.User;
import com.project.crudsms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class ClientController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User createUser(@RequestBody User user)
    {
         User user1=userService.createUser(user);
        return user1;
    }

    @GetMapping("/{getUser}")
    public List<User> getUser()
    {
        return userService.getUser();
    }

    @PutMapping("/update/{id}")
    public User updateUserById(@RequestBody User user,@PathVariable("id") Long id)
    {
     return userService.updateUserById(user,id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id")Long id)
    {
         userService.deleteUser(id);
            return "User delete successfully";
    }
    @GetMapping("user/{id}")
    public User getUserById(@PathVariable ("id")Long id)
    {
        return userService.getUserById(id);
    }
    }
