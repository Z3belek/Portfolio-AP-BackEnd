package com.trabajofinalap.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zz_aboutme")
public class Aboutme {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;
  @Column(name = "dtext")
  private String dtext;
  @Column(name = "percentage1")
  private Integer percentage1;
  @Column(name = "percentage2")
  private Integer percentage2;
  @Column(name = "percentage3")
  private Integer percentage3;
  @Column(name = "tpercentage1")
  private String tpercentage1;
  @Column(name = "tpercentage2")
  private String tpercentage2;
  @Column(name = "tpercentage3")
  private String tpercentage3;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDtext() {
    return dtext;
  }

  public void setDtext(String dtext) {
    this.dtext = dtext;
  }

  public Integer getPercentage1() {
    return percentage1;
  }

  public void setPercentage1(Integer percentage1) {
    this.percentage1 = percentage1;
  }

  public Integer getPercentage2() {
    return percentage2;
  }

  public void setPercentage2(Integer percentage2) {
    this.percentage2 = percentage2;
  }

  public Integer getPercentage3() {
    return percentage3;
  }

  public void setPercentage3(Integer percentage3) {
    this.percentage3 = percentage3;
  }

  public String getTpercentage1() {
    return tpercentage1;
  }

  public void setTpercentage1(String tpercentage1) {
    this.tpercentage1 = tpercentage1;
  }

  public String getTpercentage2() {
    return tpercentage2;
  }

  public void setTpercentage2(String tpercentage2) {
    this.tpercentage2 = tpercentage2;
  }

  public String getTpercentage3() {
    return tpercentage3;
  }

  public void setTpercentage3(String tpercentage3) {
    this.tpercentage3 = tpercentage3;
  }

}
