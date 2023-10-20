/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author Zenteno Loyola Angel Maurice
 * Es un animal con nombre, lugar de origen y color.
 */
public class Animal extends Object{
    private String nombre, lugarOrigen, color;
    /**
     * constructor vacio
     */
    public Animal() {
    }
    /**
     * 
     * @param nombre: nombre del animal
     * @param lugarOrigen: lugar de origen del animal
     * @param color :color del animal
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
     * Metodo getNombre
     * @return el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo setNombre
     * @param nombre Modifica el nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo getLugarOrigen
     * @return el lugar de origen del animal
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    /**
     * Metodo setLugarOrigen
     * @param lugarOrigen Modifica el lugar de origen del animal
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    /**
     * Metodo getColor
     * @return el color de origen del animal
     */
    public String getColor() {
        return color;
    }
    /**
     * Metodo setColor
     * @param color Modifica el color del animal
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Imprime el sonido que produce el animal
     * @param sonido el sonido del animal
     */
    public void sonido(String sonido){
        System.out.println(sonido);
    /**
     * Imprime que esta comiendo
     */  
    }
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
}
