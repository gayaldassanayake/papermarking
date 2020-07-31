package org.papermarking.papermarking.service;

import org.papermarking.papermarking.model.Authentication;

import java.util.List;


public interface AuthenticationService {

    List<Authentication> findAll();

    Authentication findByEmailAndPassword(String email , String password);

    Authentication findByEmail(String email);

    void saveOrUpdateStudent(Authentication student);

    void deleteStudent(String id);

}