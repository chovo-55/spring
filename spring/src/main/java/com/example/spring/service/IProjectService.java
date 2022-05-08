package com.example.spring.service;

import com.example.spring.entities.Dummy;
import com.example.spring.entities.Project;

import java.util.List;

public interface IProjectService {

    void deleteProject(Long projectId);

    void addNewProject(Dummy project);

    List<Project> getProject();
}
