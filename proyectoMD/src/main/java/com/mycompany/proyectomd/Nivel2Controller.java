/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomd;

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
public class Nivel2Controller implements Initializable {


    @FXML
    private ImageView imgvSuperman;
    @FXML
    private TextField txtSuperman1;
    @FXML
    private ImageView imgvSpiderman;
    @FXML
    private TextField txtSpiderman1;
    @FXML
    private ImageView imgvThor;
    @FXML
    private TextField txtThor1;
    @FXML
    private ImageView imgvIronman;
    @FXML
    private TextField txtIronman1;
    @FXML
    private ImageView imgvSuperman2;
    @FXML
    private ImageView imgvSpiderman2;
    @FXML
    private ImageView imgvThor2;
    @FXML
    private ImageView imgvIronman2;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarCampos();
        preCambio();
    }    

    @FXML
    private void switchToComprobacion(ActionEvent event) {
        //Se pasa a la ventana de comprobacion
    }
    
    
    
    private void llenarCampos(){
        cargarImagen("superman.jpg", imgvSuperman);
        cargarImagen("superman.jpg", imgvSuperman2);
        cargarImagen("spiderman.jpg", imgvSpiderman);
        cargarImagen("spiderman.jpg", imgvSpiderman2);
        cargarImagen("thor.jpg", imgvThor);
        cargarImagen("thor.jpg", imgvThor2);
        cargarImagen("ironman.jpg", imgvIronman);
        cargarImagen("ironman.jpg", imgvIronman2);

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
        imgvSuperman2.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(2);
            cambiarDeVentana();
        });
        imgvSpiderman2.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(1);
            cambiarDeVentana();
        });
        
        imgvThor2.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(4);
            cambiarDeVentana();
        });
        imgvIronman2.setOnMouseClicked(eh->{
            VistaPersonajeController.personaje = Lector.generarTarjetas().get(3);
            cambiarDeVentana();
        });
    }
}
