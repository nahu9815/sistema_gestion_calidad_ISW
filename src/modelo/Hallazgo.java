/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Nahuel
 */
public class Hallazgo {
    private String hora;
    private TipoPie tipoPie;
    private Defecto def;
    private int ocurrencia;
    LocalDateTime localDate = LocalDateTime.now();
    public Hallazgo(String hora, TipoPie tipoPie) {
        this.hora = hora;
        this.tipoPie = tipoPie;
    }

    public Hallazgo(TipoPie tipoPie, Defecto def,int ocurrencia) {
        this.tipoPie = tipoPie;
        this.def = def;
        this.ocurrencia = ocurrencia;
      
    }
    
    
    public Hallazgo(TipoPie tipoPie, Defecto def) {
        this.tipoPie = tipoPie;
        this.def = def;
       
    }


    public int getOcurrencia() {
        return ocurrencia;
    }

    public void setOcurrencia(int ocurrencia) {
        this.ocurrencia = ocurrencia;
    }
    
   

    public Defecto getDef() {
        return def;
    }

    


    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

  

    public TipoPie getTipoPie() {
        return tipoPie;
    }

    public void setTipoPie(TipoPie tipoPie) {
        this.tipoPie = tipoPie;
    }


    
}
