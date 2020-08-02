package org.papermarking.papermarking.controller;

import java.util.List;

import org.papermarking.papermarking.model.userModel.Authentication;
import org.papermarking.papermarking.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping(value = "/")
    public List<Authentication> getAllAuthUsers() {
        return authenticationService.findAll();
    }

    @GetMapping(value = "/emailAndPassword/{email}/{password}")
    public Authentication getStudentByStudentNumber(@PathVariable("email") String email , @PathVariable("password") String password) {
        return authenticationService.findByEmailAndPassword(email , password);
    }

    @GetMapping(value = "/byEmail/{email}")
    public Authentication getStudentByEmail(@PathVariable("email") String email) {
        return authenticationService.findByEmail(email);
    }

    @GetMapping(value = "/byAccessLevel/{accessLevel}")
    public List<Authentication> findAllByAccessLevel(@PathVariable("accessLevel") int accessLevel) {
        return authenticationService.findAllByAccessLevel(accessLevel);
    }


    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateStudent(@RequestBody Authentication student) {
        authenticationService.saveOrUpdateStudent(student);
        return new ResponseEntity("auth user added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{email}")
    public void deleteStudent(@PathVariable String email) {
        authenticationService.deleteStudent(authenticationService.findByEmail(email).getId());
    }

}
