import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_6 {

  public static void main(String[] args) {

    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    System.out.println(getTheAStartIEndWords1(cities));
    System.out.println(getTheAStartIEndWords2(cities));
    System.out.println(getTheAStartIEndWordsWithStream(cities));
  }

  public static ArrayList<String> getTheAStartIEndWords1(ArrayList<String> content) {
    ArrayList<String> finds = new ArrayList<>();

    for (String temp : content) {
      Character first = temp.charAt(0);
      Character last = temp.charAt(temp.length() - 1);

      if (first.equals('A') && last.equals('I')) {
        finds.add(temp);
      }
    }
    return finds;
  }

  private static ArrayList<String> getTheAStartIEndWords2(ArrayList<String> content) {
    ArrayList<String> finds = new ArrayList<>();

    for (String aContent : content) {
      if (aContent.startsWith("A") && aContent.endsWith("I")){
        finds.add(aContent);
      }
    }
    return finds;
  }

  public static List<String> getTheAStartIEndWordsWithStream(ArrayList<String> content) {
    return content.stream()
            .filter(city -> city.startsWith("A") && city.endsWith("I"))
            .collect(Collectors.toList());
  }
}