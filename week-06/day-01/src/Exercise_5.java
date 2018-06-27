import java.util.stream.Collectors;

public class Exercise_5 {

  public static void main(String[] args) {

    String content = "Write a Stream Expression to find the uppercase characters in a string!";
    System.out.println(getTheNumberOfUppercases(content));
    System.out.println(getTheNumberOfUppercasesWithStream(content));
  }

  public static Integer getTheNumberOfUppercases(String content) {
    Integer counter = 0;
    for (int i = 0; i < content.length(); i++) {
      if (Character.isUpperCase(content.charAt(i))) {
        counter = counter + 1;
      }
    }
    return counter;
  }

  public static Integer getTheNumberOfUppercasesWithStream(String content) {
    return content.chars()
            .filter(Character::isUpperCase)
            .mapToObj(s -> (char)s)
            .collect(Collectors.toList())
            .size();
  }
}