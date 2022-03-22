package servAplicacion;

import datos.Repositorio;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author Nahuel
 */
public class GestorIniciarOP {

    public ArrayList<LineaTrabajo> listaL;
    public ArrayList<Modelo> listaM;
    public ArrayList<Color> ListaC;
    public LineaTrabajo lineaT;
    Modelo mod;
    Color col;
    static Usuario us;
    public GestorIniciarOP() {
        us = GestorAutenticarUsuario.getU();
    }

    //INICIAR_OP
    public void iniciarOP() {
        listaL = Repositorio.getLineas();
        listaM = Repositorio.getModelos();
        ListaC = Repositorio.getColores();
    }

    //CONFIRMAR_OP
    public void confirmarInicio(int nroOp, int linea, String modelo, String color) {
        lineaT = this.getLinea(linea);
        mod = this.getModelo(modelo);
        col = this.getColor(color);
        String hora = Repositorio.getHoraActual();
        String fecha = Repositorio.getFecha();
        Turno turno = Repositorio.getTurno(hora);
        
        lineaT.crearOP(nroOp, mod, col, fecha, turno,us);
        System.out.println("TURNO ASIGNADO: " + turno.getNroTurno());
        JOptionPane.showMessageDialog(null, "Op iniciada con éxito");

    }

    //BUSCAR_COLOR
    public Color getColor(String color) {
        for (Color colore : this.ListaC) {
            if (colore.getDescripcion().equals(color)) {
                return colore;
            }
        }
        return null;
    }

    //BUSCAR_MODELO
    public Modelo getModelo(String denominacion) {
        for (Modelo modelo : listaM) {
            if (modelo.getDenominacion().equals(denominacion)) {
                return modelo;
            }
        }
        return null;
    }

    //BUSCAR_LINEA
    public LineaTrabajo getLinea(int nroLinea) {
        for (LineaTrabajo lineaTrabajo : listaL) {
            if (lineaTrabajo.getNumero() == nroLinea) {
                return lineaTrabajo;
            }
        }
        return null;
    }

    public void setLinea() {
        GestorPausarOP.setLinea(lineaT);
        GestorReanudarOP.setLinea(lineaT);
        GestorFinalizarOP.setLinea(lineaT);
    }

    public static Usuario getUs() {
        return us;
    }

    public ArrayList<LineaTrabajo> getListaL() {
        return listaL;
    }
    

}
