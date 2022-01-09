package com.example.employee.employeeregistration.controller;

import com.example.employee.employeeregistration.entity.EmployeeDetails;
import com.example.employee.employeeregistration.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
    @PostMapping("/saveDetails")
    public String saveEmployeeDetails(@RequestBody EmployeeDetails details){

        employeeRepository.save(details);
        return "Record of the employee is added to database";
    }
    @GetMapping("/getEmployeeDetails")
    public Optional<EmployeeDetails> getDetailsById(@RequestParam UUID id){
        Optional<EmployeeDetails> employeeDetails=  employeeRepository.findById(id);
        return employeeDetails;
    }

    @DeleteMapping("/deleteEmployeeRecord/{id}")
    public String deleteEmployeeRecord(@PathVariable UUID id){
        employeeRepository.deleteById(id);
        return "the record against the given employee id has been deleted from database";
    }

}
