package com.emp.Spring_demo_employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emp.Spring_demo_employee.repository.employee_repository;
import com.emp.Spring_demo_employee.model.employee;

import java.util.*;

@Service

public class employee_service {
    @Autowired
    private  employee_repository employeeRepository;

    public List<employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public Optional<employee> getEmployeeById(long id){
        return employeeRepository.findById(id);
    }
    public employee createEmployee(employee emp){
        return employeeRepository.save(emp);
    }
    public employee updateEmployee(Long id,employee emp_details){
        employee employee=employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        employee.setEmp_name(emp_details.getEmp_name());
        employee.setEmp_salary(emp_details.getEmp_salary());
        employee.setEmp_designation(emp_details.getEmp_designation());

        return employeeRepository.save(emp_details);
    }
    public void deleteEmployee(long id){
        employee emp= employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        employeeRepository.delete(emp);
    }
}
