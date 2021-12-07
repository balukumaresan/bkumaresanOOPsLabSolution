package com.balu.gl.studentManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.balu.gl.studentManagement.entity.Student;
import com.balu.gl.studentManagement.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public String listStudents(Model model) {

		List<Student> students = studentService.findAll();
		model.addAttribute("Students", students);
		return "list-students";
	}
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Student student = new Student();
		model.addAttribute("Student", student);
		return "Student-form";
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int id, Model model) {
		Student student = studentService.findById(id);
		model.addAttribute("Student", student);
		return "Student-form";
	}
	
	@PostMapping("/save")
	public String saveStudent(@RequestParam("id") int id, @RequestParam("firstName") String firstName, 
			@RequestParam("lastName") String lastName, @RequestParam("course") String course, @RequestParam("country") String country) {
		Student student = new Student(firstName, lastName, course, country);
		if (id != 0) {
			student.setId(id);
		}
		studentService.save(student);
		return "redirect:/student/list";
	}
		
	@RequestMapping("/delete")
	public String saveStudent(@RequestParam("studentId") int id) {
		studentService.deleteById(id);
		return "redirect:/student/list";
		
	}	
		
}
