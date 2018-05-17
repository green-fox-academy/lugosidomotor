public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long

        int workday = 5;
        int codperday = 6;
        int weeks = 14;
        int avgwork = 52;


        System.out.println("Hours spent by coding: "+ workday * codperday * weeks);
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        System.out.println("Percentage of the coding hours: "+ ((float) ( codperday * workday) / avgwork) *100 + "%");
    }
}