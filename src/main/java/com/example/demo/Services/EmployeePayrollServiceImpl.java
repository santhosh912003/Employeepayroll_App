package com.example.demo.Services;





import org.springframework.stereotype.Service;

import com.example.demo.DTO.dto;

@Service
public class EmployeePayrollServiceImpl implements EmployeePayrollService {

    @Override
    public String getAllEmployees() {
        return "Get all employee payroll data";
    }

    @Override
    public String getEmployeeById(int id) {
        return "Get employee data for ID: " + id;
    }

    @Override
    public dto createEmployee(dto empDTO) {
        return new dto(empDTO.getName(), empDTO.getSalary());
    }

    @Override
    public String updateEmployee(Object employeeData) {
        return "Updated employee: " + employeeData;
    }

    @Override
    public String deleteEmployee(int id) {
        return "Deleted employee with ID: " + id;
    }

	
}