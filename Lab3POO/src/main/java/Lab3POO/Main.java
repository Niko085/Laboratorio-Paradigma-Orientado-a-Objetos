package Lab3POO;

import java.util.*;
//import java.util.Scanner;

public class Main {
      
    public static void menuInicial(){
        System.out.println("\n### Manipulador de imagenes ###");
        System.out.println("    1. Crear una imagen");
        System.out.println("    2. Modificar una imagen");
        System.out.println("    3. Visualizar imagen");
        System.out.println("    4. Salir");
        System.out.print("INTRODUZCA SU OPCION: ");
    }
    
    
    
    public static void menuImagenes(){
        System.out.println("\n### Manipulador de imagenes ###");
        System.out.println("    1. Crear bitmap");
        System.out.println("    2. Crear pixmap");
        System.out.println("    3. Crear hexmap");
        System.out.println("    4. Volver");
        System.out.print("INTRODUZCA SU OPCION: ");
    }
 
    
    
    
    
    
    public static void main(String[] args) {
        //System.out.println("Nico");
        Pixbit bit[] = new Pixbit[2];
        bit[0] = new Pixbit(1,0,1,2);
        int numero = bit[0].getY();
        System.out.println(numero);
        
    }
}