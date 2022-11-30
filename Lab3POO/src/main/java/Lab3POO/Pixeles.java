/*
 * Se crean los pixeles dependiendo el tipo que el usuario desee
 */
package Lab3POO;

import java.util.*;

/**
 *
 * @author nicol
 */
public class Pixeles extends ComunPixeles{
    
    public String hex;
    public int r;
    public int g;
    public int b;

    public Pixeles(int x, int y, int depth, int tipo) {
        super(x, y, depth);
        Scanner entrada = new Scanner(System.in);
        switch (tipo) {
            case 1:
                System.out.println("Ingrese el valor bit");
                int bit = entrada.nextInt();
                if(bit == 0 || bit == 1){
                    this.bit = bit;
                }
                else{
                    System.out.println("Solo puede ingresar valores entre 0 y 1");
                }
                break;
            case 2:
                System.out.println("Ingrese el valor r");
                int r = entrada.nextInt();
                if(r >= 0 && r <= 255){
                    this.r = r;
                    System.out.println("Ingrese el valor g");
                    int g = entrada.nextInt();
                    
                    if(g >= 0 && g <= 255){
                        this.g = g;
                        System.out.println("Ingrese el valor b");
                        
                        int b = entrada.nextInt();
                        if(b >= 0 && b <= 255){
                            this.b = b;
                        }
                        else{
                            System.out.println("Solo puede ingresar valores entre 0 y 255");
                        }
                    }
                    else{
                        System.out.println("Solo puede ingresar valores entre 0 y 255");
                    }
                }
                else{
                    System.out.println("Solo puede ingresar valores entre 0 y 255");
                }        
                break;
            case 3:
                System.out.println("Ingrese el valor hexadecimal");
                this.hex = entrada.nextLine();
                break;
            default:
                break;
        }
    }

    public String toString(int tipo) {
        if(tipo == 1){
            return super.toString()+ "bit: " + bit + ']';
        }
        else if(tipo == 2){
            return super.toString()+ "r: " + r+ ", " + "g: " + g + ", " + "b: " + b + ']';
        }
        else if(tipo == 3){
            return super.toString()+ "hex: " + hex + ']';
        }
        else
        {
            return "Primero debe crear una imagen";
        }
        
    } 
}
