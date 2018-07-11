package com.rest.rest.models;

public class ArrayResultInt {


  private String what;
  private int result;

  private ArrayResultInt() {
  }

  public ArrayResultInt(String what, int result) {
    this.what = what;
    this.result = result;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
