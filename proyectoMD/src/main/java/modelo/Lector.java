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
        
        //BATMAN
        LinkedList<String> gustosBatman = new LinkedList<>();
        gustosBatman.add("Murciélagos");
        gustosBatman.add("Cuevas");
        gustosBatman.add("Atrapar villanos");
        gustosBatman.add("Hacer ejercicio");
        LinkedList<String> poderesBatman = new LinkedList<>();
        //Creando las tarjetas
        Tarjeta batman = new Tarjeta("Batman","Bruno Díaz", 26, "Negro", poderesBatman, "Ciudad Gótica","Negros",gustosBatman);
        
        
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
        caracteristicasSpiderman.add("Trepar paredes");
        caracteristicasSpiderman.add("Sentido Arácnido");
        //Creando las tarjetas
        Tarjeta spiderman = new Tarjeta("Spider-Man","Peter Parker", 17, "Castaño", poderesSpiderman, "Nueva York","Café",gustosSpiderman);
        spiderman.setCaracteristicasExtra(caracteristicasSpiderman);
        
        
        /*
        Ironman
        Thor
        Wonderman
        */
    }
    
    
 
}
