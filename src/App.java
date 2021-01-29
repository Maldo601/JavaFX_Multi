import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/*  
    Instructions ( by Maldo )
    Download lib, set environmen variable for path lib sfx 14.0.2, go 
    cd src folder App, execute nexT commands in terminal: 

    For Compile: 
    javac --module-path "<PATH>" --add-modules javafx.conttols <nam jav file>.jav
    For run APP :
    Same but "java" ( no javac )

    ++more info in: 
    https://www.youtube.com/watch?v=I4J5_IWDeEo 
    https://openjfx.io/openjfx-docs/#install-javafx 

    Thanks, NetBeans sucks bullshit. VSCode rulez. 

*/
public class App extends Application {

    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
// M A L D O // 

