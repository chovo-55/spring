package com.example.spring.service;

import com.example.spring.entities.Project;

import java.util.List;

public interface IProjectService {

    void addNewProject(Project project);

    List<Project> getProject();
}
