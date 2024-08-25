package controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Escuela;
import model.Estudiante;

import java.util.Properties;

public class CrudEstudianteController {
    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtNumMatri;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TableView<Estudiante> tblEstudiantes;

    private Escuela escuela;

    @FXML
    private TableColumn<Estudiante, String> ColNombre; //Le pasamos los tipos a la tabla

    @FXML
    private TableColumn<Estudiante, String> ColApellido;

    @FXML
    private TableColumn<Estudiante, String> ColMatricula;

    @FXML
    private TableColumn<Estudiante, String> ColTelefono;

    @FXML
    void actualizarEstudiante(ActionEvent event) {

        Estudiante estudiante = new Estudiante();
        estudiante.setNumeroMatricula(txtNumMatri.getText());
        estudiante.setNombre(txtNombre.getText());
        estudiante.setApellido(txtApellido.getText());
        estudiante.setTelefono(txtTelefono.getText());

        escuela.actualizarEstudiante(estudiante);
        limpiarCampos();
        actualizarTabla();


    }

    @FXML
    void eliminarEstudiante(ActionEvent event) {
        eliminarEstudiante();
    }
    public void eliminarEstudiante(){

        Estudiante estudiante = tblEstudiantes.getSelectionModel().getSelectedItem();

        escuela.eliminarEstudiante(estudiante);

        actualizarTabla();
    }
    @FXML
    void guardarEstudiante(ActionEvent event) {

        guardarEstudiante();
    }

    public void guardarEstudiante(){
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(txtNombre.getText());
        estudiante.setApellido(txtApellido.getText());
        estudiante.setTelefono(txtTelefono.getText());
        estudiante.setNumeroMatricula(txtNumMatri.getText());

        escuela.addEstudiante(estudiante);
        actualizarTabla();
        limpiarCampos();
    }

    private void actualizarTabla() {
        tblEstudiantes.getItems().clear();
        tblEstudiantes.getItems().addAll(escuela.getListaEstudiantes());
        tblEstudiantes.refresh();


    }

    public Escuela getEscuela() {
        return escuela;

    }
    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    private void limpiarCampos(){

        txtApellido.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtNumMatri.setText("");

        txtNumMatri.setEditable(true);
    }

    @FXML
    void initialize(){ // Iniciaiza el controlador antees de inicar la vista

        ColNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        ColApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        ColTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        ColMatricula.setCellValueFactory(new PropertyValueFactory<>("numeroMatricula"));

        tblEstudiantes.setOnMouseClicked(mouseEvent -> {
            if(tblEstudiantes.getSelectionModel().getSelectedItem() != null) cargarCampos();
        });

    }

    private void cargarCampos() {

        Estudiante estudiante = tblEstudiantes.getSelectionModel().getSelectedItem();

        txtTelefono.setText(estudiante.getTelefono());
        txtApellido.setText(estudiante.getApellido());
        txtNombre.setText(estudiante.getNombre());
        txtNumMatri.setText(estudiante.getNumeroMatricula());

        txtNumMatri.setEditable(false);


    }


}
