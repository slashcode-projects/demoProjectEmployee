package com.shashcode.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shashcode.springboot.dto.Project;

@Repository
public interface IProjectRepo extends JpaRepository<Project, Integer> {


	public List<Project> findByEmployeeEmpId(int EmpId);
	//emp will be you name of reference

}
