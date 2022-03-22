/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.time.LocalDateTime;
import modelo.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

import servAplicacion.GestorIniciarOP;

/**
 *
 * @author Nahuel
 */
public class Repositorio {

    private static ArrayList<Modelo> listaModelos = new ArrayList<>();
    private static ArrayList<Color> listaColores = new ArrayList<>();
    private static ArrayList<LineaTrabajo> listaLineas = new ArrayList<>();
    private static ArrayList<Defecto> listaDef = new ArrayList<>();
    private static ArrayList<OrdenP> op = new ArrayList<>();
    private static ArrayList<Hallazgo> listaDefPie = new ArrayList<>();
    private static ArrayList<Defecto> lista3Defecto = new ArrayList<>();
    private static Inspeccion hora1 = new Inspeccion();
    private static Inspeccion hora2 = new Inspeccion();
    private static Inspeccion hora3 = new Inspeccion();
    private static Inspeccion hora4 = new Inspeccion();
    private static EstadoOrden estado;
    private static ArrayList<Hallazgo> listaDefPieCOMPLETA = new ArrayList<>();
    private static LocalDateTime localDate = LocalDateTime.now();
    private static ArrayList<Turno> listaTurnos = new ArrayList<>();
    private static ArrayList<SupCalidad> listaSupCalidad = new ArrayList<>();
    private static ArrayList<SupLinea> listaSupLinea = new ArrayList<>();

    public static void iniciarlizar() {
        Repositorio.cargarModelos();
        Repositorio.cargarColores();
        Repositorio.iniciarOP();
        Repositorio.cargarLineas();
        Repositorio.cargarDefectos();
        Repositorio.cargarListaDefPie();
        Repositorio.cargarListaCompletaDefPie();
        Repositorio.prepararHorasTrabajo();
        Repositorio.ultimas4Horas();
        Repositorio.cargarSupCalidad();
        Repositorio.cargarSupLinea();
        Repositorio.cargarTurnos();
    }

    //CARGAR_4_ULTIMAS_HORAS_DE_TRABAJO(CON SUS RESPECTIVAS LISTAS DE HALLAZGO POR HORA, PARA PRUEBA)
    private static void prepararHorasTrabajo() {
        Repositorio.hora1.setListaHallazgo(listaDefPie);
        Repositorio.hora2.setListaHallazgo(listaDefPie);
        Repositorio.hora3.setListaHallazgo(listaDefPie);
        Repositorio.hora4.setListaHallazgo(listaDefPie);

    }

    //CARGA_DE_LISTA_DE_TODOS_LOS_DEFECTOS_QUE_PUEDEN_SER_HALLADOS
    public static void cargarListaCompletaDefPie() {
        listaDefPieCOMPLETA.clear();
        for (Defecto defecto : listaDef) {
            listaDefPieCOMPLETA.add(new Hallazgo(null, defecto, 0));
        }
    }

    //LISTA_DE_HALLAZGO_CARGADOS_PREVIAMENTE_PARA_EJEMPLO
    public static void cargarListaDefPie() {
        listaDefPie.clear();
        listaDefPie.add(new Hallazgo(TipoPie.IZQUIERDO, listaDef.get(0), 5));
        listaDefPie.add(new Hallazgo(TipoPie.IZQUIERDO, listaDef.get(1), 80));
        listaDefPie.add(new Hallazgo(TipoPie.IZQUIERDO, listaDef.get(2), 21));
        listaDefPie.add(new Hallazgo(TipoPie.IZQUIERDO, listaDef.get(3), 40));
        listaDefPie.add(new Hallazgo(TipoPie.IZQUIERDO, listaDef.get(4), 50));
        listaDefPie.add(new Hallazgo(TipoPie.IZQUIERDO, listaDef.get(7), 60));

    }

    //MODELOS_CARGADOS_PREVIAMENTE
    private static void cargarModelos() {
        listaModelos.clear();
        listaModelos.add(new Modelo(1234, "X", 50));
        listaModelos.add(new Modelo(1235, "Y", 60));
        listaModelos.add(new Modelo(1236, "PALO", 40));
        listaModelos.add(new Modelo(1237, "JOSEMI", 80));
        listaModelos.add(new Modelo(1238, "FABIANA", 30));
        listaModelos.add(new Modelo(1239, "CARLA", 70));
        listaModelos.add(new Modelo(1230, "CHANCLETA", 90));
    }

    //COLORES_CARGADOS_PREVIAMENTE
    private static void cargarColores() {
        listaColores.clear();
        listaColores.add(new Color(323, "ROJO"));
        listaColores.add(new Color(173, "AZUL"));
        listaColores.add(new Color(153, "VERDE"));
        listaColores.add(new Color(433, "NARANJA"));
        listaColores.add(new Color(153, "NEGRO"));
        listaColores.add(new Color(423, "BLANCO"));

    }

