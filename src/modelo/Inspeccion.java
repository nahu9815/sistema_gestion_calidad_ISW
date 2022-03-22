package modelo;

import java.util.ArrayList;

/**
 *
 * @author Nahuel
 */
public class Inspeccion {

    private String hora;
    Hallazgo hz;
    private ArrayList<Hallazgo> listaHallazgo;
    private ArrayList<SupCalidad> listaSupCalidad;
    private SupCalidad supCalidad;
    private int cantPrimera;

    public Inspeccion(String hora, ArrayList<Hallazgo> listaDefectoPie) {
        this.hora = hora;
        this.listaHallazgo = listaDefectoPie;
    }

    public Inspeccion(ArrayList<Hallazgo> listaDefectoPie) {
        this.listaHallazgo = listaDefectoPie;
    }

    public Inspeccion(String hora, SupCalidad supCalidad) {
        this.hora = hora;
        this.supCalidad = supCalidad;
        this.listaHallazgo = new ArrayList<>();
        System.out.println("La inspeccion fue iniciada a las horas " + this.getHora() + " por el supervisor " + this.supCalidad.getDni());
    }

    public Inspeccion() {
    }

    public SupCalidad getSupCalidad() {
        return supCalidad;
    }

    public void setSupCalidad(SupCalidad supCalidad) {
        this.supCalidad = supCalidad;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public ArrayList<Hallazgo> getListaHallazgo() {
        return listaHallazgo;
    }

    public void setListaHallazgo(ArrayList<Hallazgo> listaHallazgo) {
        this.listaHallazgo = listaHallazgo;
    }

    //ENVIAR_A_PRIMERA
    public void enviarAPrimera() {
        this.incrementarPrimera();
    }

    //INCREMENAR PRIMERA
    private void incrementarPrimera() {
        this.cantPrimera++;
        System.out.println("" + cantPrimera);
    }
    //QUITAR_A_PRIMERA
    public void quitarAPrimera() {
        this.restarAPrimera();
    }

    //DECREMENTAR_PRIMERA
    public void restarAPrimera(){
        this.cantPrimera--;
    }
    
    //TRAER_DATOS
    public int trarDatos() {
        return this.cantPrimera;
    }

    //REGISTRAR_INSPECCION
    public void registrarInspeccion(String tipoPie, Defecto def, String hora) {

        if (listaHallazgo.size() == 0) {
            hz = new Hallazgo(TipoPie.valueOf(tipoPie), def);
            hz.setOcurrencia(1);
            listaHallazgo.add(hz);
        } else {
            int pos = listaHallazgo.size();
            int a = 0;

            for (int i = 0; i < listaHallazgo.size(); i++) {

                if (listaHallazgo.get(i).getDef().getNombre().equals(def.getNombre())
                        && listaHallazgo.get(i).getTipoPie().toString().equals(tipoPie)
                        && listaHallazgo.get(i).getDef().getTipo().equals(def.getTipo())) {

                    listaHallazgo.get(i).setOcurrencia(listaHallazgo.get(i).getOcurrencia() + 1);
                    a = 1;

                } else if (listaHallazgo.get(i).equals(listaHallazgo.get(pos - 1))) {
                    if (a != 1) {
                        hz = new Hallazgo(TipoPie.valueOf(tipoPie), def);
                        listaHallazgo.add(hz);
                    }
                }
            }
        }

        for (Hallazgo hallazgo : listaHallazgo) {
            System.out.println("Hallazgo: " + hallazgo.getDef().getNombre() + " Ocurrencia: " + hallazgo.getOcurrencia() + " Tipo DEfecto" + hallazgo.getDef().getTipo() + " Tipo Pie: " + hallazgo.getTipoPie());
        }
    }

    //QUITAR_DEFECTO
    public void quitarDefecto(String tipoPie, Defecto def, TipoDefecto tipoDef) {
        this.quitarOcurrencia(tipoPie, def, tipoDef);
    }

    //OBTENGO_DATOS_DE_DEFECTOS_CARGADOS_EN_EL_MOMENTO
    public ArrayList<Hallazgo> traerDatosDef() {

        if (listaHallazgo != null) {
            return listaHallazgo;
        }
        return null;
    }

    //QUITAR_OCURRENCIA
    public void quitarOcurrencia(String tipoPie, Defecto def, TipoDefecto tipoDef) {

        for (int i = 0; i < listaHallazgo.size(); i++) {
            if (listaHallazgo.get(i).getDef().getNombre().equals(def.getNombre())
                    && listaHallazgo.get(i).getTipoPie().toString().equals(tipoPie)
                    && listaHallazgo.get(i).getDef().getTipo().equals(def.getTipo())) {
                listaHallazgo.get(i).setOcurrencia(listaHallazgo.get(i).getOcurrencia() - 1);
                if (listaHallazgo.get(i).getOcurrencia() == 0) {
                    listaHallazgo.remove(i);
                }

            }

        }
        for (Hallazgo hallazgo : listaHallazgo) {
            System.out.println("Hallazgo: " + hallazgo.getDef().getNombre() + " Ocurrencia: " + hallazgo.getOcurrencia());
        }
    }

}
