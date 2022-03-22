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
public class OrdenP {

    private int nro;
    private Modelo modelo;
    private Color color;
    private EstadoOrden estado;
    private ArrayList<Hallazgo> listaDefPie = new ArrayList<>();
    private DetalleDia detalle;
    private ArrayList<DetalleDia> listaDetalleDia;
    private ArrayList<Inspeccion> listaPeriodo;

    public OrdenP(int nro, Modelo modelo, Color color, String fecha, Turno t) {
        this.nro = nro;
        this.modelo = modelo;
        this.color = color;
        this.estado = estado.PROCESO;
        listaDetalleDia = new ArrayList<>();
        detalle = new DetalleDia(fecha, t);
        listaDetalleDia.add(detalle);
    }

    public OrdenP() {
    }

    
    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public EstadoOrden getEstado() {
        return estado;
    }

    public void setEstado(EstadoOrden estado) {
        this.estado = estado;
    }

   

    public ArrayList<Defecto> getListaDefectos() {
        return listaDefectos;
    }

    public void setListaDefectos(ArrayList<Defecto> listaDefectos) {
        this.listaDefectos = listaDefectos;
    }

    public String getHoraDeInicio() {
        return horaDeInicio;
    }

    public void setHoraDeInicio(String horaDeInicio) {
        this.horaDeInicio = horaDeInicio;
    }

    public SupLinea getEmpleado() {
        return empleado;
    }

    public void setEmpleado(SupLinea empleado) {
        this.empleado = empleado;
    }

    public void agregarTurno(Turno turn) {
        this.listaTurno.add(turn);
    }

    public DetalleDia getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleDia detalle) {
        this.detalle = detalle;
    }
    

    //PAUSAR_OP
    public void pausarOP() {
        if (this.getEstado().equals(estado.PROCESO)) {
            this.setEstado(EstadoOrden.PAUSADA);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede pausar la OP");
        }

    }
    
    

    //FINALIZAR_OP
    public void finalizarOP() {
            this.setEstado(EstadoOrden.FINALIZADA);
    }
    
    //FINALIZAR_OP
    public boolean finalizarOrdenP() {
        if(this.getEstado().equals(estado.PAUSADA)){
            this.setEstado(EstadoOrden.FINALIZADA);
            return true;
        }else{
            return false;
        }
    }

    //REGISTRAR_INSPECCION
    public void registrarInspeccion(String tipoPie, Defecto def, String hora,Usuario us) {
        
        detalle.registrarInspeccion(tipoPie, def, hora,us);
       

    }

    //QUITAR_DEFECTO
    public void quitarDefecto(String tipoPie,Defecto def,TipoDefecto tipoDef) {
        detalle.quitarDefecto(tipoPie,def,tipoDef);
    }

    //ENVIAR A PRIMERA
    public void enviarAPrimera() {
        detalle.enviarAPrimera();
    }

    //QUITAR_A_PRIMERA
    public void quitarAPrimera() {
        detalle.quitarAPrimera();
    }
    //CONFIRMAR_REANUDACION_OP
    public boolean reanudarOP() {
        if (this.estado.equals(EstadoOrden.PAUSADA)) {
            this.setEstado(EstadoOrden.PROCESO);
            return true;
        } else {
            return false;
        }
    }
    //PAUSAR_OP
    public boolean pausarOrdenP(){
        if (this.getEstado().equals(estado.PROCESO)) {
            this.setEstado(EstadoOrden.PAUSADA);
            return true;
        } else {
            return false;
        }
    }

    //CONFIRMAR_DATOS_HERMANADO
    public void confirmarDatosHermanado(int primera, int segunda) {
        detalle.cargarDatosHermanado(primera, segunda);
    }

    //TRAER_DATOS_DE_PRIMERA
    public int trarDatos() {
        return detalle.traerDatos();
    }

    //CREAR_INSPECCION
    public void crearInspeccion(String hora,Usuario us) {
        int pos = detalle.getListaInspeccion().size();
        if(detalle.getListaInspeccion().size()==0){
            detalle.crearInspeccion(hora,us);
        }else if(detalle.getListaInspeccion().get(pos-1).getHora().equals(hora)&&detalle.getListaInspeccion().get(pos-1).getSupCalidad().equals(us)){
            System.out.println("Ya existe una inspección creada a esta hora");
        }else{
            detalle.crearInspeccion(hora, us);
        }
        
    }
    
    
    private ArrayList<Defecto> listaDefectos;
    private ArrayList<Turno> listaTurno;
    private String horaDeInicio;
    private SupLinea empleado;

    
    //OBTENGO_DATOS_DE_DEFECTOS_CARGADOS_EN_EL_MOMENTO
    public ArrayList<Hallazgo> traerDatosDefecto(){
        return this.detalle.traerDatosDefecto();
    }

   

   
}
