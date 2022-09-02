
package modelo;

import java.util.ArrayList;
import java.util.LinkedList;


public class Tarjeta {
    private String nombrePersonaje;
    private String nombre;
    private int edad;
    private LinkedList<Tarjeta> enemigos;
    private LinkedList<Tarjeta> amigos;
    private String colorCabello;
    private LinkedList<String> poderes;
    private String ciudad;
    private String colorDeOjos;
    private LinkedList<String> gustos;
    private LinkedList<String> caracteristicasExtra;

    public Tarjeta(String nombrePersonaje, String nombre, int edad, LinkedList<Tarjeta> enemigos, LinkedList<Tarjeta> amigos, String colorCabello, LinkedList<String> poderes, String ciudad, String colorDeOjos, LinkedList<String> gustos) {
        this.nombrePersonaje = nombrePersonaje;
        this.nombre = nombre;
        this.edad = edad;
        this.enemigos = enemigos;
        this.amigos = amigos;
        this.colorCabello = colorCabello;
        this.poderes = poderes;
        this.ciudad = ciudad;
        this.colorDeOjos = colorDeOjos;
        this.gustos = gustos;
    }

    public Tarjeta(String nombrePersonaje,String nombre, int edad, String colorCabello, LinkedList<String> poderes, String ciudad, String colorDeOjos, LinkedList<String> gustos) {
        this.nombrePersonaje = nombrePersonaje;
        this.nombre = nombre;
        this.edad = edad;
        this.colorCabello = colorCabello;
        this.poderes = poderes;
        this.ciudad = ciudad;
        this.colorDeOjos = colorDeOjos;
        this.gustos = gustos;
    }
    
    
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LinkedList<Tarjeta> getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(LinkedList<Tarjeta> enemigos) {
        this.enemigos = enemigos;
    }

    public LinkedList<Tarjeta> getAmigos() {
        return amigos;
    }

    public void setAmigos(LinkedList<Tarjeta> amigos) {
        this.amigos = amigos;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public LinkedList<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(LinkedList<String> poderes) {
        this.poderes = poderes;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getColorDeOjos() {
        return colorDeOjos;
    }

    public void setColorDeOjos(String colorDeOjos) {
        this.colorDeOjos = colorDeOjos;
    }

    public LinkedList<String> getGustos() {
        return gustos;
    }

    public void setGustos(LinkedList<String> gustos) {
        this.gustos = gustos;
    }
    
    
    
    
    
    
}
