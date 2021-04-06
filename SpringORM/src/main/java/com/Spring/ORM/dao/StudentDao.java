package com.Spring.ORM.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.Spring.ORM.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public int insert(Student student) {

		//insert data
		return (Integer) this.hibernateTemplate.save(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
