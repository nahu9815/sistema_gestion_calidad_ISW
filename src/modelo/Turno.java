/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Nahuel
 */
public class Turno {

    private int nroTurno;
    private int horaInicio;
    private int horaFin;

    
    public Turno(int nroTurno, int horaInicio, int horaFin) {
        this.nroTurno = nroTurno;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }


    public Turno(int nroTurno) {
        this.nroTurno = nroTurno;
    }

    public Turno() {
    }

    public int getNroTurno() {
        return nroTurno;
    }

    public void setNroTurno(int nroTurno) {
        this.nroTurno = nroTurno;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }
}
