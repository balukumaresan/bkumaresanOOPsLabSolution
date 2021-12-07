package com.balu.gl.studentManagement.service;

import java.util.List;

import com.balu.gl.studentManagement.entity.Student;

public interface StudentService {

	public List<Student> findAll();
	public void save(Student theStudent);
	public void deleteById(int id);
	public Student findById(int id);
}
