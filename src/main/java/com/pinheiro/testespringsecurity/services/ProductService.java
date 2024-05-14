package com.pinheiro.testespringsecurity.services;

import com.pinheiro.testespringsecurity.domain.product.Product;
import com.pinheiro.testespringsecurity.dtos.ProductRequestDTO;
import com.pinheiro.testespringsecurity.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getAll(){
        return repository.findAll();
    }

    public Product createProduct(ProductRequestDTO dto){
        Product newProduct = new Product(dto);
        repository.save(newProduct);
        return newProduct;
    }
}
