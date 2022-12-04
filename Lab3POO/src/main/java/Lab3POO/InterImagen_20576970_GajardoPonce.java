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
public interface InterImagen_20576970_GajardoPonce {
    public void mostrarElementos();
    public int isBitmap();
    public int isPixmap();
    public int isHexmap();
    public int isCompressed(int anch, int alt);
    public void flipH();
    public void flipV();
    public void crop(int x1, int y1, int x2, int y2);
    public void imgRGBToHex();
    public void histogram();
    public void rotate90();
    public void changePixel(Pixbitd_20576970_GajardoPonce pixelBit, Pixrgbd_20576970_GajardoPonce pixelRgb, Pixhexd_20576970_GajardoPonce pixelHex);
    public void invertColorBit();
    public void invertColorRGB();
}
