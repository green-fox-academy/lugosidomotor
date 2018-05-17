import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // open and read it. The file data represents a tic-tac-toe
        // game result. Return 'X'/'O'/'draw' based on which player
        // has winning situation.


        String fileName = "win-o.txt"

        System.out.println(ticTacResult());
    }


    public static int ticTacResult(String fileName) {
        String lineNum = 0;




        if (fileName == "win-o.txt"){

            System.out.println(ticTacResult("win-o.txt"))
            // should print O
        } else if (fileName =="win-x.txt" ) {

            System.out.println(ticTacResult("win-x.txt"))
            // should print X
        } {else if (fileName == "draw.txt") {

            System.out.println(ticTacResult("draw.txt"))
            // should print draw

        } else {
            System.out.println(ticTacResult("draw.txt"))
        }
            return win;
        }
}
