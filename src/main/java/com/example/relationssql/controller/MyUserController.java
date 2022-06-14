package com.example.relationssql.controller;

import com.example.relationssql.model.OneToOne.MyUser;
import com.example.relationssql.service.MyUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
@AllArgsConstructor
public class MyUserController {
    private final MyUserService myUserService;

    @GetMapping
    public List<MyUser> getUser(){
        return myUserService.getUser();
    }

    @PostMapping
    public ResponseEntity addUser(@RequestBody MyUser myUser){
        myUserService.addUser(myUser);
        return ResponseEntity.status(201).body("accepted request :)");
    }
}
