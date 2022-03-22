/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

/**
 *
 * @author PCConfig-Linux
 */
import datos.Repositorio;
import javax.xml.ws.Endpoint;
import modelo.*;

public class MyServer {

    public static void main(String[] args) {

        String address = "http://127.0.0.1:1234/servidorWeb_OP";
        String address1 = "http://127.0.0.1:1235/servidorWeb_OP";
        String address2 = "http://127.0.0.1:1236/servidorWeb_OP";
        String address3 = "http://127.0.0.1:1237/servidorWeb_OP";
        String address4 = "http://127.0.0.1:1238/servidorWeb_OP";
        Endpoint.publish(address, new Color());
        Endpoint.publish(address1, new Modelo()); 
        Endpoint.publish(address2, new OrdenP()); 
        Endpoint.publish(address3, new Repositorio()); 
        Endpoint.publish(address4, new LineaTrabajo()); 
         
        
        
        System.out.println("Listening: "+address);
        System.out.println("Listening: "+address1);
        System.out.println("Listening: "+address2);
        System.out.println("Listening: "+address3);
        System.out.println("Listening: "+address4);
        
    }

}
