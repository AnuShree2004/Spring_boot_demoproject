package com.emp.Spring_demo_employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.emp.Spring_demo_employee.model.employee;

@Repository
public interface employee_repository extends JpaRepository<employee,Long> {
}
