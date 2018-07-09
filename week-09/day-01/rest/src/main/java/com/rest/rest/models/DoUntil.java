package com.rest.rest.models;

import com.rest.rest.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.ws.Service;

public class DoUntil {

  @Autowired
  AppService appService;

  private int until;

  public DoUntil() {
  }

  public DoUntil(int until) {
    this.until = until;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }
}




