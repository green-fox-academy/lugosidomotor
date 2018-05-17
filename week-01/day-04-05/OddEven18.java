import java.util.Scanner;

public class OddEven18 {
    public static void main(String[] args) {


        System.out.println("number?");
        Scanner number = new Scanner(System.in);
        int Number = number.nextInt();


       if ((Number % 2) > 0) {
           System.out.println("odd");
        } else {
            System.out.println("even");
        }

    }
}

// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.
