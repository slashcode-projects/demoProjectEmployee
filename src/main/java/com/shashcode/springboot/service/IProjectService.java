package com.shashcode.springboot.service;

import java.util.List;
import java.util.Optional;

import com.shashcode.springboot.dto.Employee;
import com.shashcode.springboot.dto.Project;

public interface IProjectService {

	List<Project> getProjectList(int empId);

	Project getProjectById(int id);

	void addProject(Project proj);

	void updateProj(Project proj);

	void deleteProjectById(int id);

	List<Project> getAllProject();

}
