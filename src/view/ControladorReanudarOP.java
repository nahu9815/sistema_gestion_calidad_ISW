
package view;

import datos.Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.LineaTrabajo;
import servAplicacion.GestorReanudarOP;

/**
 *
 * @author Nahuel
 */
public class ControladorReanudarOP implements ActionListener{

    MenuOP menuOp;
    GestorReanudarOP gestor = new GestorReanudarOP();
    public ControladorReanudarOP(MenuOP menu) {
        this.menuOp=menu;
        menuOp.setControllerReanudarOP(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       if (ae.getActionCommand().equals(menuOp.ReaundarOP)) {
            if (reanudarOP() == true) {
                JOptionPane.showMessageDialog(null, "OP REANUDADA CON ÉXITO");
                
                menuOp.lblEstadoOp.setText(this.getEstado());
            } else {
                JOptionPane.showMessageDialog(null, "No se puede reanudar la OP");
            }
        }
    }
    
    
    //REANUDAR_OP
    public boolean reanudarOP(){
        return this.gestor.reanudarOP();
    }
    
    
    public String getEstado(){
        return gestor.getEstadoOp();
    }
    
     
    
}
