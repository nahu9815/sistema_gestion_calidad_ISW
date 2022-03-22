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
public class SupLinea extends Usuario{
   public SupLinea(String dni, String pass) {
        super(dni,pass);
    }
   public SupLinea(){
       
   }

    
   
   @Override
   public String nombre(){
       return "SUPLINEA";
   }
    
}
