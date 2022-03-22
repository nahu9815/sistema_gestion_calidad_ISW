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
public class GestorReanudarOP {

    
    static LineaTrabajo lineaT;
    

    //CONFIRMAR_REANUDAR_OP
    public boolean reanudarOP() {
        return lineaT.reanudarOP();
    }

    
    public String getEstadoOp() {
        return lineaT.getEstado();
    }
    
    
    static void setLinea(LineaTrabajo linea) {
        lineaT = linea;
    }

}
