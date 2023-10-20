/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author Angel Maurice Zenteno Loyola
 * Es un pajaro con nombre, lugar de origen, color, numero de alas y tipo de pico.
 */
public class Pajaro extends AnimalAereo {
    private String tipoPico;
    /**
     * constructor vacio
     */
    public Pajaro() {
    }
    /**
     * 
     * @param tipoPico: el tipo de pico del pajaro
     * @param numeroAlas: el numero de alas del pajaro
     * @param nombre: el nombre del pajaro
     * @param lugarOrigen: el lugar de origen del pajaro
     * @param color: el color del pajaro 
     */
    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }
    /**
     * Metodo getTipoPico
     * @return el tipo de pico del pajaro
     */
    public String getTipoPico() {
        return tipoPico;
    }
    /**
     * Metodo setTipoPico
     * @param tipoPico Modifica el tipo de pico del pajaro
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    public void recolectarRamas(){
        System.out.println("Estoy recolectando ramas");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos 
     */
    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico +", "+ super.toString()+'}';
    }
            
}
