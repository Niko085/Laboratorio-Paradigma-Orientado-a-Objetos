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
public class Pixbit extends Pixel{
    public int bit;

    public Pixbit(int x, int y, int depth, int bit) {
        super(x, y, depth);
        if(bit == 0 || bit == 1){
            this.bit = bit;
        }
        else{
            System.out.println("Solo puede ingresar valores entre 0 y 1");
        }

    }

    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }
    
    
    @Override
    public String toString() {
        //return super.toString()+ "bit: " + bit + ']';
        return "" + bit + " ";
    }
    
}
