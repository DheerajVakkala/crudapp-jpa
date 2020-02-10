package com.dheeraj.springboot.crudapp.service;

import com.dheeraj.springboot.crudapp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);
}
