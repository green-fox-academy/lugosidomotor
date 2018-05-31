import java.util.ArrayList;
import java.util.Arrays;

public class Sum {
  public static void main(String[] args) {
  }

    public static int getSum (ArrayList<Integer>list){
      int sum = 0;
      for (int number : list) {
        sum += number;
      }
      return sum;
    }
  }

