package com.trabajofinalap.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trabajofinalap.portfolio.model.Aboutme;
import com.trabajofinalap.portfolio.service.AboutmeService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class AboutmeController {
  @Autowired
  private AboutmeService aboutmeService;

  @GetMapping("/aboutme")
  @ResponseBody
  public List<Aboutme> getAboutme() {
    return aboutmeService.getAboutme();
  }

  @PostMapping("/aboutme")
  public Aboutme addAboutme(@RequestBody Aboutme aboutme) {
    return aboutmeService.save(aboutme);
  }

  @PutMapping("/aboutme/{id}")
  public Aboutme editExperience(@RequestBody Aboutme aboutme) {
    return aboutmeService.save(aboutme);
  }
}
