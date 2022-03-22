package servAplicacion;

import datos.Repositorio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author Nahuel
 */
public class GestorRegistrarInspeccion {

    ArrayList<Defecto> listaDefecto;
    static LineaTrabajo linea;
    ArrayList<LineaTrabajo> listLinea;
    String hora;
    static Usuario usuario;

    public GestorRegistrarInspeccion() {
        usuario = GestorAutenticarUsuario.getU();
    }

    public ArrayList<Defecto> getListaDefectos() {
        return listaDefecto;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setListaDefectos(ArrayList<Defecto> listaDefectos) {
        this.listaDefecto = listaDefectos;
    }

    public ArrayList<Defecto> getDefRep() {
        return defRep;
    }

    public void setDefRep(ArrayList<Defecto> defRep) {
        this.defRep = defRep;
    }

    public ArrayList<Defecto> getDefObs() {
        return defObs;
    }

    public void setDefObs(ArrayList<Defecto> defObs) {
        this.defObs = defObs;
    }

    //REGISTRAR_DEFECTO
    public void crearInspeccion() {

        listaDefecto = Repositorio.obtenerDefecto();
        separarDefecto();
        hora = Repositorio.getHoraActual();

        linea.crearInspeccion(hora, usuario);

    }

    //SEPARAR_DEFECTO
    public void separarDefecto() {
        defObs.clear();
        defRep.clear();

        for (Defecto def : listaDefecto) {

            if (TipoDefecto.OBSERVADO.equals(def.getTipo())) {
                defObs.add(def);
            } else if (TipoDefecto.REPROCESO.equals(def.getTipo())) {
                defRep.add(def);
            }
        }

    }

    //REGISTRAR_INSPECCION
    public void registrarInspeccion(String tipoPie, String nombreDef, TipoDefecto tipoDef) {
        Defecto def = buscar(nombreDef, tipoDef);
        hora = Repositorio.getHoraActual();
        linea.registrarInspeccion(tipoPie, def, hora, usuario);

    }

    //QUITAR
    public void quitarDefecto(String tipoPie, String nombreDef, TipoDefecto tipoDef) {
        Defecto def = buscar(nombreDef, tipoDef);
        linea.quitarDefecto(tipoPie, def, tipoDef);
    }

    //ENVIAR A PRIMERA
    public void enviarAPrimera() {
        linea.enviarAPrimera();
    }
    //QUITAR_A_PRIMERA
    public void quitarAPrimera() {
        linea.quitarAPrimera();
    }

    //BUSCAR_DEFECTO
    public Defecto buscar(String nombreDef, TipoDefecto tipoDef) {
        for (Defecto defecto : listaDefecto) {
            if (defecto.getTipo().toString().equals(tipoDef.toString()) && defecto.getNombre().equals(nombreDef)) {
                System.out.println("Defecto " + defecto.getNombre() + " tipo " + defecto.getTipo());
                return defecto;

            }
        }
        return null;
    }

    //TRAER_DATOS DE PARES A PRIMERA
    public int traerDatos() {
        return linea.traerDatos();
    }

    //OBTENGO_DATOS_DE_DEFECTOS_CARGADOS_EN_EL_MOMENTO
    public ArrayList<Hallazgo> traerDatosDefecto() {
        return this.linea.traerDatosDefecto();
    }

    ArrayList<Defecto> defRep = new ArrayList<>();
    ArrayList<Defecto> defObs = new ArrayList<>();

    public static void setLinea(LineaTrabajo lineaT) {
        linea = lineaT;
        System.out.println("Numero linea" + linea.getNumero());
    }

    
}
