package com.example.relationssql.repository;

import com.example.relationssql.model.ManyToMany.Invoice;
import com.example.relationssql.model.OneToMany.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant,Long> {
}
