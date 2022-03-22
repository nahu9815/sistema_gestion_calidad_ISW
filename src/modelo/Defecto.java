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
public class Defecto {
    private int nroDefecto;
    private String nombre;
    private TipoDefecto tipo;
    
    public Defecto() {
    }

    public Defecto(int nroDefecto, String nombre) {
        this.nroDefecto = nroDefecto;
        this.nombre = nombre;
    }

    public Defecto(String nombre, TipoDefecto tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public TipoDefecto getTipo() {
        return tipo;
    }

    public void setTipo(TipoDefecto tipo) {
        this.tipo = tipo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOcurrencia() {
        return ocurrencia;
    }

    public void setOcurrencia(int ocurrencia) {
        this.ocurrencia = ocurrencia;
    }
    int ocurrencia;
    public Defecto(String nombre,int ocurrencia) {
        this.nombre = nombre;
        this.ocurrencia  = ocurrencia;
    }
}
