
package servAplicacion;

import datos.Repositorio;
import modelo.*;

/**
 *
 * @author Nahuel
 */
public class GestorAutenticarUsuario {
    static Usuario u;
    public Usuario buscarUsuario(String user, String pass) {
        u = Repositorio.getUsuario(user, pass);
        return u;
    }

    public static Usuario getU() {
        return u;
    }

    

}
