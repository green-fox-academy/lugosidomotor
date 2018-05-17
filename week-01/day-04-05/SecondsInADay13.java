public class SecondsInADay13 {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int allSeconds = 86400;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        System.out.println(allSeconds - (currentHours * 3600 + currentHours * 60 + currentSeconds ));

    }
}

