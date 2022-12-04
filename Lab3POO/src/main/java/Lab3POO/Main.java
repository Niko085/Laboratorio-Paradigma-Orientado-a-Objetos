package Lab3POO;

import java.util.*;
//import java.util.Scanner;

public class Main {
    
    /**
     * @param de entrada: No tiene
     * @return de salida: No tiene
     * @Descripcion: Muestra el menu inicial
     */
    public static void menuInicial(){
        System.out.println("\n### Manipulador de imagenes ###");
        System.out.println("    1. Crear una imagen");
        System.out.println("    2. Interactuar con una imagen");
        System.out.println("    3. Visualizar una imagen");
        System.out.println("    4. Salir");
        System.out.print("INTRODUZCA SU OPCION: ");
    }
    
     /**
     * @param de entrada: No tiene
     * @return de salida: No tiene
     * @Descripcion: Se muesta el menu de los pixeles que se pueden crear
     */
    public static void menuImagenes(){
        System.out.println("\n### Manipulador de imagenes ###");
        System.out.println("\nSeleccione el tipo de imagen que desea crear");
        System.out.println("    1. Crear bitmap");
        System.out.println("    2. Crear pixmap");
        System.out.println("    3. Crear hexmap");
        System.out.println("    4. Volver");
        System.out.print("INTRODUZCA SU OPCION: ");
    }
    
