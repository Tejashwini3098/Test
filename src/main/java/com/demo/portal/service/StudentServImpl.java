package com.demo.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.portal.dao.StudentDAO;
import com.demo.portal.model.StudentDTO;

@Service
public class StudentServImpl implements StudentService {
   
	@Autowired 
	private StudentDAO dao;
	
	@Override
	public void saveStudent(StudentDTO dto) {
		dao.saveStudent(dto);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean loginStudent(StudentDTO dto) {
		// TODO Auto-generated method stub
		return dao.loginStudent(dto);
	}

}
