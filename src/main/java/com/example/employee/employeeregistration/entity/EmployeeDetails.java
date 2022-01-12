package com.example.employee.employeeregistration.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "EmployeeDetails")
public class EmployeeDetails {

    @Id
    int eid;
    String name;
    String email;
    String dept;
    
}
