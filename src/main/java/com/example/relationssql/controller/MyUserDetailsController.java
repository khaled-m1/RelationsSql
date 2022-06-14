package com.example.relationssql.controller;

import com.example.relationssql.dto.UserDetailsDTO;
import com.example.relationssql.model.OneToOne.MyUser;
import com.example.relationssql.model.OneToOne.MyUserDetails;
import com.example.relationssql.repository.MyUserRepository;
import com.example.relationssql.service.MyUserDetailsService;
import com.example.relationssql.service.MyUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user-details")
@AllArgsConstructor
public class MyUserDetailsController {
    private final MyUserDetailsService myUserDetailsService;
    private final MyUserRepository myUserRepository;


    @GetMapping
    public List<MyUser> getUser(){
        return myUserDetailsService.getUser();
    }


    @PostMapping
    public ResponseEntity addUserDetails(@RequestBody UserDetailsDTO dto){
        myUserDetailsService.addUserDetails(dto);
        return ResponseEntity.status(201).body("accepted request :)");
    }
}
