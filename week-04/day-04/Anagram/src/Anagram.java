import java.util.Arrays;

public class Anagram {

  public static String sortString(String inputString) {
    char tempArray[] = inputString.toCharArray();
    Arrays.sort(tempArray);
    return new String(tempArray);
  }

  public static boolean IsAnagram(String firstWord, String secondWord) {
    return sortString(firstWord).contains(sortString(secondWord));
  }
}























