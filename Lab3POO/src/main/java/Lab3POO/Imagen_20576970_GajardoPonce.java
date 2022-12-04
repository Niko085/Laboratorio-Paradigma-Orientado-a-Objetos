package Lab3POO;

import java.util.*;
/**
 *
 * @author nicolas
 */
public class Imagen_20576970_GajardoPonce implements InterImagen_20576970_GajardoPonce{
    public int ancho;
    public int alto;
    public int tipo;
    public Pixbitd_20576970_GajardoPonce pixelesbit[][];
    public Pixrgbd_20576970_GajardoPonce pixelesrgb[][];
    public Pixhexd_20576970_GajardoPonce pixeleshex[][];
    
    //Constructor
    /**
    * @param de entrada: ancho (int) X alto (int) X tipo (int) X pixelesbit (Pixbit[][]) X pixelesrgb (Pixrgb[][]) X pixeleshex (Pixhex[][])
    * @return de salida: imagen
    * @Descripcion: Crea la imagen
    */
    public Imagen_20576970_GajardoPonce(int ancho, int alto, int tipo, Pixbitd_20576970_GajardoPonce[][] pixelesbit, Pixrgbd_20576970_GajardoPonce[][] pixelesrgb, Pixhexd_20576970_GajardoPonce[][] pixeleshex) {
        this.ancho = ancho;
        this.alto = alto;
        this.tipo = tipo;
        this.pixelesbit = pixelesbit;
        this.pixelesrgb = pixelesrgb;
        this.pixeleshex = pixeleshex;
    }
    
    //Getters
    /**
    * @param de entrada: No tiene
    * @return de salida: ancho (int)
    * @Descripcion: Entrega el ancho de la imagen
    */
    public int getAncho(){
        return ancho;
    }
    /**
    * @param de entrada: No tiene
    * @return de salida: alto (int)
    * @Descripcion: Entrega el alto de la imagen
    */
    public int getAlto() {
        return alto;
    }
    /**
    * @param de entrada: No tiene
    * @return de salida: tipo (int)
    * @Descripcion: Entrega el tipo de imagen
    */
    public int getTipo() {
        return tipo;
    }

    //Setters
    
    /**
    * @param de entrada: ancho (int)
    * @return de salida: No tiene
    * @Descripcion: inserta el ancho en la imagen
    */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
    * @param de entrada: alto (int)
    * @return de salida: No tiene
    * @Descripcion: inserta el alto en la imagen
    */
    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    /**
    * @param de entrada: tipo (int)
    * @return de salida: No tiene
    * @Descripcion: inserta el tipo en la imagen
    */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
    * @param de entrada: pixelesbit (Pixbit[][])
    * @return de salida: No tiene
    * @Descripcion: inserta una lista de pixeles en la imagen
    */
    public void setPixelesbit(Pixbitd_20576970_GajardoPonce[][] pixelesbit) {
        this.pixelesbit = pixelesbit;
    }

    /**
    * @param de entrada: pixelesrgb (pixrgb[][])
    * @return de salida: No tiene
    * @Descripcion: inserta una lista de pixeles en la imagen
    */
    public void setPixelesrgb(Pixrgbd_20576970_GajardoPonce[][] pixelesrgb) {
        this.pixelesrgb = pixelesrgb;
    }

    /**
    * @param de entrada: pixeleshex (pixhex[][])
    * @return de salida: No tiene
    * @Descripcion: inserta una lista de pixeles en la imagen
    */
    public void setPixeleshex(Pixhexd_20576970_GajardoPonce[][] pixeleshex) {
        this.pixeleshex = pixeleshex;
    }

