package com.trabajofinalap.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabajofinalap.portfolio.model.Aboutme;
import com.trabajofinalap.portfolio.repository.AboutmeRepository;

@Service
public class AboutmeService {
  @Autowired
  private AboutmeRepository aboutmeRepository;

  public AboutmeService() {}

  public List<Aboutme> getAboutme() {
    return (List<Aboutme>) aboutmeRepository.findAll();
  }

  public Aboutme save(Aboutme aboutme) {
    return aboutmeRepository.save(aboutme);
  }

}
