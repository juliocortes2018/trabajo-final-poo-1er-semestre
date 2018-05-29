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
public class Factura {
    Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    int noches;
    

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    
    
    public  String calcular(){
     int temp;
     temp = noches*cliente.getHabiacion().getPrecio();
     return temp +""; 
    }
    
    public  String impfac(){
    
    return "Precio Total por " +noches  + " noches es de : "+ calcular() +" muchas gracias por su compra "+cliente.nombre+" "+cliente.cedula;
    
    }
    
    
}
