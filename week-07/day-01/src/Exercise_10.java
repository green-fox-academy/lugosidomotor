import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_10 {
  public static void main(String[] args) {

    Fox fox1 = new Fox("Sanyi", "beagle","green");
    Fox fox2 = new Fox("Béla", "ticstöcs","green");
    Fox fox3 = new Fox("Géza", "husky","blue");
    Fox fox4 = new Fox("Dömi", "pallida","green");
    Fox fox5 = new Fox("Ica", "beagle","red");
    Fox fox6 = new Fox("Ildi", "tacskó","green");
    Fox fox7 = new Fox("Éva", "pallida","orange");

    ArrayList<Fox> foxes = new ArrayList<Fox>();
    foxes.add(fox1);
    foxes.add(fox2);
    foxes.add(fox3);
    foxes.add(fox4);
    foxes.add(fox5);
    foxes.add(fox6);
    foxes.add(fox7);

    System.out.println(findTheGreenAndPallida(foxes));
    System.out.println(findTheGreenAndPallidaWithStream(foxes));
  }

public static ArrayList<Fox> findTheGreen (ArrayList<Fox> foxes){
  ArrayList<Fox> greens = new ArrayList<Fox>();
  for (int i = 0; i < foxes.size(); i++) {
    if (foxes.get(i).color.equals("green")){
      greens.add(foxes.get(i));
    }
  }
  return greens;
}

  public static ArrayList<Fox> findTheGreenAndPallida (ArrayList<Fox> foxes){
    ArrayList<Fox> greensAndPallida = new ArrayList<Fox>();
    for (int i = 0; i < foxes.size(); i++) {
      if (foxes.get(i).color.equals("green") && foxes.get(i).type.equals("pallida")){
        greensAndPallida.add(foxes.get(i));
      }
    }
    return greensAndPallida;
  }


  public static List<Fox> findTheGreenAndPallidaWithStream (ArrayList<Fox> foxes) {
    return foxes.stream()
            .filter(fox -> fox.color == "green" && fox.type == "pallida" )
            .collect(Collectors.toList());
  }

}

