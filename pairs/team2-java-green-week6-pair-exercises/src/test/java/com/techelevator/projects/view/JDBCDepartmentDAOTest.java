package com.techelevator.projects.view;
import java.sql.SQLException;
import java.util.List;

import org.junit.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO; 

public class JDBCDepartmentDAOTest {
	
	private static SingleConnectionDataSource dataSource;
	
	private JDBCDepartmentDAO instance;
	
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
//		String sql = "INSERT INTO department (name) VALUES ('Donuts');";
//		template.update(sql);
		instance = new JDBCDepartmentDAO(dataSource);
	}
	
	@After
	public void after() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	@Test
	public void testCreateDepartment() {
		JdbcTemplate template = new JdbcTemplate(dataSource);
		Department department = new Department();
		department.setName("Sarah");		
		instance.createDepartment(department);
		long id = department.getId();
		Department newDepartment = instance.getDepartmentById(id);		
		deptsAreEqual(department, newDepartment);
	}
	
	public void deptsAreEqual(Department expected, Department actual) {
		Assert.assertEquals(expected.getId(), actual.getId());
		Assert.assertEquals(expected.getName(), actual.getName());
	}
	
	@Test
	public void testGetAllDepartments() {
		JdbcTemplate template = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO department (name) VALUES (?) Returning department_id";
		SqlRowSet row1 = template.queryForRowSet(sql, "Sarah");
		SqlRowSet row2 = template.queryForRowSet(sql, "Kolton");
		row1.next();
		long id1 = row1.getLong("department_id");
		row2.next();
		long id2 = row2.getLong("department_id");		
		List<Department> departmentList = instance.getAllDepartments();
		Department kolton = new Department();
		Department sarah = new Department();
		for (Department d : departmentList) {
			if (d.getId() == id1) {
				sarah = d;
			}
			if (d.getId() == id2) {
				kolton = d;
			}
		}
		Assert.assertEquals("Sarah", sarah.getName());
		Assert.assertEquals("Kolton", kolton.getName());
	}
	
	@Test
	public void testSearchDepartmentsByName() {
		JdbcTemplate template = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO department (name) VALUES (?) Returning department_id";
		SqlRowSet row = template.queryForRowSet(sql, "Sarah");
		row.next();
		long id = row.getLong("department_id");
		List<Department> departmentList = instance.searchDepartmentsByName("Sarah");

		Assert.assertEquals(id, (long) departmentList.get(0).getId());		
	}
	
	@Test
	public void testSaveDepartment() {
		JdbcTemplate template = new JdbcTemplate(dataSource);
		Department sarah = new Department();
		sarah.setName("Sarah");
		String sql = "INSERT INTO department (name) VALUES (?) Returning department_id";
		SqlRowSet row = template.queryForRowSet(sql, "Sarah");
		row.next();
		long id = row.getLong("department_id");
		sarah.setId(id);
		sarah.setName("Kolton");
		instance.saveDepartment(sarah);
		SqlRowSet row2 = template.queryForRowSet("SELECT name FROM department WHERE department_id = ?", id);
		row2.next();
		String name = row2.getString("name");
		Assert.assertEquals("Kolton", name);	
	}
	
	@Test
	public void testGetDepartmentById() {
		JdbcTemplate template = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO department (name) VALUES (?) Returning department_id";
		SqlRowSet row = template.queryForRowSet(sql, "Sarah");
		row.next();
		long id = row.getLong("department_id");
		Department department = new Department();				
		department = instance.getDepartmentById(id);
		String name = department.getName();
		Assert.assertEquals("Sarah", name);			
	}
}