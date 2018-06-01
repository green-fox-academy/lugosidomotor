public class AppMain {


  public static void main(String[] args) {
    PrintUsage();
  }


  private static void PrintUsage (){
    System.out.println("Command Line Todo application \n" +
            "=============================\n" +
            "\n" +
            "Command Line arguments: \n" +
            " -l    List all the tasks \n" +
            " -a    Adds a new task \n" +
            " -r    Removes a task \n" +
            " -c    Completes a task");
  }
}
