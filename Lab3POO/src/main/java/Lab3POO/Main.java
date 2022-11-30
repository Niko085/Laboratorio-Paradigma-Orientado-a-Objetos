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
    
    
    public static void menuManipularImagen(){
        System.out.println("\n### Seleccione la opción que desee hacer con la imagen ###");
        System.out.println("    1. Es del bitmap?");
        System.out.println("    2. Es del pixmap?");
        System.out.println("    3. Es del hexmap?");
        System.out.println("    4. Volver");
        System.out.print("INTRODUZCA SU OPCION: ");
    }
 
    
    
    
    
    
    public static void main(String[] args) {
        int ancho,alto;
        int opcion = 0;
        int tipo = 0;
        Imagen img = null;
        
         while(opcion != 4){
            menuInicial();
            Scanner entrada = new Scanner(System.in);
            opcion = entrada.nextInt();
            
            if (opcion == 1){
                System.out.println("\nHa seleccionado crear una imagen");
                
                System.out.println("\nIngrese el ancho de la imagen: ");
                ancho = entrada.nextInt();
                
                System.out.println("Ingrese el alto de la imagen: ");
                alto = entrada.nextInt();
                
                System.out.println("\nSeleccione el tipo de imagen que desea crear");
                
                menuImagenes();
                //int seleccion;
                while(tipo != 4){
                    Scanner entradapixeles = new Scanner(System.in);
                    tipo = entradapixeles.nextInt();
                    switch (tipo) {
                        case 1:
                            {
                                System.out.println("Ha seleccionado crear una imagen de tipo bitmap");
                                img = new Imagen(ancho,alto,tipo);
                                tipo=4;
                                //seleccion = 1;
                                break;
                            }
                        case 2:
                            {
                                System.out.println("Ha seleccionado crear una imagen de tipo pixmap");
                                img = new Imagen(ancho,alto,tipo);
                                tipo=4;
                                //seleccion = 2;
                                break;
                            }
                        case 3:
                            {
                                System.out.println("Ha seleccionado crear una imagen de tipo hexmap");
                                img = new Imagen(ancho,alto,tipo);
                                tipo=4;
                                //seleccion = 3;
                                break;
                            }
                        default:
                            System.out.println("\nUps, ha seleccionado una opcion invalida, pruebe con otra");
                            break;
                    }
                }
                tipo = 0;
            }
            else if(opcion == 2){
                System.out.println("\nHa seleccionado modificar una imagen");
                if(img == null){
                    System.out.println("Aun no ha creado una imagen");
                }
                else{
                    menuManipularImagen();
                }
                
            }
            else if(opcion == 3){
                System.out.println("\nHa seleccionado visualizar la imagen");
                if(img == null){
                    System.out.println("\nAun no ha creado una imagen");
                }
                else{
                    img.mostrarElementos();
                }
            }
            else if(opcion < 1 ){
                System.out.println("\nUps, ha seleccionado una opcion invalida, pruebe con otra");
            }
            else if(opcion > 4 ){
                System.out.println("\nUps, ha seleccionado una opcion invalida, pruebe con otra");
            }
        }
        System.out.println("Ha cerrado el editor de imagenes, hasta luego ;)");
        
        
    }
}