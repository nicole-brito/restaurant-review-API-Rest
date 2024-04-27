package com.codeacademy.diningreviewapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "reviews")
public class DiningReview {

    @Id
    @Column(nullable = false, updatable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @Column
    private Double peanutScore;

    @Column
    private Double eggScore;

    @Column
    private Double dairyScore;

    @Column
    private String commentary;

}
