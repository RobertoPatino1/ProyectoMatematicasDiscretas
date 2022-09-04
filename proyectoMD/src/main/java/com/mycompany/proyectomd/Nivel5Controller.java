/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomd;

import com.mycompany.proyectomd.App;
import com.mycompany.proyectomd.App;
import com.mycompany.proyectomd.App;
import com.mycompany.proyectomd.VistaPersonajeController;
import com.mycompany.proyectomd.VistaPersonajeController;
import com.mycompany.proyectomd.VistaPersonajeController;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;

import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modelo.Lector;
/**
 * FXML Controller class
 *
 * @author Det-Pc
 */
public class Nivel5Controller implements Initializable {


    @FXML
    private ImageView imgDuende1;
    @FXML
    private TextField txtDuende;
    @FXML
    private ImageView imgLexLuthor1;
    @FXML
    private TextField txtLex;
    @FXML
    private ImageView imgGuason1;
    @FXML
    private TextField txtGuason;
    @FXML
    private ImageView imgMrFreeze1;
    @FXML
    private TextField txtMrFreeze;
    @FXML
    private ImageView imgThanos1;
    @FXML
    private TextField txtThanos;
    @FXML
    private ImageView imgDuende2;
    @FXML
    private ImageView imgGorr2;
    @FXML
    private ImageView imgGuason2;
    @FXML
    private ImageView imgLexLuthor2;
    @FXML
    private ImageView imgMrFreeze2;
    @FXML
    private ImageView imgThanos2;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarCampos();
        preCambio();
    }    
    
    @FXML
    private void swtichToResultado5(ActionEvent event) {
    }
    private void llenarCampos(){
        cargarImagen("duendeverde.jpg", imgDuende1);
        cargarImagen("duendeverde.jpg", imgDuende2);
        cargarImagen("gorr.jpg", imgGorr2);
        cargarImagen("guason.jpg", imgGuason1);
        cargarImagen("guason.jpg", imgGuason2);
        cargarImagen("lexluthor.jpg", imgLexLuthor1);
        cargarImagen("lexluthor.jpg", imgLexLuthor2);
        cargarImagen("mrfreeze.jpg", imgMrFreeze1);
        cargarImagen("mrfreeze.jpg", imgMrFreeze2);
        cargarImagen("thanos.jpg", imgThanos1);
        cargarImagen("thanos.jpg", imgThanos2);


    }
    
    
    private void cargarImagen(String ruta,ImageView contenedor){
        try (FileInputStream input = new FileInputStream(App.pathImg + ruta)) {
            Image image = new Image(input,500,500,false,false);
            contenedor.setImage(image);

        } catch (IOException e) {
            System.out.println("No se encuentra la imagen");
        }

    }
    
    
    
    private void cambiarDeVentana(){
        try {
            //muestra una nueva ventana para poder actualizar el stock de cualquier producto
            Stage st = new Stage();
            st.setTitle("Detalle");
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("vistaPersonaje.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            st.setScene(scene);
            st.show();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    private void preCambio(){
        imgDuende2.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(10);
            cambiarDeVentana();
        });
        imgGuason2.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(5);
            cambiarDeVentana();
        });
        
        imgLexLuthor2.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(6);
            cambiarDeVentana();
        });
        imgMrFreeze2.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(12);
            cambiarDeVentana();
        });
        imgThanos2.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(7);
            cambiarDeVentana();
        });
    }
}
