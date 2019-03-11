/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starter;

/**
 *
 * @author nimunozb
 */
public class Hamster extends Pet{

    public Hamster(String id, String nombre, String haircolor, Person person, String tipo) {
        super(id, nombre, haircolor, person, tipo);
    }

   
   

   
    
    public void sound(){
        System.out.println("guau");
    }
    
    
}
