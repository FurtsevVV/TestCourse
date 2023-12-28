package com.exchange.testratings.service;

import com.exchange.testratings.model.dto.OrganizationDto;
import com.exchange.testratings.repository.OrganizationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationService {

    private final OrganizationRepo repository;

    public OrganizationDto getById(Long id) {
        return null;
    }

}
