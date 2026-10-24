package com.example.pos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "order")
@Getter
@Setter
@NoArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinColumn(name = "order_id")
    private Order order;

    @OneToMany
    @Column(name = "product_id")
    private Product product;

    @Column(length = 10)
    private Integer quantity;

    @Column(length = 10)
    private Double unitPrice;

    @Column(length = 10)
    private Double subtotal;


}
