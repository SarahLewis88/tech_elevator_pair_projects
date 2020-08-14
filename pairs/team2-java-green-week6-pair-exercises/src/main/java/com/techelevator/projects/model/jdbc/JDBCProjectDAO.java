package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;

public class JDBCProjectDAO implements ProjectDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCProjectDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Project> getAllActiveProjects() {
		String sql = "SELECT * FROM project " + 
				"WHERE (current_timestamp > from_date AND current_timestamp < to_date) OR "
				+ "(from_date IS NOT NULL AND to_date IS NULL);";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		List<Project> projectsList = new ArrayList<Project>();
		while(results.next()) {
			Project project = new Project();
			project.setName(results.getString("name"));
			project.setId(results.getLong("project_id"));
			projectsList.add(project);

		}
		return projectsList;
	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
		String sql = "DELETE FROM project_employee WHERE employee_id = ? AND project_id = ?";
		jdbcTemplate.update(sql, employeeId, projectId);
		
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		String sql = "INSERT INTO project_employee (project_id, employee_id) VALUES (?, ?);";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

}
