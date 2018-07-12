package com.exam.exam.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attractions {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String attrName;
  private String city;
  private String category;
  private int price;
  private float longitude;
  private float lattitude;
  private float recommendedAge;
  private int duratiob;


  public Attractions() {
  }

  public Attractions(String attrName, String city, String category, int price, float longitude, float lattitude, float recommendedAge, int duratiob) {
    this.attrName = attrName;
    this.city = city;
    this.category = category;
    this.price = price;
    this.longitude = longitude;
    this.lattitude = lattitude;
    this.recommendedAge = recommendedAge;
    this.duratiob = duratiob;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAttrName() {
    return attrName;
  }

  public void setAttrName(String attrName) {
    this.attrName = attrName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public float getLongitude() {
    return longitude;
  }

  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  public float getLattitude() {
    return lattitude;
  }

  public void setLattitude(float lattitude) {
    this.lattitude = lattitude;
  }

  public float getRecommendedAge() {
    return recommendedAge;
  }

  public void setRecommendedAge(float recommendedAge) {
    this.recommendedAge = recommendedAge;
  }

  public int getDuratiob() {
    return duratiob;
  }

  public void setDuratiob(int duratiob) {
    this.duratiob = duratiob;
  }
}
