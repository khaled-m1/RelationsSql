package com.example.relationssql.service;

import com.example.relationssql.dto.UserDetailsDTO;
import com.example.relationssql.model.OneToOne.MyUser;
import com.example.relationssql.model.OneToOne.MyUserDetails;
import com.example.relationssql.repository.MyUserDetailsRepository;
import com.example.relationssql.repository.MyUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MyUserDetailsService {
    private final MyUserDetailsRepository myUserDetailsRepository;
    private final MyUserRepository myUserRepository;


    public List<MyUser> getUser() {
      return myUserDetailsRepository.findAll();
    }


    public void addUserDetails(UserDetailsDTO dto) {
        Optional<MyUser> myUser = myUserRepository.findById(dto.getUserId());
        if (myUser.isEmpty()){
            throw new RuntimeException("not found");
        }

        MyUserDetails myUserDetails = new MyUserDetails();
        myUserDetails.setPhoneNumber(dto.getPhoneNumber());
        myUserDetails.setHeight(dto.getHeight());
        myUserDetails.setAge(dto.getAge());

        myUserDetails.setMyUser(myUser.get());
        myUser.get().setMyUserDetails(myUserDetails);
        myUserRepository.save(myUser.get());
    }
}
