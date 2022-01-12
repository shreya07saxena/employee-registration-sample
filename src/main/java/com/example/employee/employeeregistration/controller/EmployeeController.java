package com.example.employee.employeeregistration.controller;

import com.example.employee.employeeregistration.entity.EmployeeDetails;
import com.example.employee.employeeregistration.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
    @PostMapping("/saveDetails")
    public String saveEmployeeDetails(@RequestBody EmployeeDetails details){

        employeeRepository.save(details);
        return "Record of the employee is added to database";
    }
    @GetMapping("/getEmployeeDetails/{id}")
    public Optional<EmployeeDetails> getDetailsById(@PathVariable int id){

        Optional<EmployeeDetails> employeeDetails=  employeeRepository.findById(id);
        return employeeDetails;
    }

    @DeleteMapping("/deleteEmployeeRecord/{eid}")
    public String deleteEmployeeRecord(@PathVariable int eid){
        employeeRepository.deleteById(eid);
        return "the record against the given employee id has been deleted from database";
    }

    @GetMapping("/getEmployeeDetailss")
    public  List<EmployeeDetails> getAllDetails(){
        List<EmployeeDetails> employeeDetails= employeeRepository.findAll();
        return employeeDetails;
    }

}
