package com.shashcode.springboot.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.shashcode.springboot.dto.Employee;
import com.shashcode.springboot.dto.Project;
import com.shashcode.springboot.service.IEmployeeService;
import com.shashcode.springboot.service.IProjectService;


@RestController
public class EomployeeController {

	@Autowired
	private IEmployeeService serviceEmp;

	@RequestMapping("/employees")
	public List<Employee> getAllEmployee() {
		System.out.println("in Employee  Controller");
		return serviceEmp.getAllEmpList();
	}
	
	
	@RequestMapping("/employees/department/{deptName}")
	public List<Employee> getAllEmployeeByDeptName(@PathVariable String deptName) {
		System.out.println("in Employee  Controller");
		return serviceEmp.getAllEmployeeByDeptName(deptName);
	}

	@RequestMapping("/employees/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id) {
		return serviceEmp.getEmployeeById(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody Employee emp) {
		serviceEmp.addEmployee(emp);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/employees/{id}")
	public void updateEmployee(@RequestBody Employee emp, @PathVariable int id) {
		serviceEmp.updateEmployee(id, emp);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/employees/{id}")
	public void deleteEmployeeById(@PathVariable int id) {
		 serviceEmp.deleteEmployeeById(id);
	}
}
