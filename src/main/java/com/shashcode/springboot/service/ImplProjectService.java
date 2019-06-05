package com.shashcode.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shashcode.springboot.dao.IEmployeeRepo;
import com.shashcode.springboot.dao.IProjectRepo;
import com.shashcode.springboot.dto.Employee;
import com.shashcode.springboot.dto.Project;

@Service
public class ImplProjectService implements IProjectService{

	@Autowired
	private IProjectRepo daoRef;

	@Override
	public List<Project> getProjectList(int empId) {
		// TODO Auto-generated method stub
		System.out.println("in Dao class employee id"+empId);
		return daoRef.findByEmployeeEmpId(empId);
	}

	@Override
	public Project getProjectById(int id) {
		// TODO Auto-generated method stub
		return daoRef.getOne(id);
	}

	@Override
	public void addProject(Project proj) {
		// TODO Auto-generated method stub
		daoRef.save(proj);
	}

	@Override
	public void updateProj(Project proj) {
		// TODO Auto-generated method stub
		daoRef.save(proj);
	}

	@Override
	public void deleteProjectById(int id) {
		// TODO Auto-generated method stub
		daoRef.deleteById(id);
	}

	@Override
	public List<Project> getAllProject() {
		
		return daoRef.findAll();
	}
	
	
}
