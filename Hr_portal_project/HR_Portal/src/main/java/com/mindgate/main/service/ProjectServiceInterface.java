package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.domain.ProjectDetails;

public interface ProjectServiceInterface {
	public boolean addNewProject(ProjectDetails projectDetails);
    public ProjectDetails UpdateProject(ProjectDetails projectDetails);
    public boolean deleteProject(String projectId);
    public ProjectDetails getprojectByprojectId(String projectId);
    public List<ProjectDetails> getAllproject();

}
