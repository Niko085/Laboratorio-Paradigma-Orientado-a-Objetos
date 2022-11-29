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
public class Pixhex extends ComunPixeles{
    public String hex;

    public Pixhex(String hex, int x, int y, int depth) {
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
    public String toString() {
        return super.toString()+"Pixhex" + "hex=" + hex + '}';
    }
    
    
    
}
