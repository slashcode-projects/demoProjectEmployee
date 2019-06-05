package com.shashcode.springboot.service;

import java.util.List;
import java.util.Optional;

import com.shashcode.springboot.dto.Employee;

public interface IEmployeeService {

	public List<Employee> getAllEmpList();

	public Optional<Employee> getEmployeeById(int id);

	public void addEmployee(Employee emp);

	public void updateEmployee(int id, Employee emp);

	public void deleteEmployeeById(int id);

	public List<Employee> getAllEmployeeByDeptName(String deptName);
}
