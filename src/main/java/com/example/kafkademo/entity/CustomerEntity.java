package com.example.kafkademo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name="customer")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String customerName;

    @Column(length = 3)
    private int age;

    @Column(length = 1)
    private String genderCode;

    @Builder
    public CustomerEntity(Integer id, String customerName, int age, String genderCode) {
        this.id = id;
        this.customerName = customerName;
        this.age = age;
        this.genderCode = genderCode;
    }
}
