import java.util.Arrays;

public class Exercise_9 {

  public static void main(String[] args) {

    Character[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    System.out.println(convertCharsToString(chars));
    System.out.println(convertCharsToStringWithStream(chars));
  }

  public static String convertCharsToString(Character[] chars) {
    String finalString = "";

    for (int i = 0; i < chars.length; i++) {
      finalString += chars[i];
    }
    return finalString;
  }

  public static String convertCharsToStringWithStream(Character[] chars) {

    return Arrays.stream(chars)
            .map(c -> Character.toString(c))
            .reduce((word, letter) -> word + letter)
            .get();
  }
}