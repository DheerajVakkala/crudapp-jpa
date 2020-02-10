package com.dheeraj.springboot.crudapp.dao;

import com.dheeraj.springboot.crudapp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

     List<Employee> findAll();

     Employee findById(int theId);

     void save(Employee theEmployee);

     void deleteById(int theId);

}
