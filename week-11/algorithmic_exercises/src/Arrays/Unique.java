package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Unique {

  //  Create a function that takes a list of numbers as a parameter
  //  Returns a list of numbers where every number in the list occurs only once

  //  Example
//    System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
  //  should print: `[1, 11, 34, 52, 61]`


  public static void main(String[] args) {
  ArrayList<Integer> original = new ArrayList<>((Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34)));

    System.out.println(original);

    List<Integer> unique = original.stream().distinct().collect(Collectors.toList());

    System.out.println(unique);


  }
}
