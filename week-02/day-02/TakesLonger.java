public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println(quote);

        // szétvágja, elmenti az első részt
        String part1 = quote.substring(0, 21);
        System.out.println(part1);


        // szétvágja, elmenti a második részt
        String part3 = quote.substring(21, 82);
        System.out.println(part3);


        // az első részhez hozzáadja a plusz szöveget

        String part2 = part1.concat("always takes longer than");

        System.out.println(part2 + part3);












        //System.out.println(quote.lastIndexOf(int ch));

        //String part2 = quote.substring(22,);

        //slice()
    }
}
