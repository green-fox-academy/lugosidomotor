import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {

        System.out.println("Path?");

        Scanner scanner = new Scanner(System.in);
        String PATH = scanner.nextLine();

        System.out.println("Word?");

        Scanner scanner2 = new Scanner(System.in);
        String WORD = scanner2.nextLine();

        System.out.println("Number?");

        Scanner scanner3 = new Scanner(System.in);
        int NUMBER = scanner3.nextInt();

        System.out.println("Bemenetek: " + PATH + "  -  " + WORD + "  -  " + NUMBER);

        //------------ SCANNEREK END -------------------


        List<String> content = new ArrayList<>();

        for (int i = 0; i < NUMBER; i++) {

            content.add(WORD);
            try {
                Path filepath = Paths.get(PATH);
                Files.write(filepath, content);
            } catch (Exception e) {
                System.out.println("Unable to write file: WriteMultipleLines.txt");
            }

        }
    }
}





// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.