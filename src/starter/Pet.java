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
public abstract class  Pet {
    
    protected String id;
    protected String nombre;
    protected String haircolor;
    protected Person person;
    protected String tipo;

    public Pet(String id, String nombre, String haircolor, Person person, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.haircolor = haircolor;
        this.person = person;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   

  
    
    
    
    
    
    abstract void sound();








}
