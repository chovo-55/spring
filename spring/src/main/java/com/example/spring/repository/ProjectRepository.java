package com.example.spring.repository;

import com.example.spring.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {


    @Query("SELECT a, b, c FROM Common a, Custom b, Interior c WHERE a.name = ?1 OR b.name  = ?1 OR c.name  = ?1")
    Optional<Project> projectFindByName(String name);
}
