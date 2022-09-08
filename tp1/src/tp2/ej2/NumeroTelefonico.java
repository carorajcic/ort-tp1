package tp2.ej2;

public class NumeroTelefonico {
    private String caracteristica;
    private String numeroAbonado;
    private String codPais;
    private TipoDeLinea tipoDeLinea;

    public NumeroTelefonico(String caracteristica, String numeroAbonado, String codPais, TipoDeLinea tipoDeLinea) {
        this.caracteristica = caracteristica;
        this.numeroAbonado = numeroAbonado;
        this.codPais = codPais;
        this.tipoDeLinea = tipoDeLinea;
    }

    public TipoDeLinea getTipoDeLinea() {
        return tipoDeLinea;
    }


    public String getValor() {
        return "(+" + codPais + ") " + caracteristica + "-" + numeroAbonado;
    }
}
