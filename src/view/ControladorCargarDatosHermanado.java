package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import servAplicacion.GestorCargarDatosHermanado;

/**
 *
 * @author Nahuel
 */
public class ControladorCargarDatosHermanado implements ActionListener {

    GestorCargarDatosHermanado gestor = new GestorCargarDatosHermanado();
    Hermanado herma;

    public ControladorCargarDatosHermanado() {
    }


    public void ejecutar() {
        herma = new Hermanado();
        this.herma.setController(this);
        this.herma.ejecutar();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals(this.herma.REGISTRAR_HERMA)) {
            this.confirmarDatosHermanado(this.herma.getCantPrimera(), this.herma.getCantSegunda());
        }
        if (ae.getActionCommand().equals(this.herma.CANCELAR_HERMA)) {
            this.herma.setVisible(false);
        }

    }

    //CONFRIMAR_DATOS_HERMANADO
    public void confirmarDatosHermanado(int primera, int segunda) {
        gestor.confirmarDatosHermanado(primera, segunda);
    }
    
}
