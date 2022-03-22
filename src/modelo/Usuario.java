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
public abstract class Usuario {
     private String nomApellido;
    private String dni;
    private String mail;
    private String pass;

    public Usuario(String dni, String pass) {
        this.dni = dni;
        this.pass = pass;
    }

    public Usuario() {
    }

    public String getNomApellido() {
        return nomApellido;
    }

    public void setNomApellido(String nomApellido) {
        this.nomApellido = nomApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

   
    
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public abstract String nombre();
}
