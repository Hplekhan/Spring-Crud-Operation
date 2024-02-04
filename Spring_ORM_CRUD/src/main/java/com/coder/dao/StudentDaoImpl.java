package com.coder.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.coder.Student;

public class StudentDaoImpl implements StudentDao 

{
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	//@Transactional it only for get,update,delete not for simple fetch 
	@Override
	public int saveStudent(Student student) {
		int i = (Integer) hibernateTemplate.save(student);
		return i;
	}

	@Override
	public Student getStudent(int id) {
		Student st = hibernateTemplate.get(Student.class, id);//this will return a student object
		return st;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> list = hibernateTemplate.loadAll(Student.class);
		return list;
	}

	@Transactional
	@Override
	public void updateStudent(Student student) {
		 hibernateTemplate.update(student);
		
	}
	
	@Transactional
	@Override
	public void deleteStudent(int id) {
		Student st = hibernateTemplate.get(Student.class, id);
		hibernateTemplate.delete(st);
		
	}

}
