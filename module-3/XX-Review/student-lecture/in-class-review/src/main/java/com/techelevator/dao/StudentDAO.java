package com.techelevator.dao;

import java.util.List;

import com.techelevator.domain.Student;

public interface StudentDAO {
	
	
	public Student getStudentById(long id);
	public List<Student> getStudents();
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(long id);
     

}
