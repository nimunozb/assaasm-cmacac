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
public class Person {
 
    private String nombre;
    private String id;
    private Pet pets;

    public Person(String nombre, String id, Pet pets) {
        this.nombre = nombre;
        this.id = id;
        this.pets = pets;
    }
    
            
      public Person(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
    
}
