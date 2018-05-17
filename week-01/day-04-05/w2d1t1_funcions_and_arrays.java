import java.util.Arrays;

public class w2d1t1_funcions_and_arrays {
    public static void main(String[] args) {
        int[] numbers = new int[4]; //létrehoztunk egy négy elemű tömböt
        String[] texts = new String[4];
        boolean[] truths = new  boolean[4];


        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 4;
        numbers[3] = 8;
        numbers[3] = 9;

        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {2, 6, 7, 8, 9,};

        System.out.println(Arrays.toString(numbers2));

        int[] numbers3;
        numbers3 = new int [] {2, 6, 7, 8, 9,};

    }
}
