import static com.sun.org.apache.xalan.internal.xsltc.cmdline.Compile.printUsage;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppMain {

  public static void main(String[] args) {
    //(String) toDoList = fileReader();
    commandLine(args);
  }

  public static List<Task> toDoList = new ArrayList<>();
  public static Task task = new Task();
  public static String TaskListPath = "C:\\Users\\lugal\\OneDrive\\Desktop\\greenfox\\lugosidomotor\\week-04\\day-05\\ToDoApp\\TaskList";

  private static void printUsage (){
    System.out.println("Command Line Todo application \n" +
            "=============================\n" +
            "\n" +
            "Command Line arguments: \n" +
            " -l    List all the tasks \n" +
            " -a    Adds a new task \n" +
            " -r    Removes a task \n" +
            " -c    Completes a task");
  }

  public static void commandLine(String[] args) {

    if (args.length == 0) {
      printUsage();
    } else if (args[0].equals("-l")) {
      listTasks();
    } else if (args[0].equals("-a")) {
      addTask(args[1]);
    } else if (args[0].equals("-r")) {
      removeTask(args[1]);
    } else if (args[0].equals("-c")) {
      completeTask(args[1]);
    }
  }

  public static void addTask(String arg) {
    Task task = new Task(arg);
    toDoList.add(task);
    fileWriter();
  }

  public static void completeTask(String arg) {

    for (int i = 0; i < toDoList.size(); i++) {
      if (arg.equals(task.task)){
        task.task = "[x] " + task;
        task.status = false;
      }
    }
  }

  public static void removeTask(String task) {
  }


  public static void listTasks() {
    for (int i = 0; i < toDoList.size(); i++) {
      System.out.println(toDoList.get(i).id + " " + toDoList.get(i).task + " " + toDoList.get(i).timeStamp );
    }
  }

  public static void fileWriter () {
    try {
      Path filePath = Paths.get(TaskListPath);
      Files.write(filePath, Collections.singleton(toDoList.toString()));
    } catch (Exception e) {
      System.out.println("Uh-oh, could not write the file!");
    }
  }


  public static void fileReader () {
    try {
      Path filePath = Paths.get(TaskListPath);
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines.get(0));
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
    }
  }

}