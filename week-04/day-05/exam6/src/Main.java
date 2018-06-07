import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    Carrier carrier1 = new Carrier(10000, 100);
    Carrier enemy = new Carrier(100, 100);

    Aircraft F16One = new F16();
    Aircraft F35One = new F35();

    carrier1.add(F16One);
    carrier1.add(F35One);

    carrier1.fill();

    enemy.getSatus();
    System.out.println(enemy.getHealtOfCarrier());

    carrier1.fight(enemy);


    System.out.println(enemy.getHealtOfCarrier());
  }
}
