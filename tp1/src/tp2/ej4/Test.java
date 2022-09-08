package tp2.ej4;

public class Test {
    public static void main(String[] args) {
        Direccion direccion = new Direccion("Montañeses", "1234", 4, 'C');
        Vivienda vivienda = new Vivienda(direccion);

        agregarPersona(vivienda, "Arturo", "Roman", 53);
        agregarPersona(vivienda, "Mónica", "Gaztambide", 35);

        agregarMueble(vivienda, "Mesa", "Madera", "Marrón");
        agregarMueble(vivienda, "Mesada", "Mármol", "Rojo");
        agregarMueble(vivienda, "Perchero", "Metal", "Negro");
        agregarMueble(vivienda, "Sillón", "Cuero", "Azul");

        vivienda.mostrarVivienda();

    }

    private static void agregarPersona(Vivienda vivienda, String nombre, String apellido, int edad) {
        vivienda.agregarPersona(new Persona(nombre, apellido, edad));
    }

    private static void agregarMueble(Vivienda vivienda, String nombre, String material, String color) {
        vivienda.agregarMueble(new Mueble(nombre, material, color));
    }
}
