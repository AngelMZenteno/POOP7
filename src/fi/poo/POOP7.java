/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fi.poo;
import transportes.MediosTransporte;
/**
 *
 * @author poo08alu45
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Animal animal= new Animal();
    animal.setNombre("Max");
    animal.setLugarOrigen("CDMX");
    animal.setColor("cafe");
    
    System.out.println(animal);    
    
    AnimalAcuatico animalAcuatico=new AnimalAcuatico();
    animalAcuatico.setNombre("Leo");
    animalAcuatico.setLugarOrigen("Africa");
    animalAcuatico.setColor("Rojo");
    animalAcuatico.setNumeroAletas(4);
    System.out.println(animalAcuatico);  
        
    Ballena ballena=new Ballena(30,2,"Wilson","Canada","gris");
    System.out.println(ballena);
    }
}
