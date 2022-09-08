package tp2.ej1;

public class Email {
    private String cuenta;
    private String dominio;

    public Email(String email) {
        String[] partes = email.split("@");
        cuenta = partes[0];
        dominio = partes[1];
    }

    public String getValor() {
        return this.cuenta + "@" + this.dominio;
    }
}
