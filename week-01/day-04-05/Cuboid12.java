public class Cuboid12 {
    public static void main(String[] args) {
        double aoldal = 12;
        double boldal = 7;
        double coldal = 5;

        double surface = 2 * ( (aoldal * boldal) + (aoldal * coldal) + (boldal * coldal));
        double volume = aoldal * boldal * coldal;

        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: " + volume);

    }
}
// Surface Area: 600
// Volume: 1000