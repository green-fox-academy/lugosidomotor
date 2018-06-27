import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_1 {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(getTheEvens(numbers));
    System.out.println(getTheEvensWithStream(numbers));
  }

public static ArrayList<Integer> getTheEvens (ArrayList<Integer> numbers){
  ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
  for (int i = 0; i < numbers.size(); i++) {
    if (numbers.get(i) % 2 == 0){
      evenNumbers.add(numbers.get(i));
    }
  }
    return evenNumbers;
}

public static List<Integer> getTheEvensWithStream (ArrayList<Integer> numbers) {
    return numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
  }
}