package modelo;

import datos.Repositorio;
import java.util.ArrayList;

/**
 *
 * @author Nahuel
 */
public class DetalleDia {

    private String fecha;
    private int cParAPrimera;
    private int cParASegunda;
    private Inspeccion inspec = new Inspeccion();
    private ArrayList<Inspeccion> listaInspeccion;
    private ArrayList<Turno> listaTurno;
    private ArrayList<Inspeccion> lista4UltimasInspeccion = new ArrayList<>();

    public DetalleDia() {
    }

    public DetalleDia(String fecha, Turno turno) {
        this.fecha = fecha;
        this.listaTurno = new ArrayList<>();
        listaTurno.add(turno);
        this.listaInspeccion = new ArrayList<>();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getcParAPrimera() {
        return cParAPrimera;
    }

    public void setcParAPrimera(int cParAPrimera) {
        this.cParAPrimera = cParAPrimera;
    }

    public int getcParASegunda() {
        return cParASegunda;
    }

    public void setcParASegunda(int cParASegunda) {
        this.cParASegunda = cParASegunda;
    }

    public ArrayList<Inspeccion> getListaInspeccion() {
        return listaInspeccion;
    }

    public void setListaInspeccion(ArrayList<Inspeccion> listaInspeccion) {
        this.listaInspeccion = listaInspeccion;
    }

    public ArrayList<Turno> getListaTurno() {
        return listaTurno;
    }

    public void setListaTurno(ArrayList<Turno> listaTurno) {
        this.listaTurno = listaTurno;
    }

    public Inspeccion getInspec() {
        return inspec;
    }

    public void setInspec(Inspeccion inspec) {
        this.inspec = inspec;
    }

    //CARGAR_DATOS_HERMANADO
    public void cargarDatosHermanado(int primera, int segunda) {
        this.cParAPrimera = primera;
        this.cParASegunda = segunda;
        System.out.println("SE HERMANARON: " + primera + " a primera y " + segunda + " a segunda");
    }

    //OBTENER_ULTIMAS_4HORAS
    public void obtenerUltimas4Insp() {
        for (int i = 0; i < 4; i++) {
            lista4UltimasInspeccion.add(listaInspeccion.get(listaInspeccion.size() - i));
        }
    }

    //ENVIAR_A_PRIMERA
    public void enviarAPrimera() {
        inspec.enviarAPrimera();

    }
    //QUITAR_A_PRIMERA
    public void quitarAPrimera() {
        inspec.quitarAPrimera();
    }
    //TRAER_DATOS_PRIMERA
    public int traerDatos() {
        return inspec.trarDatos();
    }

    //CREAR_INSPECCION
    public void crearInspeccion(String hora,Usuario us) {
      
        inspec = new Inspeccion(hora, (SupCalidad) us);
        listaInspeccion.add(inspec);
    }

    //REGISTRAR_INSPECCION
    public void registrarInspeccion(String tipoPie, Defecto def, String hora,Usuario us) {
        if (hora.equals(listaInspeccion.get(listaInspeccion.size() - 1).getHora())) {
            inspec.registrarInspeccion(tipoPie, def, hora);
        } else {
            inspec = new Inspeccion(hora, (SupCalidad) us);
            listaInspeccion.add(inspec);
            inspec.registrarInspeccion(tipoPie, def, hora);
            
        }
          

    }

    //QUITAR_DEFECTO
    public void quitarDefecto(String tipoPie,Defecto def,TipoDefecto tipoDef) {
        inspec.quitarDefecto(tipoPie,def,tipoDef);
    }

    //OBTENGO_DATOS_DE_DEFECTOS_CARGADOS_EN_EL_MOMENTO
    public ArrayList<Hallazgo> traerDatosDefecto() {
        return this.inspec.traerDatosDef();
    }

    

}
