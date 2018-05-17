public class w2d2t19_SwapElements {
    public static void main(String[] args) {


        String[] abc = {"first", "second", "third"};
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i] + " ");
        }

        System.out.println();

        String temp = abc[0];
        abc[0] = abc[2];
        abc[2] = temp;
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i] + " ");
        }
    }
}





// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`