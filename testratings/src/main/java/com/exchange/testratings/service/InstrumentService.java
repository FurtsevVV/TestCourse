package com.exchange.testratings.service;

import com.exchange.testratings.model.Instrument;
import com.exchange.testratings.repository.InstrumentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InstrumentService {

    private final InstrumentRepo repository;

    public Optional<Instrument> getById(Long id){
        return repository.findById(id);
    }
}
