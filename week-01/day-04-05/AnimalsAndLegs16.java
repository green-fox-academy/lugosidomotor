
import java.util.Scanner;
public class AnimalsAndLegs16 {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        System.out.println("Hány csirke?");


        Scanner chiken = new Scanner(System.in);
        int chikens = chiken.nextInt();

        System.out.println("Hány malac?");
        Scanner pig = new Scanner(System.in);
        int pigs = pig.nextInt();

        int legs = chikens * 2 + pigs * 4;

        System.out.println(legs);

    }
}
