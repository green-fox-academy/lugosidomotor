import java.util.Scanner;

public class DrawPyramid29 {
    public static void main(String[] args) {

        System.out.println("number?");
        Scanner number1 = new Scanner(System.in);
        int i = number1.nextInt();
        String csillag = ("*");
        String szunet = (" ");

        while (i >= 0) {
            System.out.println(csillag);
            i--;
            csillag = csillag + "*";




        }
    }
}

//    *
//   ***
//  *****
// *******
//*********