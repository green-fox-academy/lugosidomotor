import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords {

  public static void main(String[] args) {
    // There is a not so family friendly text in the `content.txt`
    // Create a function named familyFriendlizer that takes a filename and a list of strings as parameters
    // and remove all the given words from the file and returns the amount of the removed words.


    ArrayList<String> offensiveWords = new ArrayList<>(Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss"));
    //System.out.println(familyFriendlizer(readFile("content.txt"), offensiveWords)); // should print out 17

    //System.out.println(readFile("./content.txt"));

    System.out.println(familyFriendlizer(readFile("content.txt"), offensiveWords));
  }

  public static List<String> readFile(String filename) {

    List<String> content = new ArrayList<>();
    Path path = Paths.get(filename);
    try {
      content = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return content;

  }

  public static int familyFriendlizer(List<String> original, List<String> removal) {
    int numberOfCenzoredWords = 0;

    String cleaned = original.toString();

    List<String> cleaner = Arrays.asList(cleaned.toLowerCase().split("[, ./!?]"));

    for (int i = 0; i < cleaner.size(); i++) {
      for (int j = 0; j < removal.size(); j++) {
        if (cleaner.get(i).equals(removal.get(j)) ) {
          numberOfCenzoredWords++;
        }

      }

    }return numberOfCenzoredWords;
  }
}
