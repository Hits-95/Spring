package com.Spring.ORM.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.Spring.ORM.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	// insert student
	@Transactional
	public int insert(Student student) {
		// insert data
		return (Integer) this.hibernateTemplate.save(student);
	}

	// get single student data
	public Student getStudent(int student_id) {

		return this.hibernateTemplate.get(Student.class, student_id);
	}

	// get all student data
	public List<Student> getAllStudent() {

		return this.hibernateTemplate.loadAll(Student.class);
	}

	// deleting student data
	@Transactional
	public void deleteStudent(int student_id) {

		this.hibernateTemplate.delete(this.getStudent(student_id));
	}
	
	//update student
	@Transactional
	public void updateStudent(Student student){
		
		this.hibernateTemplate.update(student);
	}

	// getter setter
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
