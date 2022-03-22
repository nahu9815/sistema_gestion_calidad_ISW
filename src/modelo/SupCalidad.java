/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Nahuel
 */
public class SupCalidad extends Usuario{

    public SupCalidad(String dni, String pass) {
        super(dni,pass);
    }

    public SupCalidad() {
    }

    @Override
    public String nombre() {
        return "SUPCALIDAD";
    }
   
        
}
