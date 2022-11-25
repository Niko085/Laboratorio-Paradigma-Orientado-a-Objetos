
package Lab3POO;


public class Pixbit{
    public int x;
    public int y;
    public int bit;
    public int depth;

    
    //Constructor
    public Pixbit(int x, int y, int bit, int depth) {
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
    

    
    
}
