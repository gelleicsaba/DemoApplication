package com.example.demo.controller;

import com.example.demo.model.Company;
import com.example.demo.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CompanyController {
    @Autowired
    private CompanyService _companyService;

    @GetMapping("/companies")
    public List<Company> getAllEmployees() {
        return _companyService.getAllCompanies();
    }

}
