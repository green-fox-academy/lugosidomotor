public class Counter {
    public static void main(String[] args) {


        int n = countDown( 10);
        System.out.println(n);
    }

    private static int countDown(int countFrom) {

        if (countFrom == 1) {
            return 1;
        } else {
            System.out.println(countFrom);
            return countDown(countFrom - 1);


        }
    }
}


// Write a recursive function that takes one parameter: n and counts down from n.
