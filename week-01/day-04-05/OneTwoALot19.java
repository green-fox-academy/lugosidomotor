import java.util.Scanner;

public class OneTwoALot19 {

    public static void main(String[] args) {


        System.out.println("number?");
        Scanner number = new Scanner(System.in);
        int Number = number.nextInt();


        if (Number == 0) {
            System.out.println("Not enough");
        } else if (Number == 1) {
            System.out.println("One");
        } else if (Number == 2) {
            System.out.println("Two");
        } else if (Number > 2) {
            System.out.println("A lot");

        }


    }
}



// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot