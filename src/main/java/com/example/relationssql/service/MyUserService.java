package com.example.relationssql.service;

import com.example.relationssql.model.OneToOne.MyUser;
import com.example.relationssql.repository.MyUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MyUserService {
    private final MyUserRepository myUserRepository;

    public List<MyUser> getUser() {
      return myUserRepository.findAll();
    }

    public void addUser(MyUser myUser) {
        myUserRepository.save(myUser);
    }

}
