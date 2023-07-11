package com.example.coffeemanagement.controller;


import com.example.coffeemanagement.Service.ProductService;
import com.example.coffeemanagement.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public String productsPage(Model model){
        List<Product> allProducts = productService.getAllProducts();
        log.info("컨트롤러 호출");
        model.addAttribute("products", allProducts);
        return "product-list";
    }
}
