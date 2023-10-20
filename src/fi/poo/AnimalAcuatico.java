/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author Zenteno Loyola Angel Maurice
 * Es un animal acuatico con nombre, lugar de origen, color y numero de aletas.
 */
public class AnimalAcuatico extends Animal { 
    private int numeroAletas;
    
    /**
     * constructor vacio
     */
    public AnimalAcuatico() {
    }
    /**
     * 
     * @param numeroAletas: numero de aletas que tiene el animal acuatico
     * @param nombre: nombre que tiene el animal acuatico
     * @param lugarOrigen: lugar de origen del animal acuatico
     * @param color:color que tiene el animal acuatico
     */
    public AnimalAcuatico(int numeroAletas, String nombre, String lugarOrigen, String color) {
        super (nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }
    /**
     * Metodo getNumeroAletas
     * @return el numero de aletas del animal
     */
    public int getNumeroAletas() {
        return numeroAletas;
    }
    /**
     * Metodo setNumeroAletas
     * @param numeroAletas Modifica el numero de aletas del animal
     */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    /**
     * Imprime que esta comiendo
     * Sobreescritura
     */  
    @Override
    public void comer(){
        System.out.println("Ando comiendo");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos 
     */
    @Override
    public String toString() {
        return "AnimalAcuatico{" + "numeroAletas=" + numeroAletas +", "+ super.toString()+'}';
    }

    
}

