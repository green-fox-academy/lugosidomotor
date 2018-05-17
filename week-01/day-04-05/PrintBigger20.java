import java.util.Scanner;

public class PrintBigger20 {
    public static void main(String[] args) {


        System.out.println("first number?");
        Scanner number1 = new Scanner(System.in);
        int Number1 = number1.nextInt();

        System.out.println("second number?");
        Scanner number2 = new Scanner(System.in);
        int Number2 = number2.nextInt();


        if ((Number1 - Number2)  > 0) {
            System.out.println("The first is bigger");
        } else {
            System.out.println("The second is bigger");
        }

    }
}





// Write a program that asks for two numbers and prints the bigger one