    /**
    * @param de entrada: No tiene
    * @return de salida: No tiene
    * @Descripcion: Muestra los pixeles de la imagen, el alto y el ancho
    */
    public void mostrarElementos() {
        System.out.println("\n*****************Imagen creada*****************");
        System.out.println("Ancho:"+getAncho()+"  Alto:"+getAlto()+"");
        for (int i=0; i<getAlto();i++){
            for(int j=0 ; j<getAncho(); j++){
                switch (tipo) {
                    case 1:
                        System.out.print(pixelesbit[i][j].toString());
                        break;
                    case 2:
                        System.out.print(pixelesrgb[i][j].toString());
                        break;
                    case 3:
                        System.out.print("#"+pixeleshex[i][j].toString());
                        break;
                    default:
                        break;
                }
            }
            System.out.print("\n");      
        }
    }
    
    /**
     * @param de entrada: No tiene
     * @return de salida: boolenano (1 ó 0)
     * @Descripcion: Entrega un 1 en caso de que la imagen sea del tipo bitmap
     */
    public int isBitmap(){
        if(tipo == 1){
            return 1;
        }
        else{
            return 0;
        }
    }
    /**
     * @param de entrada: No tiene
     * @return de salida: booleno (1 ó 0)
     * @Descripcion: Entrega un 1 en caso de que la imagen sea del tipo pixmap
     */
    public int isPixmap(){
        if(tipo == 2){
            return 1;
        }
        else{
            return 0;
        }
    }
    /**
     * @param de entrada: No tiene
     * @return de salida: booleano (1 ó 0)
     * @Descripcion: Entrega un 1 en caso de que la imagen sea del tipo Hexmap
     */
    public int isHexmap(){
        if(tipo == 3){
            return 1;
        }
        else{
            return 0;
        }
    }
    /**
     * @param de entrada: ancho (int) X alto (int)
     * @return de salida: booleano (1 ó 0)
     * @Descripcion: Comprueba que la cantidad de pixeles sea la misma que la declarada al momento de crear la imagen
     */
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
    
