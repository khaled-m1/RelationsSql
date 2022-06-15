package com.example.relationssql.controller;

import com.example.relationssql.model.ManyToMany.Invoice;
import com.example.relationssql.model.ManyToMany.Meal;
import com.example.relationssql.service.InvoiceService;
import com.example.relationssql.service.MealService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/invoice")
@AllArgsConstructor
public class InvoiceController {
    private final InvoiceService invoiceService;
    private final MealService mealService;

    @GetMapping
    public List<Invoice> getInvoice(){
        return invoiceService.getInvoice();
    }

    @PostMapping
    public ResponseEntity addInvoice(@RequestBody Invoice invoice){
        invoiceService.addInvoice(invoice);
        return ResponseEntity.status(201).body("accepted request :)");
    }
    @PostMapping("meal/{mealId}/{invoiceId}")
    public ResponseEntity addInvoiceMeal(@PathVariable Long invoiceId,
                                         @PathVariable Long mealId){

        invoiceService.addInvoiceMeal(invoiceId,mealId);
        return ResponseEntity.status(201).body("accepted request :)");
    }
}
