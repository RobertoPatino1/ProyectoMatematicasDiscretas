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
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modelo.Tarjeta;

public class VistaPersonajeController implements Initializable {
    boolean fin = false;

    @FXML
    public Label lblTitulo;
    @FXML
    private ImageView imgview;
    
    public static Tarjeta personaje;
    @FXML
    private Label lblNombre;
    @FXML
    private Label lblEdad;
    @FXML
    private Label lblAmigos;
    @FXML
    private Label lblEnemigos;
    @FXML
    private Label lblCabello;
    @FXML
    private Label lblGustos;
    @FXML
    private Label lblDatos;
    @FXML
    private Label amigos;
    @FXML
    private Label gustos;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(personaje!=null){
            lblTitulo.setText("");

            cargarImagen(personaje.getImagen());
            llenarCampos();
            countdown(lblTitulo);
            
            
        }else{
            System.out.println("El personaje no se ha inicializado");
        }
    }    
    
    
    
    private void cargarImagen(String ruta){
        try (FileInputStream input = new FileInputStream(App.pathImg + ruta)) {
            Image image = new Image(input,500,500,false,false);
            imgview.setImage(image);

        } catch (IOException e) {
            System.out.println("No se encuentra la imagen");
        }

    }
    
    
    private void llenarCampos(){
        lblNombre.setText(personaje.getNombrePersonaje());
        lblEdad.setText(String.valueOf(personaje.getEdad()));
        if(personaje.getAmigos().isEmpty()){
            amigos.setVisible(false);
            lblAmigos.setVisible(false);
        }else{
            lblAmigos.setText(personaje.getAmigos().toString());
        }
        
        lblEnemigos.setText(personaje.getEnemigos().toString());
        lblCabello.setText(personaje.getColorCabello());
        if(personaje.getGustos().isEmpty()){
            gustos.setVisible(false);
            lblGustos.setVisible(false);
        }else{
            lblGustos.setText(personaje.getGustos().toString());
        }
        lblDatos.setText(personaje.getCaracteristicasExtra().toString());
    }
    
    
    
    public void countdown(Label label){
        
        Thread hilo = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=15; i>=0; i--){
                    int valor = i;
                    try {
                        Thread.sleep(1000);
                        Platform.runLater(new Runnable(){
                            @Override
                            public void run(){
                                label.setText("Tiempo restante: "+String.valueOf(valor) + " segundos");
                            }
                        });
                        
                    } catch (InterruptedException ex) {
                        
                    }
                    if(valor==0){
                        final Stage stage = (Stage) label.getScene().getWindow();

                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                stage.close();
                            }
                        });   
                    }

                }
            }
            
        });
        hilo.setDaemon(true);
        hilo.start();
        


        

        
    }
    
}
