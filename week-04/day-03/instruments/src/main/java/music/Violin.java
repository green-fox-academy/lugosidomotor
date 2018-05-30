package main.java.music;

public class Violin extends StringedInstrument {

  public Violin(int number) {
    this.setNumberOfStrings(number);
  }

  public void play(){
    System.out.println("Screech");
  }

}
