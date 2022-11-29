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
public class Pixrgb extends ComunPixeles{
    public int r;
    public int g;
    public int b;

    public Pixrgb(int r, int g, int b, int x, int y, int depth) {
        super(x, y, depth);
        this.r = r;
        this.g = g;
        this.b = b;
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
    public String toString() {
        return super.toString()+"Pixrgb" + "r=" + r + ", g=" + g + ", b=" + b + '}';
    }
    
    
}
