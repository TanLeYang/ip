import java.io.IOException;

import duke.Duke;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * A GUI for Duke using FXML.
 */
public class Main extends Application {

    private Duke duke = new Duke();

    public Main() throws IOException {
    }

    @Override
    public void start(Stage stage) {
        MainWindow mainWindow = new MainWindow();
        Scene scene = new Scene(mainWindow);
        scene.getStylesheets().add("/styles/styles.css");
        stage.setScene(scene);
        mainWindow.setDuke(duke);
        stage.show();
    }
}