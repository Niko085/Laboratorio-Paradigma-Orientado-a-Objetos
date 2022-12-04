/*
 * Atributos que tienen en comun los pixeles
 */
package Lab3POO;

/**
 *
 * @author nicolas
 */
public abstract class Pixel_20576970_GajardoPonce {
    protected int x;
    protected int y;
    protected int depth;

    //Constructor
    /**
    * @param de entrada: x (int) X y (int) X depth (int)
    * @return de salida: No tiene
    * @Descripcion: Construye un pixel
    */
    public Pixel_20576970_GajardoPonce(int x, int y, int depth) {
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


    @Override
    /**
    * @param de entrada: No tiene
    * @return de salida: String
    * @Descripcion: Entrega los valores x, y, depth del pixel
    */
    public String toString() {
        return "[" + "x:" + x + ", y:" + y + ", prof:" + depth + ", " ;
        //return "";
    }
    
    
    
    
}
