package com.example.relationssql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
public class BranchDTO {
    private Long merchantId;
    private String name;
}
