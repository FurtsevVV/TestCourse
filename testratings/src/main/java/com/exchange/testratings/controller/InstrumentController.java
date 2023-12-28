package com.exchange.testratings.controller;

import com.exchange.testratings.model.dto.InstrumentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/instrument")
public class InstrumentController {

    @GetMapping("/{id}")
    public InstrumentDto getInstrumentById(@PathVariable Long id){
        return null;
    }

}
