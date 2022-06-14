package com.example.relationssql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
public class UserDetailsDTO {
    private Long userId;
    private String phoneNumber;
    private Integer height;
    private Integer age;
}
