package com.example.demo.controller;

import com.example.demo.dto.IEmployeeTableDto;
import com.example.demo.services.EmployeeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeTableController {
    @Autowired
    private EmployeeTableService _employeeTableService;

    @GetMapping("/employee-rows")
    public List<IEmployeeTableDto> getAllRows() {
        return _employeeTableService.getAllRows();
    }

}
