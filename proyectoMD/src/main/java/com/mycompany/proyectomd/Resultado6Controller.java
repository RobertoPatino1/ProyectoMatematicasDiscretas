/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomd;

import com.mycompany.proyectomd.App;
import static com.mycompany.proyectomd.Resultado2Controller.totalPuntos;
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
    @FXML
    private Label lblTotalPuntos;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarCampos();
        lblTotalPuntos.setText("Obtuviste "+totalPuntos+" puntos de un total de 15");
    }    
    
    @FXML
    private void finDelJuego(ActionEvent event) throws IOException {
       //Se cambia a la ventana final
       App.setRoot("finJuego");
        
    }
    /*
    "Muchas gracias por tu ayuda. Esta relación cumple las propiedades para ser tanto reflexiva(porque los personajes 
    pueden tener su propia altura), transitiva(porque si spiderman es mas bajo que ironman e ironman mas bajo que thor entonces spiderman es mas bajo que ironman) y antisimetrica(porque 
    nunca se dará el caso en el que superman sea mas bajo que batman pero siempre se dará que batman sea mas bajo que superman). 
    Cuando una relación cumple con estas 3 propiedades se la conoce como: relacion de orden"
    */
    private void llenarCampos(){
        cargarImagen("venom.jpg");
        lbl1.setText("\"Esta relación cumple las propiedades para ser reflexiva,ya que por ejemplo:\n spiderman mide lo mismo que spiderman\n" +
",transitiva, porque si spiderman es mas bajo que ironman y ironman  es mas bajo que thor\n entonces spiderman es mas bajo que ironman y finalmente antisimetrica, porque\n" +
"nunca se dará el caso en el que superman sea mas bajo que batman \npero siempre se dará que batman sea mas bajo que superman.\n" +
"Cuando una relación cumple con estas 3 propiedades se la conoce como: relacion de orden");
        
        lbl2.setText("RELACION DE ORDEN");
        
        lbl3.setText("\nMuchas gracias por tu ayuda. \"");
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
