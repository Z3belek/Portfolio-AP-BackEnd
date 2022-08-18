package com.trabajofinalap.portfolio.model;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table(name = "zz_experience")
public class Experience {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;
  @Column(name = "role")
  private String role;
  @Column(name = "place")
  private String place;
  @Column(name = "year1")
  private String year1;
  @Column(name = "year2")
  private String year2;
  @Column(name = "technologies")
  private ArrayList<String> technologies;
  @Column(name = "responsibilities")
  private ArrayList<String> responsibilities;
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }
  public String getPlace() {
    return place;
  }
  public void setPlace(String place) {
    this.place = place;
  }
  public String getYear1() {
    return year1;
  }
  public void setYear1(String year1) {
    this.year1 = year1;
  }
  public String getYear2() {
    return year2;
  }
  public void setYear2(String year2) {
    this.year2 = year2;
  }
  public ArrayList<String> getTechnologies() {
    return technologies;
  }
  public void setTechnologies(ArrayList<String> technologies) {
    this.technologies = technologies;
  }
  public ArrayList<String> getResponsibilities() {
    return responsibilities;
  }
  public void setResponsibilities(ArrayList<String> responsibilities) {
    this.responsibilities = responsibilities;
  }

}
