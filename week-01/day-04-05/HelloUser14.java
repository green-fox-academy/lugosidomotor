import java.util.Scanner;

public class HelloUser14 {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        System.out.println("Hello, " +  user + "!");
    }
}
