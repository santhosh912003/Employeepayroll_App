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

import jakarta.validation.Valid;


@RestController
@RequestMapping("/employeepayrollservice")
public class EmpController {

    @GetMapping("/")
    public String getAllEmployees() {
        return "Get all employee payroll data";
    }

    @GetMapping("/get/{id}")
    public String getEmployee(@PathVariable("id") int id) {
        return "Get employee data for ID: " + id;
    }

//    @PostMapping("/create")
//    public String createEmployee(@RequestBody Map<String, Object> employeeData) {
//        return "Created employee: " + employeeData;
//    }
    // updated 
    
    @PostMapping("/create")
    public dto createEmployee(@Valid @RequestBody dto empDTO) {
        return new dto(empDTO.getName(), empDTO.getSalary());
    }


    @PutMapping("/update")
    public String updateEmployee(@RequestBody Map<String, Object> employeeData) {
        return "Updated employee: " + employeeData;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        return "Deleted employee with ID: " + id;
    }
}