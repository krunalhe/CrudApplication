package com.project.crudsms.service;

import com.project.crudsms.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    //create user
    public User createUser(User user);

    //read user
    public List<User> getUser();

    //read userby id
    public User getUserById(Long id);

    //delete user
    public void deleteUser(Long id);

    //update user
    public User updateUserById(User user, Long id);
}
