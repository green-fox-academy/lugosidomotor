import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

  String expectedValue1 = "apple";
  String expectedValue2 = "apple_fail";


  @Test
  public void testReturnString(){

    Apples testApple = new Apples();
    assertEquals(expectedValue1, testApple.getApple());

  }
}