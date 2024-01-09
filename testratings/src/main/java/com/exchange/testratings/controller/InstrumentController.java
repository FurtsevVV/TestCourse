package com.exchange.testratings.controller;

import com.exchange.testratings.model.dto.InstrumentDto;
import com.exchange.testratings.service.InstrumentHandlerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/instrument")
@RequiredArgsConstructor
public class InstrumentController {

    private final InstrumentHandlerService handler;

    @GetMapping("/{id}")
    public InstrumentDto getInstrumentById(@PathVariable Long id){
        return null;
    }

}
