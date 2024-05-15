package com.pinheiro.testespringsecurity.domain.product;

import jakarta.persistence.*;
import lombok.*;

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
