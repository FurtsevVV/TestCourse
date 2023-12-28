package com.exchange.testratings.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "rating")
public class Rating {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rating_gen")
    private Long id;

    @Column(name = "rating_value")
    private String ratingValue;

    @Column(name = "rating_date")
    private LocalDate ratingDate;
    private boolean isActual;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agency_id", referencedColumnName = "id", nullable = false)
    private RatingAgency ratingAgency;
}
