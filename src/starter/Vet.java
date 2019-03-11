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
public class Vet {
    
   
    File archivo = new File("Pets.txt");
    public ArrayList<Pet> memoriadinamica=new ArrayList();

    public Vet() {
    }
    
    
    
    
    
    
    public void ListarPets() throws FileNotFoundException{
       
        PrintStream bibliotecario=new PrintStream(archivo);
        
       for (int i = 0; i < memoriadinamica.size(); i++) {
           bibliotecario.print(memoriadinamica.get(i).tipo+" "+memoriadinamica.get(i).nombre+" "+memoriadinamica.get(i).haircolor+" "+memoriadinamica.get(i).id
           +" "+memoriadinamica.get(i).person.getNombre()+" "+memoriadinamica.get(i).person.getId()
           );
       }
   }
    
    public void Remover(String id) throws FileNotFoundException{
         
        
        for (int i = 0; i < memoriadinamica.size(); i++) {
          if(id.equals( this.memoriadinamica.get(i).id)){
              this.memoriadinamica.remove(i);
          } 
           
            
            
        }
         
         
         
    }


}
