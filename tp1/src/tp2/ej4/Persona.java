package tp2.ej4;

import tp2.ej3.Email;
import tp2.ej3.Hito;
import tp2.ej3.Mascota;
import tp2.ej3.NumeroTelefonico;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void mostrarPersonas() {
        System.out.println("Nombre: " + nombre + " " + apellido +
                ", Edad: " + edad);
    }
}
