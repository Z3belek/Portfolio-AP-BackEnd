package com.trabajofinalap.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.trabajofinalap.portfolio.model.Project;
import com.trabajofinalap.portfolio.service.ProjectService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ProjectController {
  @Autowired
  private ProjectService projectService;

  @GetMapping("/project")
  public List<Project> getProject() {
    return projectService.getProject();
  }

  @PostMapping("/project")
  public Project addProject(@RequestBody Project project) {
    return projectService.save(project);
  }

  @PutMapping("/project/{id}")
  public Project editProject(@RequestBody Project project, @PathVariable Integer id) {
    Project editData = projectService.findById(id);
    editData.setTitle(project.getTitle());
    editData.setType(project.getType());
    editData.setPlace(project.getPlace());
    editData.setdTexto(project.getdTexto());
    editData.setImgurl(project.getImgurl());

    return projectService.save(editData);
  }

  @DeleteMapping("/project/{id}")
  public void deleteProject(@PathVariable Integer id) {
    projectService.delete(id);
  }
}
