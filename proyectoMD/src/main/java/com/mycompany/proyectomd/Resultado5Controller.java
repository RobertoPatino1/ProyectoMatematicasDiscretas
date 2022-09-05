/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomd;

import com.mycompany.proyectomd.App;
import com.mycompany.proyectomd.App;
import com.mycompany.proyectomd.App;
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
public class Resultado5Controller implements Initializable {

    public static int totalPuntos;
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
    private void switchToNivel6(ActionEvent event) {
        //Se cambia a la ventana del nivel 6
    }
    
    private void llenarCampos(){
        cargarImagen("thanos.jpg");
        lbl1.setText("\"Muy bien hecho!\nAhora que conozco las alturas de cada villano puedo saber\ncomo ordenarlos de manera efectiva. \nEsta relación se conoce como relación:");
        
        lbl2.setText("ANTISIMETRICA");
        
        lbl3.setText("\nLa relacion es antisimetrica ya que puedes decir que yo soy mas alto que el guason, pero\nel guason nunca será mas alto que yo.Gracias a ti puedo decir que las alturas son\nperfectamente equilibradas.Como todo deberia ser\"");
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
