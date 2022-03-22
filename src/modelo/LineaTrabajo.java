/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Repositorio;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Nahuel
 */
public class LineaTrabajo {

    private int numero;
    private OrdenP ordenP;
    private SupLinea supL = new SupLinea();
    private SupCalidad supC = new SupCalidad();
    private ArrayList<OrdenP> listaOrdenP = new ArrayList<>();

    public LineaTrabajo() {
    }

    public LineaTrabajo(int numero, OrdenP ordenP) {
        this.numero = numero;
        this.ordenP = ordenP;
    }

    //CREAR OP
    public void crearOP(int nroOp, Modelo modelo, Color color, String fecha, Turno t, Usuario us) {
        ordenP = new OrdenP(nroOp, modelo, color, fecha, t);
        listaOrdenP.add(ordenP);

        this.setSupL((SupLinea) us);//ASOCIO EL EMPLEADO A ESTA LINEA
        System.out.println("Linea seleccionada: " + this.numero);
    }

    public OrdenP getOrdenP() {
        return ordenP;
    }

    public void setOrdenP(OrdenP ordenP) {
        this.ordenP = ordenP;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public SupLinea getSupL() {
        return supL;
    }

    public void setSupL(SupLinea supL) {
        this.supL = supL;
    }

    public SupCalidad getSupC() {
        return supC;
    }

    public void setSupC(SupCalidad supC) {
        this.supC = supC;
    }

    //AGREGAR_DEFECTO
    public void registrarInspeccion(String tipoPie, Defecto def, String hora, Usuario us) {
        ordenP.registrarInspeccion(tipoPie, def, hora, us);

    }

    //QUITAR_DEFECTO
    public void quitarDefecto(String tipoPie, Defecto def, TipoDefecto tipoDef) {
        ordenP.quitarDefecto(tipoPie, def, tipoDef);
    }

    //ENVIAR A PRIMERA
    public void enviarAPrimera() {
        ordenP.enviarAPrimera();
    }

    //QUITAR_A_PRIMERA
    public void quitarAPrimera() {
        ordenP.quitarAPrimera();
    }

    //CONFIRMAR_ABANDONO
    public void abandonarOP() {
        System.out.println("El supervisor de calidad: " + this.supC.getDni() + " abandono la op");
        this.supC = null;

    }

    //CONFIRMAR_PAUSA_OP
    public void pausarOP() {
        this.ordenP.pausarOP();
    }

    //CONFIRMAR_REANUDAR_OP
    public boolean reanudarOP() {
        return ordenP.reanudarOP();
    }

    //FINALIZAR_OP
    public void finalizarOP() {
        ordenP.finalizarOP();
    }

    //TRAER_DATOS_DE_PRIMERA
    public int traerDatos() {
        return ordenP.trarDatos();
    }

    //CONFIRMAR_LINEA
    public void seleccionarLinea(Usuario us) {
        this.setSupC((SupCalidad) us);
        System.out.println("El supervisor de calidad: " + this.supC.getDni() + " Se asocio a la linea: " + this.numero);
    }

    //CONFIRMAR_DATOS_HERMANADO
    public void confirmarDatosHermanado(int primera, int segunda) {
        ordenP.confirmarDatosHermanado(primera, segunda);
    }

    //CREAR_INSPECCION
    public void crearInspeccion(String hora, Usuario us) {
        if (ordenP.getEstado().equals(EstadoOrden.PROCESO)) {
            ordenP.crearInspeccion(hora, us);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede realizar la operacion");
        }

    }

    //OBTENGO_DATOS_DE_DEFECTOS_CARGADOS_EN_EL_MOMENTO
    public ArrayList<Hallazgo> traerDatosDefecto() {
        return ordenP.traerDatosDefecto();
    }

    public String getEstado() {
        return ordenP.getEstado().toString();
    }

}
