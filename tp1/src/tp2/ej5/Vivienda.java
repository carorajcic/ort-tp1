package tp2.ej5;

import java.util.ArrayList;

public class Vivienda {
    private Direccion direccion;
    private ArrayList<Persona> personas;
    private ArrayList<Mueble> muebles;

    public Vivienda(Direccion direccion) {
        this.direccion = direccion;
        this.personas = new ArrayList<>();
        this.muebles = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        this.personas.add(persona);
    }

    public void agregarMueble(Mueble mueble) {
        this.muebles.add(mueble);
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public ArrayList<Mueble> getMuebles() {
        return muebles;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void mostrarVivienda() {
        System.out.println("Direccion: " + this.direccion.getCalle() + " " + this.direccion.getAltura() + " " + this.direccion.getPiso() + " " + this.direccion.getDepto());

        System.out.println("Personas:");
        for (Persona persona : this.personas) {
            persona.mostrarPersonas();
        }

        System.out.println("Muebles:");
        for (Mueble mueble : this.muebles) {
            mueble.mostrarMuebles();
        }
    }

}
