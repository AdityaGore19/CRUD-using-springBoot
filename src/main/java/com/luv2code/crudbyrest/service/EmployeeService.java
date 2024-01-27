package com.luv2code.crudbyrest.service;

import com.luv2code.crudbyrest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee fondById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
