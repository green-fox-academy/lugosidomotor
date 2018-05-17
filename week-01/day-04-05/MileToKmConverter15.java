import java.util.Scanner;

public class MileToKmConverter15 {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        System.out.println("Number of the kilometers?");

        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();
        System.out.println("This is " + (double) km * 0.621371192 + "miles.");
    }
}
