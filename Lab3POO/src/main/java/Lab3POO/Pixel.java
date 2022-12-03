/*
 * Atributos que tienen en comun los pixeles
 */
package Lab3POO;

/**
 *
 * @author nicolas
 */
public abstract class Pixel {
    protected int x;
    protected int y;
    protected int depth;

    public Pixel(int x, int y, int depth) {
        if (x>=0 && y>=0 && depth>=0){
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
        else{
            System.out.println("Solo puede ingresar valores positivos");
        }

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


    public String toString() {
        return "[" + "x:" + x + ", y:" + y + ", prof:" + depth + ", " ;
        //return "";
    }
    
    
    
    
}
