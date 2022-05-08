package com.example.spring.service;

import com.example.spring.entities.*;
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

    @Override
    public void deleteProject(Long projectId) {
        boolean exists = projectRepository.existsById(projectId);
        if (!exists) {
            throw new IllegalStateException("Does not exists!");
        }
        projectRepository.deleteById(projectId);
    }

    @Override
    public void addNewProject(Dummy project) {
        Optional<Project> projectName = projectRepository.projectFindByName(project.getName());
        if (projectName.isPresent()) {
            throw new ProjectAlreadyExistsException("Project with provided name already exists");
        }
        switch (project.getType()) {
            case ("custom"):
                Custom custom = new Custom(project.getType(), project.getName(), project.getPrice(),project.getDate(),project.getArea(),project.getHeatingType(),project.getHeatingSource());
                projectRepository.save(custom);
                break;
            case ("common"):
                Common common = new Common(project.getType(), project.getName(), project.getPrice(),project.getDate(),project.getArea());
                projectRepository.save(common);
                break;
            case ("interior"):
                Interior interior = new Interior(project.getType(), project.getName(), project.getPrice(),project.getDate(),project.getDescription());
                projectRepository.save(interior);
                break;
        }
    }
}