public class App {
  public static void main(String[] args) {

    Cat macska = new Cat();
    //macska.meow();
    //macska.meow();

    Cat macska2 = new Cat();
    System.out.println(macska.equals(macska2));

    macska.makeShout();

  }
}
