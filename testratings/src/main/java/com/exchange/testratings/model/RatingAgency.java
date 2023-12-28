package com.exchange.testratings.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "rating_agency")
public class RatingAgency {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;
}
