package com.timmyyyy.timmyyyy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NumberModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String firstNumber;
  private String secondNumber;
  private String thirdNumber;
  private String fourthNumber;

  public NumberModel() {
  }

  public NumberModel(String firstNumber, String secondNumber, String thirdNumber, String fourthNumber) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.thirdNumber = thirdNumber;
    this.fourthNumber = fourthNumber;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstNumber() {
    return firstNumber;
  }

  public void setFirstNumber(String firstNumber) {
    this.firstNumber = firstNumber;
  }

  public String getSecondNumber() {
    return secondNumber;
  }

  public void setSecondNumber(String secondNumber) {
    this.secondNumber = secondNumber;
  }

  public String getThirdNumber() {
    return thirdNumber;
  }

  public void setThirdNumber(String thirdNumber) {
    this.thirdNumber = thirdNumber;
  }

  public String getFourthNumber() {
    return fourthNumber;
  }

  public void setFourthNumber(String fourthNumber) {
    this.fourthNumber = fourthNumber;
  }
}
