package org.papermarking.papermarking.service.impl;

import java.util.List;

import org.papermarking.papermarking.model.User;
import org.papermarking.papermarking.repository.UserRepository;
import org.papermarking.papermarking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User findByAuthenticationEmail(String email) {
        return userRepository.findByAuthenticationEmail(email);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

//    @Override
//    public User findByEmail(String email) {
//        return userRepository.findByEmail(email);
//    }

    @Override
    public void saveOrUpdateStudent(User user) {
        userRepository.save(user);
    }

}