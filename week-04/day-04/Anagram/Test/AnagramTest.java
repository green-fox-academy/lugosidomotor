import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void SpaceInTheWords(){

    boolean expectedValue = true;
    String wordOne = "lugosi domotor";
    String wordOneAnagram = "dog suitor loom";

    assertTrue(Anagram.IsAnagram("Lugosi Domotor", "Dog Suitor Loom"));

  }

  @Test
  public void UpperCaseInTheWOrds(){

    boolean expectedValue = true;
    String wordOne = "LugosiDomotor";
    String wordOneAnagram = "DogSuitorLoom";

    assertTrue(Anagram.IsAnagram("Lugosi Domotor", "Dog Suitor Loom"));

  }

}