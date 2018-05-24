public class Power {
    public static void main(String[] args) {


        int sumPower = powerFun(5,5);
        System.out.println(sumPower);
    }

    private static int powerFun(int base, int n) {
        if (n == 0) {
            return 1;
        } else
            return (base * powerFun(base,n-1));
    }


}
// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).