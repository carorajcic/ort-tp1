package tp2.ej1;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private ArrayList<NumeroTelefonico> telefonos;
    private ArrayList<Email> emails;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        telefonos = new ArrayList<>();
        emails = new ArrayList<>();
    }

    public void agregarTelefono(NumeroTelefonico telefono) {
        telefonos.add(telefono);
    }

    public void agregarEmail(Email email) {
        emails.add(email);
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
    }
}
