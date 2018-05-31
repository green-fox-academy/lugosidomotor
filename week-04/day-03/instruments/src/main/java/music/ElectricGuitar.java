package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(int number) {
    this.setNumberOfStrings(number);
  }


  public void play(){
    System.out.println("Twangg");
  }

}
