package com.example.spring.service;

import com.example.spring.entities.Project;
import com.example.spring.exceptions.ProjectAlreadyExistsException;
import com.example.spring.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService implements IProjectService {

    private final ProjectRepository projectRepository;


    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @GetMapping
    public List<Project> getProject() {
        return projectRepository.findAll();
    }

    /*
    @Override
    public void deleteCommon(Long projectId) {
        boolean exists = projectRepository.existsById(projectId);
        if (!exists) {
            throw new IllegalStateException("Does not exists!");
        }
        projectRepository.deleteById(projectId);
    }
*/


    @Override
    public void addNewProject(Project project) {
        Optional<Project> projectName = projectRepository.projectFindByName(project.getName());
        if (projectName.isPresent()) {
            throw new ProjectAlreadyExistsException("Project with provided name already exists");
        }
        projectRepository.save(project);
    }
}