package com.szekszindahuli.demoszekszindahuli.model;

import sun.plugin.javascript.navig.Link;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class People {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private int sexCounter;
  private int power;
  boolean gender;
  private String name;
  private String picLink;

  public People() {
  }

  public People(int sexCounter, int power, boolean gender, String name, String picLink) {
    this.sexCounter = sexCounter;
    this.power = power;
    this.gender = gender;
    this.name = name;
    this.picLink = picLink;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int getSexCounter() {
    return sexCounter;
  }

  public void setSexCounter(int sexCounter) {
    this.sexCounter = sexCounter;
  }

  public int getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public boolean isGender() {
    return gender;
  }

  public void setGender(boolean gender) {
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPicLink() {
    return picLink;
  }

  public void setPicLink(String picLink) {
    this.picLink = picLink;
  }
}