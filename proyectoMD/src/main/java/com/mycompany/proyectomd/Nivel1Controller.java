/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import modelo.Lector;
import modelo.Tarjeta;


public class Nivel1Controller implements Initializable {

    @FXML
    private Label lblTitulo;
    @FXML
    private Button btnComprobarRelacion;
    private FlowPane root;
    @FXML
    private ScrollPane scrollPane1;
    @FXML
    private ScrollPane scrollPane2;
    private AnchorPane anchorPane1;
    private AnchorPane anchorPane2;
    @FXML
    private FlowPane fp1;
    @FXML
    private FlowPane fp2;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lblTitulo.setText("Relaciona a cada héroe con su villano!");
        llenarCampos1();
        llenarCampos2();
    }    

    @FXML
    private void comprobarResultados(ActionEvent event) {
    }
    
    
    
    
    private void llenarCampos1(){
        for(Tarjeta t:Lector.generarHeroes()){
            VBox vbox = new VBox(10);
            
            ImageView imagen = new ImageView();
            System.out.println(t.getImagen());
            try(FileInputStream input = new FileInputStream("archivos/"+t.getImagen())){
                Image foto = new Image(input, 150, 150, false, false);
                
                imagen.setImage(foto);
                
                Label lblNombre = new Label(t.getNombrePersonaje());
                
                 
                TextField respuesta = new TextField();
                
                vbox.getChildren().addAll(imagen,lblNombre,respuesta);
                VBox.setMargin(imagen, new Insets(50, 0, 0, 20));
                VBox.setMargin(lblNombre, new Insets(0, 20, 0, 20));
                VBox.setMargin(respuesta, new Insets(0, 20, 0, 20));
                fp1.getChildren().add(vbox);
            }catch(FileNotFoundException e){
                System.out.println("No se encuentra el archivo");
            }catch(IOException e){
                System.out.println("IOException");
            }
            
        }
    }
    private void llenarCampos2(){
        for(Tarjeta t:Lector.generarVillanos()){
            VBox vbox = new VBox(10);
            
            ImageView imagen = new ImageView();
            System.out.println(t.getImagen());
            try(FileInputStream input = new FileInputStream("archivos/"+t.getImagen())){
                Image foto = new Image(input, 150, 150, false, false);
                
                imagen.setImage(foto);
                
                Label lblNombre = new Label(t.getNombrePersonaje());
                

                
                vbox.getChildren().addAll(imagen,lblNombre);
                
                
                vbox.setOnMouseClicked(e ->{
                    System.out.println("Se hace clic en el cuadro de: "+t.getNombrePersonaje());
                    int index = Lector.generarTarjetas().indexOf(t);
                    
                    
                    
                    
                    VistaPersonajeController.personaje = Lector.generarTarjetas().get(index);
                    
                    try {
                        App.setRoot("vistaPersonaje");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    
                    
                    
                });
                
                
                VBox.setMargin(imagen, new Insets(50, 0, 0, 20));
                VBox.setMargin(lblNombre, new Insets(0, 20, 0, 20));

                fp2.getChildren().add(vbox);
            }catch(FileNotFoundException e){
                System.out.println("No se encuentra el archivo");
            }catch(IOException e){
                System.out.println("IOException");
            }
            
        }
    }
    
    
    
    private ComboBox<Tarjeta> crearCombo(Tarjeta tarjetaOG,LinkedList<Tarjeta> lista){
        ComboBox<Tarjeta> cb = new ComboBox<>();

        for(Tarjeta t: lista){
            if(!tarjetaOG.equals(t)){
                cb.getItems().add(t);
            }
        }
        return cb;
    }
    
    
    private LinkedList<Tarjeta> getListaNivel(){
        return Lector.generarTarjetas();
    }
    
}
