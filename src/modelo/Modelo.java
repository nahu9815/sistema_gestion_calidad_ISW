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
public class Modelo {
    private int sku;
    private String denominacion;
    private int objetivoHora;
    public Modelo() {
    }

    public Modelo(int sku, String denominacion) {
        this.sku = sku;
        this.denominacion = denominacion;
    }

    public Modelo(int sku, String denominacion, int objetivoHora) {
        this.sku = sku;
        this.denominacion = denominacion;
        this.objetivoHora = objetivoHora;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getObjetivoHora() {
        return objetivoHora;
    }

    public void setObjetivoHora(int objetivoHora) {
        this.objetivoHora = objetivoHora;
    }
    
    
}
