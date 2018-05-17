public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo


        String first = "My todo:\n";
        String whole = first.concat(todoText);
        whole +=  " - Download games\n";
        whole +=  "      - Diablo\n";

        System.out.println(whole);
    }
}
