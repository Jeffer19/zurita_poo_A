/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Autor;
import ec.edu.intsuperior.modelo.Biblioteca;
import ec.edu.intsuperior.modelo.Punto;
import ec.edu.intsuperior.modelo.Bicicleta;
import ec.edu.intsuperior.modelo.Libro;

/**
 *
 * @author Personal
 */

public class aplicacion {
    public static void main(String [] args){
        Punto p1 = new Punto(-1,7);
        Punto p2=new Punto();
        Bicicleta b1= new Bicicleta();
        Bicicleta b2= new Bicicleta(15, "Tundra", 325.36, 55, "verde");
        Autor au1= new Autor("1234567890", "Soledad", "Flore", "Ingeniero","1984-05-20");
        Libro l1= new Libro("la belleza en la programacion", "INT superior", au1);
        Biblioteca biblio= new Biblioteca(34,0f,55,l1,"Cayambe");
     
        
        
        System.out.println("coordenada x del punto 1;"+ p1.getX());
        System.out.println("coordenada y del punto 1;"+ p1.getY());     
    
    
        System.out.println("El autor del libro l es:"+l1.getAutor().getNombre());
     
    }
    
}
