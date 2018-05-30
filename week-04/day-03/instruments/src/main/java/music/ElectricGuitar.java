package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(int number) {
    this.setNumberOfStrings(number);
  }


  String intoduction = "Electric Guitar, a " + getNumberOfStrings() + "-stringed instrument that goes Twangg";


  public void play(){
    System.out.println(intoduction);
  }

}
