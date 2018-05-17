import java.util.Scanner;

public class DividebyZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        try {
            int result = 10 / number; // If the input value for divisor was 0 the program breaks
            System.out.println(result); // The program doesn't reach this line if the input was 0
        }catch(ArithmeticException e){
            System.out.println("fail");
        }
    }
}


// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
