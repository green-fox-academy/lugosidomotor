public abstract class Vehicle {

 private int factoryNumber;
 private int costOfLastService;
 private int numberOfSeats;

  public int getFactoryNumber() {
    return factoryNumber;
  }

  public void setFactoryNumber(int factoryNumber) {
    this.factoryNumber = factoryNumber;
  }

  public int getCostOfLastService() {
    return costOfLastService;
  }

  public void setCostOfLastService(int costOfLastService) {
    this.costOfLastService = costOfLastService;
  }

  public int getNumberOfSeats() {
    return numberOfSeats;
  }

  public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }
}
