package com.springboot.codedecode.respos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.codedecode.entity.Employee;

@Repository
public interface EmployeeCrudRepo extends JpaRepository<Employee, Long>{

}
