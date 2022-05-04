package com.example.spring.web;

import com.example.spring.entities.Project;
import com.example.spring.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProjectController {

    private final IProjectService projectService;

    @Autowired
    public ProjectController(IProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<Project> getProject() {
        return projectService.getProject();
    }

    @PostMapping
    public void registerNewProject(@RequestBody Project project) {
        projectService.addNewProject(project);
    }

    /*
    @DeleteMapping(path = "{projectId}")
    public void deleteCommon(@PathVariable("projectId") Long projectId) {
        projectService.deleteCommon(projectId);
    }
    @PutMapping(path = "{projectId}")
    public void updateCommon(
            @PathVariable("projectId") Long projectId,
            @PathVariable(required = false) String name) {
    }
    */
}