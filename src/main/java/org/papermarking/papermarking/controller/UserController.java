package org.papermarking.papermarking.controller;

import java.util.List;

import org.papermarking.papermarking.model.User;
import org.papermarking.papermarking.service.AuthenticationService;
import org.papermarking.papermarking.service.UserService;
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
@RequestMapping("/testUser")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationService authService;

    @GetMapping(value = "/findbyauth/{email}")
    public User findByAuthenticationEmail(@PathVariable("email") String email) {
        return userService.findByAuthenticationEmail(email);
    }
    @GetMapping(value = "/")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping(value = "/authId/{id}")
    public List<User> getAllUsersByAuthId(@PathVariable("id") String id) {
        System.out.println("This is  -  "+id);
        return userService.findByAuthenticationId(id);
    }


//    @GetMapping(value = "/byEmail/{email}")
//    public User getUserByEmail(@PathVariable("email") String email) {
//        return userService.findByEmail(email);
//    }



    @GetMapping(value = "/save/{email}")
    public ResponseEntity<?> saveOrUpdateUser(@PathVariable("email") String email) {
        User user = new User(authService.findByEmail(email));
        userService.saveOrUpdateStudent(user);
        return new ResponseEntity("user added successfully", HttpStatus.OK);
    }
}