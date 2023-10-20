/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author Zenteno Loyola Angel Maurice
 * Es un animal terrestre con nombre, lugar de origen, color y numero de patas.
 */
public class AnimalTerrestre extends Animal {
    private int numeroPatas;
    /**
     * constructor vacio
     */
    public AnimalTerrestre() {
    }
    /**
     * 
     * @param numeroPatas: el numero de patas del animal terrestre 
     * @param nombre: el nombre del animal terrestre
     * @param lugarOrigen: el lugar de origen del animal terrestre
     * @param color: el color del animal terrestre
     */
    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }
    /**
     * Metodo getNumeroPatas
     * @return el numero de patas del animal terrestre
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }
    /**
     * Metodo setNumeroPatas
     * @param numeroPatas Modifica el numero de patas del animal terrestre
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    /**
     * Imprime que esta corriendo
     */
    public void correr(){
        System.out.println("Estoy corriendo");
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
        return "AnimalTerrestre{" + "numeroAlas=" + numeroPatas +", "+ super.toString()+'}';
    }
    
    
    
}
