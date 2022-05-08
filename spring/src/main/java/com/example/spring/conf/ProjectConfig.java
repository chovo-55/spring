package com.example.spring.conf;

import com.example.spring.entities.Common;
import com.example.spring.entities.Custom;
import com.example.spring.entities.Interior;
import com.example.spring.entities.Project;
import com.example.spring.repository.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class ProjectConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProjectRepository repository) {
        return args -> {
            List<Project> list = new ArrayList();
            Project common = new Common("common","common", 11232.3, LocalDate.now(), 3.2121);
            Project custom = new Custom("custom","custom", 4512.3, LocalDate.now(), 8963.2121,"t","s");
            Project interior = new Interior("interior","interior", 12312.3, LocalDate.now(), "desc");
            list.add(common);
            list.add(custom);
            list.add(interior);
            repository.saveAll(list);
        };
    }
}
