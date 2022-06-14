package com.example.relationssql.repository;

import com.example.relationssql.model.OneToOne.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserDetailsRepository extends JpaRepository<MyUser,Long> {
}
