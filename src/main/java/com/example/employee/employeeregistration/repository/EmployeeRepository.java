package com.example.employee.employeeregistration.repository;

import com.example.employee.employeeregistration.entity.EmployeeDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeDetails, UUID> {
}
