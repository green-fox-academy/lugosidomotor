public class Flower {

  private String color;
  private int needOfWater;

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getNeedOfWater() {
    return needOfWater;
  }

  public void setNeedOfWater(int needOfWater) {
    this.needOfWater = needOfWater;
  }


  public Flower(String color, int needOfWater) {
    this.color = color;
    this.needOfWater = needOfWater;
  }
}

