package com.exchange.testratings.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum InstrumentType {

    STOCK("Акция"),
    BOND("Облигация");

    private final String name;
}
