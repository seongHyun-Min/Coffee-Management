package com.example.coffeemanagement.controller.api;


import com.example.coffeemanagement.Service.ProductService;
import com.example.coffeemanagement.model.Category;
import com.example.coffeemanagement.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ProductRestController {

    private final ProductService productService;

    @GetMapping("/api/v1/products")
    public List<Product> productList(@RequestParam Optional<Category> category) {
        return category.map(productService::getProductsByCategory).orElse(productService.getAllProducts());
    }


}
