package com.tamagotchi.tamagotchi;
import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private List<Tricks> tricks;


  public Fox(String name) {
    this.name = name;
    tricks = new ArrayList<>();
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Tricks> getTricks() {
    return tricks;
  }

  public void setTricks(List<Tricks> tricks) {
    this.tricks = tricks;
  }
}
