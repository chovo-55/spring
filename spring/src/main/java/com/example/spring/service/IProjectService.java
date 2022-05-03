package com.example.spring.service;

import com.example.spring.entities.Common;
import com.example.spring.entities.Custom;
import com.example.spring.entities.Project;

import java.util.List;
import java.util.Optional;

public interface IProjectService {

    // void deleteCommon(Long projectId);

    void addNewProject(Project project);

    List<Project> getProject();

    // void addProject(Project project);

    // void addNewCustom(Custom custom);
}
