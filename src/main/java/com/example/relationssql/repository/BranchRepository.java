package com.example.relationssql.repository;

import com.example.relationssql.model.OneToMany.Branch;
import com.example.relationssql.model.OneToMany.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Long> {
}
