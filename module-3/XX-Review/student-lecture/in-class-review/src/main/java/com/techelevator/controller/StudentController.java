package com.techelevator.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.StudentDAO;
import com.techelevator.domain.Student;

@RestController
public class StudentController {
	
	private StudentDAO studentDAO;
	
	
	
	public StudentController(StudentDAO studentDao) {
		this.studentDAO = studentDao;
	
	}
	
	@RequestMapping(path = "/students", method=RequestMethod.GET)
	public List<Student> getListOfStudents() {
		return studentDAO.getStudents();
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(path = "/students", method= RequestMethod.POST)
	public Student addStudent(@Valid @RequestBody Student newStudent) {
		
		return studentDAO.addStudent(newStudent);
		
	}
	

}
