import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Reverse {
    public static void main(String... args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        String normal = "";

        for (int i = reversed.length()-1; i >= 0; i--) {
            normal = normal + reversed.charAt(i);
        }

        System.out.println(normal);
    }
}
        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

       //System.out.println(reverse(reversed));


        // String part1 = reversed.substring();
        //String part2 = ;


