public abstract class Animal {


  private int weight;
  private String name;


  public void makeShout() {
    System.out.println("AAAAAA");
  }


  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
