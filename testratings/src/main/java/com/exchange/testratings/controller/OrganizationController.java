package com.exchange.testratings.controller;

import com.exchange.testratings.model.dto.OrganizationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/organization")
public class OrganizationController {

    //* Комментарий




    @GetMapping("/{id}")
    public OrganizationDto getOrganizationById(@PathVariable Long id) {
        return null;
    }
}
