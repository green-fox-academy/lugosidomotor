public class SumDigit {

    public static void main(String[] args) {

        int number = 232;
        int sumNumberDigit = numberDigitSum(number);
        System.out.println(sumNumberDigit);
    }

    private static int numberDigitSum(int number) {
        if (number == 0) {
            return 0;
        } else
            return (number % 10) + numberDigitSum(number / 10);
    }
}



// // Given a non-negative int n, return the sum of its digits recursively (no loops).
//// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
//// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).