
package view;

import datos.Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.LineaTrabajo;
import servAplicacion.GestorFinalizarOP;

/**
 *
 * @author Nahuel
 */
public class ControladorFinalizarOP implements ActionListener{

    MenuOP menuOp;
    GestorFinalizarOP gestor = new GestorFinalizarOP();
    public ControladorFinalizarOP(MenuOP menu) {
        this.menuOp = menu;
        menuOp.setControllerFinalizarOP(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals(menuOp.FinalizarOP)) {
            finalizarOP();
            menuOp.lblEstadoOp.setText(getEstado());
            menuOp.btnMenuInicarOP.setEnabled(true);
            System.out.println("FUNCIONA"); 
        }
    }
    
    //FINALIZAR_OP
    public void finalizarOP(){
        this.gestor.finalizarOP();
    }
    
    
    
    public String getEstado(){
        return gestor.getEstadoOp();
    }
}
