/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomd;

import javafx.event.ActionEvent;

/**
 *
 * @author josel
 */
public class Nivel2Provisional {
    private void comprobarResultados(ActionEvent event) {
        
        
        
     
    }
    
    private boolean comprobarSpiderman(String entrada){
        String[] respuestas =entrada.split(",");
        boolean resultado=false;
        boolean r1=false;
        boolean r2=false;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase()=="SUPERMAN"){
                r1=true;
            }
            if(respuesta.trim().toUpperCase()=="THOR"){
                r2=true;
            }
        }  
        
        resultado=r1&&r2;
        return resultado;
    }
    
    private boolean comprobarSuperman(String entrada){
        String[] respuestas =entrada.split(",");
        boolean resultado=false;
        boolean r1=false;
        boolean r2=false;
        boolean r3=false;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase()=="SPIDERMAN" || respuesta.trim().toUpperCase()=="SPIDER MAN" || respuesta.trim().toUpperCase()=="SPIDER-MAN"){
                r1=true;
            }
            if(respuesta.trim().toUpperCase()=="IRONMAN" || respuesta.trim().toUpperCase()=="IRON MAN"){
                r2=true;
            }
            if(respuesta.trim().toUpperCase()=="THOR"){
                r3=true;
            }
        }  
        
        resultado=r1&&r2&&r3;
        return resultado;
    }
    
    private boolean comprobarThor(String entrada){
        String[] respuestas =entrada.split(",");
        boolean resultado=false;
        boolean r1=false;
        boolean r2=false;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase()=="SUPERMAN"){
                r1=true;
            }
            if(respuesta.trim().toUpperCase()=="SPIDERMAN" || respuesta.trim().toUpperCase()=="SPIDER MAN" || respuesta.trim().toUpperCase()=="SPIDER-MAN"){
                r2=true;
            }
        }  
        
        resultado=r1&&r2;
        return resultado;
    }
    
    private boolean comprobarIronman(String entrada){
        String[] respuestas =entrada.split(",");
        boolean resultado=false;
        boolean r1=false;
        boolean r2=false;
        for(String respuesta:respuestas){
            if(respuesta.trim().toUpperCase()=="SUPERMAN"){
                r1=true;
            }
            if(respuesta.trim().toUpperCase()=="SPIDERMAN" || respuesta.trim().toUpperCase()=="SPIDER MAN" || respuesta.trim().toUpperCase()=="SPIDER-MAN"){
                r2=true;
            }
        }  
        
        resultado=r1&&r2;
        return resultado;
    }
    
    
    
    
}
