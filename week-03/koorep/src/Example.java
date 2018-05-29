import java.util.ArrayList;
import java.util.Arrays;

public class Example {
    public static void main(String... args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        containsSeven(arrayList);

    }

    private static void containsSeven(ArrayList<Integer> list) {
        if (list.contains(7)) {
            System.out.println("Yeeeee!");
        } else {
            System.out.println("Noooooo!");
        }
    }
}