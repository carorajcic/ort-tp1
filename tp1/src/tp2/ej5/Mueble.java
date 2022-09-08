package tp2.ej5;

public class Mueble {
    private String nombre;
    private String material;
    private String color;

    public Mueble(String nombre, String material, String color) {
        this.nombre = nombre;
        this.material = material;
        this.color = color;
    }

    public void mostrarMuebles() {
        System.out.println(nombre + " de " + material +  " Color: " + color);
    }
}
