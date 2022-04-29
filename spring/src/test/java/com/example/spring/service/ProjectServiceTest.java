package com.example.spring.service;

import com.example.spring.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class ProjectServiceTest {

    @Autowired
    private ProjectService projectService;

    @MockBean
    private ProjectRepository projectRepository;

    @Test
    void getProject() {

    }

    @Test
    void addProject() {

    }

    @Test
    void saveCheck() {
    }

    @Test
    void deleteCommon() {
    }

    @Test
    void addNewCommon() {
    }
}