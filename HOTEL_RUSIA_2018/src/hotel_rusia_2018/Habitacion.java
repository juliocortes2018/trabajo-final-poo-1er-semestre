/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_rusia_2018;

import javax.swing.ImageIcon;

/**
 *
 * @author ANDRESYANDREA
 */
public class Habitacion {
    
   int precio;
   String nombre;
   ImageIcon image;

    public Habitacion(int precio, String nombre, ImageIcon image) {
        this.precio = precio;
        this.nombre = nombre;
        this.image = image;
    }

    public Habitacion() {
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
   
   
   
    
    
    
}
