package com.exchange.testratings.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "instrument")
public class Instrument {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "instr_seq")
    private Long id;

    @Column(name = "instrument_type")
    private InstrumentType instrumentType;

    @Column(name = "isin")
    private String isin;

    @Column(name = "issue_value")
    private Long issueValue;

    @Column(name = "price")
    private Long price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id", referencedColumnName = "id", nullable = false)
    private Organization organization;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rating_id", referencedColumnName = "id")
    private Rating rating;
    private boolean compliance;
}
