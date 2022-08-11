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
  @Column(name = "type")
  private String type;
  @Column(name = "place")
  private String place;
  @Column(name = "dtexto")
  private String dtexto;
  @Column(name = "imgurl")
  private String imgurl;

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

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public String getDtexto() {
    return dtexto;
  }

  public void setDtexto(String dtexto) {
    this.dtexto = dtexto;
  }

  public String getImgurl() {
    return imgurl;
  }

  public void setImgurl(String imgurl) {
    this.imgurl = imgurl;
  }

}
