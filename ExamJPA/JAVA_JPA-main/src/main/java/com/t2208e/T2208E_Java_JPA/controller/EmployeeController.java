package com.t2208e.T2208E_Java_JPA.controller;

import com.t2208e.T2208E_Java_JPA.dto.EmployeeDto;
import com.t2208e.T2208E_Java_JPA.entity.Employee;
import com.t2208e.T2208E_Java_JPA.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.ok(createdEmployee);
    }

    @GetMapping
    public
