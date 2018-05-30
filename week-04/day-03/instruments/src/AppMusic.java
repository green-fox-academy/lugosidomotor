import main.java.music.BassGuitar;
import main.java.music.ElectricGuitar;
import main.java.music.Violin;

public class AppMusic {
  public static void main(String[] args) {

    System.out.println("Test 1, create Electric Guitar, Bass Guitar and Violin with default strings.");
    ElectricGuitar guitar = new ElectricGuitar(6);
    BassGuitar bassGuitar = new BassGuitar(8);
    Violin violin = new Violin(8);

    System.out.println("Test 1 Play");
    guitar.play();
    bassGuitar.play();
    violin.play();

    System.out.println("Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings .");
    ElectricGuitar guitar2 = new ElectricGuitar(5);
    BassGuitar bassGuitar2 = new BassGuitar(7);

    System.out.println("Test 2 Play");
    guitar2.play();
    bassGuitar2.play();

  }
}

