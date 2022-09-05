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
public class Resultado6Controller implements Initializable {

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
    private void finDelJuego(ActionEvent event) {
       //Se cambia a la ventana final
        
    }
    private void llenarCampos(){
        cargarImagen("venom.jpg");
        lbl1.setText("\"Buen trabajo amigo!\nAhora que conozco las alturas de cada villano puedo saber\ncomo ordenarlos de manera efectiva. \nEsta relación se conoce como relación:");
        
        lbl2.setText("ANTISIMETRICA");
        
        lbl3.setText("\nLa relacion es antisimetrica ya que puedes decir que\nyo soy mas alto que el guason, pero\nel guason nunca será mas alto que mí.\nGracias a ti puedo decir que las alturas son\nperfectamente equilibradas.\nComo todo deberia estar\"");
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
