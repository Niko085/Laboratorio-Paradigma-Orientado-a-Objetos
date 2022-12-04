/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3POO;

import java.util.*;
/**
 *
 * @author nicol
 */
public class Pixbitd_20576970_GajardoPonce extends Pixel_20576970_GajardoPonce{
    public int bit;

    public Pixbitd_20576970_GajardoPonce(int x, int y, int bit, int depth) {
        super(x, y, depth);
        if(bit == 0 || bit == 1){
            this.bit = bit;
        }
        else{
            System.out.println("Solo puede ingresar valores entre 0 y 1");
        }

    }

    //Getter
    public int getBit() {
        return bit;
    }

    //Setter
    public void setBit(int bit) {
        this.bit = bit;
    }
    
    
    @Override
    /**
    * @param de entrada: No tiene
    * @return de salida: String
    * @Descripcion: Entrega el bit del pixel
    */
    public String toString() {
        //return super.toString()+ "bit: " + bit + ']';
        return "" + bit + " ";
    }
    
}
