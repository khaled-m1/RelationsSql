package com.example.relationssql.service;

import com.example.relationssql.dto.BranchDTO;
import com.example.relationssql.model.OneToMany.Branch;
import com.example.relationssql.model.OneToMany.Merchant;
import com.example.relationssql.repository.BranchRepository;
import com.example.relationssql.repository.MerchantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BranchService {
    private final BranchRepository branchRepository;
    private final MerchantRepository merchantRepository;

    public List<Branch> getBranch() {
      return branchRepository.findAll();
    }
    public void addBranch(BranchDTO branchDTO) {
        Merchant merchant = merchantRepository.findById(branchDTO.getMerchantId()).get();
        Branch branch = new Branch(null,branchDTO.getName(),merchant);
        merchant.getBranches().add(branch);
        branchRepository.save(branch);
    }
}
