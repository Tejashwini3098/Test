package com.demo.portal.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.demo.portal.model.StudentDTO;

@Repository
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class StudentDaoImpl implements StudentDAO{

	@Autowired
	private SessionFactory factory;
	
	@Override
	public void saveStudent(StudentDTO dto) {
		factory.getCurrentSession().save(dto);
	}

	@Override
	public boolean loginStudent(StudentDTO dto) {
		String query="from StudentDTO where username='"+dto.getUsername()+"' and password='"+dto.getPassword()+"'";
		try {
			StudentDTO student	= factory.getCurrentSession().createQuery(query, StudentDTO.class).getSingleResult();
			return true;
		} catch (Exception e) {
		}
		return false;
	}

}
