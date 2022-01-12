package com.example.employee.employeeregistration.repository;

import com.example.employee.employeeregistration.entity.EmployeeDetails;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeDetails, Integer> {
}
