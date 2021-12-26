package com.haritech.endtoend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haritech.endtoend.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