    //TURNOS_CARGADOS_PREVIAMENTE
    private static void cargarTurnos() {

        listaTurnos.add(new Turno(101, 6, 12));
        listaTurnos.add(new Turno(102, 14, 18));
        listaTurnos.add(new Turno(103, 20, 23));
        listaTurnos.add(new Turno(104, 0, 5));

    }

    //LINEAS_CARGADAS_POR_DEFECTO(LINEAS CON OPS y LINEAS SIN OPS)
    private static void cargarLineas() {

        listaLineas.add(new LineaTrabajo(1, Repositorio.getOP().get(0)));
        listaLineas.add(new LineaTrabajo(2, Repositorio.getOP().get(1)));
        listaLineas.add(new LineaTrabajo(3, Repositorio.getOP().get(2)));

        listaLineas.add(new LineaTrabajo(5, null));
        listaLineas.add(new LineaTrabajo(6, null));
        listaLineas.add(new LineaTrabajo(7, null));
    }

    //CARGA_DE_DEFECTOS_EN_MEMORIA
    private static void cargarDefectos() {
        listaDef.clear();
        listaDef.add(new Defecto("MAL PEGADO", TipoDefecto.OBSERVADO));
        listaDef.add(new Defecto("PROBLEMA DE CUERO", TipoDefecto.OBSERVADO));
        listaDef.add(new Defecto("SUELA ROTA", TipoDefecto.OBSERVADO));
        listaDef.add(new Defecto("DISTINTOS TALLES", TipoDefecto.OBSERVADO));
        listaDef.add(new Defecto("ARRUGA", TipoDefecto.OBSERVADO));
        listaDef.add(new Defecto("DESPEGADO", TipoDefecto.OBSERVADO));

        listaDef.add(new Defecto("DESPEGADO", TipoDefecto.REPROCESO));
        listaDef.add(new Defecto("SUCIEDAD", TipoDefecto.REPROCESO));
        listaDef.add(new Defecto("HUMEDO", TipoDefecto.REPROCESO));
        listaDef.add(new Defecto("TALON TORCIDO", TipoDefecto.REPROCESO));
        listaDef.add(new Defecto("ROTO", TipoDefecto.REPROCESO));
    }

    //INICIO_DE_OPS_PREVIAMENTE
    public static void iniciarOP() {

        op.add(new OrdenP(1001, Repositorio.getModelos().get(3), Repositorio.getColores().get(0), "" + localDate.getHour(), new Turno()));
        op.add(new OrdenP(1002, Repositorio.getModelos().get(4), Repositorio.getColores().get(1), "" + localDate.getHour(), new Turno()));
        op.add(new OrdenP(1003, Repositorio.getModelos().get(6), Repositorio.getColores().get(3), "" + localDate.getHour(), new Turno()));

    }

    //PRUEBA_OBTENER_3DEFECTOS_ULTIMAS_4HORAS
    public static void ultimas4Horas() {
        int acu = 0;
        for (Hallazgo defPieComp : Repositorio.getListaDefPieCOMPLETA()) {
            acu = 0;
            for (Hallazgo defPie1 : Repositorio.hora1.getListaHallazgo()) {
                if (defPieComp.getDef().getNombre().equals(defPie1.getDef().getNombre())) {
                    acu += defPie1.getOcurrencia();

                }

            }

            for (Hallazgo defPie2 : Repositorio.hora2.getListaHallazgo()) {
                if (defPieComp.getDef().getNombre().equals(defPie2.getDef().getNombre())) {
                    acu += defPie2.getOcurrencia();

                }
            }

            for (Hallazgo defPie3 : Repositorio.hora3.getListaHallazgo()) {
                if (defPieComp.getDef().getNombre().equals(defPie3.getDef().getNombre())) {
                    acu += defPie3.getOcurrencia();

                }
            }
            for (Hallazgo defPie4 : Repositorio.hora4.getListaHallazgo()) {
                if (defPieComp.getDef().getNombre().equals(defPie4.getDef().getNombre())) {
                    acu += defPie4.getOcurrencia();

                }
            }

            defPieComp.setOcurrencia(acu);

            System.out.println("DEFECTOOOOO " + defPieComp.getOcurrencia());
        }
        Collections.sort(Repositorio.getListaDefPieCOMPLETA(), new Comparator<Hallazgo>() {

            @Override
            public int compare(Hallazgo p1, Hallazgo p2) {

                return new Integer(p2.getOcurrencia()).compareTo(new Integer(p1.getOcurrencia()));
            }
        });
        System.out.println("");
        System.out.println("Listado ordenado");
        for (Hallazgo defPie : listaDefPieCOMPLETA) {
            System.out.println("DEFECTOOOOO --> " + defPie.getDef().getNombre() + "  Ocurrencias: " + defPie.getOcurrencia());
        }
        lista3Defecto.add(new Defecto(listaDefPieCOMPLETA.get(0).getDef().getNombre(), listaDefPieCOMPLETA.get(0).getOcurrencia()));
        lista3Defecto.add(new Defecto(listaDefPieCOMPLETA.get(1).getDef().getNombre(), listaDefPieCOMPLETA.get(1).getOcurrencia()));
        lista3Defecto.add(new Defecto(listaDefPieCOMPLETA.get(2).getDef().getNombre(), listaDefPieCOMPLETA.get(2).getOcurrencia()));
    }

    //SUPERVISORES_ DE_LINEA_CARGADOS_PREVIAMENTE
    public static void cargarSupLinea() {
        Repositorio.listaSupLinea.add(new SupLinea("41495431", "1234"));
        Repositorio.listaSupLinea.add(new SupLinea("41423423", "2134"));
        Repositorio.listaSupLinea.add(new SupLinea("41645342", "4334"));
    }

    //SUPERVISORES_ DE_CALIDAD_CARGADOS_PREVIAMENTE
    public static void cargarSupCalidad() {
        Repositorio.listaSupCalidad.add(new SupCalidad("42007601", "1234"));
        Repositorio.listaSupCalidad.add(new SupCalidad("31423423", "2634"));
        Repositorio.listaSupCalidad.add(new SupCalidad("21645342", "2534"));
    }

    public static ArrayList<Modelo> getModelos() {
        return listaModelos;
    }

    public static ArrayList<Defecto> getLista3Defecto() {
        return lista3Defecto;
    }

    public static void setLista3Defecto(ArrayList<Defecto> lista3Defecto) {
        Repositorio.lista3Defecto = lista3Defecto;
    }

    public static ArrayList<Color> getColores() {
        return listaColores;
    }

    public static ArrayList<LineaTrabajo> getLineas() {
        return listaLineas;
    }

    public static ArrayList<Hallazgo> getListaDefPie() {
        return listaDefPie;
    }

    public static void setListaDefPie(ArrayList<Hallazgo> listaDefPie) {
        Repositorio.listaDefPie = listaDefPie;
    }

    public static Inspeccion getHora1() {
        return hora1;
    }

    public static void setHora1(Inspeccion hora1) {
        Repositorio.hora1 = hora1;
    }

    public static Inspeccion getHora2() {
        return hora2;
    }

    public static void setHora2(Inspeccion hora2) {
        Repositorio.hora2 = hora2;
    }

    public static Inspeccion getHora3() {
        return hora3;
    }

    public static void setHora3(Inspeccion hora3) {
        Repositorio.hora3 = hora3;
    }

    public static Inspeccion getHora4() {
        return hora4;
    }

    public static void setHora4(Inspeccion hora4) {
        Repositorio.hora4 = hora4;
    }

    public static ArrayList<Hallazgo> getListaDefPieCOMPLETA() {
        return listaDefPieCOMPLETA;
    }

    public static void setListaDefPieCOMPLETA(ArrayList<Hallazgo> listaDefPieCOMPLETA) {
        Repositorio.listaDefPieCOMPLETA = listaDefPieCOMPLETA;
    }

    public static ArrayList<Defecto> obtenerDefecto() {
        return listaDef;
    }

    public static ArrayList<OrdenP> getOP() {
        return op;
    }

    public static ArrayList<SupCalidad> getListaSupCalidad() {
        return listaSupCalidad;
    }

    public static ArrayList<SupLinea> getListaSupLinea() {
        return listaSupLinea;
    }

    //Agrega una orden a la lista
    public static void agregarNuevaOP(OrdenP orden) {
        Repositorio.op.add(orden);
    }

    //OBTENER_HORA
    public static String getHoraActual() {
        return "" + localDate.getHour();
    }

    //OBTENER_FECHA
    public static String getFecha() {
        return "" + localDate.getDayOfMonth() + "/" + localDate.getMonthValue() + "/" + localDate.getYear();
    }

    //OBTENER_TURNO
    public static Turno getTurno(String hora) {
        int horaT = Integer.parseInt(hora);
        for (Turno turn : listaTurnos) {
            if (turn.getHoraInicio() <= horaT && turn.getHoraFin() >= horaT) {
                return turn;
            }

        }
        return null;
    }

    //GET_USUARIO
    public static Usuario getUsuario(String user, String pass) {
        for (SupCalidad supCalidad : listaSupCalidad) {
            if(supCalidad.getDni().equals(user)&&supCalidad.getPass().equals(pass)){
                return supCalidad;
            }
        }
        for (SupLinea supLinea : listaSupLinea) {
            if(supLinea.getDni().equals(user)&&supLinea.getPass().equals(pass)){
                return supLinea;
            }
        }
        
        return null;
    }
    

    private static Turno turno = new Turno();

    
    
}
