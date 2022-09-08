package tp2.ej3;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private ArrayList<NumeroTelefonico> telefonos;
    private ArrayList<Email> emails;
    private ArrayList<Mascota> mascotas;
    private ArrayList<Hito> hitos;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        telefonos = new ArrayList<>();
        emails = new ArrayList<>();
        mascotas = new ArrayList<>();
        hitos = new ArrayList<>();
    }

    public void agregarTelefono(NumeroTelefonico telefono) {
        telefonos.add(telefono);
    }

    public void agregarEmail(Email email) {
        emails.add(email);
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public void agregarHito(Hito hito) {
        hitos.add(hito);
    }

    public void mostrarTodo() {
        System.out.println(this.apellido + ", " + this.nombre);

        System.out.println("Telefonos:");
        for (NumeroTelefonico telefono : telefonos) {
            System.out.println(telefono.getTipoDeLinea() + ": " + telefono.getValor());
        }

        System.out.println("Email:");
        for (Email email : emails) {
            System.out.println(email.getValor());
        }

        System.out.println("Mascotas:");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota.getTipoMascota() + ", " + mascota.getNombre());
        }

        System.out.println("Hitos:");
        for (Hito hito : hitos) {
            System.out.println(hito.getFecha() + ", " + hito.getDescripcion());
        }

    }

}
