package tp2.ej3;

public class Mascota {
    private String nombre;
    private TipoMascota tipoMascota;

    public Mascota(String nombre, TipoMascota tipoMascota) {
        this.nombre = nombre;
        this.tipoMascota = tipoMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoMascota getTipoMascota() {
        return tipoMascota;
    }
}
