import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void sumTestToGetGreen(){
    ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
    int sumOftestList = 15;

    assertEquals(sumOftestList,Sum.getSum(testList));
  }

  @Test
  public void sumTestWithEmptyList(){
    ArrayList<Integer> testList = new ArrayList<Integer>();
    int sumOftestList = 0;

    assertEquals(sumOftestList,Sum.getSum(testList));  }


  @Test
  public void sumTestWithOneElement(){
    ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(5));
    int sumOftestList = 5;

    assertEquals(sumOftestList,Sum.getSum(testList));
  }

  @Test
  public void sumTestWithNull(){

    assertEquals(42,Sum.getSum(null));
  }

}