package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utilities.Path;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane load =FXMLLoader.load(getClass().getResource(Path.HOLA_MUNDO));
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }
}
