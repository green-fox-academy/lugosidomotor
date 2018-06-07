import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Births {

  public static void main(String[] args) {

//    int freq = Collections.frequency(Births("./births.txt"), "a" );
//    System.out.println(freq);


    System.out.println(births("./births.txt"));



  }

  public static List<String> births(String filename) {

    List<String> content = new ArrayList<>();
    Path path = Paths.get(filename);
    try {
      content = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return content;



  }


//  public static List<String> splitEverything(List<String> original) {
//    String cleaned = original.toString();
//
//    List<String> cleaner = Arrays.asList(cleaned.toLowerCase().split("[, ./!?]"));
//
//
//    }return cleaner;
//  }







}
