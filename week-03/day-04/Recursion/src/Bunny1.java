public class Bunny1 {

    public static void main(String[] args) {

        System.out.println(sumOfEars(112));
    }

    private static int sumOfEars(int number) {
        int ears = 2;

        if (number == 1) {
            return ears;
        } else
            return (ears + sumOfEars(number-1));
    }

}


// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).