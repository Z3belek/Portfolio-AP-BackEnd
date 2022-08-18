package com.trabajofinalap.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabajofinalap.portfolio.model.Education;
import com.trabajofinalap.portfolio.repository.EducationRepository;

@Service
public class EducationService {
  @Autowired
  private EducationRepository educationRepository;

  public EducationService() {}

  public List<Education> getEducations() {
    return (List<Education>) educationRepository.findAll();
  }

  public Education save(Education education) {
    return educationRepository.save(education);
  }

  public Education findById(Integer id) {
    return educationRepository.findById(id).orElse(null);
  }

  public void delete(Integer id) {
    educationRepository.deleteById(id);
  }
}
