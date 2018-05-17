public class w2d2t5_Factorio {
    public static void main(String[] args) {
        int myNumber =5;
        System.out.println(factorio(myNumber));
    }

    public static int factorio(int number) {
       int result = 1;

        for (int i = 1; i <= number; i ++ ){
            result = result * i;
        }
        return result;

    }
}





//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial