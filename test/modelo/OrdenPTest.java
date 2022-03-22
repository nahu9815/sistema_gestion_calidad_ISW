/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PCConfig-Linux
 */
public class OrdenPTest {
    
    public OrdenPTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    
    
    @Test
    public void testPausarOrdenPCuandoLaOrdenSeEncuentraEnProceso() {
        System.out.println("pausarOrdenP");
        OrdenP orden = new OrdenP();
        orden.setEstado(EstadoOrden.PROCESO);
        boolean expResult = true;
        boolean result = orden.pausarOrdenP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testPausarOrdenPCuandoLaOrdenNoSeEncuentraEnProceso() {
        System.out.println("pausarOrdenP");
        OrdenP orden = new OrdenP();
        orden.setEstado(EstadoOrden.FINALIZADA);
        boolean expResult = false;
        boolean result = orden.pausarOrdenP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testReanudarOPCuandoLaOrdenPSeEncuentraPausada() {
        System.out.println("reanudarOP");
        OrdenP orden = new OrdenP();
        orden.setEstado(EstadoOrden.PAUSADA);
        boolean expResult = true;
        boolean result = orden.reanudarOP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

     @Test
    public void testReanudarOPCuandoLaOrdenPSeEncuentraEnEstadoEnProceso() {
        System.out.println("reanudarOP");
        OrdenP orden = new OrdenP();
        orden.setEstado(EstadoOrden.PROCESO);
        boolean expResult = false;
        boolean result = orden.reanudarOP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
  
     @Test
    public void testFinalizarOPCuandoLaOrdenPSeEncuentraEnEstadoEnProceso() {
        System.out.println("reanudarOP");
        OrdenP orden = new OrdenP();
        orden.setEstado(EstadoOrden.PROCESO);
        boolean expResult = false;
        boolean result = orden.finalizarOrdenP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    @Test
    public void testCrearInspeccion() {
        System.out.println("crearInspeccion");
        String hora = "";
        Usuario us = null;
        OrdenP instance = new OrdenP();
        instance.crearInspeccion(hora, us);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    
     /*
    @Test
    public void testFinalizarOP() {
        System.out.println("finalizarOP");
        OrdenP orden = new OrdenP();
        
        orden.finalizarOP();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

   
    
}
