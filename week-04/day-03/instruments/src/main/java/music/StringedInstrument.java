package main.java.music;

public abstract class StringedInstrument extends Instrument {

  public int numberOfStrings;

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }


}
