package com.demo.portal.service;

import com.demo.portal.model.StudentDTO;

public interface StudentService {

	void saveStudent(StudentDTO dto);

	boolean loginStudent(StudentDTO dto);

}
