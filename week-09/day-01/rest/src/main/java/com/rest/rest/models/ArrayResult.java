package com.rest.rest.models;

import java.util.ArrayList;

public class ArrayResult {

  private String what;
  private ArrayList<Integer> result;

  private ArrayResult() {
  }

  public ArrayResult(String what, ArrayList<Integer> result) {
    this.what = what;
    this.result = result;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public ArrayList<Integer> getResult() {
    return result;
  }

  public void setResult(ArrayList<Integer> result) {
    this.result = result;
  }


}
