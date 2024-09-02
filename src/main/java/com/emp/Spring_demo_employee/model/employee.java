package com.emp.Spring_demo_employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
//@Table(name= "emp")
public class employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
//    @Column(name="emp_name")
    private String emp_name;

//    @Column(name="emp_salary")
    private float emp_salary;

//    @Column(name="emp_designation")
    private String emp_designation;

    public void setId(long id){
        this.id=id;
    }
    public long getId(){
        return id;
    }
    public void setEmp_name(String emp_name){
        this.emp_name=emp_name;
    }
    public String getEmp_name(){
        return emp_name;
    }
    public void setEmp_salary(float emp_salary){
        this.emp_salary=emp_salary;
    }
    public float getEmp_salary(){
        return emp_salary;
    }
    public void setEmp_designation(String emp_designation){
        this.emp_designation=emp_designation;
    }
    public String getEmp_designation(){
        return emp_designation;
    }
}
