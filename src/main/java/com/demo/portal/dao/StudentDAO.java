package com.demo.portal.dao;

import com.demo.portal.model.StudentDTO;

public interface StudentDAO {

	void saveStudent(StudentDTO dto);

	boolean loginStudent(StudentDTO dto);

}
