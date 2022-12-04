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
public class Pixhexd_20576970_GajardoPonce extends Pixel_20576970_GajardoPonce{
    public String hex;

    public Pixhexd_20576970_GajardoPonce(int x, int y, String hex, int depth) {
        super(x, y, depth);
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }
    
    
    
    @Override
    /**
    * @param de entrada: No tiene
    * @return de salida: String
    * @Descripcion: Entrega el valor hexadecimal del pixel
    */
    public String toString(){
        //return super.toString()+ "hex: " + hex + ']';
        return "" + hex + " ";
    }
}
