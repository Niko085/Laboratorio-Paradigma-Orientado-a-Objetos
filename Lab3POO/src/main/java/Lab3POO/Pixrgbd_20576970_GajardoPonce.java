/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3POO;

/**
 *
 * @author nicol
 */
public class Pixrgbd_20576970_GajardoPonce extends Pixel_20576970_GajardoPonce{
    public int r;
    public int g;
    public int b;

    public Pixrgbd_20576970_GajardoPonce(int x, int y, int r, int g, int b, int depth) {
        super(x, y, depth);
        if ((r>=0 && r<=255) && (g>=0 && g<=255) && (b>=0 && b<=255)){
            this.r = r;
            this.g = g;
            this.b = b;
        }
        else{
            System.out.println("Solo puede ingresar valores entre 0 y 255");
        }
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    
    
    @Override
    /**
    * @param de entrada: No tiene
    * @return de salida: String
    * @Descripcion: Entrega los colores del pixel
    */
    public String toString(){
        //return super.toString()+ "r: " + r+ ", " + "g: " + g + ", " + "b: " + b + ']';
        return "[" + r+ "," + g + "," + b + "] ";
    }
    
    
}
