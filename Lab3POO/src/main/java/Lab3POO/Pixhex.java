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
public class Pixhex{
    private int x;
    private int y;
    private String color;//Color en Hexadecimal
    private int depth;
    
    //Constructor
    public Pixhex(int x, int y, String color, int depth) {
        this.x = x;
        this.y = y;
        this.color = color;//Color en Hexadecimal
        this.depth = depth;
    }
    
    //Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }
    
}
