import java.util.HashMap;
import java.util.Map;
import static java.util.stream.Collectors.toMap;

public class Exercise_7 {

  public static void main(String[] args) {

    String content = "Write a Stream Expression to find the uppercase characters in a string!";
    System.out.println(getTheFrequency(content));
    getTheFrequencyWithStream(content);
  }

  public static HashMap<Character, Integer> getTheFrequency(String content) {

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < content.length(); i++) {
      char c = content.charAt(i);
      map.merge(c, 1, (a, b) -> a + b);
    }
    return map;
  }

  private static void getTheFrequencyWithStream(String content) {
    Map<Character, Integer> frequencies = content.chars().boxed()
            .collect(toMap(
                    k -> (char) k.intValue(),
                    v -> 1,
                    Integer::sum));
    System.out.println("Frequencies:\n" + frequencies);
  }
}