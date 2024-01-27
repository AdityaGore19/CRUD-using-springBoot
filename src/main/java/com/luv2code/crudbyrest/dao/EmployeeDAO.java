package com.luv2code.crudbyrest.dao;

import com.luv2code.crudbyrest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee fondById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
