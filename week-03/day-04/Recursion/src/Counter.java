public class Counter {
    public static void main(String[] args) {


        int sum = sumWithRecursion( 1000);
        System.out.println(sum);
    }

    private static int sumWithRecursion(int limit) {
        if (limit == 1) {
            return 1;
        } else {
            return limit + sumWithRecursion(limit - 1);
        }
    }
}


// Write a recursive function that takes one parameter: n and counts down from n.
