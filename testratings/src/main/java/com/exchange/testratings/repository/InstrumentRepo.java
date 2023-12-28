package com.exchange.testratings.repository;

import com.exchange.testratings.model.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrumentRepo extends JpaRepository<Instrument, Long> {
}
