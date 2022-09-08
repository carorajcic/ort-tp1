package tp2.ej3;

public class Test {
    public static void main(String[] args) {
        Persona persona = new Persona("Lionel", "Messi");
        Persona persona2 = new Persona("Juan", "Pérez");

        agregarTelefono(persona, "549", "114111-2222", "54", TipoDeLinea.CELULAR);
        agregarTelefono(persona, "068", "032444-5678", "54", TipoDeLinea.CELULAR);
        agregarTelefono(persona, "054", "4411-5472", "54", TipoDeLinea.FIJO);

        agregarEmail(persona, "lio@messi.com");
        agregarEmail(persona, "lio_messi@hotmail.com");

        agregarMascota(persona, "Pluto", TipoMascota.PERRO);
        agregarMascota(persona, "Felix", TipoMascota.GATO);
        agregarMascota(persona, "Bugs", TipoMascota.CONEJO);

        Hito hito = new Hito("1987-06-24", "Cumpleaños");
        persona.agregarHito(hito);
        persona2.agregarHito(hito);

        persona.mostrarTodo();

    }

    private static void agregarTelefono(Persona persona, String codigoPais, String numero, String codigoArea, TipoDeLinea tipoDeLinea) {
        persona.agregarTelefono(new NumeroTelefonico(codigoPais, numero, codigoArea, tipoDeLinea));
    }

    private static void agregarEmail(Persona persona, String email) {
        persona.agregarEmail(new Email(email));
    }

    private static void agregarMascota(Persona persona, String nombre, TipoMascota tipoMascota) {
        persona.agregarMascota(new Mascota(nombre, tipoMascota));
    }
}
