package org.papermarking.papermarking.service.impl;

import java.util.List;

import org.papermarking.papermarking.model.Authentication;
import org.papermarking.papermarking.repository.AuthenticationRepository;
import org.papermarking.papermarking.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private AuthenticationRepository authenticationRepository;


    @Override
    public List<Authentication> findAll() {
        return authenticationRepository.findAll();
    }

    @Override
    public Authentication findByEmailAndPassword(String email, String password) {
        return authenticationRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public Authentication findByEmail(String email) {
        return authenticationRepository.findByEmail(email);
    }

    @Override
    public void saveOrUpdateStudent(Authentication authentication) {
        authenticationRepository.save(authentication);
    }

    @Override
    public void deleteStudent(String id) {
        authenticationRepository.deleteById(id);
    }
}
