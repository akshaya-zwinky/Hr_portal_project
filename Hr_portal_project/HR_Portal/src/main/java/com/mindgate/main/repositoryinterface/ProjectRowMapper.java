package com.mindgate.main.repositoryinterface;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.ProjectDetails;

public class ProjectRowMapper implements RowMapper<ProjectDetails>{

	@Override
	public ProjectDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		String projectId=rs.getString("project_id");
		String projectName=rs.getString("project_name");
		String startDate=rs.getString("start_date");
		String endDate=rs.getString("end_date");
		
		double budget=rs.getDouble("budget");
		ProjectDetails projectDetails=new ProjectDetails(projectId, projectName, startDate, endDate, budget);
		
		return projectDetails ;
		
		
	}

}
