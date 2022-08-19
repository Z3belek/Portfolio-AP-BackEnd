package com.trabajofinalap.portfolio.model;

import javax.persistence.*;

@Entity
@Table(name = "zz_project")
public class Project {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;
  @Column(name = "title")
  private String title;
  @Column(name = "github")
  private String github;
  @Column(name = "haveurl")
  private Boolean haveurl;
  @Column(name = "finalurl")
  private String finalurl;
  @Column(name = "dtext")
  private String dtext;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGithub() {
    return github;
  }

  public void setGithub(String github) {
    this.github = github;
  }

  public Boolean getHaveurl() {
    return haveurl;
  }

  public void setHaveurl(Boolean haveurl) {
    this.haveurl = haveurl;
  }

  public String getFinalurl() {
    return finalurl;
  }

  public void setFinalurl(String finalurl) {
    this.finalurl = finalurl;
  }

  public String getDtext() {
    return dtext;
  }

  public void setDtext(String dtext) {
    this.dtext = dtext;
  }
}
