package Lab3POO;

import java.util.*;
/**
 *
 * @author nicolas
 */
public class Imagen {
    public int ancho;
    public int alto;
    public int tipo;
    public Pixbit pixelesbit[][];
    public Pixrgb pixelesrgb[][];
    public Pixhex pixeleshex[][];
    

    public Imagen(int ancho, int alto, int tipo) {
        int x,y,depth,bit,r,g,b;
        String hex;
        
        Scanner entrada = new Scanner(System.in);
        Scanner hexa = new Scanner(System.in);
        if(tipo == 1){
            pixelesbit  = new Pixbit[alto][ancho];
        }
        else if(tipo == 2){
            pixelesrgb  = new Pixrgb[alto][ancho];
        }
        else if(tipo == 3){
            pixeleshex  = new Pixhex[alto][ancho];
        }

        int contador=1;
        for(int i=0 ; i<alto ; i++){
            for (int j=0 ; j<ancho ; j++){
                System.out.println("\nIngrese los datos del pixel N-"+(contador)+"");
                
                System.out.println("Ingrese la coordenada x:");
                x = entrada.nextInt();
                System.out.println("Ingrese la coordenada y:");
                y = entrada.nextInt();
                System.out.println("Ingrese la profundidad:");
                depth = entrada.nextInt();
                
                if(tipo == 1){
                    System.out.println("Ingrese el valor bit:");
                    bit = entrada.nextInt();
                    pixelesbit[i][j] = new Pixbit(x,y,depth,bit);
                }
                else if(tipo == 2){
                    System.out.println("Ingrese el valor R:");
                    r = entrada.nextInt();
                    System.out.println("Ingrese el valor G:");
                    g = entrada.nextInt();
                    System.out.println("Ingrese el valor B:");
                    b = entrada.nextInt();
                    pixelesrgb[i][j] = new Pixrgb(x,y,depth,r,g,b);
                }
                else if(tipo == 3){
                    System.out.println("Ingrese el valor hexadecimal:");
                    hex = hexa.nextLine();
                    pixeleshex[i][j] = new Pixhex(x,y,depth,hex);
                }
            contador++;
            }
        }       
        this.ancho = ancho;
        this.alto = alto;
        this.tipo = tipo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Pixbit[][] getPixelesbit() {
        return pixelesbit;
    }

    public void setPixelesbit(Pixbit[][] pixelesbit) {
        this.pixelesbit = pixelesbit;
    }

    public Pixrgb[][] getPixelesrgb() {
        return pixelesrgb;
    }

    public void setPixelesrgb(Pixrgb[][] pixelesrgb) {
        this.pixelesrgb = pixelesrgb;
    }

    public Pixhex[][] getPixeleshex() {
        return pixeleshex;
    }

    public void setPixeleshex(Pixhex[][] pixeleshex) {
        this.pixeleshex = pixeleshex;
    }


    public void mostrarElementos(){
        //System.out.println("Elementos en el arreglo");
        System.out.println("\n*****************Imagen creada*****************");
        System.out.println("Ancho:"+getAncho()+"  Alto:"+getAlto()+"");
        for (int i=0; i<getAlto();i++){
            for(int j=0 ; j<getAncho(); j++){
                switch (tipo) {
                    case 1:
                        System.out.print(pixelesbit[i][j].toString());
                        //System.out.println("("+i+","+j+"");
                        break;
                    case 2:
                        System.out.print(pixelesrgb[i][j].toString());
                        break;
                    case 3:
                        System.out.print(pixeleshex[i][j].toString());
                        break;
                    default:
                        break;
                }
                
            }
            System.out.print("\n");      
        }
    }
    
    public int isBitmap(){
        if(tipo == 1){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public int isPixmap(){
        if(tipo == 2){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public int isHexmap(){
        if(tipo == 3){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public int isCompressed(int anch, int alt){
        int tamanio = anch * alt;
        int contador = 0;
        
        for(int i=0; i< getAlto() ; i++){
            for(int j=0; j< getAncho() ;j++ ){
                contador++;
                }
            }
        if (contador < tamanio){
            return 1;
        }
        else {
            return 0;
        }
    }
    
    
    public void flipH(){
        if(isBitmap() == 1){
            Pixbit nuevosPixelesBit[][] = new Pixbit[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=(getAncho()-1) ; j>=0 ; --j){
                    nuevosPixelesBit[cont1][cont2] = new Pixbit(pixelesbit[i][j].getX(),pixelesbit[i][j].getY(),pixelesbit[i][j].getDepth(),pixelesbit[i][j].getBit());
                    cont2++;
                }
                cont2 =0;
                System.out.println("");
                cont1++;
            }
            System.out.println("**Imagen volteada Horizontalmente**");
            System.out.println("Ancho:"+getAncho()+", Alto:"+getAlto()+"\n");
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=0 ; j<getAncho() ; j++){
                    nuevosPixelesBit[i][j].setX(i);
                    nuevosPixelesBit[i][j].setY(j);
                    System.out.print(nuevosPixelesBit[i][j].toString());
                }
                System.out.println("");
            }
            setPixelesbit(nuevosPixelesBit);
        }
        else if(isPixmap() == 1){
            Pixrgb nuevosPixelesRgb[][] = new Pixrgb[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=(getAncho()-1) ; j>=0 ; --j){
                    nuevosPixelesRgb[cont1][cont2] = new Pixrgb(pixelesrgb[i][j].getX(),pixelesrgb[i][j].getY(),pixelesrgb[i][j].getDepth(),pixelesrgb[i][j].getR(),pixelesrgb[i][j].getG(),pixelesrgb[i][j].getG());
                    cont2++;
                }
                cont2 =0;
                System.out.println("");
                cont1++;
            }
            System.out.println("**Imagen volteada Horizontalmente**");
            System.out.println("Ancho:"+getAncho()+", Alto:"+getAlto()+"\n");
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=0 ; j<getAncho() ; j++){
                    nuevosPixelesRgb[i][j].setX(i);
                    nuevosPixelesRgb[i][j].setY(j);
                    System.out.print(nuevosPixelesRgb[i][j].toString());
                }
                System.out.println("");
            }
            setPixelesrgb(nuevosPixelesRgb);
        }
        else if(isHexmap() == 1){
            Pixhex nuevosPixelesHex[][] = new Pixhex[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=(getAncho()-1) ; j>=0 ; --j){
                    nuevosPixelesHex[cont1][cont2] = new Pixhex(pixeleshex[i][j].getX(),pixeleshex[i][j].getY(),pixeleshex[i][j].getDepth(),pixeleshex[i][j].getHex());
                    cont2++;
                }
                cont2 =0;
                System.out.println("");
                cont1++;
            }
            System.out.println("**Imagen volteada Horizontalmente**");
            System.out.println("Ancho:"+getAncho()+", Alto:"+getAlto()+"\n");
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=0 ; j<getAncho() ; j++){
                    nuevosPixelesHex[i][j].setX(i);
                    nuevosPixelesHex[i][j].setY(j);
                    System.out.print(nuevosPixelesHex[i][j].toString());
                }
                System.out.println("");
            }
            setPixeleshex(nuevosPixelesHex);
        }        
    }
    
    
    
    
    
    
    
    
    public void flipV(){
        if(isBitmap() == 1){
            Pixbit nuevosPixelesBit[][] = new Pixbit[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=(getAlto()-1) ; i>=0 ; --i){
                for( int j=0 ; j<getAncho() ; j++){
                    nuevosPixelesBit[cont1][cont2] = new Pixbit(pixelesbit[i][j].getX(),pixelesbit[i][j].getY(),pixelesbit[i][j].getDepth(),pixelesbit[i][j].getBit());
                    cont2++;
                }
                cont2 =0;
                System.out.println("");
                cont1++;
            }
            System.out.println("**Imagen volteada Verticalmente**");
            System.out.println("Ancho:"+getAncho()+", Alto:"+getAlto()+"\n");
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=0 ; j<getAncho() ; j++){
                    nuevosPixelesBit[i][j].setX(i);
                    nuevosPixelesBit[i][j].setY(j);
                    System.out.print(nuevosPixelesBit[i][j].toString());
                }
                System.out.println("");
            }
            setPixelesbit(nuevosPixelesBit);
        }
        else if(isPixmap() == 1){
            Pixrgb nuevosPixelesRgb[][] = new Pixrgb[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=(getAlto()-1) ; i>=0 ; --i){
                for( int j=0 ; j<getAncho() ; j++){
                    nuevosPixelesRgb[cont1][cont2] = new Pixrgb(pixelesrgb[i][j].getX(),pixelesrgb[i][j].getY(),pixelesrgb[i][j].getDepth(),pixelesrgb[i][j].getR(),pixelesrgb[i][j].getG(),pixelesrgb[i][j].getG());
                    cont2++;
                }
                cont2 =0;
                System.out.println("");
                cont1++;
            }
            System.out.println("**Imagen volteada Verticalmente**");
            System.out.println("Ancho:"+getAncho()+", Alto:"+getAlto()+"\n");
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=0 ; j<getAncho() ; j++){
                    nuevosPixelesRgb[i][j].setX(i);
                    nuevosPixelesRgb[i][j].setY(j);
                    System.out.print(nuevosPixelesRgb[i][j].toString());
                }
                System.out.println("");
            }
            setPixelesrgb(nuevosPixelesRgb);
        }
        else if(isHexmap() == 1){
            Pixhex nuevosPixelesHex[][] = new Pixhex[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=(getAlto()-1) ; i>=0 ; --i){
                for( int j=0 ; j<getAncho() ; j++){
                    nuevosPixelesHex[cont1][cont2] = new Pixhex(pixeleshex[i][j].getX(),pixeleshex[i][j].getY(),pixeleshex[i][j].getDepth(),pixeleshex[i][j].getHex());
                    cont2++;
                }
                cont2 =0;
                System.out.println("");
                cont1++;
            }
            System.out.println("**Imagen volteada Verticalmente**");
            System.out.println("Ancho:"+getAncho()+", Alto:"+getAlto()+"\n");
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=0 ; j<getAncho() ; j++){
                    nuevosPixelesHex[i][j].setX(i);
                    nuevosPixelesHex[i][j].setY(j);
                    System.out.print(nuevosPixelesHex[i][j].toString());
                }
                System.out.println("");
            }
            setPixeleshex(nuevosPixelesHex);
        }        
    }
    

        
    public void crop(int x1, int y1, int x2, int y2){
        if(isBitmap() == 1){
            Pixbit nuevosPixelesBit[][] = new Pixbit[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=0 ; j<getAncho() ; j++){
                    //System.out.print("("+i+ ","+ j+")k");
                    if((i >= x1) && (i <= x2) && (j >= y1) && ( j<= y2)){
                        //System.out.println("("+i+","+j+")");
                        //System.out.print("("+i+","+j+")a");
                        //System.out.print("("+(cont1)+ ","+ (cont2) +")b");
                        //System.out.println("("+(cont1)+ ","+ (cont2-i) +")c");
                        nuevosPixelesBit[cont1][cont2] = new Pixbit(pixelesbit[i][j].getX(),pixelesbit[i][j].getY(),pixelesbit[i][j].getDepth(),pixelesbit[i][j].getBit());
                        cont2++;
                    }   
                }
                cont2 = 0;
                System.out.println("");
                cont1++;
            }
            
            System.out.println("**Imagen recortada**");
            int nuevoAlto = x2-x1+1;
            int nuevoAncho = y2-y1+1;
            System.out.println("Ancho:"+nuevoAncho+", Alto:"+nuevoAlto+"\n");
            for (int i=0 ; i<nuevoAlto ; i++){
                for( int j=0 ; j<nuevoAncho ; j++){
                    nuevosPixelesBit[0][0].setX(i);
                    nuevosPixelesBit[0][0].setY(j);
                    System.out.print(nuevosPixelesBit[i][j].toString());
                }
                System.out.println("");
            }
            setAncho(nuevoAncho);
            setAlto(nuevoAlto);
            setPixelesbit(nuevosPixelesBit);
            
        }
        
        else if(isPixmap() == 1){
            Pixrgb nuevosPixelesRgb[][] = new Pixrgb[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=0 ; j<getAncho() ; j++){
                    if((i >= x1) && (i <= x2) && (j >= y1) && ( j<= y2)){
                        nuevosPixelesRgb[cont1][cont2] = new Pixrgb(pixelesrgb[i][j].getX(),pixelesrgb[i][j].getY(),pixelesrgb[i][j].getDepth(),pixelesrgb[i][j].getR(),pixelesrgb[i][j].getG(),pixelesrgb[i][j].getG());
                        cont2++;
                    }
                }
                cont2 = 0;
                System.out.println("");
                cont1++;
            }

            int nuevoAlto = x2-x1+1;
            int nuevoAncho = y2-y1+1;
            System.out.println("**Imagen recortada**");
            System.out.println("Ancho:"+nuevoAncho+", Alto:"+nuevoAlto+"\n");
            for (int i=0 ; i<nuevoAlto ; i++){
                for( int j=0 ; j<nuevoAncho ; j++){
                    nuevosPixelesRgb[i][j].setX(i);
                    nuevosPixelesRgb[i][j].setY(j);
                    System.out.print(nuevosPixelesRgb[i][j].toString());
                }
                System.out.println("");
            }
            setAncho(nuevoAncho);
            setAlto(nuevoAlto);
            setPixelesrgb(nuevosPixelesRgb);
        }
        
        else if(isHexmap() == 1){
            Pixhex nuevosPixelesHex[][] = new Pixhex[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=0 ; j<getAncho() ; j++){
                    if((i >= x1) && (i <= x2) && (j >= y1) && ( j<= y2)){
                        nuevosPixelesHex[cont1][cont2] = new Pixhex(pixeleshex[i][j].getX(),pixeleshex[i][j].getY(),pixeleshex[i][j].getDepth(),pixeleshex[i][j].getHex());
                        cont2++;
                    }
                }
                cont2 = 0;
                System.out.println("");
                cont1++;
            }
            
            int nuevoAlto = x2-x1+1;
            int nuevoAncho = y2-y1+1;
            System.out.println("**Imagen recortada**");
            System.out.println("Ancho:"+nuevoAncho+", Alto:"+nuevoAlto+"\n");
            for (int i=0 ; i<nuevoAlto ; i++){
                for( int j=0 ; j<nuevoAncho ; j++){
                    nuevosPixelesHex[i][j].setX(i);
                    nuevosPixelesHex[i][j].setY(j);
                    System.out.print(nuevosPixelesHex[i][j].toString());
                }
                System.out.println("");
            }
            setAncho(nuevoAncho);
            setAlto(nuevoAlto);
            setPixeleshex(nuevosPixelesHex);            
        }        
    }
        
    
    public void imgRGBToHex(){
        if(getTipo() == 2){
            Pixhex[][] nuevosPixelesHex = new Pixhex[getAlto()][getAncho()];
            String hexadecimal;
            
            for(int i=0 ; i<getAlto() ; i++){
                for(int j=0 ; j<getAncho() ; j++){
                    //System.out.println("("+i+","+j+")");
                    hexadecimal = String.format("#%02X%02X%02X", pixelesrgb[i][j].getR(),pixelesrgb[i][j].getG(),pixelesrgb[i][j].getB());
                    nuevosPixelesHex[i][j] = new Pixhex(pixelesrgb[i][j].getX(),pixelesrgb[i][j].getY(),pixelesrgb[i][j].getDepth(),hexadecimal);
                }
            }
            
            System.out.println("**Imagen tranformada**");
            System.out.println("Ancho:"+getAncho()+", Alto:"+getAlto()+"\n");
            for(int i=0 ; i<getAlto() ; i++){
                for(int j=0 ; j<getAncho() ; j++){
                    System.out.print(nuevosPixelesHex[i][j].toString());
                    pixelesrgb[i][j] = null;
                }
                System.out.println("");
            }
            setTipo(3);
            setPixeleshex(nuevosPixelesHex);   
        }
        else{
            System.out.println("Solo puede transformar una imagen del tipo RGB");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void histogram(){
        System.out.println("");
    }
    
    
    
    
}
