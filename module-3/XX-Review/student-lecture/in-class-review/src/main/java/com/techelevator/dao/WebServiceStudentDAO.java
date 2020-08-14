package com.techelevator.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.techelevator.domain.Student;


public class WebServiceStudentDAO implements StudentDAO {

	@Override
	public Student getStudentById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		
		
		// Build a web service client that calls someone else's web service
		
		
		return null;
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub

	}

}
