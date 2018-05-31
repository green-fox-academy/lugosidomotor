import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    System.out.println(IsAnagram("Lugosi Domotor","Dog Suitor Loom"));
    System.out.println(anagramOld("Lugosi Domotor","Dog Suitor Loom"));
  }

  public static String sortString(String inputString) {
    char tempArray[] = inputString.toCharArray();
    Arrays.sort(tempArray);
    return new String(tempArray);
  }

  public static boolean IsAnagram(String firstWord, String secondWord) {
    return sortString(firstWord.replace(" ","").toLowerCase()).contains(sortString(secondWord.replace(" ","").toLowerCase()));
  }

  public static boolean anagramOld(String stringOne, String stringTwo) {

    if (stringOne.length() != stringTwo.length()) {
      return false;
    } else {
      for (int i = 0; i <= stringOne.length(); i++) {
        if (sortString(stringOne).charAt(i) == sortString(stringTwo).charAt(i)) {
          return true;
        }else{
          return false;
        }
      }
    }return true;
  }
}























