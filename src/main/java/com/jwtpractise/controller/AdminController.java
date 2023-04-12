package com.jwtpractise.controller;

import com.jwtpractise.model.User;
import com.jwtpractise.service.appuser.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    private IUserService userService;
    @GetMapping("/all")
    public ResponseEntity<Iterable<User>>getAllUser(){
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<User>createUser(@RequestBody User user){
        return new ResponseEntity<>(userService.save(user),HttpStatus.OK);
    }
}
