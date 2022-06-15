package com.example.relationssql.repository;

import com.example.relationssql.model.ManyToMany.Invoice;
import com.example.relationssql.model.ManyToMany.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {

}
