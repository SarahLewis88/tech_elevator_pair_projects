package com.techelevator.projects.view;


import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Date;
import org.junit.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;

public class JDBCEmployeeDAOTest {
	
private static SingleConnectionDataSource dataSource;
	
	private JDBCEmployeeDAO instance;
	
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
		//String sql = "INSERT INTO department (name) VALUES (Donuts);";
		//JdbcTemplate template = new JdbcTemplate(dataSource);
		//template.update(sql);
		instance = new JDBCEmployeeDAO(dataSource);
	}
	
	@After
	public void after() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	
	@Test
	public void testGetAllEmployees() {
		Long[] idList = this.createEmployees();
		
		List<Employee> employeeList = instance.getAllEmployees();
		Employee kolton = new Employee();
		Employee sarah = new Employee();
		Employee clay = new Employee();
		Employee jay = new Employee();
		for (Employee e : employeeList) {
			if (e.getId() == idList[0]) {
				kolton = e;
			}
			if (e.getId() == idList[1]) {
				sarah = e;
			}
			if (e.getId() == idList[2]) {
				clay = e;
			}
			if (e.getId() == idList[3]) {
				jay = e;
			}
		}
		Assert.assertEquals(idList[0], kolton.getId());
		Assert.assertEquals(idList[1], sarah.getId());
		Assert.assertEquals(idList[2], clay.getId());
		Assert.assertEquals(idList[3], jay.getId());
		
		
	}
	
	@Test
	public void testSearchEmployeeByName() {
		Long[] idList = this.createEmployees();
		
		List<Employee> employeeList1 = instance.searchEmployeesByName("Kolton", "Nay");
		Assert.assertEquals(idList[0], employeeList1.get(0).getId());
		
		List<Employee> employeeList2 = instance.searchEmployeesByName("Sarah", "Lewis");
		Assert.assertEquals(idList[1], employeeList2.get(0).getId());
		
		List<Employee> employeeList3 = instance.searchEmployeesByName("Clay", "Kim");
		Assert.assertEquals(idList[2], employeeList3.get(0).getId());
		
		List<Employee> employeeList4 = instance.searchEmployeesByName("Jay", "Roever");
		Assert.assertEquals(idList[3], employeeList4.get(0).getId());
		
	}
	
	@Test
	public void testGetEmployeeByDepartmentId() {
		Long[] idList = this.createEmployees();
		
		List<Employee> employeesByDept1 = instance.getEmployeesByDepartmentId(1);
		Employee kolton = new Employee();
		for (Employee e : employeesByDept1) {
			if(e.getId() == idList[0]) {
				kolton = e;
			}
		}
		
		List<Employee> employeesByDept2 = instance.getEmployeesByDepartmentId(2);
		Employee sarah = new Employee();
		for (Employee e : employeesByDept2) {
			if(e.getId() == idList[1]) {
				sarah = e;
			}
		}
		
		List<Employee> employeesByDept3 = instance.getEmployeesByDepartmentId(3);
		Employee clay = new Employee();
		for (Employee e : employeesByDept3) {
			if(e.getId() == idList[2]) {
				clay = e;
			}
		}
		
		List<Employee> employeesByDept4 = instance.getEmployeesByDepartmentId(4);
		Employee jay = new Employee();
		for (Employee e : employeesByDept4) {
			if(e.getId() == idList[3]) {
				jay = e;
			}
		}
		
		Assert.assertEquals(idList[0], kolton.getId());
		Assert.assertEquals(idList[1], sarah.getId());
		Assert.assertEquals(idList[2], clay.getId());
		Assert.assertEquals(idList[3], jay.getId());

		
	}
	
	@Test
	public void testGetEmployeesWithoutProjects() {
		Long[] idList = this.giveHalfEmployeesAProject();
		
		List<Employee> employeesWithoutProjects = instance.getEmployeesWithoutProjects();
		Employee sarah = new Employee();
		Employee jay = new Employee();
		for (Employee e : employeesWithoutProjects) {
			if(e.getId() == idList[1]) {
				sarah = e;
			}
			if(e.getId() == idList[3]) {
				jay = e;
			}
		}
		
		Assert.assertEquals(idList[1], sarah.getId());
		Assert.assertEquals(idList[3], jay.getId());
		
	}
	
	@Test
	public void testGetEmployeesByProjectId() {
		Long[] idList = this.giveHalfEmployeesAProject();
		List<Employee> project2List = instance.getEmployeesByProjectId((long) 2);
		List<Employee> project6List = instance.getEmployeesByProjectId((long) 6);
		
		Employee kolton = new Employee();
		Employee clay = new Employee();
		for (Employee e : project2List) {
			if(e.getId() == idList[0]) {
				kolton = e;
			}
		}
		for (Employee e : project6List) {
			if(e.getId() == idList[2]) {
				clay = e;
			}
		}
		
		Assert.assertEquals(idList[0], kolton.getId());
		Assert.assertEquals(idList[2], clay.getId());

		
	}
	
	@Test
	public void testChangeEmployeeDepartment() {
		Long[] idList = this.createEmployees();
		JdbcTemplate template = new JdbcTemplate(dataSource);
		instance.changeEmployeeDepartment(idList[0], (long) 2); 
		instance.changeEmployeeDepartment(idList[1], (long) 1); 
		instance.changeEmployeeDepartment(idList[2], (long) 4); 
		instance.changeEmployeeDepartment(idList[3], (long) 3); 
		
		String sql = "SELECT department_id FROM employee WHERE employee_id = ?";
		SqlRowSet row1 = template.queryForRowSet(sql, idList[0]);
		SqlRowSet row2 = template.queryForRowSet(sql, idList[1]);
		SqlRowSet row3 = template.queryForRowSet(sql, idList[2]);
		SqlRowSet row4 = template.queryForRowSet(sql, idList[3]);
		row1.next();
		long id1 = row1.getLong("department_id");
		row2.next();
		long id2 = row2.getLong("department_id");
		row3.next();
		long id3 = row3.getLong("department_id");
		row4.next();
		long id4 = row4.getLong("department_id");
		
		Assert.assertEquals((long) 2, id1);
		Assert.assertEquals((long) 1, id2);
		Assert.assertEquals((long) 4, id3);
		Assert.assertEquals((long) 3, id4);
		
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
	
	public Long[] giveHalfEmployeesAProject() {
		Long[] idList = this.createEmployees();
		JdbcTemplate template = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO project_employee (project_id, employee_id) VALUES (?, ?)";
		template.update(sql, 2, idList[0]);
		template.update(sql, 6, idList[2]);
		return idList;
	}
	
	
	
	
	
	

}
