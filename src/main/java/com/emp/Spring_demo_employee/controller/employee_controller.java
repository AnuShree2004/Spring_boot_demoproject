package com.emp.Spring_demo_employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.emp.Spring_demo_employee.service.employee_service;
import com.emp.Spring_demo_employee.model.employee;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class employee_controller {
    @Autowired
    private employee_service empservice;

    @GetMapping
    public List<employee> getAllEmployees(){
        return empservice.getAllEmployees();
    }
    @GetMapping("/{id}")
    public ResponseEntity<employee> getEmployeeById(@PathVariable Long id){
        Optional <employee> emp=empservice.getEmployeeById(id);
        if(emp.isPresent()){
            return ResponseEntity.ok(emp.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/create")
    public employee createEmployee(@RequestBody employee emp){
        if (emp != null){
            System.out.println("Got the details");
        }
        return empservice.createEmployee(emp);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<employee> updateEmployee(@PathVariable Long id,@RequestBody employee empdetails){
        employee updatedemployee=empservice.updateEmployee(id,empdetails);
        return ResponseEntity.ok(updatedemployee);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        empservice.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}
