package com.example.relationssql.controller;

import com.example.relationssql.dto.BranchDTO;
import com.example.relationssql.model.OneToMany.Branch;
import com.example.relationssql.model.OneToMany.Merchant;
import com.example.relationssql.service.BranchService;
import com.example.relationssql.service.MerchantService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/branch")
@AllArgsConstructor
public class BranchController {
    private final BranchService branchService;

    @GetMapping
    public List<Branch> getBranch(){
        return branchService.getBranch();
    }

    @PostMapping
    public ResponseEntity addBranch(@RequestBody BranchDTO branchDTO){
        branchService.addBranch(branchDTO);
        return ResponseEntity.status(201).body("accepted request :)");
    }
}
