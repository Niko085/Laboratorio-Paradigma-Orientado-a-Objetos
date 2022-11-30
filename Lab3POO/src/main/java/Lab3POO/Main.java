package Lab3POO;

import java.util.*;
//import java.util.Scanner;

public class Main {
      
    public static void menuInicial(){
        System.out.println("\n### Manipulador de imagenes ###");
        System.out.println("    1. Crear una imagen");
        System.out.println("    2. Interactuar con una imagen");
        System.out.println("    3. Visualizar una imagen");
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
        System.out.println("\n### Seleccione la opcion que desee hacer con la imagen ###");
        System.out.println("    1. Es del bitmap?");
        System.out.println("    2. Es del pixmap?");
        System.out.println("    3. Es del hexmap?");
        System.out.println("    4. Esta comprimida?");
        System.out.println("    5. Voltear la imagen horizontalmente");
        System.out.println("    20. Volver");
        System.out.print("INTRODUZCA SU OPCION: ");
    }
 
    
    
    
    
    
    public static void main(String[] args) {
        int ancho =0;
        int alto = 0;
        int opcion = 0;
        int tipo = 0;
        int eleccion = 0;
        Imagen img = null;
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        

         while(opcion != 4){
            menuInicial();
            opcion = entrada.nextInt();
            
            if (opcion == 1){
                System.out.println("\nHa seleccionado crear una imagen");
               
                
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
                                
                                System.out.println("\nIngrese el ancho de la imagen: ");
                                ancho = entrada.nextInt();

                                System.out.println("Ingrese el alto de la imagen: ");
                                alto = entrada.nextInt();
                                img = new Imagen(ancho,alto,tipo);
                                tipo=4;
                                //seleccion = 1;
                                break;
                            }
                        case 2:
                            {
                                System.out.println("Ha seleccionado crear una imagen de tipo pixmap");
                                
                                System.out.println("\nIngrese el ancho de la imagen: ");
                                ancho = entrada.nextInt();

                                System.out.println("Ingrese el alto de la imagen: ");
                                alto = entrada.nextInt();
                                img = new Imagen(ancho,alto,tipo);
                                tipo=4;
                                //seleccion = 2;
                                break;
                            }
                        case 3:
                            {
                                System.out.println("Ha seleccionado crear una imagen de tipo hexmap");
                                
                                System.out.println("\nIngrese el ancho de la imagen: ");
                                ancho = entrada.nextInt();

                                System.out.println("Ingrese el alto de la imagen: ");
                                alto = entrada.nextInt();
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
                    
                    
                    
                    
                    
                    
                    
                    while(eleccion != 20){
                        menuManipularImagen();
                        eleccion = entrada2.nextInt();
                        if(eleccion == 1){
                            int bitmap = img.isBitmap();
                            if(bitmap == 1){
                                System.out.println("Es del tipo bitmap");
                            }
                            else{
                                System.out.println("No es del tipo bitmap");
                            }
                        }
                        else if(eleccion == 2){
                            int pixmap = img.isPixmap();
                            if(pixmap == 1){
                                System.out.println("Es del tipo pixmap");
                            }
                            else{
                                System.out.println("No es de tipo pixmap");
                            }
                        }
                        else if(eleccion == 3){
                            int hexmap = img.isHexmap();
                            if(hexmap == 1){
                                System.out.println("Es del tipo hexmap");
                            }
                            else{
                                System.out.println("No es de tipo hexmap");
                            }
                        }
                        else if(eleccion == 4){
                            int comprimida = img.isCompressed(ancho,alto);
                            if(comprimida == 1){
                                System.out.println("La imagen esta comprimida");
                            }
                            else{
                                System.out.println("La imagen no esta comprimida");
                            }
                        }
                        else if(eleccion == 5){
                            //Pixbit Pixbit[][] = null;
                            //img.flipH();
                            Pixbit pixeles[][] = new Pixbit[2][2];
                            pixeles[0][0] = new Pixbit(0,0,3,1);
                            pixeles[0][1] = new Pixbit(0,1,3,1);
                            pixeles[1][0] = new Pixbit(1,0,3,1);
                            pixeles[1][1] = new Pixbit(1,1,3,1);
                            img.setPixelesbit(pixeles);
                            //int nuevoAncho = img.getAncho();
                            //int nuevoAlto = img.getAlto();
                            
                            for (int i=0 ; i<2 ; i++){
                                for( int j=0 ; j<2 ; j++){
                                    System.out.println(pixeles[i][j].toString());
                                }
                            }
                            System.out.println("Ahora viene a imagen modificada");
                            
                            img.mostrarElementos();
                            
                            
                        }
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                }
            }
            else if(opcion == 3){
                System.out.println("\nHa seleccionado visualizar la imagen");
                if(img == null){
                    System.out.println("\nAun no ha creado una imagen :(");
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