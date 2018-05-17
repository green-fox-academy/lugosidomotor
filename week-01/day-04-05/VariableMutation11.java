public class VariableMutation11 {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10


        System.out.println(a + 10);




        int b = 100;
        // make it smaller by 7


        System.out.println(b - 7);




        int c = 44;
        // please double c's value


        System.out.println(c * 2);




        int d = 125;
        // please divide by 5 d's value


        System.out.println(d / 5);




        int e = 8;
        // please cube of e's value


        System.out.println(e / e );




        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)

        if (f1 - f2 > 0) {
            System.out.println("Az f1 a nagyobb.");
        } else {System.out.println("Az f2 a nagyobb.");
        }





        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        if (f1 - (g2 * 2) > 0) {
            System.out.println("Az g1 a nagyobb.");
        } else {System.out.println("Az g2 duplája a nagyobb.");
        }




        int h = 135798745;
        int maradek = 135798745 % 11;
        // tell if it has 11 as a divisor (print as a boolean)

        if (maradek > 0) {
            System.out.println("A 11 nem osztója.");
        } else {System.out.println("A 11 osztoja");
        }





        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)




        int j = 1521;
        int maradek3 = 1521 % 3;
        int maradek5 = 1521 % 5;
        // tell if j is dividable by 3 or 5 (print as a boolean)

        if (maradek3 > 0) {
            boolean oszto3 = false;
            System.out.println("Osztója a 3? " + oszto3);

        }
        if (maradek5 > 0) {
            boolean oszto5 = false;
            System.out.println("Osztója az 5? " + oszto5);

        }




        String k = "Apple";
        //fill the k variable with its cotnent 4 times
        k = k + k + k + k;

        System.out.println(k);
    }
}
