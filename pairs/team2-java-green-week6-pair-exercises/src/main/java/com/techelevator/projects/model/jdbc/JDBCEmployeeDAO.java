package com.techelevator.projects.model.jdbc;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.EmployeeDAO;

public class JDBCEmployeeDAO implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCEmployeeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		String sql = "SELECT * FROM employee;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		List<Employee> employeeList = new ArrayList<Employee>();
		while(results.next()) {
			Employee employee = new Employee();
			employee.setFirstName(results.getString("first_name"));
			employee.setLastName(results.getString("last_name"));
			employee.setId(results.getLong("employee_id"));
			employee.setDepartmentId(results.getLong("department_id"));
			employee.setBirthDay(results.getDate("birth_date").toLocalDate());
			employee.setHireDate(results.getDate("hire_date").toLocalDate());
			employee.setGender(Character.valueOf(results.getString("gender").charAt(0)));
			employeeList.add(employee);
		}
		
		return employeeList;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		String sql = "SELECT * FROM employee WHERE first_name LIKE ? OR last_name LIKE ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, "%" + firstNameSearch + "%", "%" + lastNameSearch + "%");
		List<Employee> employeeList = new ArrayList<Employee>();
		while(results.next()) {
			Employee employee = new Employee();
			employee.setFirstName(results.getString("first_name"));
			employee.setLastName(results.getString("last_name"));
			employee.setId(results.getLong("employee_id"));
			employee.setDepartmentId(results.getLong("department_id"));
			employee.setBirthDay(results.getDate("birth_date").toLocalDate());
			employee.setHireDate(results.getDate("hire_date").toLocalDate());
			employee.setGender(Character.valueOf(results.getString("gender").charAt(0)));
			employeeList.add(employee);
		}
		
		
		return employeeList;
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {
		String sql = "SELECT * FROM employee WHERE department_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
		List<Employee> employeeList = new ArrayList<Employee>();
		while(results.next()) {
			Employee employee = new Employee();
			employee.setFirstName(results.getString("first_name"));
			employee.setLastName(results.getString("last_name"));
			employee.setId(results.getLong("employee_id"));
			employee.setDepartmentId(results.getLong("department_id"));
			employee.setBirthDay(results.getDate("birth_date").toLocalDate());
			employee.setHireDate(results.getDate("hire_date").toLocalDate());
			employee.setGender(Character.valueOf(results.getString("gender").charAt(0)));
			employeeList.add(employee);
		}
		
		
		return employeeList;
		
	}
						
	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		String sql = "SELECT * FROM employee " +
				"WHERE employee.employee_id NOT IN (SELECT employee_id FROM project_employee);";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		List<Employee> employeeList = new ArrayList<Employee>();
		while(results.next()) {
			Employee employee = new Employee();
			employee.setFirstName(results.getString("first_name"));
			employee.setLastName(results.getString("last_name"));
			employee.setId(results.getLong("employee_id"));
			employee.setDepartmentId(results.getLong("department_id"));
			employee.setBirthDay(results.getDate("birth_date").toLocalDate());
			employee.setHireDate(results.getDate("hire_date").toLocalDate());
			employee.setGender(Character.valueOf(results.getString("gender").charAt(0)));
			employeeList.add(employee);
		}
		
		
		return employeeList;
		
	}
					
	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		String sql = "SELECT * FROM employee " + 
				"JOIN project_employee ON employee.employee_id = project_employee.employee_id " + 
				"WHERE project_employee.project_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		List<Employee> employeeList = new ArrayList<Employee>();
		while(results.next()) {
			Employee employee = new Employee();
			employee.setFirstName(results.getString("first_name"));
			employee.setLastName(results.getString("last_name"));
			employee.setId(results.getLong("employee_id"));
			employee.setDepartmentId(results.getLong("department_id"));
			employee.setBirthDay(results.getDate("birth_date").toLocalDate());
			employee.setHireDate(results.getDate("hire_date").toLocalDate());
			employee.setGender(Character.valueOf(results.getString("gender").charAt(0)));
			employeeList.add(employee);
		}
		
		
		return employeeList;
		
	}

	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) {
		String sql = "UPDATE employee SET department_id = ? WHERE employee_id = ?";
		jdbcTemplate.update(sql, departmentId, employeeId);
		
		
	}

}
