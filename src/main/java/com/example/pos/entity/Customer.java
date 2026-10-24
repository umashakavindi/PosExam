package com.example.pos.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String mobileNumber;

    @Column(nullable = false,unique = true, length = 100)
    private String fullName;

    @Email
    @NotBlank
    @Column(nullable = false)
    private String email;

    @Column(length = 10)
    private Double loyaltyPoints;

    @Column(name = "registeredAt", nullable = false, updatable = false)
    private LocalDateTime registeredAt;

}
