package com.trabajofinalap.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabajofinalap.portfolio.model.Experience;
import com.trabajofinalap.portfolio.repository.ExperienceRepository;

@Service
public class ExperienceService {
  @Autowired
  private ExperienceRepository experienceRepository;

  public ExperienceService() {

  }

  public List<Experience> getExperiences() {
    return (List<Experience>) experienceRepository.findAll();
  }

  public Experience save(Experience experience) {
    return experienceRepository.save(experience);
  }

  public Experience findById(Integer id) {
    return experienceRepository.findById(id).orElse(null);
  }

  public void delete(Integer id) {
    experienceRepository.deleteById(id);
  }
}
