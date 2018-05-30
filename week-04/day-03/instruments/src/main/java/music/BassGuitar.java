package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar(int number) {
    this.setNumberOfStrings(number);
  }

  public void play(){
    System.out.println("Duum-duum-duum");
  }
}
