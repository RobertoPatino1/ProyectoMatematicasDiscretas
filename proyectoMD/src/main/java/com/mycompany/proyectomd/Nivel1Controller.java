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
import java.util.List;
import java.util.ResourceBundle;
import java.util.Stack;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
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
import javafx.stage.Stage;
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
    private void comprobarResultados(ActionEvent event) throws IOException {
//        System.out.println(comprobarResultadosBatman(entrada));
//        System.out.println(comprobarResultadosSuperman(entrada));

        App.setRoot("resultado1");
        
    }
    
    private int comprobarResultadosBatman(String entrada){
        String[] respuestas =entrada.trim().split(",");

        int r1=0;
        int r2=0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase().equals("GUASON")){

                r1 = 1;
            }
            if(respuesta.trim().toUpperCase().equals("MR.FREEZE") || respuesta.trim().toUpperCase().equals("MR. FREEZE")){
                r2=1;
            }
        }  

        return r1+r2;
    }
    
    private int comprobarResultadosSuperman(String entrada){
        String[] respuestas =entrada.trim().split(",");
        boolean resultado=false;
        int r1=0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase()=="LEX LUTHOR" || respuesta.trim().toUpperCase()=="LEXLUTHOR"){
                r1=1;
            }
        }  

        return r1;
    }
    
    
    private int comprobarSpiderman(String entrada){
        String[] respuestas =entrada.trim().split(",");

        int r1=0;
        int r2=0;
        int r3 = 0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase()=="VENOM"){
                r1=1;
            }
            if(respuesta.trim().toUpperCase()=="THANOS"){
                r2=1;
            }
            if(respuesta.trim().toUpperCase()=="DUENDE VERDE"|| respuesta.trim().toUpperCase()=="DUENDEVERDE"){
                r3=1;
            }
        }  
        
        return r1+r2+r3;
    }
    
    private int comprobarIronman(String entrada){
        String[] respuestas =entrada.trim().split(",");

        int r1=0;
        int r2=0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase()=="THANOS"){
                r1=1;
            }
            if(respuesta.trim().toUpperCase()=="LOKI"){
                r2=1;
            }
        }  
        

        return r1+r2;
    }
    
    private int comprobarResultadosThor(String entrada){
        String[] respuestas =entrada.trim().split(",");
        boolean resultado=false;
        int r1=0;
        int r2=0;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase()=="THANOS"){
                r1=1;
            }
            if(respuesta.trim().toUpperCase()=="GORR"){
                r2=1;
            }
        }
        return r1+r2;
    }
    
    
    
    
    
    
    
    private void llenarCampos1(){
        
        int puntosTotales = 0;
        for(Tarjeta t:Lector.generarHeroes()){
            VBox vbox = new VBox(10);
            Stack<String> s = new Stack<>();
            ImageView imagen = new ImageView();
            System.out.println(t.getImagen());
            try(FileInputStream input = new FileInputStream("archivos/"+t.getImagen())){
                Image foto = new Image(input, 150, 150, false, false);
                
                imagen.setImage(foto);
                
                Label lblNombre = new Label(t.getNombrePersonaje());
                
                
                
                 
                TextField respuesta = new TextField(); 
                
                respuesta.setOnKeyTyped(eh ->{
                    System.out.println("Se escrbio: "+respuesta.getText());
                    s.push(respuesta.getText());
                    
                });
                
                System.out.println(respuesta.getText());
                vbox.getChildren().addAll(imagen,lblNombre,respuesta);
                VBox.setMargin(imagen, new Insets(50, 0, 0, 20));
                VBox.setMargin(lblNombre, new Insets(0, 20, 0, 20));
                VBox.setMargin(respuesta, new Insets(0, 20, 0, 20));
                fp1.getChildren().add(vbox);
                
                if(!s.isEmpty()){
//                    System.out.println(comprobarResultadosHeroes(t.getNombrePersonaje(), s.pop()));
System.out.println(s.pop());
                }
                
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
                    cambiarDeVentana();
                    
                    
                    
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
    
    
    private int comprobarResultadosHeroes(String heroe,String entrada) {
        int resultado=0;
        if(heroe.equals("Batman")){
            resultado=comprobarResultadosBatman(entrada);
        }
        if(heroe.equals("Spiderman")){
            resultado=comprobarSpiderman(entrada);
        }
        if(heroe.equals("Ironman")){
            resultado=comprobarIronman(entrada);
        }
        if(heroe.equals("Thor")){
            resultado=comprobarResultadosThor(entrada);
        }
        if(heroe.equals("Superman")){
            resultado=comprobarResultadosSuperman(entrada);
        }
        return resultado;
    }

}
