import java.util.Scanner;

public class AverageOfInput17 {
    public static void main(String[] args) {


        System.out.println("elso?");
        Scanner one = new Scanner(System.in);
        int elso = one.nextInt();

        System.out.println("masodik?");
        Scanner two = new Scanner(System.in);
        int masodik = two.nextInt();

        System.out.println("harmadik?");
        Scanner three = new Scanner(System.in);
        int harmadik = three.nextInt();

        System.out.println("negyedik?");
        Scanner four = new Scanner(System.in);
        int negyedik = four.nextInt();

        System.out.println("otodik?");
        Scanner five = new Scanner(System.in);
        int otodik = five.nextInt();

        int sum = elso + masodik + harmadik + negyedik + otodik;
        int avr = ((elso + masodik + harmadik + negyedik + otodik) / 5);

        System.out.println("Sum: " + sum + "  " + "Average: " +  avr);
    }
}
// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4