package com.codeacademy.diningreviewapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String website;

    @Column
    private Double peanutScore;
    private Double eggScore;
    private Double dairyScore;
    private Double overallScore;
}

