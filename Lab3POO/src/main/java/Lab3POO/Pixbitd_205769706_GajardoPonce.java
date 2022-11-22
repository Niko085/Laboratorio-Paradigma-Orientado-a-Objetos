
package Lab3POO;


public class Pixbitd_205769706_GajardoPonce extends imagen_205769706_GajardoPonce {
    private int x;
    private int y;
    private int bit;
    private int depth;

    /*
    //Constructor
    public Pixbitd_205769706_GajardoPonce(int x, int y, int bit, int depth) {
        this.x = x;
        this.y = y;
        this.bit = bit;
        this.depth = depth;
    }

    
    //Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getBit() {
        return bit;
    }

    public int getDepth() {
        return depth;
    }

    public String mostrarDatos(){
        return "x: "+x+"\ny: "+y+"\nbit: "+bit+"\nprofundidad: "+depth+"\n";
    }
    */

    public Pixbitd_205769706_GajardoPonce(int x, int y, int bit, int depth, int alto, int ancho) {
        super(alto, ancho);
        this.x = x;
        this.y = y;
        this.bit = bit;
        this.depth = depth;
    }
    
    
}