    /**
     * @param de entrada: No tiene
     * @return de salida: No tiene
     * @Descripcion: Modifica la lista de pixeles, con el objetivo de mover los pixeles de tal manera que esto queden invertidos horizontalmente
     */
    public void flipH(){
        if(isBitmap() == 1){
            Pixbitd_20576970_GajardoPonce nuevosPixelesBit[][] = new Pixbitd_20576970_GajardoPonce[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=(getAncho()-1) ; j>=0 ; --j){
                    nuevosPixelesBit[cont1][cont2] = new Pixbitd_20576970_GajardoPonce(pixelesbit[i][j].getX(),pixelesbit[i][j].getY(),pixelesbit[i][j].getBit(),pixelesbit[i][j].getDepth());
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
            Pixrgbd_20576970_GajardoPonce nuevosPixelesRgb[][] = new Pixrgbd_20576970_GajardoPonce[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=(getAncho()-1) ; j>=0 ; --j){
                    nuevosPixelesRgb[cont1][cont2] = new Pixrgbd_20576970_GajardoPonce(pixelesrgb[i][j].getX(),pixelesrgb[i][j].getY(),pixelesrgb[i][j].getR(),pixelesrgb[i][j].getG(),pixelesrgb[i][j].getB(),pixelesrgb[i][j].getDepth());
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
            Pixhexd_20576970_GajardoPonce nuevosPixelesHex[][] = new Pixhexd_20576970_GajardoPonce[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=(getAncho()-1) ; j>=0 ; --j){
                    nuevosPixelesHex[cont1][cont2] = new Pixhexd_20576970_GajardoPonce(pixeleshex[i][j].getX(),pixeleshex[i][j].getY(),pixeleshex[i][j].getHex(),pixeleshex[i][j].getDepth());
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
    

    /**
     * @param de entrada: No tiene
     * @return de salida: No tiene
     * @Descripcion: Modifica la lista de pixeles, con el objetivo de mover los pixeles de tal manera que esto queden invertidos verticalmente
     */
    public void flipV(){
        if(isBitmap() == 1){
            Pixbitd_20576970_GajardoPonce nuevosPixelesBit[][] = new Pixbitd_20576970_GajardoPonce[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=(getAlto()-1) ; i>=0 ; --i){
                for( int j=0 ; j<getAncho() ; j++){
                    nuevosPixelesBit[cont1][cont2] = new Pixbitd_20576970_GajardoPonce(pixelesbit[i][j].getX(),pixelesbit[i][j].getY(),pixelesbit[i][j].getBit(),pixelesbit[i][j].getDepth());
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
            Pixrgbd_20576970_GajardoPonce nuevosPixelesRgb[][] = new Pixrgbd_20576970_GajardoPonce[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=(getAlto()-1) ; i>=0 ; --i){
                for( int j=0 ; j<getAncho() ; j++){
                    nuevosPixelesRgb[cont1][cont2] = new Pixrgbd_20576970_GajardoPonce(pixelesrgb[i][j].getX(),pixelesrgb[i][j].getY(),pixelesrgb[i][j].getR(),pixelesrgb[i][j].getG(),pixelesrgb[i][j].getB(),pixelesrgb[i][j].getDepth());
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
            Pixhexd_20576970_GajardoPonce nuevosPixelesHex[][] = new Pixhexd_20576970_GajardoPonce[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=(getAlto()-1) ; i>=0 ; --i){
                for( int j=0 ; j<getAncho() ; j++){
                    nuevosPixelesHex[cont1][cont2] = new Pixhexd_20576970_GajardoPonce(pixeleshex[i][j].getX(),pixeleshex[i][j].getY(),pixeleshex[i][j].getHex(),pixeleshex[i][j].getDepth());
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
    
    /**
     * @param de entrada: x1 (int) X y1 (int) X x2 (int) X y2 (int)
     * @return de salida: No tiene
     * @Descripcion: Recorta la imagen utilizando los parametros de entrada, los nuevo pixeles son ingresados a
     * la imagen original, por ende, las dimensiones de la imagen y sus pixeles son cambiados
     */    
    public void crop(int x1, int y1, int x2, int y2){
        if(isBitmap() == 1){
            Pixbitd_20576970_GajardoPonce nuevosPixelesBit[][] = new Pixbitd_20576970_GajardoPonce[getAlto()][getAncho()];

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
                        nuevosPixelesBit[cont1][cont2] = new Pixbitd_20576970_GajardoPonce(pixelesbit[i][j].getX(),pixelesbit[i][j].getY(),pixelesbit[i][j].getBit(),pixelesbit[i][j].getDepth());
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
                    nuevosPixelesBit[i][j].setX(i);
                    nuevosPixelesBit[i][j].setY(j);
                    System.out.print(nuevosPixelesBit[i][j].toString());
                }
                System.out.println("");
            }
            setAncho(nuevoAncho);
            setAlto(nuevoAlto);
            setPixelesbit(nuevosPixelesBit);
        }
        else if(isPixmap() == 1){
            Pixrgbd_20576970_GajardoPonce nuevosPixelesRgb[][] = new Pixrgbd_20576970_GajardoPonce[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=0 ; j<getAncho() ; j++){
                    if((i >= x1) && (i <= x2) && (j >= y1) && ( j<= y2)){
                        nuevosPixelesRgb[cont1][cont2] = new Pixrgbd_20576970_GajardoPonce(pixelesrgb[i][j].getX(),pixelesrgb[i][j].getY(),pixelesrgb[i][j].getR(),pixelesrgb[i][j].getG(),pixelesrgb[i][j].getB(),pixelesrgb[i][j].getDepth());
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
            Pixhexd_20576970_GajardoPonce nuevosPixelesHex[][] = new Pixhexd_20576970_GajardoPonce[getAlto()][getAncho()];

            int cont1 = 0;
            int cont2 = 0;
            for (int i=0 ; i<getAlto() ; i++){
                for( int j=0 ; j<getAncho() ; j++){
                    if((i >= x1) && (i <= x2) && (j >= y1) && ( j<= y2)){
                        nuevosPixelesHex[cont1][cont2] = new Pixhexd_20576970_GajardoPonce(pixeleshex[i][j].getX(),pixeleshex[i][j].getY(),pixeleshex[i][j].getHex(),pixeleshex[i][j].getDepth());
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
        
    /**
     * @param de entrada: No tiene
     * @return de salida: No tiene
     * @Descripcion: Transforma una imagen del tipo pixmap a hexmap, lo hacer transformando cada pixel de 
     * la imagen inicial y dejandolo en una nuevamatriz, la cual le será insertada a la imagen, además
     * se cambia el atributo tipo de la imagen
     */
    public void imgRGBToHex(){
        if(getTipo() == 2){
            Pixhexd_20576970_GajardoPonce[][] nuevosPixelesHex = new Pixhexd_20576970_GajardoPonce[getAlto()][getAncho()];
            String hexadecimal;
            
            for(int i=0 ; i<getAlto() ; i++){
                for(int j=0 ; j<getAncho() ; j++){
                    hexadecimal = String.format("#%02X%02X%02X", pixelesrgb[i][j].getR(),pixelesrgb[i][j].getG(),pixelesrgb[i][j].getB());
                    nuevosPixelesHex[i][j] = new Pixhexd_20576970_GajardoPonce(pixelesrgb[i][j].getX(),pixelesrgb[i][j].getY(),hexadecimal,pixelesrgb[i][j].getDepth());
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
    
    /**
     * @param de entrada: No tiene
     * @return de salida: No tiene
     * @Descripcion: Realiza un histograma de colores de una imagen y lo muestra por pantalla, lamentablemente solo funciona para imágenes del tipo Bitmap
     */
    public void histogram(){     
        if(isBitmap() == 1){
            int ceros= 0;
            int unos=0;
            if(isBitmap()==1){
                for(int i=0 ; i<getAlto() ; i++){
                    for(int j=0 ; j<getAncho() ; j++){
                        if(pixelesbit[i][j].getBit() == 1){
                            unos++;
                        }else{
                            ceros++;
                        }
                    }
                }
            }
            TDAHistograma_20576970_GajardoPonce histograma[] = new TDAHistograma_20576970_GajardoPonce[2];
            histograma[0] = new TDAHistograma_20576970_GajardoPonce(0,ceros);
            histograma[1] = new TDAHistograma_20576970_GajardoPonce(1,unos);

            System.out.println("***Histograma***");
            for(int i=0 ; i< histograma.length ; i++){
                System.out.println(histograma[i].toString());
            }
        }
        else{
            System.out.println("El histograma solo funciona para bitmap :(");
        }
        
    }
    
    /**
     * @param de entrada: No tiene
     * @return de salida: No tiene
     * @Descripcion: Rota una imagen 90 grados a la derecha, esto de hace con una matriz auxiliar, la cual
     * posteriormente le será entregada a la imagen en cuestion
     */
    public void rotate90(){
        int primerParametro = 0;
        int segundoParametro = 0;
        if(getAlto() > getAncho()){
            primerParametro = getAlto()-1;
            segundoParametro = getAncho();
        }
        if(getAlto() == getAncho()){
            primerParametro = getAlto();
            segundoParametro = getAncho()-1;
        }
        if(getAlto() < getAncho()){
            primerParametro = getAncho();
            segundoParametro = getAlto()-1;
        }
        if(isBitmap() == 1){
            Pixbitd_20576970_GajardoPonce nuevosPixelesBit[][] = new Pixbitd_20576970_GajardoPonce[getAncho()][getAlto()];
                        
            System.out.println("dimensiones:"+getAncho()+","+getAlto());//3,2

            int cont1 = 0;
            int cont2 = 0;
            for (int i=0 ; i<primerParametro ; i++){//alto
                for( int j=segundoParametro ; j>=0 ; --j){//ancho
                    nuevosPixelesBit[cont1][cont2] = new Pixbitd_20576970_GajardoPonce(pixelesbit[j][i].getX(),pixelesbit[j][i].getY(),pixelesbit[j][i].getBit(),pixelesbit[j][i].getDepth());
                    cont2++;
                }
                cont2 =0;
                System.out.println("");
                cont1++;
            }
            System.out.println("**Imagen rotada 90 grados a la derecha**");
            System.out.println("Ancho:"+getAncho()+", Alto:"+getAlto()+"\n");
            for (int i=0 ; i<getAncho() ; i++){
                for( int j=0 ; j<getAlto() ; j++){
                    nuevosPixelesBit[i][j].setX(i);
                    nuevosPixelesBit[i][j].setY(j);
                    System.out.print(nuevosPixelesBit[i][j].toString());
                }
                System.out.println("");
            }
            setPixelesbit(nuevosPixelesBit);
            int a = getAlto();
            int b = getAncho();
            setAncho(a);
            setAlto(b);
        }
        if(isPixmap() == 1){
            Pixrgbd_20576970_GajardoPonce nuevosPixelesRgb[][] = new Pixrgbd_20576970_GajardoPonce[getAncho()][getAlto()];
                        
            System.out.println("dimensiones:"+getAncho()+","+getAlto());

            int cont1 = 0;
            int cont2 = 0;
            for (int i=0 ; i<primerParametro ; i++){//alto
                for( int j=segundoParametro ; j>=0 ; --j){//ancho
                    nuevosPixelesRgb[cont1][cont2] = new Pixrgbd_20576970_GajardoPonce(pixelesrgb[j][i].getX(),pixelesrgb[j][i].getY(),pixelesrgb[j][i].getR(),pixelesrgb[j][i].getG(),pixelesrgb[j][i].getB(),pixelesrgb[j][i].getDepth());
                    cont2++;
                }
                cont2 =0;
                System.out.println("");
                cont1++;
            }
            System.out.println("**Imagen rotada 90 grados a la derecha**");
            System.out.println("Ancho:"+getAncho()+", Alto:"+getAlto()+"\n");
            for (int i=0 ; i<getAncho() ; i++){
                for( int j=0 ; j<getAlto() ; j++){
                    nuevosPixelesRgb[i][j].setX(i);
                    nuevosPixelesRgb[i][j].setY(j);
                    System.out.print(nuevosPixelesRgb[i][j].toString());
                }
                System.out.println("");
            }
            setPixelesrgb(nuevosPixelesRgb);
            int a = getAlto();
            int b = getAncho();
            setAncho(a);
            setAlto(b);
        }
        if(isHexmap() == 1){
            Pixhexd_20576970_GajardoPonce nuevosPixelesHex[][] = new Pixhexd_20576970_GajardoPonce[getAncho()][getAlto()];
                        
            System.out.println("dimensiones:"+getAncho()+","+getAlto());

            int cont1 = 0;
            int cont2 = 0;
            for (int i=0 ; i<primerParametro ; i++){//alto
                for( int j=segundoParametro ; j>=0 ; --j){//ancho
                    nuevosPixelesHex[cont1][cont2] = new Pixhexd_20576970_GajardoPonce(pixeleshex[j][i].getX(),pixeleshex[j][i].getY(),pixeleshex[j][i].getHex(),pixeleshex[j][i].getDepth());
                    cont2++;
                }
                cont2 =0;
                System.out.println("");
                cont1++;
            }
            System.out.println("**Imagen rotada 90 grados a la derecha**");
            System.out.println("Ancho:"+getAncho()+", Alto:"+getAlto()+"\n");
            for (int i=0 ; i<getAncho() ; i++){
                for( int j=0 ; j<getAlto() ; j++){
                    nuevosPixelesHex[i][j].setX(i);
                    nuevosPixelesHex[i][j].setY(j);
                    System.out.print(nuevosPixelesHex[i][j].toString());
                }
                System.out.println("");
            }
            setPixeleshex(nuevosPixelesHex);
            int a = getAlto();
            int b = getAncho();
            setAncho(a);
            setAlto(b);
        }
        
    }

    /**
     * @param de entrada: PixelBit (Pixbit) X PixelRgb (Pixrgb) X PixelHex (PixHex)
     * @return de salida: No tiene
     * @Descripcion: Inserta los valores del pixel nuevo que el usuario haya ingresado en la matriz de pixeles del tipo que corresponda
     */
    public void changePixel(Pixbitd_20576970_GajardoPonce pixelBit, Pixrgbd_20576970_GajardoPonce pixelRgb, Pixhexd_20576970_GajardoPonce pixelHex){
        if(isBitmap() == 1){
            int x = pixelBit.getX();
            int y = pixelBit.getY();
            int b,d;
            for(int i=0 ; i< getAlto() ;i++){
                for(int j=0 ; j < getAncho() ; j++){
                    if ((pixelesbit[i][j].getX() == x) && (pixelesbit[i][j].getY() == y)){
                        b = pixelBit.getBit();
                        d = pixelBit.getDepth();
                        pixelesbit[i][j].setBit(b);
                        pixelesbit[i][j].setDepth(d);
                    }
                }
            }
        }
        if(isPixmap() == 1){
            int x = pixelRgb.getX();
            int y = pixelRgb.getY();
            int r,g,b,d;
            for(int i=0 ; i< getAlto() ;i++){
                for(int j=0 ; j < getAncho() ; j++){
                    if ((pixelesrgb[i][j].getX() == x) && (pixelesrgb[i][j].getY() == y)){
                        r = pixelRgb.getR();
                        g = pixelRgb.getG();
                        b = pixelRgb.getB();
                        d = pixelRgb.getDepth();
                        pixelesrgb[i][j].setR(r);
                        pixelesrgb[i][j].setG(g);
                        pixelesrgb[i][j].setB(b);
                        pixelesrgb[i][j].setDepth(d);
                    }
                }
            }
        }
        if(isHexmap() == 1){
            int x = pixelHex.getX();
            int y = pixelHex.getY();
            int d;
            String h;
            for(int i=0 ; i< getAlto() ;i++){
                for(int j=0 ; j < getAncho() ; j++){
                    if ((pixeleshex[i][j].getX() == x) && (pixeleshex[i][j].getY() == y)){
                        h = pixelHex.getHex();
                        d = pixelHex.getDepth();
                        pixeleshex[i][j].setHex(h);
                        pixeleshex[i][j].setDepth(d);
                    }
                }
            }
        }
    }
    
    /**
     * @param de entrada: No tiene
     * @return de salida: No tiene
     * @Descripcion: Invierte los colores simetricamente opuesto de la imagen solo si es del tipo pixmap
     * la función trabaja con la imagen solamente cambiando su matriz de pixeles
     */
    public void invertColorBit(){
        if(isBitmap() == 1){
            for(int i=0 ; i<getAlto() ; i++){
                for(int j=0 ; j<getAncho() ; j++){
                    if(pixelesbit[i][j].getBit() == 1){
                        pixelesbit[i][j].setBit(0);
                    }
                    else{
                        pixelesbit[i][j].setBit(1);
                    }
                }
            } 
        }
        else{
            System.out.println("Solo puede invertir una imagen del tipo Bitmap");
        }
    }
    
    /**
     * @param de entrada: No tiene
     * @return de salida: No tiene
     * @Descripcion: Invierte los colores simetricamente opuesto de la imagen solo si es del tipo pixmap
     * la función trabaja con la imagen solamente cambiando su matriz de pixeles
     */
    public void invertColorRGB(){
        int r,g,b;
        if(isPixmap() == 1){
            for(int i=0 ; i<getAlto() ; i++){
                for(int j=0 ; j<getAncho() ; j++){
                    r = Math.abs(pixelesrgb[i][j].getR()-255);
                    g = Math.abs(pixelesrgb[i][j].getG()-255);
                    b = Math.abs(pixelesrgb[i][j].getB()-255);
                    pixelesrgb[i][j].setR(r);
                    pixelesrgb[i][j].setG(g);
                    pixelesrgb[i][j].setB(b);
                }
            } 
        }
        else{
            System.out.println("Solo puede invertir una imagen del tipo Pixmap");
        }
    }
}








