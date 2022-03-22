/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import datos.Repositorio;
import java.util.ArrayList;
import view.ControladorAutenticarUser;
import servAplicacion.GestorIniciarOP;
import servAplicacion.GestorRegistrarInspeccion;
/**
 *
 * @author Nahuel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Repositorio.iniciarlizar();
       
      
        ControladorAutenticarUser controller = new ControladorAutenticarUser();
        controller.ejecutar();
       
        Repositorio.ultimas4Horas();
        
        OrdenP op = new OrdenP(0023, null, null, null, null);
        op.setEstado(EstadoOrden.PAUSADA);
        boolean resultado = op.reanudarOP();
        System.out.println(""+resultado);
    }
    
}
