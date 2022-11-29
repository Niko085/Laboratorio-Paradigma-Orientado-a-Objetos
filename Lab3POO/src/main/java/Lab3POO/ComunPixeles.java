/*
 * Atributos que tienen en comun los pixeles
 */
package Lab3POO;

/**
 *
 * @author nicolas
 */
public abstract class ComunPixeles {
    private int x;
    private int y;
    private int depth;

    public ComunPixeles(int x, int y, int depth) {
        this.x = x;
        this.y = y;
        this.depth = depth;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "ComunPixeles{" + "x=" + x + ", y=" + y + ", depth=" + depth + ", " ;
    }
    
    
    
    
}
