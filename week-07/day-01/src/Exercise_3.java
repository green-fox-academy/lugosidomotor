import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_3 {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(getTheSquare(numbers));
    System.out.println(getTheSquareWithStream(numbers));
  }

  public static ArrayList<Integer> getTheSquare (ArrayList<Integer> numbers){
    ArrayList<Integer> square = new ArrayList<Integer>();
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 == 0){
        square.add(numbers.get(i) * numbers.get(i));
      }
    }
    return square;
  }

  public static List<Integer> getTheSquareWithStream (ArrayList<Integer> numbers) {
    return numbers.stream()
            .filter(n -> n % 2 == 0)
            .map( n -> n * n)
            .collect(Collectors.toList());
  }
}