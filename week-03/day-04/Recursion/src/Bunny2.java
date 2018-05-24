public class Bunny2 {

    public static void main(String[] args) {

        System.out.println(sumOfEars(12));
    }

    private static int sumOfEars(int number) {
        int ears = 2;

        if (number == 1) {
            return ears;
        } else {
            if (number % 2 == 0){
                return (ears + 1 + sumOfEars(number - 1));
            }else {
                return (ears + sumOfEars(number - 1));
            }
    }

}
}


// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).