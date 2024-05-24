package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(name = "category_name", length = 50, unique = true ,nullable = false)
    private String name;
}
