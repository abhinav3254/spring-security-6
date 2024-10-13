package com.example.spring_security.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_security.models.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
	
	
	private List<Student> students = new ArrayList<Student>(
				List.of(
				new Student(1,"Abhinav",89),
				new Student(2,"Ansh",95),
				new Student(3,"Rahul",67),
				new Student(4,"Himanshu",85)
				)
			);
	
	@GetMapping("students")
	public List<Student> getStudents() {
		return students;
	}
	
	@GetMapping("csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
	
	@PostMapping("students")
	public Student createStudent(@RequestBody Student student) {
		students.add(student);
		return student;
	}

}
