package com.bankofsimba.bankofsimba.model;

public class BankAccount {

  public static int counter = 1;
  private int id;
  private String name;
  private double balance;
  private String animalType;
  private String moral;
  private String status;

  public BankAccount() {
  }

  public BankAccount(String name, double balance, String animalType, String moral, String status) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.moral = moral;
    this.status = status;
    this.id = counter;
    counter++;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String type) {
    this.animalType = type;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getMoral() {
    return moral;
  }

  public void setMoral(String moral) {
    this.moral = moral;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}