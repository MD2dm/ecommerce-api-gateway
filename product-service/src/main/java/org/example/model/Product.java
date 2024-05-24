package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String name;

    private String description;

    private double price;

    @Column(name = "category_id")
    private Long categoryId;

}
