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

import com.trabajofinalap.portfolio.model.Aboutme;
import com.trabajofinalap.portfolio.service.AboutmeService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class AboutmeController {
  @Autowired
  private AboutmeService aboutmeService;

  @GetMapping("/aboutme")
  public List<Aboutme> getAboutme() {
    return aboutmeService.getAboutme();
  }

  @PostMapping("/aboutme")
  public Aboutme addAboutme(@RequestBody Aboutme aboutme) {
    return aboutmeService.save(aboutme);
  }

  @PutMapping("/aboutme/{id}")
  public Aboutme editExperience(@RequestBody Aboutme aboutme, @PathVariable Integer id) {
    Aboutme editData = aboutmeService.findById(id);
    editData.setDtext(aboutme.getDtext());
    editData.setPercentage1(aboutme.getPercentage1());
    editData.setPercentage2(aboutme.getPercentage2());
    editData.setPercentage3(aboutme.getPercentage3());
    editData.setTpercentage1(aboutme.getTpercentage1());
    editData.setTpercentage2(aboutme.getTpercentage2());
    editData.setTpercentage3(aboutme.getTpercentage3());

    return aboutmeService.save(editData);
  }

  @DeleteMapping("/aboutme/{id}")
  public void deleteAboutme(@PathVariable Integer id) {
    aboutmeService.delete(id);
  }
}
