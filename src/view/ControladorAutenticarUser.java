package view;

import datos.Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
import servAplicacion.GestorAutenticarUsuario;

/**
 *
 * @author Nahuel
 */
public class ControladorAutenticarUser implements ActionListener {

    //ControladorINICIAROP controlINICIAROP;
    AutenticarUser viewAutenticar;
    ControladorAsociarOP controlCALIDAD;
    ControladorINICIAROP controlLINEA;
    GestorAutenticarUsuario gestor = new GestorAutenticarUsuario();

    public ControladorAutenticarUser() {
        this.viewAutenticar = new AutenticarUser();

    }

    public void ejecutar() {
        this.viewAutenticar.setController(this);
        this.viewAutenticar.ejecutar();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
        if (ae.getActionCommand().equals(this.viewAutenticar.CONTINUAR)) {
            String user = viewAutenticar.getUser();
            String pass = viewAutenticar.getPass();
            if (buscarUsuario(user, pass).nombre().equals("SUPLINEA")) {
                controlLINEA = new ControladorINICIAROP();
                controlLINEA.ejecutar();
            } else if(this.buscarUsuario(user, pass).nombre().equals("SUPCALIDAD")){
                controlCALIDAD = new ControladorAsociarOP();
                controlCALIDAD.ejecutarController();
               
            }
            
        }
    }

    
    //BUSCAR_USUARIO
    public Usuario buscarUsuario(String user, String pass) {
        return this.gestor.buscarUsuario(user, pass);
    }
    

}
