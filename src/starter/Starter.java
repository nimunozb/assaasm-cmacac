/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nimunozb
 */
public class Starter {

    private Vet vet=new Vet();
    ArrayList<Person> person=new ArrayList();
    public ArrayList memoriadinamica=new ArrayList();
    File archivo = new File("Pets.txt");

    public Starter() {
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
    
     
    
    
    public int numerodatos() throws FileNotFoundException{
     Scanner b =new Scanner(archivo);
       int contador=0;
         while(b.hasNext()){
             String word=b.next();
                     contador++;}
                return contador;}

    
   public void ReadPets() throws FileNotFoundException{
         Scanner lectura =new Scanner(archivo);
       
          for (int i = 0; i < numerodatos(); i++) {
             String word=lectura.next();
                         this.memoriadinamica.add(word);
                         }
     
         
               
          for (int i = 0; i < vet.memoriadinamica.size(); i++) {
           
              for (int j = 0; j <this.memoriadinamica.size(); j=j+6) {
               vet.memoriadinamica.get(i).setTipo((String) this.memoriadinamica.get(0+j));
              vet.memoriadinamica.get(i).setNombre((String) this.memoriadinamica.get(1+j));
              vet.memoriadinamica.get(i).setHaircolor((String) this.memoriadinamica.get(2+j));
              vet.memoriadinamica.get(i).setId((String) this.memoriadinamica.get(3+j));
              vet.memoriadinamica.get(i).person.setNombre((String) this.memoriadinamica.get(4+j));
              vet.memoriadinamica.get(i).person.setId((String) this.memoriadinamica.get(5+j));    
              
              }
             
          
          
          }
   
   
   }
    
   
    
    
   
  



    
    
    
    
    public static void main(String[] args) throws FileNotFoundException {
       
        Starter stard=new Starter();
        Vet vet=new Vet();
        stard.setVet(vet);
        Person person=new Person("nicolas","123121");
        Pet pet=new Dog("pinchin","firulais","negro",person,"perro");
        vet.memoriadinamica.add(pet);
        stard.ReadPets();
        vet.ListarPets();
        
    }
    
}
