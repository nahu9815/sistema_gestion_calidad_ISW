/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servAplicacion;

import modelo.LineaTrabajo;

/**
 *
 * @author Nahuel
 */
public class GestorFinalizarOP {

    static LineaTrabajo lineaT;
    
    

    //FINALIZAR_OP
    public void finalizarOP() {
        lineaT.finalizarOP();
    }

    //ACTUALIZA LA VISTA MOSTRANDO EL ESTADO..
    public String getEstadoOp() {
       return lineaT.getEstado();
    }
    
    
    
    static void setLinea(LineaTrabajo linea) {
        lineaT = linea;
    }
}
