package com.project.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springboot.entity.Department;
import com.project.springboot.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService  {

	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

}
