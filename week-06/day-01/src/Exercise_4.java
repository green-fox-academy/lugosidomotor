import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Exercise_4 {
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    System.out.println(getSquareValuesBiggerThen20WithStream(numbers));
    System.out.println(getSquareValuesBiggerThen20(numbers));
  }

  public static ArrayList<Integer> getSquareValuesBiggerThen20 (ArrayList<Integer> numbers){
    ArrayList<Integer> square = new ArrayList<Integer>();
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) * numbers.get(i) > 20){
        square.add(numbers.get(i));
      }
    }
    return square;
  }

  private static List<Integer> getSquareValuesBiggerThen20WithStream(ArrayList<Integer> numbers) {
    return numbers.stream()
            .filter(n -> n * n > 20)
            .collect(Collectors.toList());
  }
}