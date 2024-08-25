package com.ar.peluqueriacanina.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class principalController {

    @FXML
    void cargaDatoView(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/CargaDatos.fxml"));
        //Cargamos al padre
        Parent root = loader.load();
        cargaDatosController cargaControlador = loader.getController();

        Scene scene = new Scene (root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();

    }

    @FXML
    void salir(ActionEvent event) {

    }

    @FXML
    void verDatoView(ActionEvent event) {

    }

}


