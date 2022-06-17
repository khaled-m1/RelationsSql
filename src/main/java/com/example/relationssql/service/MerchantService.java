package com.example.relationssql.service;

import com.example.relationssql.model.ManyToMany.Invoice;
import com.example.relationssql.model.ManyToMany.Meal;
import com.example.relationssql.model.OneToMany.Merchant;
import com.example.relationssql.repository.InvoiceRepository;
import com.example.relationssql.repository.MealRepository;
import com.example.relationssql.repository.MerchantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MerchantService {
    private final MerchantRepository merchantRepository;

    public List<Merchant> getMerchant() {
      return merchantRepository.findAll();
    }
    public void addMerchant(Merchant merchant) {
        merchantRepository.save(merchant);
    }
}
