import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application{

 private Pane root;

 private Parent createContent(){
   root = new Pane();
   root.setPrefSize(600,600);
   return root;
 }


  @Override
  public void start(Stage primaryStage) throws Exception {

  }
}
