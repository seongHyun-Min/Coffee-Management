package com.example.coffeemanagement.Service;

import com.example.coffeemanagement.dto.CreateProductRequestDto;
import com.example.coffeemanagement.model.Category;
import com.example.coffeemanagement.model.Product;
import com.example.coffeemanagement.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public Product createProduct(CreateProductRequestDto requestDto) {
        Product product = new Product(UUID.randomUUID(), requestDto.getProductName(), requestDto.getCategory(),
                requestDto.getPrice());
        return productRepository.insert(product);
    }

    public Product createProductWithDetails(CreateProductRequestDto requestDto) {
        Product product = new Product(UUID.randomUUID(), requestDto.getProductName(), requestDto.getCategory(),
                requestDto.getPrice(), requestDto.getDescription(), LocalDateTime.now(), LocalDateTime.now());
        log.info("product 생성 :" + product);
        return productRepository.insert(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(Category category) {
        return productRepository.findByCategory(category);
    }


}
