import java.util.Scanner;

public class DrawTriangle28 {
    public static void main(String[] args) {

        System.out.println("number?");
        Scanner number1 = new Scanner(System.in);
        int i = number1.nextInt();
        String csillag = ("*");

        while (i >= 0) {
            System.out.println(csillag);
            i--;
            csillag = csillag + "*";


        }
    }
}

// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was