    /**
     * @param de entrada: No tiene
     * @return de salida: No tiene
     * @Descripcion: Se muestra el menu de las opciones que pueden hacer con la imagen que haya sido creada
     */
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
        System.out.println("    10. Rotarla 90 grados");
        System.out.println("    11. Reemplazar un pixel en la imagen");
        System.out.println("    12. Invertir colores de la imagen (solo Bitmap)");
        System.out.println("    13. Invertir colores de la imagen (solo Pixmap)");
        System.out.println("    14. Volver");
        System.out.print("INTRODUZCA SU OPCION: ");
    }
 
    
    public static void main(String[] args) {
        int x1,y1,x2,y2,x,y,depth,bit,r,g,b;
        String hex;
        int ancho =0;
        int alto = 0;
        int opcion = 0;
        int tipo = 0;
        int eleccion = 0;
        //Imagen_20576970_GajardoPonce img = null; //habilitar en caso de no querer tener una imagen inicial
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        //Ejemplos de imagenes (descomentar la imagen de se desee probar)

        /*
        System.out.println("\n**Imagen de tipo Bitmap creada, puede interactuar con ella o crear una nueva de cualquier tipo**");
        Pixbitd_20576970_GajardoPonce pixeles[][] = new Pixbitd_20576970_GajardoPonce[3][3];
        pixeles[0][0] = new Pixbitd_20576970_GajardoPonce(0,0,1,1);
        pixeles[0][1] = new Pixbitd_20576970_GajardoPonce(0,1,1,1);
        pixeles[0][2] = new Pixbitd_20576970_GajardoPonce(0,2,0,4);
        pixeles[1][0] = new Pixbitd_20576970_GajardoPonce(1,0,1,3);
        pixeles[1][1] = new Pixbitd_20576970_GajardoPonce(1,1,0,4);
        pixeles[1][2] = new Pixbitd_20576970_GajardoPonce(1,2,1,4);
        pixeles[2][0] = new Pixbitd_20576970_GajardoPonce(2,0,0,4);
        pixeles[2][1] = new Pixbitd_20576970_GajardoPonce(2,1,1,4);
        pixeles[2][2] = new Pixbitd_20576970_GajardoPonce(2,2,0,4);
        Imagen_20576970_GajardoPonce img = new Imagen_20576970_GajardoPonce(3,3,1,pixeles,null,null);       
*/



        System.out.println("\n**Imagen de tipo Pixmap creada, puede interactuar con ella o crear una nueva de cualquier tipo**");
        Pixrgbd_20576970_GajardoPonce pixeles[][] = new Pixrgbd_20576970_GajardoPonce[3][3];
        pixeles[0][0] = new Pixrgbd_20576970_GajardoPonce(0,0,1,1,1,4);
        pixeles[0][1] = new Pixrgbd_20576970_GajardoPonce(0,1,2,2,2,2);
        pixeles[0][2] = new Pixrgbd_20576970_GajardoPonce(0,2,3,3,3,3);
        pixeles[1][0] = new Pixrgbd_20576970_GajardoPonce(1,0,4,4,4,4);
        pixeles[1][1] = new Pixrgbd_20576970_GajardoPonce(1,1,5,5,5,5);
        pixeles[1][2] = new Pixrgbd_20576970_GajardoPonce(1,2,6,6,6,6);
        pixeles[2][0] = new Pixrgbd_20576970_GajardoPonce(2,0,7,7,7,7);
        pixeles[2][1] = new Pixrgbd_20576970_GajardoPonce(2,1,8,8,8,8);
        pixeles[2][2] = new Pixrgbd_20576970_GajardoPonce(2,2,9,9,9,9);
        Imagen_20576970_GajardoPonce img = new Imagen_20576970_GajardoPonce(3,3,2,null,pixeles,null);

/*
        System.out.println("\n**Imagen de tipo Hexmap creada, puede interactuar con ella o crear una nueva de cualquier tipo**");
        Pixhexd_20576970_GajardoPonce pixeles[][] = new Pixhexd_20576970_GajardoPonce[3][3];
        pixeles[0][0] = new Pixhexd_20576970_GajardoPonce(0,0,"FFFFFF",1);
        pixeles[0][1] = new Pixhexd_20576970_GajardoPonce(0,1,"FF0000",3);
        pixeles[0][2] = new Pixhexd_20576970_GajardoPonce(0,2,"FF1664",2);
        pixeles[1][0] = new Pixhexd_20576970_GajardoPonce(1,0,"DF1664",23);
        pixeles[1][1] = new Pixhexd_20576970_GajardoPonce(1,1,"C81664",20);
        pixeles[1][2] = new Pixhexd_20576970_GajardoPonce(1,2,"C8DE64",2);
        pixeles[2][0] = new Pixhexd_20576970_GajardoPonce(2,0,"96DE64",5);
        pixeles[2][1] = new Pixhexd_20576970_GajardoPonce(2,1,"96DE14",3);
        pixeles[2][2] = new Pixhexd_20576970_GajardoPonce(2,2,"96FF14",2);
        Imagen_20576970_GajardoPonce img = new Imagen_20576970_GajardoPonce(3,3,3,null,null,pixeles);
*/
        while(opcion != 4){
            menuInicial();
            opcion = entrada.nextInt();
            
            if (opcion == 1){
                System.out.println("\nHa seleccionado crear una imagen");
                
                while(tipo != 4){
                    menuImagenes();
                    Scanner entradapixeles = new Scanner(System.in);
                    Scanner hexa = new Scanner(System.in);
                    tipo = entradapixeles.nextInt();
                    
                    if (tipo == 1){
                        System.out.println("Ha seleccionado crear una imagen de tipo bitmap");
                                
                        System.out.println("\nIngrese el ancho de la imagen: ");
                        ancho = entrada.nextInt();
                        System.out.println("Ingrese el alto de la imagen: ");
                        alto = entrada.nextInt();
                        Pixbitd_20576970_GajardoPonce[][] pixelesbit  = new Pixbitd_20576970_GajardoPonce[alto][ancho];
                        
                        int contador = 0;
                        for(int i=0 ; i<alto ; i++){
                            for (int j=0 ; j<ancho ; j++){
                                System.out.println("\nIngrese los datos del pixel N-"+(contador)+"");
                                System.out.println("Ingrese la coordenada x:");
                                x = entrada.nextInt();
                                System.out.println("Ingrese la coordenada y:");
                                y = entrada.nextInt();
                                System.out.println("Ingrese el valor bit:");
                                bit = entrada.nextInt();
                                System.out.println("Ingrese la profundidad:");
                                depth = entrada.nextInt();

                                pixelesbit[i][j] = new Pixbitd_20576970_GajardoPonce(x,y,bit,depth);
                                contador++;
                            }
                        }   
                        img = new Imagen_20576970_GajardoPonce(ancho,alto,tipo,pixelesbit,null,null);
                        img.mostrarElementos();
                        tipo=4;
                    }
                    if (tipo == 2){
                        System.out.println("Ha seleccionado crear una imagen de tipo Pixmap");
                                
                        System.out.println("\nIngrese el ancho de la imagen: ");
                        ancho = entrada.nextInt();
                        System.out.println("Ingrese el alto de la imagen: ");
                        alto = entrada.nextInt();
                        Pixrgbd_20576970_GajardoPonce[][] pixelesrgb  = new Pixrgbd_20576970_GajardoPonce[alto][ancho];
                        
                        int contador = 0;
                        for(int i=0 ; i<alto ; i++){
                            for (int j=0 ; j<ancho ; j++){
                                System.out.println("\nIngrese los datos del pixel N-"+(contador)+"");
                                System.out.println("Ingrese la coordenada x:");
                                x = entrada.nextInt();
                                System.out.println("Ingrese la coordenada y:");
                                y = entrada.nextInt();
                                System.out.println("Ingrese el valor R:");
                                r = entrada.nextInt();
                                System.out.println("Ingrese el valor G:");
                                g = entrada.nextInt();
                                System.out.println("Ingrese el valor B:");
                                b = entrada.nextInt();
                                System.out.println("Ingrese la profundidad:");
                                depth = entrada.nextInt();

                                pixelesrgb[i][j] = new Pixrgbd_20576970_GajardoPonce(x,y,r,g,b,depth);
                                contador++;
                            }
                        }   

                        img = new Imagen_20576970_GajardoPonce(ancho, alto,tipo,null,pixelesrgb,null);
                        img.mostrarElementos();
                        tipo=4;
                    }
                    if (tipo == 3){
                        System.out.println("Ha seleccionado crear una imagen de tipo Hexmap");
                                
                        System.out.println("\nIngrese el ancho de la imagen: ");
                        ancho = entrada.nextInt();
                        System.out.println("Ingrese el alto de la imagen: ");
                        alto = entrada.nextInt();
                        Pixhexd_20576970_GajardoPonce[][] pixeleshex  = new Pixhexd_20576970_GajardoPonce[alto][ancho];
                        
                        int contador = 0;
                        for(int i=0 ; i<alto ; i++){
                            for (int j=0 ; j<ancho ; j++){
                                System.out.println("\nIngrese los datos del pixel N-"+(contador)+"");
                                System.out.println("Ingrese la coordenada x:");
                                x = entrada.nextInt();
                                System.out.println("Ingrese la coordenada y:");
                                y = entrada.nextInt();
                                System.out.println("Ingrese el valor Hexadecimal:");
                                hex = hexa.nextLine();
                                System.out.println("Ingrese la profundidad:");
                                depth = entrada.nextInt();

                                pixeleshex[i][j] = new Pixhexd_20576970_GajardoPonce(x,y,hex,depth);
                                contador++;
                            }
                        }   
                        img = new Imagen_20576970_GajardoPonce(ancho,alto,tipo,null,null,pixeleshex);
                        img.mostrarElementos();
                        tipo=4;
                    }
                    else if(tipo <= 0 ){
                        System.out.println("\nUps, ha seleccionado una opcion invalida, pruebe con otra");
                    }
                    else if(tipo >= 5 ){
                        System.out.println("\nUps, ha seleccionado una opcion invalida, pruebe con otra");
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
                    while(eleccion != 14){
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
                                //Ejemplo de crop:
                                //img.crop(0,1,1,2);
                                break;
                            case 8:
                                img.imgRGBToHex();
                                break;
                            case 9:
                                img.histogram();
                                break;
                            case 10:
                                img.rotate90();
                                break;
                            case 11:
                                Scanner nuevoPix = new Scanner(System.in);
                                Scanner nuevoHex = new Scanner(System.in);
                                
                                System.out.println("Ingrese el X del nuevo pixel");
                                int nuevoX = nuevoPix.nextInt();
                                System.out.println("Ingrese el Y del nuevo pixel");
                                int nuevoY = nuevoPix.nextInt();
                                System.out.println("Ingrese la profundidad del nuevo pixel");
                                int nuevoDepth = nuevoPix.nextInt();
                                
                                if(img.isBitmap() == 1){
                                    System.out.println("Ingrese el valor Bit del nuevo pixel");
                                    int nuevoBit = nuevoPix.nextInt();
                                    Pixbitd_20576970_GajardoPonce nuevoPixelBit = new Pixbitd_20576970_GajardoPonce(nuevoX,nuevoY,nuevoBit,nuevoDepth);
                                    img.changePixel(nuevoPixelBit,null,null);
                                }
                                else if (img.isPixmap() == 1){
                                    System.out.println("Ingrese el valor R del nuevo pixel");
                                    int nuevoR = nuevoPix.nextInt();
                                    System.out.println("Ingrese el valor G del nuevo pixel");
                                    int nuevoG = nuevoPix.nextInt();
                                    System.out.println("Ingrese el valor B del nuevo pixel");
                                    int nuevoB = nuevoPix.nextInt();
                                    Pixrgbd_20576970_GajardoPonce nuevoPixelRGB = new Pixrgbd_20576970_GajardoPonce(nuevoX,nuevoY,nuevoR,nuevoG,nuevoB,nuevoDepth);
                                    img.changePixel(null,nuevoPixelRGB,null);
                                }
                                else if (img.isHexmap() == 1){
                                    System.out.println("Ingrese el valor Hexadeciaml del nuevo pixel");
                                    String nuevoH = nuevoHex.nextLine();
                                    Pixhexd_20576970_GajardoPonce nuevoPixelHex = new Pixhexd_20576970_GajardoPonce(nuevoX,nuevoY,nuevoH,nuevoDepth);
                                    img.changePixel(null,null,nuevoPixelHex);
                                }
                                img.mostrarElementos();
                                break;
                            case 12:
                                img.invertColorBit();
                                img.mostrarElementos();
                                break;
                            case 13:
                                img.invertColorRGB();
                                img.mostrarElementos();
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