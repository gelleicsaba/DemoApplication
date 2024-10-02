package com.example.demo.services;

import com.example.demo.dto.IEmployeeTableDto;
import com.example.demo.repository.EmployeeTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeTableService {

    @Autowired
    private EmployeeTableRepository _employeeTableRepository;

    public List<IEmployeeTableDto> getAllRows() {
        return _employeeTableRepository.getEmployeeTableRows();
    }

}
