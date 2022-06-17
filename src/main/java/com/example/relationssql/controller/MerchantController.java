package com.example.relationssql.controller;

import com.example.relationssql.model.ManyToMany.Invoice;
import com.example.relationssql.model.OneToMany.Merchant;
import com.example.relationssql.service.InvoiceService;
import com.example.relationssql.service.MealService;
import com.example.relationssql.service.MerchantService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/merchant")
@AllArgsConstructor
public class MerchantController {
    private final MerchantService merchantService;

    @GetMapping
    public List<Merchant> getMerchant(){
        return merchantService.getMerchant();
    }

    @PostMapping
    public ResponseEntity addMerchant(@RequestBody Merchant merchant){
        merchantService.addMerchant(merchant);
        return ResponseEntity.status(201).body("accepted request :)");
    }

}
