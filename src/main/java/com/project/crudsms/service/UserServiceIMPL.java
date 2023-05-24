package com.project.crudsms.service;

import com.project.crudsms.model.User;
import com.project.crudsms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user)
    {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUser()
    {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getUserById(Long id)
    {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteUser(Long id)
    {
         userRepository.deleteById(id);
    }

    @Override
    public User updateUserById(User user, Long id)
    {
        User user1=userRepository.findById(id).get();
        user1.setEmail(user.getEmail());
        user1.setName(user.getName());
        user1.setMobile(user.getMobile());
        user1.setAddress(user.getAddress());
        return userRepository.save(user1);
    }
}
