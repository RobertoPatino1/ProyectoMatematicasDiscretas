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
        ----------------------------------
        SUPERHEROES
        ----------------------------------
        */
        
        
        
        
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
        poderesBatman.add("Experto en combate");
        poderesBatman.add("Alta resistencia");
        
        LinkedList<String> caracteristicasBatman = new LinkedList<>();
        caracteristicasBatman.add("Es millonario");
        caracteristicasBatman.add("Es muy inteligente");
        caracteristicasBatman.add("Es muy disciplinado");
        caracteristicasBatman.add("Lleva 'man' en su nombre");
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
        caracteristicasSpiderman.add("Es un vengador");
        caracteristicasSpiderman.add("Trabaja en una empresa de periódicos");
        caracteristicasSpiderman.add("Lleva 'man' en su nombre");
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
        poderesSuperman.add("Resistencia sobrehumana");
        poderesSuperman.add("Volar");
        poderesSuperman.add("Vision de rayos x");
        poderesSuperman.add("Vision de rayos laser");
        poderesSuperman.add("Aliento helado");
        
        LinkedList<String> caracteristicasSuperman = new LinkedList<>();
        caracteristicasSuperman.add("Usa lentes");
        caracteristicasSuperman.add("Trabaja en una empresa de periódicos");
        caracteristicasSuperman.add("Es muy amigable");
        caracteristicasSuperman.add("Lleva 'man' en su nombre");
        caracteristicasSuperman.add("Es un alien");
        //Creando las tarjetas
        Tarjeta superman = new Tarjeta("Super-Man","Clark Kent", 28, "Castaño", poderesSuperman, "Metrópolis","Café",gustosSuperman);
        superman.setCaracteristicasExtra(caracteristicasSuperman);
        superman.setImagen("superman.jpg");
        
        /*
        ###################################
        IRON-MAN
        ###################################
        */
        LinkedList<String> gustosIronman = new LinkedList<>();
        gustosIronman.add("Inventar cosas");
        gustosIronman.add("Conducir carros");
        gustosIronman.add("Disfrutar con amigos");
        gustosIronman.add("Robots");
        
        LinkedList<String> poderesIronman = new LinkedList<>();
        poderesIronman.add("Fuerza sobrehumana");
        poderesIronman.add("Volar");
        
        LinkedList<String> caracteristicasIronman = new LinkedList<>();
        caracteristicasIronman.add("Es muy inteligente");
        caracteristicasIronman.add("Es millonario");
        caracteristicasIronman.add("Es un vengador");
        caracteristicasIronman.add("Experto en ingenieria");
        caracteristicasIronman.add("Lleva 'man' en su nombre");
        
        
        //Creando las tarjetas
        Tarjeta ironman = new Tarjeta("Iron-Man","Tony Stark", 30, "Negro", poderesIronman, "California","Negro",gustosIronman);
        ironman.setCaracteristicasExtra(caracteristicasIronman);
        ironman.setImagen("ironman.jpg");
        
        
        /*
        ###################################
        THOR
        ###################################
        */
        LinkedList<String> gustosThor = new LinkedList<>();
        gustosThor.add("Inventar cosas");
        gustosThor.add("Conducir carros");
        gustosThor.add("Disfrutar con amigos");
        gustosThor.add("Robots");
        
        LinkedList<String> poderesThor = new LinkedList<>();
        poderesThor.add("Fuerza sobrehumana");
        poderesThor.add("Volar");
        poderesThor.add("Controlar el trueno");
        
        LinkedList<String> caracteristicasThor = new LinkedList<>();
        caracteristicasThor.add("Es un vengador");
        caracteristicasThor.add("Tiene un martillo");
        caracteristicasThor.add("Es un guardian de la galaxia");
        caracteristicasThor.add("Le gustan los pancakes");
        
        
        //Creando las tarjetas
        Tarjeta thor = new Tarjeta("Thor","Thor Odinson", 25, "Rubio", poderesThor, "Asgard","Café",gustosThor);
        thor.setCaracteristicasExtra(caracteristicasThor);
        thor.setImagen("thor.jpg");
        
        
        /*
        ----------------------------------
        VILLANOS
        ----------------------------------
        */
        
        /*
        ###################################
        GUASON
        ###################################
        */
        LinkedList<String> poderesGuason = new LinkedList<>();
        poderesGuason.add("Experto en combate");
        
        LinkedList<String> gustosGuason = new LinkedList<>();
        
        LinkedList<String> caracteristicasGuason = new LinkedList<>();
        caracteristicasGuason.add("Experto en quimica");
        caracteristicasGuason.add("Experto en ingenieria");

        
        
        //Creando las tarjetas
        Tarjeta guason = new Tarjeta("Guason","Guason", 32, "Verde", poderesGuason, "Ciudad Gótica","Negro",gustosGuason);
        guason.setCaracteristicasExtra(caracteristicasGuason);
        guason.setImagen("guason.jpg");
        
        
        /*
        ###################################
        LEX LUTHOR
        ###################################
        */
        LinkedList<String> podereslexLuthor = new LinkedList<>();
        podereslexLuthor.add("Experto en combate");
        
        LinkedList<String> gustosLexLuthor = new LinkedList<>();
        
        LinkedList<String> caracteristicasLexLuthor = new LinkedList<>();
        caracteristicasLexLuthor.add("Es muy inteligente");
        caracteristicasLexLuthor.add("Es millonario");
        caracteristicasLexLuthor.add("Experto en ingenieria");

        
        
        //Creando las tarjetas
        Tarjeta lexLuthor = new Tarjeta("Lex Luthor","Lex Luthor", 35, "No tiene cabello", podereslexLuthor, "Metrópolis","Verde",gustosLexLuthor);
        lexLuthor.setCaracteristicasExtra(caracteristicasLexLuthor);
        lexLuthor.setImagen("lexluthor.jpg");
        
        
        /*
        ###################################
        THANOS
        ###################################
        */
        LinkedList<String> poderesThanos = new LinkedList<>();
        poderesThanos.add("Fuerza sobrehumana");
        poderesThanos.add("Control sobre las gemas del infinito");
        poderesThanos.add("Resistencia sobrehumana");
        
        LinkedList<String> gustosThanos = new LinkedList<>();
        
        LinkedList<String> caracteristicasThanos = new LinkedList<>();
        caracteristicasThanos.add("Es un alien");
        caracteristicasThanos.add("Posee el guantelete del infinito");
        caracteristicasThanos.add("Tiene un ejército");
        caracteristicasThanos.add("Su piel es morada");

        
        
        //Creando las tarjetas
        Tarjeta thanos = new Tarjeta("Thanos","Thanos", 1000, "No tiene cabello", poderesThanos, "El espacio","Morado",gustosThanos);
        thanos.setCaracteristicasExtra(caracteristicasThanos);
        thanos.setImagen("thanos.jpg");
        
        
        /*
        ###################################
        VENOM
        ###################################
        */
        LinkedList<String> poderesVenom = new LinkedList<>();
        poderesVenom.add("Fuerza sobrehumana");
        poderesVenom.add("Trepar paredes");
        poderesVenom.add("Resistencia sobrehumana");
        poderesVenom.add("Regeneracion");
        poderesVenom.add("Sentido aracnido");
        
        LinkedList<String> gustosVenom = new LinkedList<>();
        gustosVenom.add("Chocolate");
        
        
        LinkedList<String> caracteristicasVenom = new LinkedList<>();
        caracteristicasVenom.add("Odia los sonidos fuertes");
        caracteristicasVenom.add("No le gusta el fuego");
        caracteristicasVenom.add("Es un alien");
        caracteristicasVenom.add("Trabaja en una empresa de periódicos");

        
        
        //Creando las tarjetas
        Tarjeta venom = new Tarjeta("Venom","Eddie Brock", 21, "Rubio", poderesVenom, "Nueva York","Negro",gustosVenom);
        venom.setCaracteristicasExtra(caracteristicasVenom);
        venom.setImagen("venom.jpg");
        
        
        
        /*
        ###################################
        LOKI
        ###################################
        */
        LinkedList<String> poderesLoki = new LinkedList<>();
        poderesLoki.add("Magia");
        poderesLoki.add("Cambiar de forma");
        
        LinkedList<String> gustosLoki = new LinkedList<>();
        
        
        LinkedList<String> caracteristicasLoki = new LinkedList<>();
        caracteristicasLoki.add("Es hermano de Thor");
        caracteristicasLoki.add("Es un alien");
        caracteristicasLoki.add("Estuvo aliado con Thanos");

        
        
        //Creando las tarjetas
        Tarjeta loki = new Tarjeta("Loki","Loki Laufeyson", 23, "Negro", poderesLoki, "Asgard","Negro",gustosLoki);
        loki.setCaracteristicasExtra(caracteristicasLoki);
        venom.setImagen("loki.jpg");
        
        
        
        /*

        LOKI
        DUENDE VERDE
        GORR
        MR FREEZE
        */
        
        
        
        
        
        
        
        
        
        
        
        listaRetorno.add(batman);
        listaRetorno.add(spiderman);
        listaRetorno.add(superman);
        listaRetorno.add(ironman);
        listaRetorno.add(thor);
        
        
        return listaRetorno;
    }
    
    
 
}
