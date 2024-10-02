package com.example.demo.repository;

import com.example.demo.dto.IEmployeeTableDto;
import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeTableRepository extends JpaRepository<Employee, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM employee_table ORDER BY employeeid")
    List<IEmployeeTableDto> getEmployeeTableRows();
}
