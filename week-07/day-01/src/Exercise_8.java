//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import static java.util.stream.Collectors.toMap;
//
//public class Exercise_8 {
//
//  public static void main(String[] args) {
//
//    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));
//    System.out.println(getTheFrequency(numbers));
//    getTheFrequencyWithStream(numbers);
//  }
//
//  public static HashMap<Integer, Integer> getTheFrequency(ArrayList<Integer> content) {
//
//    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//    for (int i = 0; i < content.size(); i++) {
//
//      map.merge((c, 1, (a, b) -> a + b);
//    }
//    return map;
//  }
//
//  private static void getTheFrequencyWithStream(ArrayList<Integer> content) {
//   Map<Character, Integer> frequencies = content.boxed()
//            .collect(toMap(
//                    k -> (char) k.intValue(),
//                    v -> 1,
//                    Integer::sum));
//    System.out.println("Frequencies:\n" + frequencies);
//  }
//}