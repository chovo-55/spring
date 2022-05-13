package com.example.spring.service;

import com.example.spring.conf.ProjectConfig;
import com.example.spring.entities.Common;
import com.example.spring.entities.Dummy;
import com.example.spring.entities.Project;
import com.example.spring.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class ProjectServiceTest {

    @Autowired
    private ProjectService projectService;

    @MockBean
    private ProjectRepository projectRepository;

    private ProjectConfig projectConfig;

    @Test
    void getProject() {

    }

    @Test
    void addProject() {
        Common common = new Common("common","common", 11232.3, LocalDate.now(), 3.2121);
        List list = new ArrayList();
        list.add(common);
        assertEquals(list, projectService.addNewProject();
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