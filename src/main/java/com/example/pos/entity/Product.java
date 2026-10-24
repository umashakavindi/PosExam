package com.example.pos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 30)
    private String code;

    @Column(nullable = false, unique = true, length = 100)
    private String name;

    @Column(length = 50)
    private Double unitPrice;

    @Column(length = 50)
    private Double availableQuantity;

    @Column(length = 10)
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
