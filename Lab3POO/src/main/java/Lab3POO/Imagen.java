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
    public Pixeles pixelesMap[][];

    public Imagen(int ancho, int alto, int tipo) {
        //int x,y,depth; 
        Scanner entrada = new Scanner(System.in);
        pixelesMap  = new Pixeles[ancho][alto];
        
        for(int i=0 ; i<ancho ; i++){
            for (int j=0 ; j<alto ; j++){
                System.out.println("Ingrese la coordenada x:");
                int x = entrada.nextInt();
                System.out.println("Ingrese la coordenada y:");
                int y = entrada.nextInt();
                System.out.println("Ingrese la profundidad:");
                int depth = entrada.nextInt();
                pixelesMap[i][j] = new Pixeles(x,y,depth,tipo);
            }
        }       
        this.ancho = ancho;
        this.alto = alto;
        this.tipo = tipo;
    }

    public void mostrarElementos(){
        //System.out.println("Elementos en el arreglo");
        System.out.println("*****************Pixeles******************");
        for (int i=0; i<ancho;i++){
            for(int j=0 ; j<alto; j++){
                System.out.print(pixelesMap[i][j].toString(tipo));
            }
            System.out.print("\n");
                
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
    
    
}
