package com.example.demo.Controller;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.dto;
import com.example.demo.Services.EmployeePayrollService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmpController {

    @Autowired
    private EmployeePayrollService payrollService;

    @GetMapping("/")
    public String getAllEmployees() {
        return payrollService.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public String getEmployee(@PathVariable("id") int id) {
        return payrollService.getEmployeeById(id);
    }

    @PostMapping("/create")
    public dto createEmployee(@Valid @RequestBody dto empDTO) {
        return payrollService.createEmployee(empDTO);
    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody Map<String, Object> employeeData) {
        return payrollService.updateEmployee(employeeData);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        return payrollService.deleteEmployee(id);
    }
}