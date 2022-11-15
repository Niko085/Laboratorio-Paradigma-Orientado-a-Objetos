
package Lab3POO;

/**
 *
 * @author nicolas
 */
public class Pixbitd {
    //Atributos
    private int x;
    private int y;
    private int bit;
    private int depth;
    
    //Métodos
    //public Bitmap(int _x, int _y, int _bit, int _depth){
     //   x = _x;
      //  y = _y;
       // bit = _bit;
       // depth = _depth;
    //}
    public Pixbitd(int x, int y, int bit, int depth){
        if (x >= 0 && y >= 0 && depth >= 0){
                this.x = x;
                this.y = y;
                this.bit = bit;
                this.depth = depth;
        }
        else {
            System.out.println("Debe ingresar valores correctos");
        }
    }

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
    
    
    public String mostrar(){
        return "X: "+x+"\nY: "+y+"\nbit: "+bit+"\ndepth: "+depth+"\n";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
    public void mostrarDatos(){
        System.out.println("El x es: "+x);
        System.out.println("El y es: "+y);
        System.out.println("El bit es: "+bit);
        System.out.println("La profundidad es: "+depth);
    }
}
