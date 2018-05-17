import java.util.Scanner;

public class CountFromTo26 {
    public static void main(String[] args) {
        System.out.println("Szám 1.??");

        Scanner scanner1 = new Scanner(System.in);
        int szam1 = scanner1.nextInt();

        System.out.println("Szám 2.??");

        Scanner scanner2 = new Scanner(System.in);
        int szam2 = scanner2.nextInt();
        int kulonbseg = szam2 - szam1;

        if ((szam1 - szam2) >= 0) {
            System.out.println("The second number should be bigger");
        } else {


            while (szam2 >= szam1) {

                System.out.println(szam2);
                szam2--;
            }
        }
    }
}

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5