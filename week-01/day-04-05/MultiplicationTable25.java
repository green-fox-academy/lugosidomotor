import java.util.Scanner;

public class MultiplicationTable25 {
    public static void main(String[] args) {
        System.out.println("Szám??");

        Scanner scanner = new Scanner(System.in);
        int szam = scanner.nextInt();

        int szorzo = 1;
        while (szorzo <= 10) {
            System.out.println(szorzo + " * " + szam  + " = " + szorzo * szam);
            szorzo++;}
        }
    }

// Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150