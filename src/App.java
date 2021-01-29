import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
/*  
    Instructions ( by Maldo )
    Download lib, set environmen variable for path lib sfx 14.0.2, go 
    cd src folder App, execute nexT commands in terminal: 

    set PATH_TO_FX="C:\Java\javafx-sdk-11.0.2\lib"

    For Compile: 
    javac --module-path %PATH_TO_FX% --add-modules javafx.controls App.java
    For Transitive Modules:
    javac --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml App.java
    For run APP :
    java --module-path %PATH_TO_FX% --add-modules javafx.controls App

    ++more info in: 
    https://www.youtube.com/watch?v=I4J5_IWDeEo 
    https://openjfx.io/openjfx-docs/#install-javafx 

    

*/
public class App extends Application {

   
    @Override
    public void start(Stage primaryStage) throws Exception {
       
    }
    public static void main(String[] args) {
        launch(args);
    }
}