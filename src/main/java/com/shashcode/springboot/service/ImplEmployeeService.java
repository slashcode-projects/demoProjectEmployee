package com.shashcode.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shashcode.springboot.dao.IEmployeeRepo;
import com.shashcode.springboot.dto.Employee;

@Service
public class ImplEmployeeService implements IEmployeeService{

	@Autowired
	private IEmployeeRepo daoRef;
	

	public List<Employee> getAllEmpList() {
		System.out.println("in Service");
		//return empList;
		List<Employee> employees = new ArrayList<>();
		daoRef.findAll().forEach(employees::add);
		return employees;
	}

	@Override
	public Optional<Employee> getEmployeeById(int id) {
		
		Integer empId=id;
		//return empList.stream().filter(e -> e.getEmpId() == (id)).findFirst().get();
		Optional<Employee> emp = daoRef.findById(empId);
		return emp;
	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		//empList.add(emp);
		daoRef.save(emp);
	}

	@Override
	public void updateEmployee(int id, Employee emp) {
		// TODO Auto-generated method stub
		/*for(int i=0; i<=empList.size(); i++) {
			Employee e = empList.get(i);
			if(e.getEmpId() == id) {
				empList.set(i,emp);
				return;
			}
		}*/
		
		daoRef.save(emp);
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		//empList.removeIf(e -> e.getEmpId() == id);
		daoRef.deleteById(id);
	}

	@Override
	public List<Employee> getAllEmployeeByDeptName(String deptName) {
		// TODO Auto-generated method stub
		return daoRef.findByDeptName(deptName);
	}
	
}
