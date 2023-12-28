package com.exchange.testratings.model.dto;

import lombok.Data;

@Data
public class InstrumentDto {

    private String name;
    private String instrumentType;
    private String isin;
    private String organization;
    private String rating;
    private String agencyName;
    private boolean compliance;
}
