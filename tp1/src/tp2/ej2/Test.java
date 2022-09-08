package tp2.ej2;

public class Test {
    public static void main(String[] args) {
        Persona persona = new Persona("Lionel", "Messi");

        persona.agregarTelefono(new NumeroTelefonico("549", "114111-2222", "54", TipoDeLinea.CELULAR));
        persona.agregarTelefono(new NumeroTelefonico("068", "032444-5678", "54", TipoDeLinea.CELULAR));
        persona.agregarTelefono(new NumeroTelefonico("054", "4411-5472", "54", TipoDeLinea.FIJO));

        persona.agregarEmail(new Email("lio@messi.com"));
        persona.agregarEmail(new Email("lio_messi@hotmail.com"));

        persona.agregarMascota(new Mascota("Pluto", TipoMascota.PERRO));
        persona.agregarMascota(new Mascota("Felix", TipoMascota.GATO));
        persona.agregarMascota(new Mascota("Bugs", TipoMascota.CONEJO));

        persona.mostrarTodo();

    }
}
