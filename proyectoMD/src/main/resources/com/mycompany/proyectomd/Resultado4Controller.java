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

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * FXML Controller class
 *
 * @author Det-Pc
 */
public class Resultado4Controller implements Initializable {


    @FXML
    private ImageView img;
    @FXML
    private Label lbl1;
    @FXML
    private Label lbl2;
    @FXML
    private Label lbl3;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarCampos();
    }    
    
    @FXML
    private void switchToCinematica5(ActionEvent event) {
    }
    
    
    private void llenarCampos(){
        cargarImagen("thor.jpg");
        lbl1.setText("\"Muchas gracias compañero. Esta información me ayudará mucho.\nAlgo curioso es que la relación se puede aplicar entre los heroes mismos.\nUn spiderman puede trepar muros así como otro spiderman del multiverso!\nEste tipo de relacion se conoce como:");
        
        lbl2.setText("REFLEXIVA");
        
        lbl3.setText("Usaremos estos datos para el futuro.\nMuchas gracias por tu ayuda compañero!\"");
    }
    
    
    private void cargarImagen(String ruta){
        try (FileInputStream input = new FileInputStream(App.pathImg + ruta)) {
            Image image = new Image(input,500,500,false,false);
            img.setImage(image);

        } catch (IOException e) {
            System.out.println("No se encuentra la imagen");
        }

    }
    
    

}