import javafx.application.Application;
import javafx.stage.Stage;

/**
 * A GUI for Duke using FXML.
 */
public class Main extends Application {

    private Duke duke = new Duke();

    @Override
    public void start(Stage stage) {
        MainWindow mainWindow = new MainWindow(stage);
        mainWindow.setDuke(duke);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
