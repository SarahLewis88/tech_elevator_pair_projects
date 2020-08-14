package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.domain.Student;

@Component    // tells Spring that this can be injected somewhere
public class JDBCStudentDAO implements StudentDAO {
	
	
	private JdbcTemplate jdbcTemplate;

	public JDBCStudentDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}	
	
	

	@Override
	public Student getStudentById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudents() {
		
		List<Student> students = new ArrayList<Student>();
		
       
		String sql = "Select * from student";
		SqlRowSet rs = jdbcTemplate.queryForRowSet(sql);
		
		while (rs.next()) {
			students.add(mapRowToStudent(rs));
		}
		
		
		return students;
	}

	@Override
	public Student addStudent(Student student) {
		
		String sql = "INSERT INTO student (id, first_name, last_name, section, cohort, phone, email)" +
				" VALUES (DEFAULT, ?, ?, ?, ?, ?, ?) RETURNING id";
		
		Long id = jdbcTemplate.queryForObject(sql, Long.class, student.getFirstName(), student.getLastName(), student.getSection(), student.getCohort(), student.getPhone(), student.getEmail());
		
		student.setId(id);
		
		return student;
		
		
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
	
	private Student mapRowToStudent(SqlRowSet rs) {
		
		Student student = new Student();
		student.setSection(rs.getString("section"));
		student.setCohort(rs.getString("cohort"));
		student.setEmail(rs.getString("email"));
		student.setFirstName(rs.getString("first_name"));
		student.setLastName(rs.getString("last_name"));
		student.setPhone(rs.getString("phone"));
	
		return student;
		
	}

}
