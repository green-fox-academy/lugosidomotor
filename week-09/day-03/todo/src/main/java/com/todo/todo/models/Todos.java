package com.todo.todo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todos {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String action;
  private boolean done;
  private boolean urgent;

  public Todos() {
  }

  public Todos(String action) {
    this.action = action;
    this.done = false;
    this.urgent = false;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }
}