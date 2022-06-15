package com.example.relationssql.service;

import com.example.relationssql.model.ManyToMany.Invoice;
import com.example.relationssql.model.ManyToMany.Meal;
import com.example.relationssql.repository.InvoiceRepository;
import com.example.relationssql.repository.MealRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;
    private final MealRepository mealRepository;

    public List<Invoice> getInvoice() {
      return invoiceRepository.findAll();
    }

    public void addInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
    }


    public void addInvoiceMeal(Long invoiceId, Long mealId) {
        Invoice invoice = invoiceRepository.findById(invoiceId).get();
        Meal meal = mealRepository.findById(mealId).get();
        invoice.getMeal().add(meal);
        invoiceRepository.save(invoice);
    }
}
