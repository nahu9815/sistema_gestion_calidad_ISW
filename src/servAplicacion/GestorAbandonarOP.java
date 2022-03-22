
package servAplicacion;

import modelo.LineaTrabajo;


/**
 *
 * @author Nahuel
 */
public class GestorAbandonarOP  {
    static LineaTrabajo linea;

    
    public GestorAbandonarOP() {
        
    }
   
    //CONFIRMAR_ABANDONO
    public void abandonarOP() {
        linea.abandonarOP();
    }
    
    
    
    
    
    
    
     public static void setLinea(LineaTrabajo lineaT) {
        linea = lineaT;
        System.out.println("Numero linea" + linea.getNumero());
    }
    
}
