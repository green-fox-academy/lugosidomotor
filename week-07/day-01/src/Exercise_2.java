import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_2 {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(getTheSumOfOdds(numbers));
    System.out.println(getTheSumOfOddsWithStream(numbers));
  }

  public static Integer getTheSumOfOdds (ArrayList<Integer> numbers){
    Integer sumOfOdds = 0;
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 != 0){
        sumOfOdds += numbers.get(i);
      }
    }
    return sumOfOdds / numbers.size();
  }

  public static double getTheSumOfOddsWithStream (ArrayList<Integer> numbers) {
    return numbers.stream()
            .filter(n -> n % 2 != 0)
            .mapToDouble( n -> n)
            .average()
            .getAsDouble();
  }
}

