/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomd;

import com.mycompany.proyectomd.App;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * FXML Controller class
 *
 * @author Det-Pc
 */
public class Resultado1Controller implements Initializable {
        
    public static int totalPuntos;

    @FXML
    private ImageView imgvPersonaje;
    @FXML
    private Label lblTexto;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
    @FXML
    private void siguienteNivel(ActionEvent event) {
    }
    
    private void llenarCampos(){
        cargarImagen("batman.jpg");
        lblTexto.setText("Muy bien amigo, para mi siguiente misión necesito tu ayuda.\nDebo "
                + " encontrar los enemigos de todos los superheroes que te\n mostraré en pantalla.\n"
                + " Cuento contigo!");
    }
    
    
    private void cargarImagen(String ruta){
        try (FileInputStream input = new FileInputStream(App.pathImg + ruta)) {
            Image image = new Image(input,500,500,false,false);
            imgvPersonaje.setImage(image);

        } catch (IOException e) {
            System.out.println("No se encuentra la imagen");
        }

    }
}
