import java.sql.Timestamp;

public class Task {

  public static int counter = 1;
  public String task;
  public int id;
  public Timestamp timeStamp;
  public boolean status;

  public Task() {
    task = "default";
    id = 000;
    timeStamp = new Timestamp(System.currentTimeMillis());
    status = true;
  }

  public Task(String task) {
    this.task = task;
    this.timeStamp = new Timestamp(System.currentTimeMillis());
    status = true;
    this.id = counter;
    counter++;
  }
}

