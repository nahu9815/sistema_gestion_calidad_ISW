/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servAplicacion;

import modelo.*;

/**
 *
 * @author Nahuel
 */
public class GestorCargarDatosHermanado {

    public GestorCargarDatosHermanado() {
    }
    public static LineaTrabajo lineaT;
    

    
    //CONFIRMAR_DATOS_HERMANADO
    public void confirmarDatosHermanado(int primera, int segunda) {
        lineaT.confirmarDatosHermanado(primera,segunda);
    }




   public static void setLinea(LineaTrabajo linea){
        lineaT=linea;
    }    
    
}
