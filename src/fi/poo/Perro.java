/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author Angel Z
 */
public class Perro extends AnimalTerrestre {
    private String colorCollar;
    /**
     * constructor vacio
     */
    public Perro() {
    }
    /**
     * 
     * @param colorCollar: el color del collar del perro
     * @param numeroPatas: el numero de patas del perro
     * @param nombre: el nombre del perro
     * @param lugarOrigen: el lugar de origen del perro
     * @param color: el color del perro 
     */
    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }
    /**
     * Metodo getColorCollar
     * @return el color del collar del perro
     */
    public String getColorCollar() {
        return colorCollar;
    }
    /**
     * Metodo setColorCollar
     * @param colorCollar Modifica el color del collar del perro
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    /**
     * Imprime que realiza trucos el perro
     */
    public void hacerTrucos(){
        System.out.println("Hago trucos");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos 
     */
    @Override
    public String toString() {
        return "Perro{" + "colorCollar=" + colorCollar +", "+ super.toString()+'}';
    }
    
   
   
   
   
   
}
