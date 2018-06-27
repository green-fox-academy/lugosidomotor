import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_10 {
  public static void main(String[] args) {

    List<Fox> foxes = Arrays.asList(
    new Fox("Sanyi", "beagle","green"),
    new Fox("Béla", "ticstöcs","green"),
    new Fox("Géza", "husky","blue"),
    new Fox("Dömi", "pallida","green"),
    new Fox("Ica", "beagle","red"),
    new Fox("Ildi", "tacskó","green"),
    new Fox("Éva", "pallida","orange"));

    System.out.println(findTheGreen(foxes));
    System.out.println(findTheGreenAndPallida(foxes));
    System.out.println(findTheGreenAndPallidaWithStream(foxes));
    }

public static List<Fox> findTheGreen (List<Fox> foxes){
  List<Fox> greens = new ArrayList<Fox>();
  for (int i = 0; i < foxes.size(); i++) {
    if (foxes.get(i).color.equals("green")){
      greens.add(foxes.get(i));
    }
  }
  return greens;
}

  public static List<Fox> findTheGreenAndPallida (List<Fox> foxes){
    List<Fox> greensAndPallida = new ArrayList<Fox>();
    for (int i = 0; i < foxes.size(); i++) {
      if (foxes.get(i).color.equals("green") && foxes.get(i).type.equals("pallida")){
        greensAndPallida.add(foxes.get(i));
      }
    }
    return greensAndPallida;
  }

  public static List<Fox> findTheGreenAndPallidaWithStream (List<Fox> foxes) {
    return foxes.stream()
            .filter(fox -> fox.color == "green" && fox.type == "pallida")
            .collect(Collectors.toList());
  }
}