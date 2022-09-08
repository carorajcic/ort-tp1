package tp2.ej3;

import java.util.ArrayList;

public class Hito {
    private String fecha;
    private String descripcion;
    private ArrayList<Persona> personasInvolucradas;

    public Hito(String fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.personasInvolucradas = new ArrayList<Persona>();
    }

    public String getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
