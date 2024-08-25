package com.ar.peluqueriacanina.application;

import com.ar.peluqueriacanina.controllers.principalController;
import com.ar.peluqueriacanina.utils.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
            // Cargar el archivo FXML de la ventana principal
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Principal.fxml"));

            AnchorPane pane = loader.load();
            principalController principal = loader.getController();
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.show();

    }
    public static void main(String[] args) {
        launch();
    }

}
