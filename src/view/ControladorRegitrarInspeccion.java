package view;

import datos.Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import modelo.Hallazgo;
import modelo.Defecto;
import modelo.LineaTrabajo;
import modelo.TipoDefecto;
import servAplicacion.GestorRegistrarInspeccion;

/**
 *
 * @author Nahuel
 */
public class ControladorRegitrarInspeccion implements ActionListener {

    ViewSupCalidad vistaOP;
    MenuCALIDAD menuCalidad;
    VisualizarDatos datosTiempoReal;
    InspeccionV3 inspeccionView;
    Hermanado herma;
    GestorRegistrarInspeccion gestorDef = new GestorRegistrarInspeccion();
    ControladorCargarDatosHermanado controladorHermanado;
    ControladorAbandonarOP controladorAbandonarOP;
    ArrayList<Defecto> listaDefecto = new ArrayList<>();
    ArrayList<Hallazgo> listaAux = new ArrayList<>();

    public ControladorRegitrarInspeccion() {
        this.menuCalidad = new MenuCALIDAD();
        
        this.controladorAbandonarOP = new ControladorAbandonarOP(menuCalidad);
    }

    public void ejecutar(int nroLinea){
            this.menuCalidad.setController(this);
            
            for (LineaTrabajo linea : Repositorio.getLineas()) {
                if (linea.getNumero() == nroLinea) {
                    menuCalidad.setColor(linea.getOrdenP().getColor().getDescripcion());
                    menuCalidad.setModelo(linea.getOrdenP().getModelo().getDenominacion());
                    menuCalidad.setEstadoOP(linea.getOrdenP().getEstado().toString());
                    menuCalidad.setNroOP("" + linea.getOrdenP().getNro());
                    menuCalidad.setLinea("" + linea.getNumero());
                }
            }
            this.menuCalidad.ejecutar();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals(this.menuCalidad.REGISTRAR_DEFECTOS)) {
            this.inspeccionView = new InspeccionV3();
            this.datosTiempoReal = new VisualizarDatos();
            this.inspeccionView.setController(this);
            this.datosTiempoReal.setController(this);
            this.actualizarViewDatosTiempoReal();

            for (LineaTrabajo linea : Repositorio.getLineas()) {
                if (linea.getNumero() == this.menuCalidad.getLinea()) {
                    this.crearInspeccion();
                    for (Defecto defOb : gestorDef.getDefObs()) {
                        String fila[] = {defOb.getNombre()};
                        this.inspeccionView.llenarTablaOBS(fila);
                    }
                    for (Defecto defRep : gestorDef.getDefRep()) {
                        String fila[] = {defRep.getNombre()};
                        this.inspeccionView.llenarTablaREP(fila);
                    }

                }
            }
            this.inspeccionView.ejecutar();
            this.datosTiempoReal.ejecutar();

        }

        //ENVIAR A PRIMERA
        if (ae.getActionCommand().equals(this.inspeccionView.A_PRIMERA)) {
            this.enviarAPrimera();
            this.traerDatos();
            this.actualizarViewDatosTiempoReal();
        }

        if(ae.getActionCommand().equals(this.inspeccionView.QUITAR_PRIMERA)){
            this.quitarAPrimera();
            this.traerDatos();
            this.actualizarViewDatosTiempoReal();
        }
        

        if (ae.getActionCommand().equals(this.menuCalidad.CARGAR_HERMANADO)) {
            
            controladorHermanado = new ControladorCargarDatosHermanado();
            controladorHermanado.ejecutar();
        }
 
