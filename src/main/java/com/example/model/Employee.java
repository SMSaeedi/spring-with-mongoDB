package com.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "Employee")
public class Employee {

    @Id
    private String employeeId;

    private String employeeName;

    private String employeeRole;

}