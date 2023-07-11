package com.example.coffeemanagement.dto;

import com.example.coffeemanagement.model.Category;
import lombok.Data;

@Data
public class CreateProductRequestDto {
    private String productName;
    private Category category;
    private long price;
    private String description;
}
