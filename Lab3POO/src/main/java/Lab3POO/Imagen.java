package Lab3POO;

import java.util.*;
/**
 *
 * @author nicolas
 */
public class Imagen {
    public int ancho;
    public int alto;
    public int tipo;
    public int cantidad;
    public Pixbit pixelesbit[][];
    public Pixrgb pixelesrgb[][];
    public Pixhex pixeleshex[][];
    

    public Imagen(int ancho, int alto, int tipo) {
        int x,y,depth,bit,r,g,b;
        String hex;
        
        Scanner entrada = new Scanner(System.in);
        Scanner hexa = new Scanner(System.in);
        if(tipo == 1){
            pixelesbit  = new Pixbit[ancho][alto];
        }
        else if(tipo == 2){
            pixelesrgb  = new Pixrgb[ancho][alto];
        }
        else if(tipo == 3){
            pixeleshex  = new Pixhex[ancho][alto];
        }

        int contador=1;
        for(int i=0 ; i<ancho ; i++){
            for (int j=0 ; j<alto ; j++){
                System.out.println("\nIngrese los datos del pixel N-"+(contador)+"");
                
                System.out.println("Ingrese la coordenada x:");
                x = entrada.nextInt();
                System.out.println("Ingrese la coordenada y:");
                y = entrada.nextInt();
                System.out.println("Ingrese la profundidad:");
                depth = entrada.nextInt();
                
                if(tipo == 1){
                    System.out.println("Ingrese el valor bit:");
                    bit = entrada.nextInt();
                    pixelesbit[i][j] = new Pixbit(x,y,depth,bit);
                }
                else if(tipo == 2){
                    System.out.println("Ingrese el valor R:");
                    r = entrada.nextInt();
                    System.out.println("Ingrese el valor G:");
                    g = entrada.nextInt();
                    System.out.println("Ingrese el valor B:");
                    b = entrada.nextInt();
                    pixelesrgb[i][j] = new Pixrgb(x,y,depth,r,g,b);
                }
                else if(tipo == 3){
                    System.out.println("Ingrese el valor hexadecimal:");
                    hex = hexa.nextLine();
                    pixeleshex[i][j] = new Pixhex(x,y,depth,hex);
                }
            contador++;
            }
        }       
        this.ancho = ancho;
        this.alto = alto;
        this.tipo = tipo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Pixbit[][] getPixelesbit() {
        return pixelesbit;
    }

    public void setPixelesbit(Pixbit[][] pixelesbit) {
        this.pixelesbit = pixelesbit;
    }

    public Pixrgb[][] getPixelesrgb() {
        return pixelesrgb;
    }

    public void setPixelesrgb(Pixrgb[][] pixelesrgb) {
        this.pixelesrgb = pixelesrgb;
    }

    public Pixhex[][] getPixeleshex() {
        return pixeleshex;
    }

    public void setPixeleshex(Pixhex[][] pixeleshex) {
        this.pixeleshex = pixeleshex;
    }


    public void mostrarElementos(){
        //System.out.println("Elementos en el arreglo");
        System.out.println("*****************Pixeles*****************");
        for (int i=0; i<ancho;i++){
            for(int j=0 ; j<alto; j++){
                switch (tipo) {
                    case 1:
                        System.out.print(pixelesbit[i][j].toString());
                        break;
                    case 2:
                        System.out.print(pixelesrgb[i][j].toString());
                        break;
                    case 3:
                        System.out.print(pixeleshex[i][j].toString());
                        break;
                    default:
                        break;
                }
                System.out.println("\n");
            }
            
                
        }
    }
    
    public int isBitmap(){
        if(tipo == 1){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public int isPixmap(){
        if(tipo == 2){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public int isHexmap(){
        if(tipo == 3){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public int isCompressed(int anch, int alt){
        int tamanio = anch * alt;
        int contador = 0;
        
        for(int i=0; i< ancho ; i++){
            for(int j=0; j< alto ;j++ ){
                contador++;
                }
            }
        if (contador < tamanio){
            return 1;
        }
        else {
            return 0;
        }
    }
    
    
    public void flipH(){
        for (int i=0 ; i<2 ; i++){
            for (int j=2 ; j>0 ; --j){
                System.out.println(""+i+""+j+"");
            }
        }
    }
    
    
    
    
    
    
}
