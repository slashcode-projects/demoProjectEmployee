package com.shashcode.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shashcode.springboot.dto.Employee;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

	List<Employee> findByDeptName(String deptName);
}
