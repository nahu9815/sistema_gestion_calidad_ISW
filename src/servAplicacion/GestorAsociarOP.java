/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servAplicacion;

import datos.Repositorio;
import java.util.ArrayList;
import modelo.LineaTrabajo;
import modelo.Usuario;

/**
 *
 * @author Nahuel
 */
public class GestorAsociarOP {
    
    ArrayList<LineaTrabajo> listLinea;
    LineaTrabajo linea;
    static Usuario us;
    
    public GestorAsociarOP() {
        us = GestorAutenticarUsuario.getU();
    }
   
    //CONFIRMAR_LINEA
    public void seleccionarLinea(int nroLinea) {
        this.getLinea(nroLinea);
        linea.seleccionarLinea(us);
    }
    //ASOCIAR_OP
    public void asociarOP(){
       listLinea = Repositorio.getLineas();
    }
    //SELECCIONAR_LINEA
    public void getLinea(int nroLinea) {
        
        for (LineaTrabajo lin : listLinea) {
            if (lin.getNumero() == nroLinea) {
                linea = lin;
            }
        }
    }
    
    
    
    
    
    
    
     public void setLinea(){
        GestorRegistrarInspeccion.setLinea(linea);
        GestorCargarDatosHermanado.setLinea(linea);
        GestorAbandonarOP.setLinea(linea);
    }
}