        //AGREGAR_DEFECTO
        if (ae.getActionCommand().equals(this.inspeccionView.AGREGAR_DEFECTO)) {
    

            int fila1 = this.inspeccionView.tbtDefectosREP.getSelectedRow();
            int fila2 = this.inspeccionView.tbtDefectosOBS.getSelectedRow();

            if (this.inspeccionView.rbPieIzq.isSelected()) {
                System.out.println(this.inspeccionView.rbPieIzq.getText());
                if (this.inspeccionView.tbtDefectosREP.isColumnSelected(0)) {

                    this.registrarInspeccion(this.inspeccionView.rbPieIzq.getText(), this.inspeccionView.tbtDefectosREP.getValueAt(fila1, 0).toString(),TipoDefecto.REPROCESO);
                } else if (this.inspeccionView.tbtDefectosOBS.isColumnSelected(0)) {

                    this.registrarInspeccion(this.inspeccionView.rbPieIzq.getText(), this.inspeccionView.tbtDefectosOBS.getValueAt(fila2, 0).toString(),TipoDefecto.OBSERVADO);
                }

            } else if (this.inspeccionView.rbPieDer.isSelected()) {
                System.out.println(this.inspeccionView.rbPieDer.getText());
                if (this.inspeccionView.tbtDefectosREP.isColumnSelected(0)) {

                    this.registrarInspeccion(this.inspeccionView.rbPieDer.getText(), this.inspeccionView.tbtDefectosREP.getValueAt(fila1, 0).toString(),TipoDefecto.REPROCESO);
                } else if (this.inspeccionView.tbtDefectosOBS.isColumnSelected(0)) {

                    this.registrarInspeccion(this.inspeccionView.rbPieDer.getText(), this.inspeccionView.tbtDefectosOBS.getValueAt(fila2, 0).toString(),TipoDefecto.OBSERVADO);
                }
            }
            this.actualizarViewDatosTiempoReal();
            this.mostrarDatosCargadosEnTiempo();
        }
        if (ae.getActionCommand().equals(this.inspeccionView.QUITAR_DEFECTO)) {
            int fila1 = this.inspeccionView.tbtDefectosREP.getSelectedRow();
            int fila2 = this.inspeccionView.tbtDefectosOBS.getSelectedRow();
            /*if (this.inspeccionView.tbtDefectosREP.isColumnSelected(0)) {

                this.quitarDefecto(this.inspeccionView.tbtDefectosREP.getValueAt(fila1, 0).toString(),TipoDefecto.REPROCESO);
            } else if (this.inspeccionView.tbtDefectosOBS.isColumnSelected(0)) {

                this.quitarDefecto(this.inspeccionView.tbtDefectosOBS.getValueAt(fila2, 0).toString(),TipoDefecto.OBSERVADO);
            }*/
            if (this.inspeccionView.rbPieIzq.isSelected()) {
                System.out.println(this.inspeccionView.rbPieIzq.getText());
                if (this.inspeccionView.tbtDefectosREP.isColumnSelected(0)) {

                    this.quitarDefecto(this.inspeccionView.rbPieIzq.getText(), this.inspeccionView.tbtDefectosREP.getValueAt(fila1, 0).toString(),TipoDefecto.REPROCESO);
                } else if (this.inspeccionView.tbtDefectosOBS.isColumnSelected(0)) {

                    this.quitarDefecto(this.inspeccionView.rbPieIzq.getText(), this.inspeccionView.tbtDefectosOBS.getValueAt(fila2, 0).toString(),TipoDefecto.OBSERVADO);
                }

            } else if (this.inspeccionView.rbPieDer.isSelected()) {
                System.out.println(this.inspeccionView.rbPieDer.getText());
                if (this.inspeccionView.tbtDefectosREP.isColumnSelected(0)) {

                    this.quitarDefecto(this.inspeccionView.rbPieDer.getText(), this.inspeccionView.tbtDefectosREP.getValueAt(fila1, 0).toString(),TipoDefecto.REPROCESO);
                } else if (this.inspeccionView.tbtDefectosOBS.isColumnSelected(0)) {

                    this.quitarDefecto(this.inspeccionView.rbPieDer.getText(), this.inspeccionView.tbtDefectosOBS.getValueAt(fila2, 0).toString(),TipoDefecto.OBSERVADO);
                }
            }
            this.actualizarViewDatosTiempoReal();
            this.mostrarDatosCargadosEnTiempo();
        }
       
        if(ae.getActionCommand().equals(this.inspeccionView.VOLVER)){
            this.inspeccionView.setVisible(false);
            this.datosTiempoReal.setVisible(false);
        }

    }

    public void actualizarViewDatosTiempoReal() {
        for (LineaTrabajo linea : Repositorio.getLineas()) {
            if (linea.getNumero() == this.menuCalidad.getLinea()) {
                datosTiempoReal.setColor(linea.getOrdenP().getColor().getDescripcion());
                datosTiempoReal.setModelo(linea.getOrdenP().getModelo().getDenominacion());
                datosTiempoReal.setObjetivoHora("" + linea.getOrdenP().getModelo().getObjetivoHora());
                datosTiempoReal.setOP("" + linea.getOrdenP().getNro());
                datosTiempoReal.setLinea("" + linea.getNumero());
                datosTiempoReal.setTOTPRimera(this.traerDatos());

                //ULTIMAS 4 HORAS
                datosTiempoReal.lblDef1.setText(Repositorio.getLista3Defecto().get(0).getNombre());
                datosTiempoReal.lblDef2.setText(Repositorio.getLista3Defecto().get(1).getNombre());
                datosTiempoReal.lblDef3.setText(Repositorio.getLista3Defecto().get(2).getNombre());
                datosTiempoReal.lblCantDef1.setText("" + Repositorio.getLista3Defecto().get(0).getOcurrencia());
                datosTiempoReal.lblCantDef2.setText("" + Repositorio.getLista3Defecto().get(1).getOcurrencia());
                datosTiempoReal.lblCantDef3.setText("" + Repositorio.getLista3Defecto().get(2).getOcurrencia());
                String fila[] = {"" + this.traerDatos()};
                datosTiempoReal.cargarTabla(fila);
            }
        }
    }

    //MUESTRA_DATOS_DE_DEFECTOS_CARGADOS_EN_EL_MOMENTO
    public void mostrarDatosCargadosEnTiempo() {
        datosTiempoReal.txtDefectosEncontrados.setText(null);
        for (Hallazgo hallazgo : gestorDef.traerDatosDefecto()) {
            datosTiempoReal.txtDefectosEncontrados.append("Hallazgo: " + hallazgo.getDef().getNombre() + " Ocurrencia: " + hallazgo.getOcurrencia() +" Tipo de pie: "+hallazgo.getTipoPie()+"Tipo Defecto: "+hallazgo.getDef().getTipo()+ "\n");
        }
    }


    //CREAR_INSPECCION
    public void crearInspeccion() {
        gestorDef.crearInspeccion();
    }

    //REGISTRAR_INSPECCION
    public void registrarInspeccion(String tipoPie, String nombreDef,TipoDefecto tipoDef) {
        gestorDef.registrarInspeccion(tipoPie, nombreDef,tipoDef);
    }

    //QUITAR_DEFECTO
    public void quitarDefecto(String tipoPie,String nombreDef,TipoDefecto tipoDef) {
        gestorDef.quitarDefecto(tipoPie,nombreDef,tipoDef);
    }

    //ENVIAR A PRIMERA
    public void enviarAPrimera() {

        gestorDef.enviarAPrimera();
    }
    //QUITAR_A_PRIMERA
    public void quitarAPrimera(){
        gestorDef.quitarAPrimera();
    }

    //TRAER_DATOS_DE_PRIMERA
    public int traerDatos() {
        return this.gestorDef.traerDatos();
    }

   
}
