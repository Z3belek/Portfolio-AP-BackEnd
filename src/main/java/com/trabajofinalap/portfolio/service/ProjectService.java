package com.trabajofinalap.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabajofinalap.portfolio.model.Project;
import com.trabajofinalap.portfolio.repository.ProjectRepository;

@Service
public class ProjectService {
  @Autowired
  private ProjectRepository projectRepository;

  public ProjectService() {
  }

  public List<Project> getProject() {
    return (List<Project>) projectRepository.findAll();
  }

  public Project save(Project project) {
    return projectRepository.save(project);
  }

  public Project findById(Integer id) {
    return projectRepository.findById(id).orElse(null);
  }

  public void delete(Integer id) {
    projectRepository.deleteById(id);
  }
}
