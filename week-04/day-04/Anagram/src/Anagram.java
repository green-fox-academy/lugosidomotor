import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {


    System.out.println(anagram("diebbcdb","omed"));

    }

  public static String sortString(String inputString)  {
    char tempArray[] = inputString.toCharArray();
    Arrays.sort(tempArray);
    return new String(tempArray);
  }

  public static boolean anagram(String stringOne, String stringTwo) {

    String sortedOne = sortString(stringOne);
    String sortedTwo = sortString(stringTwo);

    if (stringOne.length() != stringTwo.length()) {
      return false;
    } else {
      for (int i = 0; i <= sortedOne.length(); i++) {
        if (sortedOne.charAt(i) == sortedTwo.charAt(i)) {
          return true;
        }else{
          return false;
        }
      }
    }return true;
  }
}


















