package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.ProjectDetails;
import com.mindgate.main.repositoryinterface.ProjectDetailsRepositoryInterface;
@Service
public class ProjectServiceClass implements ProjectServiceInterface {
	@Autowired
	private ProjectDetailsRepositoryInterface projectDetailsRpositoryInterface;
	
	public ProjectServiceClass() {
		System.out.println("service started");
	}

	@Override
	public boolean addNewProject(ProjectDetails projectDetails) {
		
		return projectDetailsRpositoryInterface.addNewProject(projectDetails);
	}

	@Override
	public ProjectDetails UpdateProject(ProjectDetails projectDetails) {
		
		return projectDetailsRpositoryInterface.UpdateProject(projectDetails);
	}

	@Override
	public boolean deleteProject(String projectId) {
		
		return projectDetailsRpositoryInterface.deleteProject(projectId);
	}

	@Override
	public ProjectDetails getprojectByprojectId(String projectId) {
	
		return projectDetailsRpositoryInterface.getprojectByprojectId(projectId);
	}

	@Override
	public List<ProjectDetails> getAllproject() {
		
		return projectDetailsRpositoryInterface.getAllproject();
	}

}
