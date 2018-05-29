/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_rusia_2018;

/**
 *
 * @author ANDRESYANDREA
 */
public class Cliente extends Persona{
    
    Habitacion habiacion;

    public Cliente(Habitacion habiacion) {
        this.habiacion = habiacion;
    }
    

    public Cliente() {
    }

    public Habitacion getHabiacion() {
        return habiacion;
    }

    public void setHabiacion(Habitacion habiacion) {
        this.habiacion = habiacion;
    }

    
    
}
