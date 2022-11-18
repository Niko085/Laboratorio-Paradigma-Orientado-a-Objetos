package Lab3POO;

import java.util.*;

public class Main {
    
    //public static void main(String[] args) {
        // TODO code application logic here
      //  System.out.println("Hola Nico");
    //    Scanner entrada = new Scanner(System.in);
      //  int numero;
        
      //  System.out.print("Digita un numero: ");
      //  numero = entrada.nextInt();
        //
       // System.out.println("El numero es: "+numero);
    //}
    
    
    
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
        /*
        int opcion = 0;
        
        while(opcion != 4){
            menuInicial();
            Scanner entrada = new Scanner(System.in);
            opcion = entrada.nextInt();
            if (opcion == 1){
                System.out.println("\nHa seleccionado crear una imagen");
                menuImagenes();
                int pixel = 0;
                while(pixel != 4){
                    Scanner entradapixeles = new Scanner(System.in);
                    pixel = entradapixeles.nextInt();
                    if(pixel == 1){
                        System.out.println("Ha seleccionado crear una imagen de tipo bitmap");
                    }
                    else if(pixel == 2){
                        System.out.println("Ha seleccionado crear una imagen de tipo pixmap");
                    }
                    else if(pixel == 3){
                        System.out.println("Ha seleccionado crear una imagen de tipo hexmap");
                    }
                    else 
                        System.out.println("\nUps, ha seleccionado una opcion invalida, pruebe con otra");
                }
            }
            else if(opcion == 2){
                System.out.println("\nHa seleccionado modificar una imagen");
            }
            else if(opcion == 3){
                System.out.println("\nHa seleccionado visualizar la imagen");
            }
            else
                System.out.println("\nUps, ha seleccionado una opcion invalida, pruebe con otra");
        }
        
        System.out.println("Hasta luego ;)");

        */
        
        //int opcion = menuInicial();
        int cantidad;
        int x;
        int y;
        int bit;
        int depth;
        
        System.out.println("Ingrese la cantidad de pixeles: ");
        
        Scanner entrada = new Scanner(System.in);
        cantidad = entrada.nextInt();
        
        Pixbitd_205769706_GajardoPonce pixeles[] = new Pixbitd_205769706_GajardoPonce[cantidad];

        
        
        for(int i=0; i<pixeles.length;i++){
            System.out.println("\nIngrese los datos del pixel N-"+(i+1)+"");
            System.out.println("Introduzca x: ");
            x = entrada.nextInt();
            System.out.println("Intoduzca y: ");
            y = entrada.nextInt();
            System.out.println("Introduzca el bit: ");
            bit = entrada.nextInt();
            System.out.println("Introduzca la profundidad: ");
            depth = entrada.nextInt();
            
            pixeles[i] = new Pixbitd_205769706_GajardoPonce(x,y,bit,depth);
        }
        
        //System.out.println(pixeles[0].mostrarDatos());
        
        System.out.println("Los pixeles ingresados son: ");
        for(int i=0; i<pixeles.length;i++){
            System.out.println("\nDatos del pixel N-"+(i+1)+"");
            System.out.println(pixeles[i].mostrarDatos());
        }
        

    }
    
}
