public class Cat extends Animal implements Pet{

  public Cat(String name, int weight) {
    this.setName(name);
    this.setWeight(weight);
  }

  public void meow(){
    System.out.println("meow");
  }

  @Override
  public void cuddle() {

  }

  @Override
  public void sitting() {

  }
}
