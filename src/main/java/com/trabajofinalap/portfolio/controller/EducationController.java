package com.trabajofinalap.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabajofinalap.portfolio.model.Education;
import com.trabajofinalap.portfolio.service.EducationService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class EducationController {
  @Autowired
  private EducationService educationService;

  @GetMapping("/education")
  public List<Education> getEducations() {
    return educationService.getEducations();
  }

  @PostMapping("/education")
  public Education addEducation(@RequestBody Education education) {
    return educationService.save(education);
  }

  @PutMapping("/education/{id}")
  public Education editExperience(@RequestBody Education education, @PathVariable Integer id) {
    Education editData = educationService.findById(id);
    editData.setType(education.getType());
    editData.setTitle(education.getTitle());
    editData.setInstitution(education.getInstitution());
    editData.setImgurl(education.getImgurl());
    editData.setDtext(education.getDtext());

    return educationService.save(editData);
  }

  @DeleteMapping("/education/{id}")
  public void deleteEducation(@PathVariable Integer id) {
    educationService.delete(id);
  }
}