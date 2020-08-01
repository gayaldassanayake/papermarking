package org.papermarking.papermarking.service;

import org.papermarking.papermarking.model.User;

import java.util.List;


public interface UserService {

    User findByAuthenticationEmail(String email);

    List<User> findAll();

//    User findByEmail(String email);

    void saveOrUpdateStudent(User user);


}