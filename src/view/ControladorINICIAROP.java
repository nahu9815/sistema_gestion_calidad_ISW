package view;

import datos.Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.*;
import servAplicacion.GestorIniciarOP;
import view.*;

public class ControladorINICIAROP implements ActionListener {

    private MenuOP vistaPrincipal;
    private IniciarOP vista2;
    private ControladorFinalizarOP controladorFin;
    private ControladorPausarOP controladorPausa;
    private ControladorReanudarOP controladorReanudar;
    private Repositorio datos = new Repositorio();
    private GestorIniciarOP gestor = new GestorIniciarOP();
    
    public ControladorINICIAROP() {
        this.vistaPrincipal = new MenuOP();
        this.vista2 = new IniciarOP();
        
        this.controladorPausa = new ControladorPausarOP(vistaPrincipal);
        this.controladorReanudar = new ControladorReanudarOP(vistaPrincipal);
        this.controladorFin = new ControladorFinalizarOP(vistaPrincipal);

    }

    public void ejecutar() {
        vistaPrincipal.setController(this);
        
       verificar();
    }

    public void verificar() {
        for (LineaTrabajo linea : Repositorio.getLineas()) {
            if (linea.getSupL().equals(GestorIniciarOP.getUs())) {

                vistaPrincipal.setLinea(linea.getNumero());
                vistaPrincipal.setNroOP(linea.getOrdenP().getNro());
                vistaPrincipal.setEstado(linea.getOrdenP().getEstado().toString());
                vistaPrincipal.setSupLinea(linea.getSupL().getDni());
                vistaPrincipal.btnMenuInicarOP.setEnabled(false);

                vistaPrincipal.ejecutar();
            } else {
                vistaPrincipal.ejecutar();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals(vistaPrincipal.IniciarOP)) {

            this.vistaPrincipal.setVisible(false);

            this.vista2.setController(this);
            this.iniciarOP();
            this.cargarCB();
            this.vista2.ejecutar();
        }
        if (ae.getActionCommand().equals(vista2.INICIAROrden)) {
            String color = vista2.cbColor.getSelectedItem().toString();
            String modelo = vista2.cbModelo.getSelectedItem().toString();
            int nroLinea = Integer.parseInt(vista2.cbLinea.getSelectedItem().toString());
            int nrOp = Integer.parseInt(vista2.txtNroOp.getText());
            this.confirmarInicio(nrOp,nroLinea, modelo, color);
            this.vista2.setVisible(false);
            verificar();
            gestor.setLinea();
            this.vistaPrincipal.setVisible(true);
        }
        if (ae.getActionCommand().equals(vista2.cancelar)) {
            this.vista2.setVisible(false);
            this.vistaPrincipal.setVisible(true);
        }
        
        

        
        
        if (ae.getActionCommand().equals(vistaPrincipal.VOLVER)) {
            this.vistaPrincipal.setVisible(false);
        }
    }
    public void cargarCB(){
        for (LineaTrabajo linea : gestor.listaL) {
            if(linea.getOrdenP()==null){
                this.vista2.cbLinea.addItem(""+linea.getNumero());
            }
         }
        for (Modelo modelo : gestor.listaM) {
            this.vista2.cbModelo.addItem(modelo.getDenominacion());
        }
        for (Color color : gestor.ListaC) {
            this.vista2.cbColor.addItem(color.getDescripcion());
        }
    }
    
    
    

    //INICIAR_OP(VISTA)
    public void iniciarOP(){
        gestor.iniciarOP();
    }
    
    //CONFIRMAR_INICIO
    public void confirmarInicio(int nroOp,int nroLinea,String modelo,String color){
        gestor.confirmarInicio(nroOp,nroLinea, modelo, color);
    }
    
    
    
    
}
