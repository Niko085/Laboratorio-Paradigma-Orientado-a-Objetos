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
public class TDAHistograma_20576970_GajardoPonce {
    public int bit;
    public int cantidadBit;

    public TDAHistograma_20576970_GajardoPonce(int bit, int cantidad) {
        this.bit = bit;
        this.cantidadBit = cantidad;
    }

    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }

    public int getCantidadBit() {
        return cantidadBit;
    }

    public void setCantidadBit(int cantidadBit) {
        this.cantidadBit = cantidadBit;
    }
    

    @Override
    public String toString() {
        return "{" + "bit=" + bit + ", cantidad=" + cantidadBit + '}';
    }
    
}
