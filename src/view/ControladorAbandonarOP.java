
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.LineaTrabajo;
import servAplicacion.GestorAbandonarOP;

/**
 *
 * @author Nahuel
 */
public class ControladorAbandonarOP implements ActionListener{
    
    GestorAbandonarOP gestor = new GestorAbandonarOP();
    MenuCALIDAD menuCalidad;
    public ControladorAbandonarOP(MenuCALIDAD menu) {
        this.menuCalidad = menu;
        menuCalidad.setControllerAbandonarOP(this);
        
    }

    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        //ABANDONAR_OP
        if (ae.getActionCommand().equals(this.menuCalidad.ABANDONAR_OP)) {
            this.abandonarOP();
            this.menuCalidad.setVisible(false);
        }
    }
    //CONFIRMAR_ABANDONO
    public void abandonarOP() {
        this.gestor.abandonarOP();
    }
}
