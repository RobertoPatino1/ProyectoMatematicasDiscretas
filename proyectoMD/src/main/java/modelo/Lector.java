/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;


public class Lector {
    public static LinkedList<Tarjeta> generarTarjetas(){
        LinkedList<Tarjeta> listaRetorno = new LinkedList<>();
        
        /*
        ###################################
        BATMAN
        ###################################
        */
        LinkedList<String> gustosBatman = new LinkedList<>();
        gustosBatman.add("Murciélagos");
        gustosBatman.add("Cuevas");
        gustosBatman.add("Atrapar villanos");
        gustosBatman.add("Hacer ejercicio");
        
        LinkedList<String> poderesBatman = new LinkedList<>();
        
        LinkedList<String> caracteristicasBatman = new LinkedList<>();
        caracteristicasBatman.add("Es millonario");
        caracteristicasBatman.add("Es muy inteligente");
        caracteristicasBatman.add("Es muy disciplinado");
        //Creando las tarjetas
        Tarjeta batman = new Tarjeta("Batman","Bruno Díaz", 26, "Negro", poderesBatman, "Ciudad Gótica","Negros",gustosBatman);
        batman.setCaracteristicasExtra(caracteristicasBatman);
        batman.setImagen("batman.jpg");
        
        
        
        /*
        ###################################
        SPIDER-MAN
        ###################################
        */
        LinkedList<String> gustosSpiderman = new LinkedList<>();
        gustosSpiderman.add("Comer pizza");
        gustosSpiderman.add("Estudiar");
        gustosSpiderman.add("Atrapar villanos");
        gustosSpiderman.add("Disfrutar con amigos");
        gustosSpiderman.add("Arañas");
        
        LinkedList<String> poderesSpiderman = new LinkedList<>();
        poderesSpiderman.add("Fuerza sobrehumana");
        poderesSpiderman.add("Trepar paredes");
        poderesSpiderman.add("Sentido Arácnido");
        
        LinkedList<String> caracteristicasSpiderman = new LinkedList<>();
        caracteristicasSpiderman.add("Usa lentes");
        caracteristicasSpiderman.add("Es muy inteligente");
        caracteristicasSpiderman.add("Es muy amigable");
        //Creando las tarjetas
        Tarjeta spiderman = new Tarjeta("Spider-Man","Peter Parker", 17, "Castaño", poderesSpiderman, "Nueva York","Café",gustosSpiderman);
        spiderman.setCaracteristicasExtra(caracteristicasSpiderman);
        spiderman.setImagen("spiderman.jpg");
        
        /*
        ###################################
        SUPER-MAN
        ###################################
        */
        LinkedList<String> gustosSuperman = new LinkedList<>();
        gustosSuperman.add("Trabajar");
        gustosSuperman.add("La justicia");
        gustosSuperman.add("Disfrutar con amigos");
  
        
        LinkedList<String> poderesSuperman = new LinkedList<>();
        poderesSuperman.add("Fuerza sobrehumana");
        poderesSuperman.add("Volar");
        poderesSuperman.add("Vision de rayos x");
        poderesSuperman.add("Vision de rayos laser");
        poderesSuperman.add("Aliento helado");
        
        LinkedList<String> caracteristicasSuperman = new LinkedList<>();
        caracteristicasSuperman.add("Usa lentes");
        caracteristicasSuperman.add("Trabaja en una empresa de periódicos");
        caracteristicasSuperman.add("Es muy amigable");
        
        //Creando las tarjetas
        Tarjeta superman = new Tarjeta("Super-Man","Clark Kent", 28, "Castaño", poderesSuperman, "Metrópolis","Café",gustosSuperman);
        superman.setCaracteristicasExtra(caracteristicasSuperman);
        superman.setImagen("superman.jpg");
        
        
        /*
        Ironman
        Thor
        Wonderman
        */
        return listaRetorno;
    }
    
    
 
}
