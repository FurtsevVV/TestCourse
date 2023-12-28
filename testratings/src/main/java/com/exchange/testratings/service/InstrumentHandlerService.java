package com.exchange.testratings.service;

import com.exchange.testratings.model.Instrument;
import com.exchange.testratings.model.dto.InstrumentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InstrumentHandlerService {

    private final InstrumentService instrumentService;

    public InstrumentDto getInstrumentById(Long id) {

        Instrument instrument = instrumentService.getById(id).orElse(new Instrument());


        return null;

    }
}
