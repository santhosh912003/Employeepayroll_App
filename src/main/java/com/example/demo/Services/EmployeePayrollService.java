package com.example.demo.Services;



import com.example.demo.DTO.dto;

import ch.qos.logback.core.model.Model;

public interface EmployeePayrollService {
    String getAllEmployees();
    String getEmployeeById(int id);
    dto createEmployee(dto empDTO);
    String updateEmployee(Object employeeData);
    String deleteEmployee(int id);
}
