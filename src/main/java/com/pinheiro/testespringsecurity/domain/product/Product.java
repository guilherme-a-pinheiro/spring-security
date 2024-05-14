package com.pinheiro.testespringsecurity.domain.product;

import com.pinheiro.testespringsecurity.dtos.ProductRequestDTO;
import com.pinheiro.testespringsecurity.repositories.ProductRepository;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity(name = "product")
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private Double price;

    public Product(ProductRequestDTO dto){
        this.name = dto.name();
        this.price = dto.price();
    }
}
