package com.example.coffeemanagement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;


@AllArgsConstructor
@Getter

public class Product {
    private final UUID productId;
    private String productName;

    private Category category;

    private long price;

    private String description;
    private final LocalDateTime createdAt;

    private LocalDateTime updateAt;

    public Product(UUID productId, String productName, Category category, long price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.createdAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
    }

    public void setProductName(String productName) {
        this.productName = productName;
        this.updateAt = LocalDateTime.now();
    }

    public void setCategory(Category category) {
        this.category = category;
        this.updateAt = LocalDateTime.now();

    }

    public void setPrice(long price) {
        this.price = price;
        this.updateAt = LocalDateTime.now();

    }

    public void setDescription(String description) {
        this.description = description;
        this.updateAt = LocalDateTime.now();

    }
}
