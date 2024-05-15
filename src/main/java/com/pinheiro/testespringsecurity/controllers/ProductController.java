package com.pinheiro.testespringsecurity.controllers;

import com.pinheiro.testespringsecurity.domain.product.Product;
import com.pinheiro.testespringsecurity.domain.product.ProductRequestDTO;
import com.pinheiro.testespringsecurity.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }

    @PostMapping
    public Product createProduct(@RequestBody ProductRequestDTO dto){
        return productService.createProduct(dto);
    }
}
