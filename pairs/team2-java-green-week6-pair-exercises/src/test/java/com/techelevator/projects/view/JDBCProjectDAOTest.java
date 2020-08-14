package com.techelevator.projects.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;
import com.techelevator.projects.model.jdbc.JDBCProjectDAO;

import org.junit.*;

public class JDBCProjectDAOTest {
	
private static SingleConnectionDataSource dataSource;

	
	private JDBCProjectDAO instance;
	
	@BeforeClass
	public static void beforeClass() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/projects");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		dataSource.setAutoCommit(false);
	}
	
	@AfterClass
	public static void afterClass() throws SQLException {
		dataSource.destroy();

	}
	
	@Before
	public void before() {
		instance = new JDBCProjectDAO(dataSource);
	}
	
	@After
	public void after() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	@Test
	public void testGetAllActiveProjects() {
		Long[] idList = this.createProjects();
		
		List<Project> projectsList = instance.getAllActiveProjects();
		
		Project customerSupport = new Project();
		Project pancakesEveryDay = new Project();
		for (Project p : projectsList) {
			if(p.getId() == idList[1]) {
				customerSupport = p;
			}
			if(p.getId() == idList[3]) {
				pancakesEveryDay = p;
			}
		}
		
		Assert.assertEquals(idList[1], customerSupport.getId());
		Assert.assertEquals(idList[3], pancakesEveryDay.getId());
		
	}
	
	@Test
	public void testRemoveEmployeeFromProject() {
		Long[] employeeIds = this.createEmployees();
		Long[] projectIds = this.createProjects();
		
		JdbcTemplate template = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO project_employee (project_id, employee_id) VALUES (?, ?)";
		template.update(sql, projectIds[1], employeeIds[0]);
		template.update(sql, projectIds[3], employeeIds[2]);
		template.update(sql, projectIds[1], employeeIds[1]);
		template.update(sql, projectIds[3], employeeIds[3]);
		
		instance.removeEmployeeFromProject(projectIds[1], employeeIds[0]);
		instance.removeEmployeeFromProject(projectIds[3], employeeIds[2]);
		
		//----------------------------
		String sql2 = "SELECT * FROM employee " +
				"WHERE employee.employee_id NOT IN (SELECT employee_id FROM project_employee);";
		SqlRowSet results = template.queryForRowSet(sql2);
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
		//---------------------------
		
		
		
		
		Employee kolton = new Employee();
		Employee clay = new Employee();
		for (Employee e : employeeList) {
			if (e.getId() == employeeIds[0]) {
				kolton = e;
			}
			if (e.getId() == employeeIds[2]) {
				clay = e;
			}
		}
		
		Assert.assertEquals(employeeIds[0], kolton.getId());
		Assert.assertEquals(employeeIds[2], clay.getId());

		
	}
	
	
	

	
	public Long[] createEmployees() {
		JdbcTemplate template = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO employee (first_name, last_name, birth_date, hire_date, gender, department_id) VALUES (?, ?, '01-01-1990', '01-01-2020', ?, ?) Returning employee_id";
		SqlRowSet row1 = template.queryForRowSet(sql, "Kolton", "Nay", "M", 1);
		SqlRowSet row2 = template.queryForRowSet(sql, "Sarah", "Lewis", "F", 2);
		SqlRowSet row3 = template.queryForRowSet(sql, "Clay", "Kim", "M", 3);
		SqlRowSet row4 = template.queryForRowSet(sql, "Jay", "Roever", "M", 4);
	

		Long[] idList = new Long[4];
		row1.next();
		idList[0] = row1.getLong("employee_id");
		row2.next();
		idList[1] = row2.getLong("employee_id");
		row3.next();
		idList[2] = row3.getLong("employee_id");
		row4.next();
		idList[3] = row4.getLong("employee_id");
		
		return idList;
	}
	
	public Long[] createProjects() {
		JdbcTemplate template = new JdbcTemplate(dataSource);
		String sql1 = "INSERT INTO project (name, from_date, to_date) VALUES (?, '01-01-1990', '01-01-2020') Returning project_id";
		String sql2 = "INSERT INTO project (name, from_date, to_date) VALUES (?, '01-01-1990', '11-01-2020') Returning project_id";
		String sql3 = "INSERT INTO project (name, from_date, to_date) VALUES (?, null, '8-01-2020') Returning project_id";
		String sql4 = "INSERT INTO project (name, from_date, to_date) VALUES (?, '01-01-1990', null) Returning project_id";

		
		SqlRowSet row1 = template.queryForRowSet(sql1, "User Interface"); //Not active
		SqlRowSet row2 = template.queryForRowSet(sql2, "Customer Support"); //Active
		SqlRowSet row3 = template.queryForRowSet(sql3, "Magic Mower"); //Not Started
		SqlRowSet row4 = template.queryForRowSet(sql4, "Pancakes Every Day"); // Active (no end date)
	

		Long[] idList = new Long[4];
		row1.next();
		idList[0] = row1.getLong("project_id");
		row2.next();
		idList[1] = row2.getLong("project_id");
		row3.next();
		idList[2] = row3.getLong("project_id");
		row4.next();
		idList[3] = row4.getLong("project_id");
		
		return idList;
	}
	

}
