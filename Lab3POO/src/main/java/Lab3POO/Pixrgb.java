
package Lab3POO;


public class Pixrgb {
    private int x;
    private int y;
    private int r;
    private int g;
    private int b;
    private int depth;
    
    
    //Constructor
    public Pixrgb(int x, int y, int r, int g, int b, int depth) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.g = g;
        this.b = b;
        this.depth = depth;
    }

    //Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public int getDepth() {
        return depth;
    }
   
}


