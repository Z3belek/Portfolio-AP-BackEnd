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

import com.trabajofinalap.portfolio.model.Experience;
import com.trabajofinalap.portfolio.service.ExperienceService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ExperienceController {
  @Autowired
  private ExperienceService experienceService;

  @GetMapping("/experience")
  public List<Experience> getExperiences() {
    return experienceService.getExperiences();
  }

  @PostMapping("/experience")
  public Experience addExperience(@RequestBody Experience experience) {
    return experienceService.save(experience);
  }

  @PutMapping("/experience/{id}")
  public Experience editExperience(@RequestBody Experience experience, @PathVariable Integer id) {
    Experience editData = experienceService.findById(id);
    editData.setRole(experience.getRole());
    editData.setPlace(experience.getPlace());
    editData.setYear1(experience.getYear1());
    editData.setYear2(experience.getYear2());
    editData.setTechnologies(experience.getTechnologies());
    editData.setResponsibilities(experience.getResponsibilities());

    return experienceService.save(editData);
  }

  @DeleteMapping("/experience/{id}")
  public void deleteExperience(@PathVariable Integer id) {
    experienceService.delete(id);
  }
}
