public class NumberAdder {
    public static void main(String[] args) {


        int sum = sumWithRecursion( 10);
        System.out.println(sum);
    }

    private static int sumWithRecursion(int limit) {
        System.out.println(limit);
        if (limit == 1) {
            return 1;
        } else {
            return limit + sumWithRecursion(limit - 1);
        }
    }
}



//    Write a recursive function that takes one parameter: n and adds numbers from 1 to n.