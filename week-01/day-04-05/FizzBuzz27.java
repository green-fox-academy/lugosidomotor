public class FizzBuzz27 {
    public static void main(String[] args) {

        int a = 1;
        while (a <= 100) {

            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("Fizzbuzz");
                a++;
            } else if(a % 3 == 0) {
                System.out.println("Fizz");
                a++;
            } else if(a % 5 == 0) {
                System.out.println("Buzz");
                a++;
            }else {System.out.println(a);
            a++;}

            }
    }
}
// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.



//a % 3 > 0 && a % 5 !=0

//a % 5 > 0


  //      (a % 3 > 0 && a % 5 > 0)
    //    System.out.println(a);
      //  a++;





