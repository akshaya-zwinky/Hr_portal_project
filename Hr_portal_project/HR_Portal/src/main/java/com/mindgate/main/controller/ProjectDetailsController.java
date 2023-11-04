package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.ProjectDetails;
import com.mindgate.main.service.ProjectServiceInterface;

@RestController
@RequestMapping("projectapi")
public class ProjectDetailsController {
	@Autowired
	private ProjectServiceInterface projectServiceInterface;
	//http://localhost:8081/projectapi/add/projectdetails
	
	@RequestMapping(value="add/projectdetails",method=RequestMethod.POST)
	public boolean addProject(@RequestBody ProjectDetails projectdetails) {
		return projectServiceInterface.addNewProject(projectdetails) ;
	}
	
	
	//http://localhost:8081/projectapi/update/projectdetails
	
		@RequestMapping(value="update/projectdetails",method=RequestMethod.PUT)
		public ProjectDetails updateProjectDetails(@RequestBody ProjectDetails projectdetails ) {
			return  projectServiceInterface.UpdateProject(projectdetails);
		}
	
		
		
		//http://localhost:8081/projectapi/getone/PRO10001
		@RequestMapping(value="getone/{projectId}",method=RequestMethod.GET)
		public ProjectDetails getprojectByprojectId(@PathVariable String projectId) {
			return projectServiceInterface.getprojectByprojectId(projectId);
		}
		
		
		
		
	
		//http://localhost:8081/projectapi/delete/PRO10001 
		@RequestMapping(value="delete/{projectId}",method=RequestMethod.DELETE)
		public boolean deleteProject(@PathVariable String projectId) {
			return  projectServiceInterface.deleteProject(projectId);
		}
	
	
		//http://localhost:8081/projectapi/getall
		
		@RequestMapping(value="getall",method=RequestMethod.GET)
		public List<ProjectDetails> getProjectAll(){
			return projectServiceInterface.getAllproject();
			
		}
	

}
