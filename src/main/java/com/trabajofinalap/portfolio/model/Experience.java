package com.trabajofinalap.portfolio.model;

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
  private Integer year1;
  @Column(name = "year2")
  private Integer year2;
  @Column(name = "technologies")
  private String technologies;
  @Column(name = "responsibilities")
  private String responsibilities;
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
  public Integer getYear1() {
    return year1;
  }
  public void setYear1(Integer year1) {
    this.year1 = year1;
  }
  public Integer getYear2() {
    return year2;
  }
  public void setYear2(Integer year2) {
    this.year2 = year2;
  }
  public String getTechnologies() {
    return technologies;
  }
  public void setTechnologies(String technologies) {
    this.technologies = technologies;
  }
  public String getResponsibilities() {
    return responsibilities;
  }
  public void setResponsibilities(String responsibilities) {
    this.responsibilities = responsibilities;
  }

}
