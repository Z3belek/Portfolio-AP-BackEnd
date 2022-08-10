package com.trabajofinalap.portfolio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trabajofinalap.portfolio.model.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {
}
