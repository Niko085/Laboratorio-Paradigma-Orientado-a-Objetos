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
public class Pixbit extends ComunPixeles{
    public int bit;

    public Pixbit(int bit, int x, int y, int depth) {
        super(x, y, depth);
        this.bit = bit;
    }

    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }
    

    @Override
    public String toString() {
        return super.toString()+"Pixbit" + "bit=" + bit + '}';
    }
    
    
}
