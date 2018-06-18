import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Births {

  public static void main(String[] args) {

    System.out.println(tellTheHighestValue((countLetters(getDate(readTheFile("./Births.txt"))))));

  }

  public static String tellTheHighestValue (Map<String, Integer> mapOfYears){

    int tempValue = 0;
    String highestValue = "";

    for (Map.Entry value : mapOfYears.entrySet()){
      if ((Integer) value.getValue() > tempValue){
        tempValue = (Integer) value.getValue();
      }
    }
    for (String years : mapOfYears.keySet()){
      if (mapOfYears.get(years).equals(tempValue)){
        highestValue = years;
      }
    }


    return highestValue;

  }


  public static Map countLetters(List<String> years) {
    Map<String, Integer> mapOfYears = new HashMap<>();
    for (int i = 0; i < years.size(); i++) {
      if (!mapOfYears.containsKey(years.get(i))) {
        mapOfYears.put(years.get(i),1);
      }else{
        mapOfYears.put(years.get(i),  mapOfYears.get(years.get(i)) +1);
              }
    } return mapOfYears;
  }

  public static List<String> readTheFile(String filename) {

    List<String> content = new ArrayList<>();
    Path path = Paths.get(filename);
    try {
      content = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return content;
  }

  public static List<String> getDate(List<String> original) {
    List<String> justDates = new ArrayList<>();
    List<String> justYears = new ArrayList<>();
    for (String lines : original){
    justDates.add(lines.split(";")[1]);
    }
    for (String dates : justDates){
      justYears.add(dates.split("-")[0]);
    }
    return justYears;
  }
}