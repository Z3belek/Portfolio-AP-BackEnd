package com.trabajofinalap.portfolio.model;

public class Education {
<<<<<<< Updated upstream
  
=======
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;
  @Column(name = "type")
  private String type;
  @Column(name = "title")
  private String title;
  @Column(name = "institution")
  private String institution;
  @Column(name = "imgurl")
  private String imgurl;
  @Column(name = "urlcertificate")
  private String urlcertificate;
  @Column(name = "dtext")
  private String dtext;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getInstitution() {
    return institution;
  }

  public void setInstitution(String institution) {
    this.institution = institution;
  }

  public String getImgurl() {
    return imgurl;
  }

  public void setImgurl(String imgurl) {
    this.imgurl = imgurl;
  }

  public String getUrlcertificate() {
    return urlcertificate;
  }

  public void setUrlcertificate(String urlcertificate) {
    this.urlcertificate = urlcertificate;
  }

  public String getDtext() {
    return dtext;
  }

  public void setDtext(String dtext) {
    this.dtext = dtext;
  }
>>>>>>> Stashed changes
}
