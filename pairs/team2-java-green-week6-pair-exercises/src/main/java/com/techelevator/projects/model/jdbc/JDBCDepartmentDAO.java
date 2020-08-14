package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;

public class JDBCDepartmentDAO implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Department> getAllDepartments() {
		SqlRowSet results = jdbcTemplate.queryForRowSet("SELECT * FROM department;");
		List<Department> departmentList = new ArrayList<Department>();
		while(results.next()) {
			Department department = new Department();
			department.setId(results.getLong("department_id"));
			department.setName(results.getString("name"));
			departmentList.add(department);
		}
		
		return departmentList;
		
	}

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		String sql = "SELECT * FROM department WHERE name LIKE ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, "%" + nameSearch + "%");
		List<Department> departmentList = new ArrayList<Department>();
		while(results.next()) {
			Department department = new Department();
			department.setId(results.getLong("department_id"));
			department.setName(results.getString("name"));
			departmentList.add(department);
		}
		
		return departmentList;
		
		
	}

	@Override
	public void saveDepartment(Department updatedDepartment) {
		long id = updatedDepartment.getId();
		String name = updatedDepartment.getName();
		String sql = ("UPDATE department SET name = ? WHERE department_id = ?");
		jdbcTemplate.update(sql, name, id);
		
	}

	@Override
	public Department createDepartment(Department newDepartment) {
		String name = newDepartment.getName();		
		String sql = "INSERT INTO department (name) VALUES (?) Returning department_id";		
		SqlRowSet row = jdbcTemplate.queryForRowSet(sql,name);
		row.next();
		long id = row.getLong("department_id");
		newDepartment.setId((long) id);		
		return newDepartment;
	}

	@Override
	public Department getDepartmentById(Long id) {
		String sql = "SELECT * FROM department WHERE department_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
		Department department = new Department();
		if(results.next()) {
		department.setId(results.getLong("department_id"));
		department.setName(results.getString("name"));
		}
		
		return department;
	}

}
