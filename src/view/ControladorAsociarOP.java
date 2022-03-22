
package view;

import datos.Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.LineaTrabajo;
import servAplicacion.GestorAsociarOP;

/**
 *
 * @author Nahuel
 */
public class ControladorAsociarOP  implements ActionListener{
    ViewSupCalidad vistaOP;
    GestorAsociarOP gestor = new GestorAsociarOP();
    ControladorRegitrarInspeccion controlReg;
    public ControladorAsociarOP() {
    }
    
    public void ejecutarController() {
        this.vistaOP = new ViewSupCalidad();
        this.vistaOP.setController(this);
        this.vistaOP.ejecutar();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getActionCommand().equals(this.vistaOP.CONTINUAR)) {
           
           controlReg = new ControladorRegitrarInspeccion();
           
           asociarOP();
           
           seleccionarLinea(Integer.parseInt(vistaOP.cbLINEACalidad.getSelectedItem().toString()));
           gestor.setLinea();
           controlReg.ejecutar(vistaOP.getLinea());
           
        }
       
    }
    
    //ASOCIAR_OP
    public void asociarOP(){
        this.gestor.asociarOP();
    }
    
    //SELECCIONAR_LINEA
    public void seleccionarLinea(int nroLinea) {
        gestor.seleccionarLinea(nroLinea);
    }
    
    
    
}
