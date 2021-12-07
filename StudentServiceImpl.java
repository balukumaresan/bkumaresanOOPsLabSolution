package com.balu.gl.studentManagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.balu.gl.studentManagement.entity.Student;

@Repository
public class StudentServiceImpl implements StudentService{

	private SessionFactory sessionFactory;
	
	private Session session;
	
	public StudentServiceImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			e.printStackTrace();
			session = sessionFactory.openSession();
		}
	}

	@Transactional
	@Override
	public List<Student> findAll() {
		Transaction txn = session.beginTransaction();
		List<Student> students = session.createQuery("from student").list();
		txn.commit();
		return students;
	}

	@Transactional
	@Override
	public void save(Student student) {
		Transaction txn = session.beginTransaction();
		session.saveOrUpdate(student);
		txn.commit();
	}

	@Transactional
	@Override
	public void deleteById(int id) {
		Transaction txn = session.beginTransaction();
		Student student = session.get(Student.class, id);
		session.delete(student);
		txn.commit();
		
	}

	@Override
	public Student findById(int id) {
		Transaction txn = session.beginTransaction();
		Student student = session.get(Student.class, id);
		txn.commit();
		return student;
	}

}
