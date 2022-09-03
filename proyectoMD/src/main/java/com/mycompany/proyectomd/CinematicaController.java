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
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CinematicaController implements Initializable {


    @FXML
    private Label lblTituloNivel;
    @FXML
    private Button btnJugar;
    @FXML
    private ImageView imgviewPersonaje;
    @FXML
    private Label lblTextoCinematica;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarCampos();
    }    
    
    @FXML
    private void nivel1(ActionEvent event) throws IOException {
        App.setRoot("nivel1");
    }
    
    
    
    
    
    private void llenarCampos(){
        cargarImagen("batman.jpg");
        lblTituloNivel.setText("Batman necesita tu ayuda!");
        lblTextoCinematica.setText("Hola amigo, para mi siguiente misión necesito tu ayuda.\nDebo "
                + " encontrar los enemigos de todos los superheroes que te\n mostraré en pantalla.\n"
                + " Cuento contigo!");
    }
    
    
    private void cargarImagen(String ruta){
        try (FileInputStream input = new FileInputStream(App.pathImg + ruta)) {
            Image image = new Image(input,500,500,false,false);
            imgviewPersonaje.setImage(image);

        } catch (IOException e) {
            System.out.println("No se encuentra la imagen");
        }

    }
    
    

   

}
