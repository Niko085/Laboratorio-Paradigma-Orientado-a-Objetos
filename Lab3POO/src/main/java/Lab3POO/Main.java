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
        System.out.println("    1. Es del tipo bitmap?");
        System.out.println("    2. Es del tipo pixmap?");
        System.out.println("    3. Es del tipo hexmap?");
        System.out.println("    4. Esta comprimida?");
        System.out.println("    5. Voltear horizontalmente");
        System.out.println("    6. Voltear verticalmente");
        System.out.println("    7. Recortar la imagen");
        System.out.println("    8. Transformar RGB a Hexadecimal");
        System.out.println("    9. Realizar histograma");
        System.out.println("    20. Volver");
        System.out.print("INTRODUZCA SU OPCION: ");
    }
 
    
    public static void main(String[] args) {
        int x1,y1,x2,y2;
        int ancho =0;
        int alto = 0;
        int opcion = 0;
        int tipo = 0;
        int eleccion = 0;
        Imagen img = new Imagen(1,1,1);
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        

/*

        Pixbit pixeles[][] = new Pixbit[3][3];
        pixeles[0][0] = new Pixbit(0,0,1,1);
        pixeles[0][1] = new Pixbit(0,1,2,0);
        pixeles[0][2] = new Pixbit(0,2,4,0);
        pixeles[1][0] = new Pixbit(1,0,3,1);
        pixeles[1][1] = new Pixbit(1,1,4,0);
        pixeles[1][2] = new Pixbit(1,2,4,1);
        pixeles[2][0] = new Pixbit(2,0,4,0);
        pixeles[2][1] = new Pixbit(2,1,4,1);
        pixeles[2][2] = new Pixbit(2,2,4,0);

        
        img.setAncho(3);
        img.setAlto(3);
        img.setTipo(1);
        img.setPixelesbit(pixeles);
        
        
        String hexaa = String.format("#%02X%02X%02X", 255,255,255);
        System.out.println(hexaa);




*/




        Pixrgb pixeles[][] = new Pixrgb[3][3];
        pixeles[0][0] = new Pixrgb(0,0,1,255,255,255);
        pixeles[0][1] = new Pixrgb(0,1,2,2,2,2);
        pixeles[0][2] = new Pixrgb(0,2,4,3,3,3);
        pixeles[1][0] = new Pixrgb(1,0,3,4,4,4);
        pixeles[1][1] = new Pixrgb(1,1,4,5,5,5);
        pixeles[1][2] = new Pixrgb(1,2,4,6,6,6);
        pixeles[2][0] = new Pixrgb(2,0,4,7,7,7);
        pixeles[2][1] = new Pixrgb(2,1,4,8,8,8);
        pixeles[2][2] = new Pixrgb(2,2,4,9,9,9);
        
  
        img.setAncho(3);
        img.setAlto(3);
        img.setTipo(2);
        img.setPixelesrgb(pixeles);




/*



        Pixhex pixeles[][] = new Pixhex[3][3];
        pixeles[0][0] = new Pixhex(0,0,1,"h");
        pixeles[0][1] = new Pixhex(0,1,2,"o");
        pixeles[0][2] = new Pixhex(0,2,4,"l");
        pixeles[1][0] = new Pixhex(1,0,3,"a");
        pixeles[1][1] = new Pixhex(1,1,4,"c");
        pixeles[1][2] = new Pixhex(1,2,4,"o");
        pixeles[2][0] = new Pixhex(2,0,4,"m");
        pixeles[2][1] = new Pixhex(2,1,4,"o");
        pixeles[2][2] = new Pixhex(2,2,4,"e");

        
        img.setAncho(3);
        img.setAlto(3);
        img.setTipo(3);
        img.setPixeleshex(pixeles);

*/


        while(opcion != 4){
            menuInicial();
            opcion = entrada.nextInt();
            
            if (opcion == 1){
                System.out.println("\nHa seleccionado crear una imagen");
               
                System.out.println("\nSeleccione el tipo de imagen que desea crear");
                menuImagenes();
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
                                img.mostrarElementos();
                                tipo=4;
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
                                img.mostrarElementos();
                                tipo=4;
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
                                img.mostrarElementos();
                                tipo=4;
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
                        switch (eleccion) {
                            case 1:
                                int bitmap = img.isBitmap();
                                if(bitmap == 1){
                                    System.out.println("\nEs del tipo bitmap");
                                }
                                else{
                                    System.out.println("\nNo es del tipo bitmap");
                                }   break;
                            case 2:
                                int pixmap = img.isPixmap();
                                if(pixmap == 1){
                                    System.out.println("\nEs del tipo pixmap");
                                }
                                else{
                                    System.out.println("\nNo es de tipo pixmap");
                                }   break;
                            case 3:
                                int hexmap = img.isHexmap();
                                if(hexmap == 1){
                                    System.out.println("\nEs del tipo hexmap");
                                }
                                else{
                                    System.out.println("\nNo es de tipo hexmap");
                                }   break;
                            case 4:
                                int comprimida = img.isCompressed(ancho,alto);
                                if(comprimida == 1){
                                    System.out.println("\nLa imagen esta comprimida");
                                }
                                else{
                                    System.out.println("\nLa imagen no esta comprimida");
                                }   break;
                            case 5:
                                img.flipH();
                                break;
                            case 6:
                                img.flipV();
                                break;
                            case 7:
                                System.out.println("Ingrese el valor x1");
                                x1 = entrada.nextInt();
                                System.out.println("Ingrese el valor y1");
                                y1 = entrada.nextInt();
                                System.out.println("Ingrese el valor x2");
                                x2 = entrada.nextInt();
                                System.out.println("Ingrese el valor y2");
                                y2 = entrada.nextInt();

                                img.crop(x1,y1,x2,y2);
                                //img.crop(0,1,1,2);
                                break;
                            case 8:
                                img.imgRGBToHex();
                                break;
                            default:
                                break;
                        }
                    }
                    eleccion = 0;                    
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
            else if(opcion <= 0 ){
                System.out.println("\nUps, ha seleccionado una opcion invalida, pruebe con otra");
            }
            else if(opcion >= 5 ){
                System.out.println("\nUps, ha seleccionado una opcion invalida, pruebe con otra");
            }
        }
        System.out.println("Ha cerrado el editor de imagenes, hasta luego ;)");
        
        
    }
}