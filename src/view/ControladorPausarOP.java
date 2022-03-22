
package view;

import datos.Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.LineaTrabajo;
import servAplicacion.GestorPausarOP;

/**
 *
 * @author Nahuel
 */
public class ControladorPausarOP implements ActionListener{
    MenuOP menuOp;
    GestorPausarOP gestor = new GestorPausarOP();

    public ControladorPausarOP(MenuOP menu) {
        this.menuOp = menu;
        menuOp.setControllerPausarOP(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals(menuOp.PauarOp)){
            this.pausarOP();
            menuOp.lblEstadoOp.setText(getEstado());
        }
    }
    //PAUSAR_OP
    public void pausarOP(){
        this.gestor.pausarOP();
    }
    
    
    
    
    public String getEstado(){
        return gestor.getEstadoOp();
    }
}
