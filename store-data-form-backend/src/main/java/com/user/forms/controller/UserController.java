package com.user.forms.controller;

import com.user.forms.model.Fields;
import com.user.forms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home() {
        return "This is homepage.";
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/users")
    public List<Fields> getAllUsers() {
        List<Fields> fields = new ArrayList<>();
        userRepository.findAll().forEach(fields::add);
        return fields;
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/users")
    public Fields addUser(@RequestBody Fields fields) {
        userRepository.save(fields);
        return fields;
    }



}
