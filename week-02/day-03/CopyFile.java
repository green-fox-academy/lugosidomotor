import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) {

        String fileName = "CopyFile1.txt";
        System.out.println(fileCopyCheck(fileName));

    }

    public static boolean fileCopyCheck (String fileName) {
        boolean check = true;
        try {
            Path sourceFilepath = Paths.get(fileName);
            Path copyFilepath = Paths.get("CopyFile2.txt");
            Files.copy(sourceFilepath, copyFilepath);
        }
        catch (Exception e) {
            check = false;
        }
        return check;
    }
}




// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
