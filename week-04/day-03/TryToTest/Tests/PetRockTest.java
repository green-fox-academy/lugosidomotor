import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {

  @Test
  public void getName() {
    PetRock rocky = new PetRock("Rocky");
    assertEquals("Rocky", getTrickyAvg());
  }

  @Test
  public void testHappy() {
    PetRock rocky = new PetRock("Rocky");
    assertFalse(rocky.isHappy());
  }
}