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
public class Pixbit {
    public int x;
    public int y;
    public int bit;
    public int depth;

    public Pixbit(int x, int y, int bit, int depth) {
        this.x = x;
        this.y = y;
        this.bit = bit;
        this.depth = depth;
    }
    
    public String mostrarDatos(){
        return "x: "+x+"\ny: "+y+"\nbit: "+bit+"\nprofundidad: "+depth+"\n";
    }

}
