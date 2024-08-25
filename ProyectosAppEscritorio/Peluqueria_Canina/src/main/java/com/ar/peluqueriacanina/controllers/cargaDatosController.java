package com.ar.peluqueriacanina.controllers;
import com.ar.peluqueriacanina.models.Duenio;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
public class cargaDatosController {
    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtRaza;

    @FXML
    private TextField txtColor;

    @FXML
    private TextField txtNombreDuenio;

    @FXML
    private TextField txtCelDuenio;

    @FXML
    private TextField txtObservaciones;

    @FXML
    private TextField txtAtencionEspecial;

    @FXML
    void guardarDatos(ActionEvent event) {

        Duenio duenio = new Duenio();
        duenio.setNombre(txtNombreDuenio.getText());
        duenio.setDireccion(txtCelDuenio.getText());


    }

    @FXML
    void limpiarMascota(ActionEvent event) {
        txtNombre.setText("");
        txtNombreDuenio.setText("");
        txtAtencionEspecial.setText("");
        txtColor.setText("");
        txtCelDuenio.setText("");
        txtRaza.setText("");
        txtObservaciones.setText("");

    }

}
