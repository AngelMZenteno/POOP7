/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author Zenteno Loyola Angel Maurice
 * Es un animal aereo con nombre, lugar de origen, color y numero de alas.
 */
public class AnimalAereo extends Animal {
    private int numeroAlas;
    /**
     * constructor vacio
     */
    public AnimalAereo() {
    }
    /**
     * 
     * @param numeroAlas:numero de alas que tiene el animal aereo
     * @param nombre: nombre del animal aereo
     * @param lugarOrigen: lugar de origen del animal aereo
     * @param color: el color del animal aereo
     */
    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }
    /**
     * Metodo getNumeroAlas
     * @return el numero de alas del animal aereo
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }
    /**
     * Metodo setNumeroAlas
     * @param numeroAlas Modifica el numero de alas del animal aereo
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    /**
     * Imprime que esta volando
     */
    public void volar(){
        System.out.println("Estoy volando");
    }
    /**
     * Imprime que esta comiendo
     * Sobreescritura 
     */
    @Override
    public void comer(){
        System.out.println("Estoy comiendo");
    }   
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos 
     */
    @Override
    public String toString() {
        return "AnimalAereo{" + "numeroPatas=" + numeroAlas +", "+ super.toString()+'}';
    }
    
}
