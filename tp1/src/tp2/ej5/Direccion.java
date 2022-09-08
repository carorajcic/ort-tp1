package tp2.ej5;

public class Direccion {
    private String calle;
    private String altura;
    private int piso;
    private char depto;

    public Direccion(String calle, String altura, int piso, char depto) {
        this.calle = calle;
        this.altura = altura;
        this.piso = piso;
        this.depto = depto;
    }

    public String getCalle() {
        return calle;
    }

    public String getAltura() {
        return altura;
    }
    public int getPiso() {
        return piso;
    }


    public char getDepto() {
        return depto;
    }

}
