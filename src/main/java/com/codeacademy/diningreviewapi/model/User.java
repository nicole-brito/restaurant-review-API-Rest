package com.codeacademy.diningreviewapi.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (nullable = false, unique = true)
    private String displayName;

    @Column (nullable = false)
    private String city;

    @Column (nullable = false)
    private String state;

    @Column (nullable = false)
    private String zipcode;

    @Column (nullable = false)
    private Boolean peanutAllergic;

    @Column (nullable = false)
    private Boolean eggAllergic;

    @Column (nullable = false)
    private Boolean dairyAllergic;
}
