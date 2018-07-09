package com.rest.rest.models;

public class AppendA {

  private String appended = "a";

  public AppendA(String append) {
    this.appended = append + appended;
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
