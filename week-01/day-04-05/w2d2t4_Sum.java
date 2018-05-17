public class w2d2t4_Sum {
    public static void main(String[] args) {
        int myNumber =10;
        System.out.println(sum(myNumber));
    }

    public static int sum(int number) {
        int result =0;

        for (int i = 0; i <= number; i ++ ){
            result += i;
        }
        return result;

        }
    }



//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
